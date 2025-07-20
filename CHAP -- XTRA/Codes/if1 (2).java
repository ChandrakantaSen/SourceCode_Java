import java.io.*;
class if1
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int a;

a=Integer.parseInt(br.readLine());
System.out.println("Enter the number : - ");
if(a>0)
{
System.out.println(a+" is positive . ");
}
else
{
System.out.println(a+" is negative . ");
}
}
}