import java.io.*;
class dowhile4
{
public static void main(String args[])throws IOException
{
int i,n;
BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
System.out.println("Enter the range : - ");
n=Integer.parseInt(br.readLine());
i=n;
do
{
System.out.println(i);
i--;
    }
    while(i>0);
}
    }
    