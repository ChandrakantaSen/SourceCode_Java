import java.io.*;
class mp
{
public static void main(String args[])throws IOException
{
int i,j,n;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the no. of element=");
n=Integer.parseInt(br.readLine());
for(i=1;i<=n;i++)
{
System.out.println();
for(j=1;j<=i;j++)
{

System.out.print("\t"+n*j);
}
System.out.println("");
}
}}
