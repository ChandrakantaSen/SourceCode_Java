import java.io.*;
import java.lang.*;
class sg
{
public static void main(String args[])
{
double a=4,b=2,f,g,x,y,p,q,s,t,c;
x=a+b;
y=a-b;
f=(Math.pow(x,2));
g=(Math.pow(y,2));
p=(Math.pow(x,3));
q=(Math.pow(y,3));
s=(Math.sqrt(f-g));
t=(Math.sqrt(p-q));
c=s/t;

System.out.println("Sqrt is :"+"\t"+c);




}
}
