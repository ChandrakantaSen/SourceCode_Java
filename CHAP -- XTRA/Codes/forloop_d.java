import java.io.*;
class forloop_d
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int i,n;
System.out.println("Enter the Range ");
n=Integer.parseInt(br.readLine());
System.out.println("The numbers are as follows");
for(i=n;i>=1;i--)
{
System.out.println(i);
}
}
}

