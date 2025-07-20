import java.io.*;
class anti_circular_matrix
{
public static void main(String args[])throws IOException
{
int n,i,j,s=0,d=0,m,p=0;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the size of the matrix : - ");
n=Integer.parseInt(br.readLine());
int a[]=new int[n*n];
m=n*2;
System.out.println("Enter the values in the array : - ");
for(i=n*n-1;i>=0;i--)
{
a[i]=Integer.parseInt(br.readLine());
    }
    int mat[][]=new int[n][n];
while(s!=n*2)
{
i=d;
for(j=d;j<n-d-1;j++)
mat[i][j]=a[p++];
s++;
if(s==m)
break;
j=n-d-1;
for(i=d;i<n-d-1;i++)
mat[i][j]=a[p++];
s++;
if(s==m)
break;
i=n-d-1;
for(j=n-d-1;j>d;j--)
mat[i][j]=a[p++];
s++;
if(s==m)
break;
j=d;
for(i=n-d-1;i>d;i--)
mat[i][j]=a[p++];
s++;
d++;
    }
    if(n%2==1)
    {
    int c=n/2;
    mat[c][c]=a[p++];
    }
    System.out.println("The values in the matrix are as follows : - ");
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
System.out.print(mat[i][j]);
    }
System.out.println();
}
    }
}

