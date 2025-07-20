import java.util.*;
class factors
{
    public static void main(String args[])
    {
        int i,n;
        Scanner in=new Scanner(System.in);
        System.out.println("enter the number");
        n=in.nextInt();
        for(i=1;i<n;i++)
        {
         if(n%i==0)
         System.out.println(""+i);
        }
    }
}
        
