import java.io.*;
public class math9

{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
double a,b,c;
System.out.println("enter the number:-");
a=Integer.parseInt(br.readLine());
System.out.println("enter the power:-");
b=Integer.parseInt(br.readLine());
c=Math.cbrt(a+b);
System.out.println("The answer is "+c);
}
}
