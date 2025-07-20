//An example of a multithreaded program:
class simpleThread extends Thread
{
public simpleThread(String str)
{
super(str);
    }
    public void run()
    {
        for(int i=0;i<10;i++)
        {
            System.out.println(getName());
        }
    }
}
public class Example2
{
public static void main(String argv[])
{
new simpleThread("Thread1").start();
new simpleThread("Thread1").start();
    }
}