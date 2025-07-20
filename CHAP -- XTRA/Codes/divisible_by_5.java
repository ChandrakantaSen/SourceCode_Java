import java.io.*;
public class divisible_by_5
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
double a;
System.out.println("enter the first number:-");
a=Double.parseDouble(br.readLine());
if(a%5==0)
{
System.out.println(a+ "is divisible by 5");
}
else
{
System.out.println(a+ "is not is divisible by 5");
}
}
}
