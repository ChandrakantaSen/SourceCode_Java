import java.io.*;
class perfect_nwl
{
public static void main(String args[])throws IOException
{
 int n,i,j,s=0;
BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
System.out.println("Enter the number to check whether it is perfect or not");
n=Integer.parseInt(br.readLine());
for(i=1;i<n;i++)
{
while(i<n)
{
if(n%i==0)
{
s=s+i;
}
i++;
}
if(s==i)
{
System.out.println(i);
}
}
}
}

