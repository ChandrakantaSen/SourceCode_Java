import java.util.*;
class max
{
    public static void main(String args[])
    {
        int a,b,max=0;
        Scanner in=new Scanner(System.in);
        System.out.println("enter the two numbers");
        a=in.nextInt();
        b=in.nextInt();
        max= (a>b)? a:b;
        System.out.println("greatest number is"+max);
    }
}
        
        
