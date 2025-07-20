import java.io.*;
class forloop2
{
public static void main(String args[])throws IOException
{
int i;
BufferedReader br= new BufferedReader (new InputStreamReader(System.in));
System.out.println("Enter any no.: - ");
i=Integer.parseInt(br.readLine());
for(i=10;i>0;i--)
{
System.out.println(+i);
    }
}
    }