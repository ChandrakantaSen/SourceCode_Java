import java.io.*;
class PRE_AND_POST4
{
public static void main(String args[])throws IOException 
{
BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
int a;
a=5;
++a;
System.out.println(a++);
}
}