import java.io.*;
public class math18
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
double a,b;
System.out.println("enter the number to find out the cosec value:-");
a=Integer.parseInt(br.readLine());
b=1/(Math.sin(a));
System.out.println("The floor value of"+a+" is"+b);
}
}
