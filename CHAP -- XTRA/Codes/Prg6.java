import java.io.*;
class Prg6
{
public static void main(String args[])throws IOException
{
int i,n,j;
BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
System.out.println("Enter the range : - ");
n=Integer.parseInt(br.readLine());
for(i=1;i<=n;i++)
{
for(j=1;j<=i;j++)
{
System.out.print(" ");
    }
for(j=1;j<=((2*n)-(i*2))+1;j++)
{
if(i==1)
{
if(j%2==1)
{
System.out.print("a");
    }
    else
{
System.out.print(" ");
    }
    }
    else if(i>1)
    {
if((j==1)||(j==((2*n)-(i*2))+1))
{
System.out.print("a");
    }
    else
    {
System.out.print(" ");
    }
}
    }
    System.out.println();
}
    }
}
