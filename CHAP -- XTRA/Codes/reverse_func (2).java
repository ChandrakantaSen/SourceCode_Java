import java.io.*;
class reverse_func
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

public static void reverseshow()
{
m=n;
while(m>0)
{
d=m%10;
s=(s*10)+d;
m=m/10;
    }
}
public static void reversecheck()
{
System.out.println("The reverse of the number is   "+s);  
        }
    public static void main()throws IOException
    {
        reverse_func ob=new reverse_func();
        ob.input();
        ob.display();
        ob.reverseshow();
        ob.reversecheck();
    }
}
    