import java.io.*;
public class math14
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
double a,b;
System.out.println("enter the number to find out the real integer:-");
a=Integer.parseInt(br.readLine());
b=Math.rint(a);
System.out.println("The real integer value of"+a+" is"+b);
}
}
