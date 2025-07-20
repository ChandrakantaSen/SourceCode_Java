import java.io.*;
class saddle
{
void main()throws IOException
{
 BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
int m,n,c,i=0,j,max,min,k,z=0;
System.out.println("Enter the no. of rows :");
m=Integer.parseInt(buf.readLine());
System.out.println("Enter the no. of columns :");
n=Integer.parseInt(buf.readLine());
int a[][]=new int[m][n];
System.out.println("Enter elements in the matrix :");
for(i=0;i<m;i++)
{
for(j=0;j<n;j++)
{
a[i][j]=Integer.parseInt(buf.readLine());
    }
}
System.out.println("The matrix :");
for(i=0;i<m;i++)
{
for(j=0;j<n;j++)
{
System.out.print(a[i][j]+" ");
    }
    System.out.println();
}
for(i=0;i<m;i++)
{
max=0;
c=0;
k=0;
for(j=0;j<n;j++)
{
if(a[i][j]>max)
{
max=a[i][j];
c=j;    
}
}
for(j=0;j<m;j++)
{
if(max>a[j][c])
{
k=1;
    }
}
if(k==0)
{
System.out.println("Saddle point--->"+max);
z++;    
}
}
if(z==0)
{
System.out.println("No Saddle point");
    }
    }
}
