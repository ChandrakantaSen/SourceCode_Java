import java.io.*;
public class subs_long
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
long a,b,c;
System.out.println("enter the first number:-");
a=Long.parseLong(br.readLine());
System.out.println("enter the second number:-");
b=Long.parseLong(br.readLine());
c=a-b;
System.out.println("the additional value of "+a+" and "+b+"is :-"+c);
}
}















