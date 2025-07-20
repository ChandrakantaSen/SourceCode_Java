import java.io.*;
public class twin_prime
    {
        public static void main(String args[])throws IOException
        {
            InputStreamReader read=new InputStreamReader(System.in);
            BufferedReader in=new BufferedReader(read);
            int a,b,k;
            System.out.println("Enter 2 numbers");
            a=Integer.parseInt(in.readLine());
            b=Integer.parseInt(in.readLine());
            twin_prime t=new twin_prime();
            k=t.twin(a,b);
            if(k==1)
            System.out.println("The numbers are twin prime");
            else
            System.out.println("The numbers are not twin prime");
        }
        int twin(int n,int m)
        {
            int i,c1=0,c2=0;
            for(i=1;i<=n;i++)
            {
                if(n%i==0)
                {
                    c1=c1+1;
                }
            }
            for(i=1;i<=m;i++)
            {
                if(m%i==0)
                {
                    c2=c2+1;
                }
            }
            if((c1==2)&&(c2==2)&&((m-n)==2||(m-n)==-2))
            {
                return 1;
            }
            else
            return 0;
        }
    }
            
            
            
            
           
            