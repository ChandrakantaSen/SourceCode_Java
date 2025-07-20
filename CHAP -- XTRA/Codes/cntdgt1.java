import java.io.*;
class cntdgt1   
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int n,m,c=0;
System.out.println("Enter the number to count the number of digits in it");
n=Integer.parseInt(br.readLine());
m=n;
do
{
c++;
m=m/10;
    }
    while(m>0);
    System.out.println("The number of digits in the number"+n+"is"+c);
}
}