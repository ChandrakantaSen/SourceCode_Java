import java.util.*;
class divisible
{
    public static void main(String args[])
    {
        int n,p1,p2;
        Scanner in=new Scanner(System.in);
        System.out.println("enter the number");
        n=in.nextInt();
        p1=n%10;
        p2=n%100;
        if((p1==2)||(p1==0)||(p1==4)||(p1==6)||(p1==8))
        System.out.println("the number is divisible by two");
        if(p2%4==0)
        System.out.println("the number is divisible by four");
        if((p1==0)||(p1==5))
        System.out.println("the number is divisible by five");
        else
        System.out.println("wrong input");
    }
}

        
        
        
        
