import java.io.*;
class pow1
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
double a,b;
System.out.println("Enter the First number : - ");
a=Double.parseDouble(br.readLine());
b=Math.pow(a,2);
System.out.println("The square of "+a+" is = "+b);
}
}