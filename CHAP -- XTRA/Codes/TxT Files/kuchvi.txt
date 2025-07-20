import java.io.*;
class tutor
{
public static void sonam()throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("enter a no.");
int a=Integer.parseInt(br.readLine());
int s=0;
int m=a;
for(a|=0;a>0;a=a/10)
{
int d=a%10;
s=s+d*d*d;
    }
    if(s==m)
    {
System.out.println("The number is amstrong number"+s);    
        }   
}
public static void karan()throws IOException
{
 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
 System.out.println("Enter a number:");
 int a=Integer.parseInt(br.readLine());
 System.out.println("Enter a number:");
 int b=Integer.parseInt(br.readLine());
  int c=0;
  c=a+b;
System.out.println("The addition result is="+c);
    }
public static void main(String args[])throws IOException
{
int a=5;
int b=6;
int c=a+b;
System.out.println("The addition result is="+c);
sonam();
karan();
    }
}
public class kuchvi extends tutor
{
public static void main(String args[])throws IOException
{
int a=10;
int b=15;
int c=a+b;
System.out.println("The addition result is="+c);
    }
}
    