 class MyThread implements Runnable
{
    public void run()
    {
        System.out.println("Running state");
    }


        public static void main(String[] args) {
            Runnable m= new MyThread();
         Thread t= new Thread(m);
       t.start();
         try
         {
             Thread.sleep(100);
         }
         catch(Exception e)
         {

         }

        }
    }

