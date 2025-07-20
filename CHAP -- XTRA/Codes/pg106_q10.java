import java.io.*;
class pg106_q10
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
double h,b,p;
System.out.println("Enter the hpotenuse::");
h=Double.parseDouble(br.readLine());
System.out.println("Enter the base::");
b=Double.parseDouble(br.readLine());
System.out.println("Enter the perpendicular::");
p=Double.parseDouble(br.readLine());
if((p*p)+(b*b)==(h*h))
{
System.out.println("The pythagoras triplet possible::");
}
else
{
System.out.println("The pythagoras triplet not possible::");
}
}
}
