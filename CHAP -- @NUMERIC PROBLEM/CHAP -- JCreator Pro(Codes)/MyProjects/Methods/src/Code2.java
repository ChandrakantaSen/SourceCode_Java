//without return type with parameter
//Krishnamurthy series

import java.util.*;

class Code2
{
    void accept(int a,int n)
    {
        int c=0,f=1,s=0,temp;
        for(int j=a;c<=n;j++)
        {
        	temp = j;
        	System.out.println(temp);	
        }
    }

    public static void main (String args[])
    {
        Code2 obj=new Code2();
        Scanner sc=new Scanner (System.in);
        
        System.out.println("ENTER THE STARTING NUMBER");
        int  q=sc.nextInt();
        
        System.out.println("ENTER THE NUMBER OF TERMS YOU WANT TO PRINT");
        int r=sc.nextInt();
        
        obj.accept(q,r);
    }
}