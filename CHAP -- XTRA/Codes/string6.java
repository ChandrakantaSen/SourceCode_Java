import java.io.*;
class string6
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String s,k,g;
System.out.println("Enter your first name");
s=br.readLine();
System.out.println("Enter your middle name");
k=br.readLine();
System.out.println("Enter your last name");
g=br.readLine();
s=s.concat(" ");
s=s.concat(k);
s=s.concat(" ");
s=s.concat(g);
System.out.println("Your full name is:"+s	);
    }
}