import java.io.*;
class circularmat
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int n,i,j,s=0,d=0,m;
System.out.println("Enter the size of the matrix : - ");
n=Integer.parseInt(br.readLine());
m=n*2;
int a[][]=new int[n][n];
System.out.println("Enter the values in the matrix : - ");
while(s!=n*2)
{
i=d;
for(j=d;j<n-d-1;j++)
a[i][j]=Integer.parseInt(br.readLine());
s++;
if(s==m)
break;
j=n-d-1;
for(i=d;i<n-d-1;i++)
a[i][j]=Integer.parseInt(br.readLine());
s++;
if(s==m)
break;
i=n-d-1;
for(j=n-d-1;j>d;j--)
a[i][j]=Integer.parseInt(br.readLine());
s++;
if(s==m)
break;
j=d;
for(i=n-d-1;i>d;i--)
a[i][j]=Integer.parseInt(br.readLine());
s++;
d++;
    }
    if(n%2==1)
    {
    int c=n/2;
    a[c][c]=Integer.parseInt(br.readLine());
    }
System.out.println("The values in the matrix are as follows : - ");
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
System.out.print(a[i][j]);
    }
System.out.println();
}
    }
}

