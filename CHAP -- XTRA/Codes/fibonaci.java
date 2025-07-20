import java.util.*;
class fibonaci
{
    public static void main(String args[])
    {
      Scanner in=new Scanner(System.in);
      int i,a=0,b=1,c,n;
      System.out.println("enter the number");
      n=in.nextInt();
      System.out.print(a+" "+b);
      for(i=1;i<=n;i++)
      {
          c=a+b;
          System.out.print(" "+c);
          a=b;
          b=c;
        }
        }
    }
      
       
       
