import java.io.*;
class sample
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int a;
double a1;
float c;
char d;
String t;
long p;
System.out.println("Enter the integer : - ");
a=Integer.parseInt(br.readLine());
System.out.println("Enter the double : - ");
a1=Double.parseDouble(br.readLine());
System.out.println("Enter the float : - ");
c=Float.parseFloat(br.readLine());
System.out.println("Enter the text : - ");
t=br.readLine();
System.out.println("Enter the long : - ");
p=Long.parseLong(br.readLine());
System.out.println("Enter the character : - ");
d=(char)br.read();
System.out.println("Integer = "+a);
System.out.println("Double = "+a1);
System.out.println("Float = "+c);
System.out.println("Character = "+d);
System.out.println("String = "+t);
System.out.println("long = "+p);
}    
}