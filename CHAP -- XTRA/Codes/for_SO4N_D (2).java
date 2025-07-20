import java.io.*;
class for_SO4N_D
{
public static void main(String args[])throws IOException
{
double i=1,n,s=0;
BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the range:");
n=Double.parseDouble(buf.readLine());
while(i<=n)
{
s=s+(i*i*i*i);
i++;
}
System.out.println(s);
}
}