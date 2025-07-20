import java.io.*;
public class math16
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
double a,b;
System.out.println("enter the number to find out the cos value:-");
a=Integer.parseInt(br.readLine());
b=Math.cos(a);
System.out.println("The cos value of"+a+" is"+b);
}
}
