import java.io.*;
class digitextraction_fl
{
public static void main(String args[])throws IOException
{
 int n,m,d;
BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
System.out.println("Enter the number to extract digit from it");
n=Integer.parseInt(br.readLine());
System.out.println("The each extracted digit from the number "+n+" are as follows");
for(m=n;m>0;m=m/10)
{
d=m%10;
System.out.println(d);
}
}
}
