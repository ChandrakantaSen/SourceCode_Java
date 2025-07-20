//A Java program which makes sure that both the threads will be running alternative of the scheduling strategy.sleep() method in use.


   class Example6ThreadClass implements Runnable
    {
        public void run()
        {
            while(true)
            {
                System.out.println(Thread.currentThread().getName());
                try
                {
                    Thread.sleep(100);
                }catch (InterruptedException ie)
                  {
                      return;
                    }
                }
            }
        }
        public class Example6
        {
            public static void main(String argv)
            {
                Example6ThreadClass aETC=
                new Example6ThreadClass();
                new Thread(aETC,"boys").start();
                new Thread(aETC,"girls").start();
            }
        }
        