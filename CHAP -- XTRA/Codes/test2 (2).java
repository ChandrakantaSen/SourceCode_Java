import java.io.*;
class test2
{
public static void main(String args[])
{
int a=0,sev=0,sod=0;
while(a<=10)
{
if (a%2==0)
{
sev=sev+a;
}
else
{
sod=sod+a;
}
a++;
}
System.out.println("Sum of even "+sev);
System.out.println("Sum of odd "+sod);
}
}

