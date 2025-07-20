import java.io.*;
class PRE_AND_POST18
{
public static void main(String args[])throws IOException
{
int i=6,j=9,k=11,l;
l=(i++)+(--j)-(i++)+(--k);
System.out.println(l);
}

}