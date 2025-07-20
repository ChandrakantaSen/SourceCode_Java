import java.util.*;
class number11
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int n,i,s;
        System.out.println("enter the number");
        n=in.nextInt();
        for(i=1;i<=n;i++)
        {
            s=(i*i*i)-1;
            System.out.print(" "+s);
        }
    }
}
    
