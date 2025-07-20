/*STORING THE FIRS 20 NUMBERS IN THE FIBONACCI SERIES AND PRINTING IT WHERE THE FIRST TWO ELEMENT IS TO BE 
 ENTERED BY THE USER AND THEN PRINT ONLY THOSE NUMBER WHICH ARE PRIME*/
import java.io.*;
class p402_20
{
public static void main(String args[])throws IOException
{
int i,j,c=0;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int a[]=new int[20];
System.out.println("Enter the first two numbers of the fibonacci series");
a[0]=Integer.parseInt(br.readLine());
a[1]=Integer.parseInt(br.readLine());
System.out.println("The first 20 numbers in the fibonacci series are as follows:-");
System.out.print(a[0]+" ");
System.out.print(a[1]+" ");
for(i=2;i<20;i++)
{
a[i]=a[i-1]+a[i-2];
System.out.print(a[i]+" ");
}
System.out.println("\nThe prime numbers in the fibonacci series are as follows:-");
for(i=0;i<20;i++)
{
c=0;
for(j=1;j<=a[i];j++)
{
if(a[i]%j==0)
{
c++;
}
}
if(c==2)
{
System.out.println(a[i]+" ");
}
}
}
}