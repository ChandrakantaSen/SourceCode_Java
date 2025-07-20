import java.io.*;
class whloop2
{
public static void main(String args[])throws IOException
{
int i;
BufferedReader br= new BufferedReader (new InputStreamReader(System.in));
System.out.println("Enter any no.: - ");
i=Integer.parseInt(br.readLine());
i=10;
while(i>0)
{
System.out.println(i);
i--;
    }
}
    }
