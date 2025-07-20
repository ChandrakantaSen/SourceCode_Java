import java.io.*;
import java.lang.*;
class sg3
{
public static void main(String args[])
{
double a=2,b=5,p,q,c;
if(a>b)
{
p=a/b;
q=a-b;
System.out.println("Division of a/b is:"+p+"\t"+q);
}
else
{
c=a;
a=b;
b=c;
System.out.println("The interchanged value of a & b is:"+a+"\t"+b);
}
}
}

