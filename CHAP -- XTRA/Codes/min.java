import java.io.*;
class min
{
public static void main(String args[])throws IOException
{
double a,b,c;
BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
System.out.println("Enter two no. to print the min value between them");
a=Double.parseDouble(br.readLine());
b=Double.parseDouble(br.readLine());
c=Math.min(a,b);
System.out.println("The min  value between"+a+"&"+b+"is"+c);
    }
}