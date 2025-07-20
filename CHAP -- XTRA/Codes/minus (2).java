import java.io.*;
class minus
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
{
double a,b,c;
System.out.println("enter the 1st number :-");
a=Double.parseDouble(br.readLine ());
System.out.println("enter the 2nd number :-");
b=Double.parseDouble(br.readLine ());
c=a-b;
System.out.println("the subtraction is = "+c);
    }
}
    }