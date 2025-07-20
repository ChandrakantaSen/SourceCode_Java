import java.io.*;
class matrix_add
{

public static void main(String args[])throws IOException
{

     BufferedReader br=new BufferedReader(new InputStreamReader(System.in)); 
//int m=0,n=0;
int b[][]=new int [2][2];

for(int i=0;i<2;i++)
{
for(int j=0;j<2;j++)
{
System.out.println("enter a  no");
b[i][j]=Integer.parseInt(br.readLine());
    }
}
int a[][]=new int [2][2];
for(int i=0;i<2;i++)
{
for(int j=0;j<2;j++)
{
System.out.println("enter a no");
a[i][j]=Integer.parseInt(br.readLine());
    }
}

int  temp[][]=new int [2][2];
for(int i=0;i<2;i++)
{
for(int j=0;j<2;j++)
{
temp[i][j]=b[i][j]-a[i][j];
 
 
System.out.print(temp[i][j]+"\t");

    }
    System.out.println();
    }
    
}
}