import java.io.*;
class whloop3
{
public static void main(String args[])throws IOException
{
int i,n;
BufferedReader br= new BufferedReader (new InputStreamReader(System.in));
System.out.println("Enter any no.: - ");
n=Integer.parseInt(br.readLine());
i=1;
while(i<=n)
{
System.out.println(i);
i++;
    }
}
    }
