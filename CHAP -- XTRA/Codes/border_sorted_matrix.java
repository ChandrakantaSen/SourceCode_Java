import java.io.*;
class border_sorted_matrix
{
public static void main()throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("enter the size");
int m=Integer.parseInt(br.readLine());
int a[][]=new int[m][m];
System.out.println("enter the numbers");
int i,j;
for(i=0;i<m;i++)
{
for(j=0;j<m;j++)
{
a[i][j]=Integer.parseInt(br.readLine());
}
}System.out.println("Original matrix is");
for(i=0;i<m;i++)
{
for(j=0;j<m;j++)
{
System.out.print(a[i][j]+" ");
}
System.out.println();
}
int b[]=new int[(m-1)*4];
int x;x=0;
i=0;
for(j=0;j<m-1;j++)
{
b[x]=a[i][j];
x++;
}
j=m-1;
for(i=0;i<m-1;i++)
{
b[x]=a[i][j];
x++;
}
i=m-1;
for(j=m-1;j>0;j--)
{
b[x]=a[i][j];
x++;
}
j=0;
for(i=m-1;i>0;i--)
{
b[x]=a[i][j];
x++;
}
int t=0;
for(i=0;i<((m-1)*4)-1;i++)
{ 
int min=i;
for(j=i+1;j<(m-1)*4;j++)
{
if(b[j]<b[min])
min=j;
}
t=b[i];
b[i]=b[min];
b[min]=t;
}
x=0;
i=0;
for(j=0;j<m-1;j++)
{
a[i][j]=b[x];
x++;
}
j=m-1;
for(i=0;i<m-1;i++)
{
a[i][j]=b[x];
x++;
}
i=m-1;
for(j=m-1;j>0;j--)
{
a[i][j]=b[x];
x++;
}
j=0;
for(i=m-1;i>0;i--)
{
a[i][j]=b[x];
x++;
}System.out.println("border sorted matrix is");
for(i=0;i<m;i++)
{
for(j=0;j<m;j++)
{
System.out.print(a[i][j]+" ");
}
System.out.println();
}
}
}
