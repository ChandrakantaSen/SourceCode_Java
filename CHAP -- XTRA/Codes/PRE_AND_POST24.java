import java.io.*;
class PRE_AND_POST24
{
public static void main(String args[])throws IOException
{
int u=8,v=7,w=9,x=11,y,z;
y=--u+(u++)-(--v)-(w--)+(--x);
z=8-(--y);
System.out.println(z);
}

}