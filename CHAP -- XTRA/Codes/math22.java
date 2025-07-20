import java.io.*;
public class math22
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
double a,b;
System.out.println("enter the number to find out the acos value:-");
a=Integer.parseInt(br.readLine());
b=Math.acos(a);
System.out.println("The acos value of"+a+" is"+b);
}
}
