import java.io.*;
class array_skip_pos
{
public static void main(String args[])throws IOException
{
int n,i,j,c=0,p=0,k=0,t=0,x;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the size of the array : - ");
n=Integer.parseInt(br.readLine());
int a[]=new int[n];
System.out.println("Enter the values in the array : - ");
for(i=0;i<n;i++)
{
a[i]=Integer.parseInt(br.readLine());
    }
x=n;
System.out.println("The values in the array are as follows : - ");
for(i=0;i<n;i++)
{
System.out.println(a[i]);
    }
for(j=0;j<(x/2)+1;j++)    
{
t=0;
k=0;
for(i=0;i<n;i++)
{
a[k]=a[i];
c++;
k++;
t++;
if(t==p)
{
t=0;
i++;
    }
    }
n=c;
c=0;
p++;
System.out.println("The values in the array are as follows : - ");
for(i=0;i<n;i++)
{
System.out.print(a[i]+"  ");
    }    
System.out.println();
    }
}
    }