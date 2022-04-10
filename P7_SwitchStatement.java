import java.util.Scanner;
public class P7_SwitchStatement {

    public static void main(String[] args) {
     
     SwitchStatements obj = new SwitchStatements();
     Scanner myobj = new Scanner(System.in);
     int num = myobj.nextInt();
     obj.switchStatements(num);
   
    }
   
   }
   
   class SwitchStatements {
    void switchStatements(int num)
    {
     num = num%2;
     switch(num)
     {
     case 0:
      System.out.println("number is even");
      break;
     
     case 1:
      System.out.println("number is odd");
      break;
     }
    }
   }