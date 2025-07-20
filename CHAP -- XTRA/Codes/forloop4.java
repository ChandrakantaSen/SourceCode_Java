import java.io.*;
class forloop4
{
public static void main(String args[])throws IOException
{
int i,n;
BufferedReader br= new BufferedReader (new InputStreamReader(System.in));
System.out.println("Enter any no.: - ");
n=Integer.parseInt(br.readLine());
for(i=n;i>0;i--)
{
System.out.println(i);
    }
}
    }
