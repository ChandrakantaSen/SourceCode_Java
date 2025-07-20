 import java.io.*;               
class buzz_num
{
public static void main(String args[])throws IOException
{
 BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
int a;
System.out.println("Enter the number to find whether it is buzz or not");
a=Integer.parseInt(br.readLine());
if((a%7==0)||(a%10==7))
{
System.out.println(a+"is a buzz number");
}
else
{
System.out.println(a+"is not a buzz number");
}
}
}