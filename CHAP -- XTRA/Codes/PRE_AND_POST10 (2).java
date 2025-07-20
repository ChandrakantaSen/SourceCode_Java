import java.io.*;
class PRE_AND_POST10
{
public static void main(String args[])
{

int v,w,x,y,z;
x=4;
y=12;
z=8;
w=z--+(++y)-(--x);
v=++z+(--w)+(--y);
System.out.println(v);
}
}