import java.io.*;
class ci
{
public static void main(String args[])throws IOException
{
double p,a;
BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
System.out.println("The principal is-");
p=Double.parseDouble(br.readLine());
a=p*(1+0.05)*(1+0.08)*(1+0.1);
System.out.println("The amount for three years is-"+a);
    }
} 