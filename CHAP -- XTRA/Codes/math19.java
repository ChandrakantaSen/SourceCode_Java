import java.io.*;
public class math19
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
double a,b;
System.out.println("enter the number to find out the sec value:-");
a=Integer.parseInt(br.readLine());
b=1/(Math.cos(a));
System.out.println("The sec value of"+a+" is"+b);
}
}
