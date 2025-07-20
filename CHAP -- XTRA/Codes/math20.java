import java.io.*;
public class math20
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
double a,b;
System.out.println("enter the number to find out the cot value:-");
a=Integer.parseInt(br.readLine());
b=1/(Math.tan(a));
System.out.println("The cot value of"+a+" is"+b);
}
}
