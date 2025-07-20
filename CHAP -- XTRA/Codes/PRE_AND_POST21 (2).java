import java.io.*;
class PRE_AND_POST21
{
public static void main(String args[])throws IOException
{
int t=14,u=16,v;
v=(--t)+(u--)-(--t)+(t++);
System.out.println(v);
}

}