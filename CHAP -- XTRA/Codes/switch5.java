import java.util.*;
class switch5
{
    public static void main(String args[])
    {
        int n,i,c=0,n1,a,r,x=0;
        Scanner in=new Scanner(System.in);
        System.out.println("enter the number");
        n=in.nextInt();
        System.out.println("press 1 for finding whether the number is prime or not");
        System.out.println("press 2 for finding whether the number is a armstrong number or not");
        a=in.nextInt();
        n1=n;
        switch(a)
        {
        case 1:
        for(i=2;i<n;i++)
        {
            if(n%i!=0)
            {
                c=1;
            }
            else
            {
                c=0;
            }
        }
        if(c==1)
        {
        System.out.println("the number is prime");
        
        }
        else
        {
        System.out.println("the number is notprime");
        
        }
        break;
        case 2:
        r=n*n;
        while(n>0)
        {
            n=(n/10);
            x=x+1;
        }
        int k=(int)(Math.pow(10,x));
        int s=(r%k);
        if(s==n1)
        System.out.println("armstrong number");
        else
        System.out.println("not a armstrong number");
        break;
        default:
        System.out.println("wrong input");
    }
}
}
