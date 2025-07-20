import java.util.*;
class krishnomurti
{
    public static void main(String args[])
{
    Scanner in=new Scanner(System.in);
    int n,n1,f=1,i,r,s=0;
    System.out.println("enter the value of the number");
    n=in.nextInt();
    
    n1=n;
    while(n>0)
    {
     r=n%10;
     for(i=1;i<=r;i++)
     {
         f=f*i;
     }
        s=s+f;
        f=1;
        n=(n/10);
    }
    if(s==n1)
    System.out.println("krishnomurti number");
    else
    System.out.println("not a krishnomurti number");
}
}

         
