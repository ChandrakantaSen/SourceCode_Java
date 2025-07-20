import java.io.*;
class dowhileloop_c
{
public static void main(String args[])throws IOException
{
int i,n;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the Range ");
n=Integer.parseInt(br.readLine());
System.out.println("The no from 1 to 10 are as follows");
i=1;
do
{
System.out.println(i);
i++;
}
while(i<=n);

}
}
