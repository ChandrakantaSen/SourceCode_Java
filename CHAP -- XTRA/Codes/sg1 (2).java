import java.io.*;
import java.lang.*;
class sg1
{
public static void main(String args[])
{
double a=2,b=3,c=4;
if(a==b && a==c && b==c)
{
System.out.println("TRIANGLE IS EQUILATERAL");
}
else if(a==b || a==c || b==c)
{
System.out.println("TRIANGLE IS ISOSCALE");
}
else
{
System.out.println("TRIANGLE IS SCALENE");
}
}
}








