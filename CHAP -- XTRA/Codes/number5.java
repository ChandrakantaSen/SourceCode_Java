import java.util.*;
class number5
{    public static void main(String args[])
    {
        int i,n=0,sum=0;
        Scanner in=new Scanner(System.in);
        for(i=1;i<5;i++)
        {
            System.out.println("enter the number");
            n=in.nextInt();
            sum=sum+n;
            
        }
        System.out.println("sum of all the numbers is"+sum);
    }
}
        
