import java.util.*;
class number586
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int n,a,r;
        System.out.println("enter the number");
        n=in.nextInt();
        System.out.println("enter the digit");
        a=in.nextInt();
        while(n>0)
        {
            r=(n%10);
            if(r!=a)
            {
              System.out.println(r);
            }
        n=(n/10);
    }
       }
}
