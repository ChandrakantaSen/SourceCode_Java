import java.util.*;
class LCM
{
    public static void main(String args[])
    {
      Scanner in=new Scanner(System.in);
       int n,n1,i,h=0,a,b;
       System.out.println("enter the first number");
       n=in.nextInt();
       System.out.println("enter the second number");
       n1=in.nextInt();
       a=n*n1;
       for(i=1;i<a;i++)
       {
           if(n%i==0 && n1%i==0)
           {
               h=i;
            }
        }
        b=a/h;
        System.out.println("lowest common multiple of the number is"+" "+b);
    }
}
           
      