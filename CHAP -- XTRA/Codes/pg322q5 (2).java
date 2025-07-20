import java.io.*;               
class pg322q5
{
public static int fact(int n)
{
int i,f=1;
for(i=0;i<=n;i++)
{
f=f*i;
}
return f;
}
public static void main (String args[])throws IOException
{
int m,n,s=0;
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
pg322q5 ob= new pg322q5();
System.out.println("Enter the first number ");
n=Integer.parseInt(br.readLine());
System.out.println("Enter the second number ");
m=Integer.parseInt(br.readLine());
s=(ob.fact(n)/ob.fact(m)*ob.fact(n-m));
}
}

