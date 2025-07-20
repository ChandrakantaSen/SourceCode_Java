import java.util.*;
class tribonaci
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int a=0,b=1,c=b,f,i,n;
        System.out.println("enter the number");
        n=in.nextInt();
        System.out.print(a+" "+b+" "+c);
        for(i=1;i<=n;i++)
        {
            f=a+b+c;
            System.out.print(" "+f);
            a=b;
            b=c;
            c=f;
        }
    }
}
          
        
