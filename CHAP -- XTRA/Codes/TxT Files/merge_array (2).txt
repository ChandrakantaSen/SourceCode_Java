import java.io.*;
class prog2
{
public static void main(String args[]) throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int b[]=new int[5];
int c[]=new int[10];
int a[]=new int[5];
int i,j=0;
for(i=0;i<5;i++)
{
System.out.println("ENTER VALUE OF ONE ARRAY");
a[i]=Integer.parseInt(br.readLine());
    }
for(i=0;i<5;i++)
{
System.out.println("ENTER VALUE OF ANOTHER ARRAY");
b[i]=Integer.parseInt(br.readLine());
}
for(i=0;i<5;i++)
{
c[i]=a[i];
 j++;   }
for(i=0;i<5;i++)
{
c[j]=b[i];
   j++; }
for(i=0;i<10;i++)
{
System.out.println(c[i]);
    }
}
    }