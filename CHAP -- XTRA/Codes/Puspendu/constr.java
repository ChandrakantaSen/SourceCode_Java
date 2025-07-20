package Puspendu;

import java.util.*;
class constr
{
    static int f;
    public constr()
    {
        f=1;
    }
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter a number :");
        int n=sc.nextInt();
        constr obj=new constr();
        for(int i=n;i>=1;i--)
        f=f*i;
        System.out.println("Factorial : "+f);
    }
}
    