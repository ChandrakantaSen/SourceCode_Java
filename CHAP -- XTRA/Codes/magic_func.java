import java.io.*;
class magic_func
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

public static void magicshow()
{
m=n;
while(m>0)
{
d=m%10;
s=s+d;
m=m/10;
    }
}
public static void magiccheck()
{
if((s==10)||(s==1))
{
System.out.println(n+" is a magic number  ");  
        }
        else
        {
System.out.println(n+" is not a magic number  ");  
        }
    }
public static void main()throws IOException
    {
        magic_func ob=new magic_func();
        ob.input();
        ob.display();
        ob.magicshow();
        ob.magiccheck();
    }
}
    