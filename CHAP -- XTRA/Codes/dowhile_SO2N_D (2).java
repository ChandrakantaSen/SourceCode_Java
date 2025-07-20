import java.io.*;
class dowhile_SO2N_D
{
public static void main(String args[])throws IOException
{
BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
double n, i=0;
double s=0;
System.out.println("Enter the range:");
n=Double.parseDouble(buf.readLine());
do
{
s=s+(i*i);
i++;
}
while(i<=n);
System.out.println(+s);
}
}