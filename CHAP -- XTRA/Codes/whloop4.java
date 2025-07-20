import java.io.*;
class whloop4
{
public static void main(String args[])throws IOException
{
int i,n;
BufferedReader br= new BufferedReader (new InputStreamReader(System.in));
System.out.println("Enter any no.: - ");
n=Integer.parseInt(br.readLine());
i=n;
while(i>0)
{
System.out.println(i);
i--;
    }
}
    }
    