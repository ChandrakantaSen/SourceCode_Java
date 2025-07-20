import java.io.*;
class ifelseif
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int a;
System.out.println("Enter the number : - ");
a=Integer.parseInt(br.readLine());
if(a>0)
{
System.out.println(a+" is positive . ");
}
else if(a==0)
{
System.out.println(a+" is zero . ");
}
else
{
System.out.println(a+" is negative . ");
}
}
}