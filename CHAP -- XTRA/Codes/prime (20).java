public class prime
{
    public static void main(String args[])
    {
        int i,j,c=0;
        for(i=1;i<=200;i++)
        {
            for(j=1;j<=i;j++)
            {
                if(i%j==0)
                {
                    c++;
                }    
            }
            if(c==2)
                System.out.println(i);
            c=0;
        }
    }
}