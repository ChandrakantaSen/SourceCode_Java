import java.io.*;
class danamicinput
{
public static void main(String args[])throws IOException
{
int a;
float b;
char c;
String v;
long e;
double x;
InputStreamReader ir=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(ir);
System.out.println("enter any string ");
v=br.readLine();
System.out.print("enter the integer value of a");
a=Integer.parseInt(br.readLine());
System.out.println("enter the float value of b");
b=Float.parseFloat(br.readLine());



System.out.println("enter double data");
x=Double.parseDouble(br.readLine());

System.out.println("enter  long integer");
 e=Long.parseLong(br.readLine());
 System.out.println("enter the any character");
c=(char)br.read();// character always declear at last
System.out.println(a);
System.out.println(b);

System.out.println(c);

System.out.println(v);
System.out.println(x);
System.out.println(e);
}
}

