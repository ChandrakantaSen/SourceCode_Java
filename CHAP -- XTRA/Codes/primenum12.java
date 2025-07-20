import java.io.*;
class primenum12
{
    int prime1()throws IOException
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
           return 1;          
          else 
          return 0;
        }
        public static void main(String args[])throws IOException
        {
        primenum12 ob=new primenum12();
        int p=ob.prime1();
        if(p==1)
        System.out.println("number is prime");
        else
        System.out.println("number is not prime");
        }
    }