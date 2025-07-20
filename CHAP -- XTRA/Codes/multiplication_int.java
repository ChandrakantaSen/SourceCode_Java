import java.io.*;
public class multiplication_int
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int a,b,c;
System.out.println("enter the first number:-");
a=Integer.parseInt(br.readLine());
System.out.println("enter the second number:-");
b=Integer.parseInt(br.readLine());
c=a*b;
System.out.println("the multiplied value of "+a+" and "+b+"is :-"+c);
}
}















