import java.io.*;
class unique_no
{
    public static void main()throws IOException
    {
        int n,i,m,d,c=0,flag=0;
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        System.out.println("Enter a no.");
        n=Integer.parseInt(br.readLine());
        for(i=0;i<=9;i++)
        {
            m=n;
            c=0;
            while(m>0)
            {
                d=m%10;
                if(d==i)
                {
                    c++;
                }
                m=m/10;
            }
            if(c>1)
            {
                flag=1;
                break;
            }            
        }
        
        if(flag ==0)
        {
            System.out.println(n+" is a unique no.");
        }
        else
        {
            System.out.println(n+" is not a unique no.");
        }
    }
}