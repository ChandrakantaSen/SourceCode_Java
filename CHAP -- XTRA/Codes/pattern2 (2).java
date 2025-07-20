import java.io.*;
class pattern2
{
public static void main(String args[])
{
int a,b,p=2,c;
for(a=1;a<=5;a++)
{
for (b=1;b<=a;b++)
System.out.print(a);
for(c=b;c<=5;c++)
System.out.print(c);
System.out.println();
p=p+1;
}
}
}
