import java.io.*;
class pal_con
{
static int i,n,m,d,s; 
static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
pal_con()//DEFAULT CONSTRUCTOR
{
n=0;
s=0;
    }
public static void input()throws IOException
{
System.out.println("Enter the  number : - ");
n=Integer.parseInt(br.readLine());
    } 
public static void display()
{
System.out.println("The  number is "+n);
    }

public static void palshow()
{
m=n;
while(m>0)
{
d=m%10;
s=(s*10)+d;
m=m/10;
    }
}
public static void palcheck()
{
if(s==n)
{
System.out.println(n+" is a palindrome number  ");
    }
else
{
System.out.println(n+" is not a palindrome number  ");   
    }
        }
    public static void main()throws IOException
    {
        pal_con ob=new pal_con();
        ob.input();
        ob.display();
        ob.palshow();
        ob.palcheck();
    }
}
    