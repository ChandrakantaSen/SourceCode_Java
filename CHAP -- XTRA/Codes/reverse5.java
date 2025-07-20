import java.util.*;
class reverse5
{
    public static void main(String args[])
    {
        int n,c=0,r;
        Scanner in=new Scanner(System.in);
        System.out.println("enter the number");
        n=in.nextInt();
        while(n>0)
        {
            r=(n%10);
            n=(n/10);
            c=c*10+r;
        }
        System.out.println("the reverse of the number is"+c);
    }
}
