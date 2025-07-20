import java.io.*;
class wloop1
{
public static void main(String args[])throws IOException
{
int i;
BufferedReader br= new BufferedReader (new InputStreamReader(System.in));
System.out.println("Enter any no.: - ");
i=Integer.parseInt(br.readLine());
i=1;
while(i<=10)
{
System.out.println(i);
i++;
    }
}
    }
