import java.io.*;
class magic_matrix
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int n=0,i,j,srd=0,sld=0,k=n-1,f=0,sr2=0,sc2=0,sr1=0,sc1=0;
System.out.println("Enter the size of the matrix : - ");
n=Integer.parseInt(br.readLine());
int a[][]=new int[n][n];
System.out.println("Enter the values in the matrix : - ");
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
a[i][j]=Integer.parseInt(br.readLine());
    }
}
System.out.println("The values in the matrix are as follows : - ");
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
System.out.print(a[i][j]+" ");
    }
System.out.println();    
}
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
sr2=sr2+a[i][j];
sc2=sc2+a[j][i];
if(i==0)
{
sr1=sr1+a[i][j];
sc1=sc1+a[j][i];
    }
if(i==j)
sld=sld+a[i][j];
if(j==(n-1-i))
srd=srd+a[i][j];
    }
    if((sc2==sr2)&&(sc1==sr1)&&(sc1==sc2)&&(sr1==sld)&&(sld==srd))
    f=1;
    sr2=0;sc2=0;
}
if(f==1)
System.out.println("it is a magic matrix");
else
System.out.println("it is not a magic matrix");
    }
}