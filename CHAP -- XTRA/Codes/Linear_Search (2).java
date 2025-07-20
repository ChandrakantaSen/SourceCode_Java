import java.io.*;
class Linear_Search
{
public static void main (String args[]) throws IOException
{
BufferedReader br=new BufferedReader (new InputStreamReader (System.in));
int i,n,k,flag=0;
System.out.println ("Enter the size of the array : - ");
n=Integer.parseInt(br.readLine());
int a[]=new int[n];
System.out.println ("Enter the values in the array : - ");
for (i=0;i<n;i++)
{
a[i]=Integer.parseInt(br.readLine());
}
System.out.println ("Enter the no. to be find in the array");
k=Integer.parseInt (br.readLine());
for (i=0;i<n;i++)
{
if (a[i]==k)
{
flag=1;
break;
    }
}
if (flag==1)
{
System.out.println (k+" is found at "+(i+1)+"th possision in the array ");
    }
    else
    {
        System.out.println ("The values not found");
    }
}
    }
  



