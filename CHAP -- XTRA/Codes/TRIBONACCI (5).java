package All;

import java.io.*;

class TRIBONACCI
{

public static void main(String[] args)throws IOException
{
BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter n.....");
int n=Integer.parseInt(in.readLine());

int a=0;
int b=0;
int c=1;
int d=a+b+c;

System.out.print(a+"\t"+b+"\t"+c);
for(int i=4;i<=n;i++)
{
System.out.print("\t"+d);
a=b;
b=c;
c=d;
d=a+b+c;
}

}
}