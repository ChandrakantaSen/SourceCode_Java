import java.io.*;                /* COUNT THE NUMBER OF DIGITS*/
class count_fl
{
public static void main(String args[])throws IOException
{
 int n,m,c=0;
BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
System.out.println("Enter the number to count the digits in it");
n=Integer.parseInt(br.readLine());
for(m=n;m>0;m=m/10)
{
c++;
}
System.out.println("The no of digits in the no "+n+" is " +c);
}
}
