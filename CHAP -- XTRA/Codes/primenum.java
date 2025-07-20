import java.io.*;
class primenum
{
    void prime1()throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n,c=0;
        System.out.println("Enter the number");
        n=Integer.parseInt(br.readLine());
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            c=c+1;
        }
         if(c==2)
         System.out.println("Number is prime");
         else
          System.out.println("Number is not prime"); 
          
        }
        public static void main(String args[])throws IOException
        {
        primenum ob=new primenum();
        ob.prime1();
        }
    }