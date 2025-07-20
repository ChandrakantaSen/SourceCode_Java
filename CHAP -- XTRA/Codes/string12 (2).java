import java.io.*;
class string12
{
public static void main(String args[])throws IOException
{
String s,k,t,h;
BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
System.out.println("Enter your first name : - ");
s=br.readLine();
System.out.println("Enter your middle name : - ");
k=br.readLine();
System.out.println("Enter your last name : - ");
t=br.readLine();
h=s+k+t;
System.out.println("Your full name is : - "+h);
    }
}