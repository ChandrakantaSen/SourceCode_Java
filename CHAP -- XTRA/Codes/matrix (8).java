import java.io.*;
class matrix
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("enter the value of row and column");
int n=Integer.parseInt(br.readLine());
int a[][]=new int[n][n];
int i,j;
System.out.println("enter the values in the matrix");
for(i=0;i<n;i++)
{    
for(j=0;j<n;j++)
{
a[i][j]=Integer.parseInt(br.readLine());
}
}
System.out.println(" the values in the matrix are as follows");
for(i=0;i<n;i++)
{    
for(j=0;j<n;j++)
{
System.out.print(a[i][j]+" ");
}
System.out.println();
}
int sum=0,sum1=0;
int k=0,l=n-1;
int b[][]=new int[n][n];
System.out.println(" the values of the left diagonal ");
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
if(i==j)
{
b[i][j]=a[i][j];
}
else
{
b[i][j]=0;
}
}
}
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
System.out.print(b[i][j]+" ");
}
System.out.println();
}
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
if(i==j)
{
sum+=a[i][j];
}
}
}
System.out.println("the value of the sum of left diagonal="+sum);
}
}
