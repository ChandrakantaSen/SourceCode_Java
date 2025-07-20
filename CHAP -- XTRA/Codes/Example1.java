//An example of a multithread program:
class Example1Thread1Class extends Thread
{
public void run()
{
for(int i=0;i<10;i++)
{
System.out.println("Hello Thread1");
    }
}}
class Example1Thread2Class extends Thread
{
public void run()
{
for(int i=0;i<10;i++)
    {
        System.out.println("Hello Thread2");
    }
}
    }
    public class Example1
    {
        public static void main(String argv[])
        {
            Example1Thread1Class thread1=
            new Example1Thread1Class();
            Example1Thread2Class thread2=
            new Example1Thread2Class();
            thread1.start();
            thread2.start();
        }
    }