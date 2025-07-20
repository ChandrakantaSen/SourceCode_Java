import java.io.*;
class finally0
{
     void main()
    {
      final int a=5,b=0,c;
    try
    {
       c=a/b;
        System.out.println(c);
    }
    catch(Exception e)
    {
        System.out.println("Can't be divide by zero");
    }
    finally
    {
           System.out.println(" a = "+a);
    }
    }       
}