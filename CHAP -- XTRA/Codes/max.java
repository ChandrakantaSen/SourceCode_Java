import java.io.*;
class max
{
public static void main(String args[])throws IOException
{
double a,b,c;
BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
System.out.println("Enter two no. to print the max value between them");
a=Double.parseDouble(br.readLine());
b=Double.parseDouble(br.readLine());
c=Math.max(a,b);
System.out.println("The max  value between"+a+"&"+b+"is"+c);
    }
}