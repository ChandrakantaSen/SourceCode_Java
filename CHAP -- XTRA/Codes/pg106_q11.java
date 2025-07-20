import java.io.*;
class pg106_q11
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
double a,b,c;
System.out.println("Enter the first side::");
a=Double.parseDouble(br.readLine());
System.out.println("Enter the second side::");
b=Double.parseDouble(br.readLine());
System.out.println("Enter the third side::");
c=Double.parseDouble(br.readLine());
if(((a+b)>c)&&((a+c)>b)&&((b+c)>a))
{
System.out.println("The triangle is possible::");
}
else
{
System.out.println("The triangle is not possible::");
}
}
}
