import java.io.*;
class patt
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("enter no of stars");
int n=Integer.parseInt(br.readLine());
for(int i=1;i<=n;i++)
{

for(int c=1;c<=i-1;c++)

System.out.print("*\n");

    
    if(n==1)
    System.out.print("*\n");
    else
    { 
        for(int k=0;k<=1;k++)
    {
      System.out.print(" ");
    }}
    for(int t=n-1;t>=1;t--)
    {
  System.out.print("*\n");
}
if(i!=1)
{
//k=k+2;
n=n--;
    }
//System.out.println();
       } 
}
    }
