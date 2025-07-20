import java.io.*;
class amicable_range
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int i,j,m,n,s=0,s1=0,n1;
        System.out.println("Enter the first value :- ");
        n1=Integer.parseInt(br.readLine());
        for(i=1;i<=n1;i++)
        {
        for(j=i;j<=n1;j++)  
        {
            s=0;
            s1=0;
            for(m=1;m<i;m++)
            {
                if(i%m==0)
                {
                    s=s+m;
                }
            }
            for(n=1;n<j;n++)
            {
                if(j%n==0)
                {
                    s1=s1+n;
                }
            }
            if((s==j)&&(s1==i))
            {
                System.out.println(i+"    "+j);
            }
            }
        }
    }
}
