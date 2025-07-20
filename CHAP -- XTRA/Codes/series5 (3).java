import java.util.*;
class series5
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int a=2,i,n,s=0;
        System.out.println("enter the number");
        n=in.nextInt();
        for(i=1;i<=n;i++)
        {
          if(i%2==0)
          s=s-a;
         else
          s=s+a;
          a=a+2;
        }
        System.out.print(s);
    }
    }

          
