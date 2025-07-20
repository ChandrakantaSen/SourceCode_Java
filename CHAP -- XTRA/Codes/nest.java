import java.util.*;
class nest
{
    public static void main(String args[])
    {
       Scanner in=new Scanner(System.in);
       int i,j,f=1,n,num;
       System.out.println("enter the limit");
       n=in.nextInt();
       for(i=1;i<=n;i++)
        {
          System.out.println("enter the numbers");
          num=in.nextInt();
          for(j=1;j<=num;j++)
          {
              f=f*j;
            }
            System.out.println("factorial of"+num+"="+f);
            f=1;
        }
    }
}
            
