import java.io.*;
class dowhileloop_d
{
public static void main(String args[])throws IOException
{
int i,n;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the Range ");
n=Integer.parseInt(br.readLine());
System.out.println("The numbers are as follows");
i=n;
do
{
System.out.println(i);
i--;
}
while(i>=1);

}
}
