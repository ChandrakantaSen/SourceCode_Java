import java.util.*;
class number523
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int n,a,c=0,r;
        System.out.println("enter the number");
        n=in.nextInt();
        System.out.println("enter the digit");
        a=in.nextInt();
        while(n>0)
        {
            r=(n%10);
            n=(n/10);
            if(r==a)
            {
                c=c+1;
            }
        }
        System.out.println(" "+c);
    }
}
           
        
       
       