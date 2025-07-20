import java.io.*;
class insertion_Sort2
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int i,s,t=0,k;
System.out.println("Enter the size of the array : -");
s=Integer.parseInt(br.readLine ());
int a[]=new int[s];
System.out.println("Enter the numbers in an arrary: - ");
for(i=0;i<s;i++)
{
a[i]=Integer.parseInt(br.readLine ());
    }
System.out.println("The values in the array are as follows : -");  
for(i=0;i<s;i++)
    {
        System.out.println(a[i]);
    }
        for (i=0;i<s;i++)
{
for (int j=0;j<i;j++)
            {
                if (a[j]>a[i])
{
t=a[j];    
a[j]=a[i];
for (k=i;k>j;k--)
  a[k]=a[k-1];
a[k+1]=t;
    }
}
    }
    System.out.println(" The sorted array is:");
for(i=0;i<s;i++)
{
System.out.print(a[i]+"\t");
    }
}
    }
