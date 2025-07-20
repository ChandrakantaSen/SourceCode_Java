import java.io.*;
class sample2
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
char c;
System.out.println("Enter any chracter from your keyboard  : - ");
c=(char)br.read();
System.out.println("The inputted character is = "+c);
    }
}