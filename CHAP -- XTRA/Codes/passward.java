import java.io.*;
public class passward
{
public static void main(String[]args)throws IOException
{
BufferedReader qads =new BufferedReader(new InputStreamReader(System.in));
System.out.println("enter your passward");
int a =Integer.parseInt(qads.readLine());
switch (a)
{
case 231007:
System.out.println("welcome");
break;
default:
System.out.println("out");
    }
}
    }