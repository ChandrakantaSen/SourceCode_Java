import java.io.*;
class ifor
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int a;
System.out.println("Enter the number : - ");
a=Integer.parseInt(br.readLine());
if((a%2==0)||(a%4==0))
{
System.out.println(a+" is divisible by 2 or 4 . ");
}
else
{
System.out.println(a+" is not divisible by both 2 or 4  . ");
}
}
}