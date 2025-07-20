import java.io.*;                     /*INPUT OUTPUT PACKAGE*/
public class math35
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
double a,b;
System.out.println("Enter the no to find out the exponential value");
a=Double.parseDouble(br.readLine());
b=Math.exp(a);
System.out.println("The exponential value of"+a+" is = "+b);
       } 
    }
    

