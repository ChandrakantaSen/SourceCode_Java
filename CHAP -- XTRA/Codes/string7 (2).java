import java.io.*;
class string7
{
    public static void main(String args[])throws IOException
    {
String s,a,b;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter your first name : -   ");
a=br.readLine();
System.out.println("Enter your last name : -   ");
b=br.readLine();
s=a.concat(b);
System.out.println("Your full name is =  "+s);
    }
}