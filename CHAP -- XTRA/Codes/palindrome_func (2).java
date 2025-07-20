import java.io.*;
class palindrome_func
{
static int i,n,m,d,s=0; 
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

public static void palindromeshow()
{
m=n;
while(m>0)
{
d=m%10;
s=(s*10)+d;
m=m/10;
    }
}
public static void palindromecheck()
{
if(s==n)
System.out.println(n+" is a palindrome number  ");  
        }
    public static void main()throws IOException
    {
        palindrome_func ob=new palindrome_func();
        ob.input();
        ob.display();
        ob.palindromeshow();
        ob.palindromecheck();
    }
}
    