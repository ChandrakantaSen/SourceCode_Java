import java.io.*;
public class math15
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
double a,b;
System.out.println("enter the number to find out the sin value:-");
a=Integer.parseInt(br.readLine());
b=Math.sin(a);
System.out.println("The sin value of"+a+" is"+b);
}
}
