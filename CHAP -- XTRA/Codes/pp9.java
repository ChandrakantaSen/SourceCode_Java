import java.io.*;
class pp9
{
public static void main(String args[])
{
int a=0,sod=0,sev=0;
do
{
if(a%2==0)
{
sev=sev+a;
}
else
{
sod=sod+a;
}
a++;
}
while(a<=100);
System.out.println("sum of even number is"+sev);
System.out.println("sum of odd number is"+sod);
}
}
