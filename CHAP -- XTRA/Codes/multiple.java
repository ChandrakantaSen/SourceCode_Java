import java.util.*;
class multiple
{
    public static void main(String args[])
    {
        int i,a,n;
        Scanner in=new Scanner(System.in);
        System.out.println("enter the numbers");
        n=in.nextInt();
        for(i=1;i<=n;i=i+1)
        {
            a=(i*i)+1;
            System.out.println(a);
        }
    }
}
            
