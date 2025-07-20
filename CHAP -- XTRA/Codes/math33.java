import java.util.*;
import java.io.*;
public class math33
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int a,b,c;
System.out.println("Enter the upper range");
a=Integer.parseInt(br.readLine());
System.out.println("Enter the lower range");
b=Integer.parseInt(br.readLine());
c=(int)(Math.random()*(a-b))+b;
System.out.println(b);
}
}
