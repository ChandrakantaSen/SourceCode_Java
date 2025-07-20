import java.io.*;
class pow2
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
double a,b,c;
System.out.println("Enter the number : - ");
a=Double.parseDouble(br.readLine());
System.out.println("Enter the exponent : - ");
b=Double.parseDouble(br.readLine());
c=Math.pow(a,b);
System.out.println("The "+a+" to the power "+b+" is = "+c);
}
}