import java.io.*;
class loop_range_n
{
public static void main(String args[])throws IOException
{
BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
int i,n,s=0;
System.out.println("Enter the range");
n=Integer.parseInt(br.readLine());

i=1;
do
{
s=s+i;
i++;
}
while(i<=n);
{
System.out.println("The sum of numbers from 1 to n"+s);
}
}
}

