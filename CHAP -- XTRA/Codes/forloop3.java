import java.io.*;
class forloop3
{
public static void main(String args[])throws IOException
{
int i,n;
BufferedReader br= new BufferedReader (new InputStreamReader(System.in));
System.out.println("Enter any no.: - ");
n=Integer.parseInt(br.readLine());
for(i=0;i<=n;i++)
{
System.out.println(i);
    }
}
    }