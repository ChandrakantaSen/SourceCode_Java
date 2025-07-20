import java.util.*;
import java.io.*;
public class math32
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int a,b;
System.out.println("Enter the range");
a=Integer.parseInt(br.readLine());
b=(int)(Math.random()*a);
System.out.println(b);
}
}
