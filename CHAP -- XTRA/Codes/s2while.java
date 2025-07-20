import java.io.*;
class s2while
{
public static void main(String args[])throws IOException
{
int i=1,s=0,n;
BufferedReader br= new BufferedReader (new InputStreamReader(System.in));
System.out.println("Enter the range : - ");
n=Integer.parseInt(br.readLine());
do
{

s=s+i;
i++;
    }
    while(i<=n);
 System.out.println("The sum of the series : - "+s);   
}}