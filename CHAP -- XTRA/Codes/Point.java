import java.io.*;
class Point
{
static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
static double x,y,x2,y2,a,b,c,d,e,g;
Point(double x1,double x3,double y1,double y3)
{
x=x1;
y=y1;
x2=x3;
y2=y3;
}
static void dis()
{
a=x2-x;
b=y2-y;
c=Math.pow(a,2);
d=Math.pow(b,2);
e=c+d;
g=Math.sqrt(e);
}
static void print()throws IOException
{
System.out.println(" the first value for x: "+x);
System.out.println(" the second value for x: "+x2);
System.out.println(" the first value for y: "+y);
System.out.println(" the second value for y: "+y2);
System.out.println(" The distance b/w the two values is : "+g);
}
public static void main()throws IOException
{
double u,v,p,q;
System.out.println("Enter the first value for x: ");
u=Double.parseDouble(br.readLine());
System.out.println("Enter the second value for x: ");
v=Double.parseDouble(br.readLine());
System.out.println("Enter the first value for y: ");
p=Double.parseDouble(br.readLine());
System.out.println("Enter the second value for y: ");
q=Double.parseDouble(br.readLine());
Point ob=new Point(u,v,p,q);
ob.dis();
ob.print();
}
}