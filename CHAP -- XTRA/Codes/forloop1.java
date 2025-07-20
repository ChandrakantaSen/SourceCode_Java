import java.io.*;
class forloop1
{
public static void main(String args[])throws IOException
{
int i;
BufferedReader br= new BufferedReader (new InputStreamReader(System.in));
System.out.println("Enter any no.: - ");
i=Integer.parseInt(br.readLine());
for(i=1;i<=10;i++)
{
System.out.println(+i);
    }
}
    }