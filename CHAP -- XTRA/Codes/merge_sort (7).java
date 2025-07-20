import java.io.*;
class merge_sort
{
public static void main(String args[])throws IOException
{int i,j,k;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("enter the number of elements in the array a");
int m=Integer.parseInt(br.readLine());
int a[]=new int [m];
System.out.println("enter the elements of the array a");
for(i=0;i<m;i++)
a[i]=Integer.parseInt(br.readLine());
System.out.println("nos are");
for(i=0;i<m;i++)
System.out.println(a[i]);

System.out.println("enter the number of elements in the array b");
int n=Integer.parseInt(br.readLine());
int b[]=new int [n];
System.out.println("enter the elements of the array b");
for(i=0;i<n;i++)
b[i]=Integer.parseInt(br.readLine());
System.out.println("nos are");
for(i=0;i<n;i++)
System.out.println(b[i]);

//sorting of a
int min=0,temp;
for(i=0;i<m-1;i++)
{
min=i;
for(j=i+1;j<m;j++)
{
if(a[j]<a[min])
{
temp=a[j];
a[j]=a[i];
a[i]=temp;
    }
}
    }
System.out.println("nos of array a in ascending order are");
for(i=0;i<m;i++)
System.out.println(a[i]);

//sorting of b
for(i=0;i<n-1;i++)
{
min=i;
for(j=i+1;j<n;j++)
{
if(b[j]<b[min])
{
temp=b[j];
b[j]=b[i];
b[i]=temp;
    }
}
    }
System.out.println("nos of array b in ascending order are");
for(i=0;i<n;i++)
System.out.println(b[i]);

//merge sort
int c[]=new int[m+n];
for(i=j=k=0;i<(m+n);)
{
if(a[j]<b[k])
c[i++]=a[j++];
else if(a[j]>=b[k])
c[i++]=b[k++];
    if((j==m)||(k==n))
    {
     break;
    }
}
for(;j<m;)
c[i++]=a[j++];
for(;k<n;)
c[i++]=b[k++];

System.out.println("nos of merge array c in ascending order are");
for(i=0;i<(m+n);i++)
System.out.println(c[i]);
    }
}