//without return type with parameter
//Krishnamurthy series
import java.util.*;
public class Code3
{
    void accept(int a,int n)
    {
        int c=0,pro=1,s=0;
        int d;
        for(int j=a;c<=n;j++)
        {
            int temp = j;
            while(temp != 0)
            {
            	d = temp % 10;
            	System.out.println(d);	
            }
            c++;
        }
    }

    public static void main (String args[])
    {
        Code3 obj=new Code3();
        Scanner sc=new Scanner (System.in);
        System.out.println("ENTER THE STARTING NUMBER");
        int  q=sc.nextInt();
        System.out.println("ENTER THE NUMBER OF TERMS YOU WANT TO PRINT");
        int r=sc.nextInt();
        obj.accept(q,r);
    }
}