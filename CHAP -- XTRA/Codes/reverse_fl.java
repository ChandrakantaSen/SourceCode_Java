import java.io.*;               
class reverse_fl
{
public static void main(String args[])throws IOException
{
 int n,m,d,s=0;
BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
System.out.println("Enter the number to reverse");
n=Integer.parseInt(br.readLine());

for(m=n;m>0;m=m/10)
{
d=m%10;
s=s*10+d;

}
System.out.println("The reverse of a number is"+s);
}
}
