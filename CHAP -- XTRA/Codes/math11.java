import java.io.*;
public class math11
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
double a,b;
System.out.println("enter the number to find out the floor value:-");
a=Integer.parseInt(br.readLine());
b=Math.floor(a);
System.out.println("The floor value of"+a+" is"+b);
}
}
