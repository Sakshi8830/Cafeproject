package cafeproject;
import java.util.Scanner;
class Cafe
{
    String name;
    int cost;
    float dis;
 Cafe(String name,int cost,float dis)
 {
       this.name=name;
       this.cost=cost;
       this.dis=dis;
 }
 public void getDetails()
 {
    System.out.println("\t\tName\t\t\t|\t\tcost\t\t|\t\tApply discount");
    System.out.println("\t\t"+name+"\t\t|\t\t"+cost+"\t\t|\t\t"+dis);
    System.out.println("-------------------------------------------------------");
 } 

    void getBill(int qty) {
        float totalbill=(float)(qty*cost-(dis*qty));
        System.out.println("*******Your Bill*********");
        System.out.println("\n\tPay amount::"+totalbill+"/-\n\n");
        //System.out.println("**--------Happy Customer-------**");
    }
}
public class CafeTest {
  public static void main(String args[])
  {
      Scanner scanner=new Scanner(System.in);
      Cafe chai1=new Cafe("ilaychi chai",6,0);
      Cafe chai2=new Cafe("adarak chai",8,0);
      Cafe coffe1=new Cafe("Cappuccino",10,0);
      Cafe coffe2=new Cafe("cold cofee",12,0);
      Cafe snacks1=new Cafe("butter bread",15,0);
      Cafe snacks2=new Cafe("plane bread",8,0);
      Cafe combo1=new Cafe("chai+bread+french fries",60,10f);
      Cafe combo2=new Cafe("coffe+bread+hot choclate",65,10f);
      while(true)
      {
      System.out.println("*****Welcome to Engineers Cafe*****");
      System.out.println("Enter Your choice:\n1.Tea\n2.Coffe\n3.snacks\n4.Combo\n5.Exit");
      int choice=scanner.nextInt();
      switch(choice)
      {
          case 1:
              System.out.println("Enter choice:\n1.ilaychi chai/cardamom tea\n2.adarak chai/ginger tea\n3.exit");
              int num=scanner.nextInt();
              System.out.println("How many cup of tea you want:");
              int qty=scanner.nextInt();
              switch(num)
              {
                  case 1:
                     chai1.getDetails();
                     chai1.getBill(qty);
                     break;
                  case 2:
                      chai2.getDetails();
                      chai2.getBill(qty);
                      break;
                  case 3:
                      System.out.println("\tSuccessfully Exit\n");
                      break;
              }
              break;
          case 2:
              System.out.println("Enter choice:\n1.Cappuccino\n2.Cold Coffe\n3.exit");
              int n=scanner.nextInt();
              System.out.println("How many cup of coffe you want:");
              int qt = scanner.nextInt();
              switch(n)
              {
                  case 1:
                     coffe1.getDetails();
                     coffe1.getBill(qt);
                     break;
                  case 2:
                      coffe2.getDetails();
                      coffe2.getBill(qt);
                      break;
                  case 3:
                      System.out.println("\tSuccessfully Exit\n");
                      break;
              }
              break;
          case 3:
              System.out.println("Enter choice:\n1.Butter Bread\n2.Plane Bread\n3.exit");
              int no=scanner.nextInt();
              System.out.println("How many slice of bread you want:");
              int q= scanner.nextInt();
              switch(no)
              {
                  case 1:
                     snacks1.getDetails();
                     snacks1.getBill(q);
                     break;
                  case 2:
                      snacks2.getDetails();
                      snacks2.getBill(q);
                      break;
                  case 3:
                      System.out.println("\tSuccessfully Exit\n");
                      break;
              }
              break;
          case 4:
              System.out.println("Enter choice:\n1.chai+bread+french fries\n2.coffe+bread+hot choclate\n3.exit");
              int nom=scanner.nextInt();
              System.out.println("How many combo you want:");
              int qaty=scanner.nextInt();
              switch(nom)
              {
                  case 1:
                     combo1.getDetails();
                     combo1.getBill(qaty);
                     break;
                  case 2:
                      combo2.getDetails();
                      combo2.getBill(qaty);
                      break;
                  case 3:
                      System.out.println("\tSuccessfully Exit\n");
                      break;
              }
              break;
          case 5:
              System.out.println("Succesfully Exit");
              break;
        }
      }
   }
}
