import java.io.*;
class for_SO2N_D
{
public static void main(String args[])throws IOException
{
BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
double n, i;
double s=0;
System.out.println("Enter the range:");
n=Double.parseDouble(buf.readLine());
for(i=0;i<=n;i++)
{
 s=s+(i*i);

}
System.out.println(s);
}
}