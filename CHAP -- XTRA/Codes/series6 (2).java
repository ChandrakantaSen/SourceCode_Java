import java.util.*;
class series6
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int i,n;double k=0.0;
        System.out.println("enter the number");
        n=in.nextInt();
        for(i=1;i<=n;i++)
        {
            k=k/10+0.1;
            System.out.print(k+" ");
        }
       }
}

