import java.util.*;
class duck
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int r,n,n1,f=0;
        System.out.println("enter the number");
        n=in.nextInt();
        n1=n;
       while(n>0)
        {
            r=(n%10);
            n=(n/10);
            if(r==0)
            {
             f=1;
             break;
            }
        }
           if(f==1)
        
    System.out.println("it is a duck number");
    else
    System.out.println("not a duck number");
        
}
}
