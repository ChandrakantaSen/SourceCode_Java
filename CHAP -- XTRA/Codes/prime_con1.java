import java.io.*;
class prime_con1
{
 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
 int n,i,count=0;
        prime_con1(int x)
        {
            n=x;
        }
       void display()
        {
            System.out.println("The  number is "+n);
        }
       void primeshow()
        {
            for(i=1;i<=n;i++)
            {
                if(n%i==0)
                {
                    count++;
                }
            }
        }
              void primecheck()
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
              void main()throws IOException
        {
            int p;
            System.out.println("Enter the number : -   ");
            p=Integer.parseInt(br.readLine());        
            prime_con1 ob=new prime_con1(p);
            ob.display();
            ob.primeshow();
            ob.primecheck();
        }
    }