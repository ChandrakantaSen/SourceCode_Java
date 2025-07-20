import java.util.*;
class Lucky_number_Series
{
    public static void main(String args[])
    {
        int n,s=0,d,i,p  ;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the range: ");
        n = sc.nextInt();
        for(i=1;i<=n;i++)
        {
            p=i;
            s=p;
            while(s>9)
            {
                p=s;
                s=0;
                while(p!=0)
                {
                    d = p % 10;
                    s = s + d;
                    p = p/10;
                }
            }
            if(s==1)
            {
                System.out.println(" "+i);
            }
        }
    }
}