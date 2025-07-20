import java.util.*;
class factorial2
{
    public static void main(String args[])
    {
        int i,j,f=1,n,c=0;
        Scanner in=new Scanner(System.in);
        System.out.println("enter the number");
        n=in.nextInt();
        for(i=1;i<n;i++)
        {
          for(j=1;j<=i;j++)
          {
          f=f*i;
          } 
         c=c+f;
         f=1;
        }
        System.out.println("sum of the factorials is"+c);
    }
}

