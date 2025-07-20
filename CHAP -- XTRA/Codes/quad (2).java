import java.io.*;
import java.lang.*;
class quad
{
public static void main(String args[])
{
double r1,r2,b=6,a=2,c=3,d;
d=b*b-4*a*c;

if(a==0)
{
System.out.println("it will reach infinity");
}

else
{
d=b*b-4*a*c;
}

if(d>0)
{
r1=-b+(Math.sqrt(d))/(2*a);
r2=-b-(Math.sqrt(d))/(2*a);
System.out.println("roots are real and unequal");
System.out.println("r1 value is" +r1);
System.out.println("r2 value is" +r2);

}
else

System.out.println("roots are complex and imaginary");

}
}


