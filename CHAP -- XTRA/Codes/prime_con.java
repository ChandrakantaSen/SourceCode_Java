import java.io.*;
class prime_con  
{
        static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        static int n,i,count=0;
        prime_con(int x)
        {
            n=x;
        }
        public static void display()
        {
            System.out.println("The  number is "+n);
        }
        public static void primeshow()
        {
            for(i=1;i<=n;i++)
            {
                if(n%i==0)
                {
                    count++;
                }
            }
        }
        public static void primecheck()
        {        
            if(count==2)
            {
                System.out.println(n+" IS A PRIME NUMBER ");
            }
            else
            {
                System.out.println(n+" IS NOT A PRIME NUMBER ");
            }
        }
        public static void main()throws IOException
        {
            int p;
            System.out.println("Enter the number : -   ");
            p=Integer.parseInt(br.readLine());        
            prime_con ob=new prime_con(p);
            ob.display();
            ob.primeshow();
            ob.primecheck();
        }
    }