import java.io.*;
class magic_sq
{
public static void main(String arga[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("enter the size of the square matrix");
int n=Integer.parseInt(br.readLine());
int b[][]=new int[n][n];
for(int i=0;i<n;i++)
{
for(int j=0;j<n;j++)
{
System.out.println("enter a value");
b[i][j]=Integer.parseInt(br.readLine());
    }
}
for(int r=0;r<n;r++)
{
for(int c=0;c<n;c++)
{
sum=sum+b[r][c];