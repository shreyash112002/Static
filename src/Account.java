import java.util.Scanner;

class Account
 {
     private int accid;
     private String name;
     private double bal;

     private static double roi;

     static
     {
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter roi");
         roi=sc.nextDouble();
     }
     public Account()
     {
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter accid,bal,name");
         accid=sc.nextInt();
         bal=sc.nextDouble();
         name=sc.next();
     }
     public void showData()
     {
         System.out.println("Accid is "+accid+"Balance is "+bal+"Name is "+name);
     }
     public static void display()
     {
         System.out.println("ROI is "+roi);
     }
}
 class useAccount
 {
     public static void main(String[] args) {
         Account A= new Account();
         A.showData();
         Account.display();

         Account B= new Account();
         B.showData();
         Account.display();
     }
 }