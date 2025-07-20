import java.io.*;
import java.lang.*;
class sg2
{
public static void main(String args[])
{
double a=2,b=6,c=3,d,r1,r2;
d=(Math.pow(b,2))-(4*a*c);
if(a==0)
{
System.out.println("the value a shld not be zero.Aborting!!");
}
else
{
  d=(b*b)-(4*a*c);
 }
 if(d>0)
 {
   r1=-b+(Math.sqrt(d))/2*a;
   r2=-b-(Math.sqrt(d))/2*a;
 System.out.println("the value of r1 is"+"\t"+r1);
 System.out.println("the value of r2 is"+"\t"+r2);
  }
 }
 }
