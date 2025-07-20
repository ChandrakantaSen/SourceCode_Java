import java.io.*;
class whileloop_d
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int i,n;
System.out.println("Enter the Range ");
n=Integer.parseInt(br.readLine());
System.out.println("The numbers are as follows");
i=n;
while(i>=1)
{
System.out.println(i);
i--;
}
}
}

