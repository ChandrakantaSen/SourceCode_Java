import java.io.*;
class greater
{
public static void main(String args[])throws IOException 
{
BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
int a,b,c;
System.out.println("Enter the first no:");
a=Integer.parseInt(buf.readLine());
System.out.println("Enter the second no:");
b=Integer.parseInt(buf.readLine());
System.out.println("Enter the third no:");
c=Integer.parseInt(buf.readLine());
if((a>b)&&(a>c))
{
System.out.println(a+" is the greatest");
}

if((b>c)&&(b>a))
{
System.out.println(b+" is the greatest");
}

if((c>b	)&&(c>a))
{
System.out.println(c+" is the greatest");
}
}
}