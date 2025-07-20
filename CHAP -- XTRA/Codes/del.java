import java.io.*;
class del
{
public static void main(String args[])throws IOException
{
 BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
int i,j,k,n;
int a[]=new int[5];
System.out.println("Enter the elements :"); 
for(i=0;i<5;i++)
{
a[i]=Integer.parseInt(buf.readLine());
}
System.out.println("Enter the position :");     
n=Integer.parseInt(buf.readLine());
if((n>0)&&(n<=5))
{
n=n-1;
k=a[n];
for(i=n;i<4;i++)
{
a[i]=a[i+1];
    }
    a[4]=0;
for(i=0;i<5;i++)
{
System.out.println(a[i]);
    }
}
else
{
for(i=0;i<5;i++)
{
System.out.println(a[i]);
    }
    }

}
    }
