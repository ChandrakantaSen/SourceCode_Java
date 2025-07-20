import java.io.*;
public class calculate
{
static int a,b,s,d;
 void inputdata()throws IOException
{
BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
System.out.println("Enter the two values");
a=Integer.parseInt(br.readLine());
b=Integer.parseInt(br.readLine());
}
public static void calculate()
{
s=a+b;
d=a-b;
}
public static void outputdata()
{
System.out.println("The sum of the two numbers are"+s);
System.out.println("The difference of the two numbers are"+d);
}
public static void main(String args[])throws IOException
{
 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
calculate ob = new calculate();
ob.inputdata();
ob.calculate();
ob.outputdata();
}
}
