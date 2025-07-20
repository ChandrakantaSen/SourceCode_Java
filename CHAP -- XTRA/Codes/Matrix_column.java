import java.io.*;
class Matrix_column
{
public static void main (String args[]) throws IOException
{
BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
int i,j,r,c;
System.out.println("Enter rows and columns");
r=Integer.parseInt(br.readLine());
c=Integer.parseInt(br.readLine());
int n[][]=new int[r][c];
for(i=0;i<r;i++)
{
for(j=0;j<c;j++)
{
System.out.println("Enter the number");
n[i][j]=Integer.parseInt(br.readLine());
}
}
System.out.println("The value of the second columnis:");
for(j=0;j<3;j++)
{
System.out.println(n[j][1]);
}
}
}

