package Puspendu;

import java.io.*;
class Constructors
{
static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
static int a,b,c;
 Constructors()throws IOException
{

System.out.println("Please enter the first number :");
 a=Integer.parseInt(br.readLine());
System.out.println("Please enter the second number :");
 b=Integer.parseInt(br.readLine());
}
public static void Display()
{
System.out.println(" a = "+a+" b = "+b);
}
public static void Sum()
{
c=a+b;
System.out.println(c);
}
public static void main()throws IOException
{
//int m,n;
Constructors obj=new Constructors();
obj.Display();
obj.Sum();
//obj.Display();
}
}