import java.io.*;
class PRE_AND_POST20
{
public static void main(String args[])throws IOException
{
int q=8,r=10,s;
s=(r++)-(--q)-(++r)+(q--);
System.out.println(s);
}

}