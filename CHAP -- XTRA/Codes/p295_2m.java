/*                SERIES
(2^a/a+1 +3^a/a+2 +4^a/a+3+.......TO n TERMS*/
import java.io.*;
class p295_2m
{
public static void main(String args[])throws IOException
{
int a,i,n,j,k;
double s=0.0;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the range");
n=Integer.parseInt(br.readLine());
System.out.println("Enter the value of a");
a=Integer.parseInt(br.readLine());
for(i=1;i<=n;i++)
{
j=2;
k=1;
s=s+(Math.pow(j,a)/(a+k));
j++;
k++;
}
System.out.println(s);
}
}