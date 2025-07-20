import java.io.*;
class PRE_AND_POST5
{
public static void main(String args[])throws IOException 
{
BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
int a,b,c;
a=5;
b=4;
c=(++a)+(b++)-(a--)+(b--);
System.out.println(c);
}
}