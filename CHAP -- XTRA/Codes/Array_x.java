import java.io.*;
class Array_x
{
public static void main (String args[]) throws IOException
{
BufferedReader br=new BufferedReader (new InputStreamReader (System.in));
int a,b,i;
System.out.println("Enter the number of elements in the first array:-");
a=Integer.parseInt(br.readLine());
System.out.println("Enter the number of elements in the second array:-");
b=Integer.parseInt(br.readLine());
int p[]=new int[a];
int q[]=new int[b];
int r[]=new int[a+b];
for(i=0;i<a;i++)
{
System.out.println("Enter the elements:-");
p[i]=Integer.parseInt(br.readLine());
}
for(i=0;i<b;i++)
{
System.out.println("Enter the elements:-");
q[i]=Integer.parseInt(br.readLine());
}
for(i=0;i<a;i++)
{
r[i]=p[i];
}
for(i=0;i<b;i++)
{
r[a+i]=q[i];
}
for(i=0;i<a+b;i++)
{
System.out.println(r[i]);
}
}
}


