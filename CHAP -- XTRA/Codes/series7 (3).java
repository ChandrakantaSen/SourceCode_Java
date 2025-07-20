import java.util.*;
class series7
{
    public static void main(String rags[])
    {
     Scanner in=new Scanner(System.in);
     int n,f=1,j,i,a;
     double s=0.0;
     System.out.println("enter the value of a");
     a=in.nextInt();
     System.out.println("enter the number");
     n=in.nextInt();
     for(i=1;i<=n;i++)
     {
         for(j=1;j<=i;j++)
         {
             f=f*i;
           
        }
        s=s+(a/f);
      
            f=1;
        }
         System.out.print(" "+s);
    }
}
        
     
