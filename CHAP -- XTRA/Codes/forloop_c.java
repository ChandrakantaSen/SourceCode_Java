import java.io.*;
class forloop_c
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int i,n;
System.out.println("Enter the Range ");
n=Integer.parseInt(br.readLine());
System.out.println("The numbers are as follows");
for(i=1;i<=n;i++)
{
System.out.println(i);
}
}
}

