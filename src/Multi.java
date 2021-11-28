public class Multi  extends Thread
{
   public void run()
   {

   }
    public static void main(String[] args) {
        Thread t=new Thread("Java");
        Thread t1=new Thread("Maths");
     t.start();
     t1.start();
        System.out.println(t1.getName());
        System.out.println(t.getName());


    }
}
