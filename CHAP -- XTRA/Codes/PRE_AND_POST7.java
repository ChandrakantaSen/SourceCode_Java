import java.io.*;
class PRE_AND_POST7
{
public static void main(String args[])
{

int a,b,c,d;
a=5;
b=7;
c=++a-(--b)+(b++);
d=++b-c;
System.out.println(d);
}
}