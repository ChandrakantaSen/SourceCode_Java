import java.io.*;
class prime_func
{
static int i,n,count=0; 
static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
public static void input()throws IOException
{
System.out.println("Enter the  number : - ");
n=Integer.parseInt(br.readLine());
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
        prime_func ob=new prime_func();
        ob.input();
        ob.display();
        ob.primeshow();
        ob.primecheck();
    }
}
    