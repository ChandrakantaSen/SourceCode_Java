import java.io.*;
class pg106_q12
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
double a,b,c,d,r1,r2;
System.out.println("Enter the first side::");
a=Integer.parseInt(br.readLine());
System.out.println("Enter the second side::");
b=Integer.parseInt(br.readLine());
System.out.println("Enter the third side::");
c=Integer.parseInt(br.readLine());
d=((b*b)-(4*a*c));
if(d>0)
{
System.out.println("Roots are real and unequal::");
r1=((-b+(Math.sqrt(d)))/2*a);
r2=((-b-(Math.sqrt(d)))/2*a);
System.out.println("Root 1 is"+r1);
System.out.println("Root 2 is"+r2);
}
else if(d==0)
{
System.out.println("Roots are real and equal::");
r1=((-b+(Math.sqrt(d)))/2*a);
r2=((-b-(Math.sqrt(d)))/2*a);
System.out.println("Root 1 is"+r1);
System.out.println("Root 2 is"+r2);
}
else
{
System.out.println("Roots are imaginary::");
}
}
}


