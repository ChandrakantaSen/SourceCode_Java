import java.io.*;
class saddle_point_mat
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int n,i,j,h=0,p=0,q,m;
System.out.println("Enter the no of rows of the matrix : - ");
n=Integer.parseInt(br.readLine());
System.out.println("Enter the no of columns of the matrix : - ");
m=Integer.parseInt(br.readLine());
int a[][]=new int[n][m];
System.out.println("Enter the values in the matrix : - ");
for(i=0;i<n;i++)
{
for(j=0;j<m;j++)
{
a[i][j]=Integer.parseInt(br.readLine());
    }
}
System.out.println("The values in the matrix are as follows : - ");
for(i=0;i<n;i++)
{
for(j=0;j<m;j++)
{
System.out.print(a[i][j]);
    }
System.out.println();
}
for(j=0;j<m;j++)
{
for(i=0;i<n;i++)
{
if(a[i][j]>h)
{
h=a[i][j];
p=i;
    }
}
i=p;
q=0;
for(j=0;j<m;j++)
{
if(a[i][j]<h)
q=1;
    }
    if(q==0)
    System.out.println("Saddle Point found at row "+(p+1)+" & column 1 = "+h);
    else
    System.out.println("Saddle Point not found");
}
    }
}