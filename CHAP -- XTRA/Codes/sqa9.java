class sqa9
{
public static void main(String args[])
{
int  a=6,b=8,c=6;
double d;
double root1;
double root2;
d=(b*b)-(4*a*c);
if (a==0)
{
System.out.println("Value of a should be zero.Aboriting!!"+d);
}

else  
{
d=b*b-4*a*c;
}
if (d>0)
{

root1=(-b+Math.sqrt(d))/(2*a);
root2=(-b-Math.sqrt(d))/(2*a);
System.out.println("Root are real and unegual"+root1);
System.out.println("Root are real and unegual"+root2);
}
else

System.out.println("Root are complex & imaginary");


}
}



