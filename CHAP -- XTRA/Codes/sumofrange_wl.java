import java.io.*;
class sumofrange_wl
{
public static void main(String args[])throws IOException
{
BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
int i,n,s=0;
System.out.println("Enter the range");
n=Integer.parseInt(br.readLine());
i=1;
while(i<=n)
{
s=s+i;
}
i++;
{
System.out.println("The sum of the numbers from 1 to +n+ is "+s);
}
}
}

