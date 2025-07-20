import java.io.*;
class mergeSrt_bSrc
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

int flagau=-1,flagas=-1,flagbu=-1,flagbs=-1,flagcs=-1,l,u,mid;
System.out.println("enter no to search");
int src=Integer.parseInt(br.readLine());
//searching unsorted a
for(i=0;i<m;i++)
{
if(a[i]==src)
{flagau=i+1;
break;}
    }
    //searching unsorted b
    for(i=0;i<n;i++)
{
if(b[i]==src)
{flagbu=i+1;
break;}
    }
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

//searching sorted a
l=0;
    u=m-1;
    while(l<=u)
    {
        mid=(l+u)/2;
        if(src>a[mid])
        l=mid+1;
        else if(src<a[mid])
        u=mid-1;
        else
        {
            flagas=mid+1;
            break;
        }
    }
    //searching sorted b
    l=0;
    u=n-1;
    while(l<=u)
    {
        mid=(l+u)/2;
        if(src>b[mid])
        l=mid+1;
        else if(src<b[mid])
        u=mid-1;
        else
        {
            flagbs=mid+1;
            break;
        }
    }
    //searching merge array c
    l=0;
    u=m+n-1;
    while(l<=u)
    {
        mid=(l+u)/2;
        if(src>c[mid])
        l=mid+1;
        else if(src<c[mid])
        u=mid-1;
        else
        {
            flagcs=mid+1;
            break;
        }
    }

if((flagau==-1)&&(flagbu==-1))
System.out.println("search - "+src+" not found in array a and array b and thus not in c also");
    else if((flagau!=-1)&&(flagbu!=-1))
{
System.out.println("search - "+src+" found in unsorted array a in pos "+flagau+" and in unsorted array b in pos "+flagbu);
System.out.println("search - "+src+" found in sorted array a in pos "+flagas+" and in sorted array b in pos "+flagbs);
System.out.println("search - "+src+" found in merge array c in pos "+flagcs);
    }
    else if((flagau!=-1)&&(flagbu==-1))
{
System.out.println("search - "+src+" found in unsorted array a in pos "+flagau);
System.out.println("search - "+src+" found in sorted array a in pos "+flagas);
System.out.println("search - "+src+" not found in array b");
System.out.println("search - "+src+" found in merge array c in pos "+flagcs);
    }
    else if((flagau==-1)&&(flagbu!=-1))
{
System.out.println("search - "+src+" found in unsorted array b in pos "+flagbu);
System.out.println("search - "+src+" found in sorted array b in pos "+flagbs);
System.out.println("search - "+src+" not found in array a");
System.out.println("search - "+src+" found in merge array c in pos "+flagcs);
    }
    }
}