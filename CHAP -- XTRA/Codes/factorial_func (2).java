import java.io.*;
class factorial_func
{
static int i,n,s=1; 
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

public static void factorialshow()
{
for(i=1;i<=n;i++)
s=s*i;
}
public static void factorialcheck()
{
System.out.println("The factorial of the number is   "+s);  
        }
    public static void main()throws IOException
    {
        factorial_func ob=new factorial_func();
        ob.input();
        ob.display();
        ob.factorialshow();
        ob.factorialcheck();
    }
}
    