import java.io.*;
class PRE_AND_POST12
{
public static void main(String args[])
{

int f,a,r,m;
f=13;
a=7;
r=5;
m=++f-(r++)-(a--)+(--f);

System.out.println(m);
}
}