import java.io.*;
class karpekar1
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int n,m,k,p;
System.out.println("enter a range");
n=Integer.parseInt(br.readLine());
double c=0,s=n*n;
m=n;
while(m>0)
{
c++;
m=m/10;
}
k=((int)(s%Math.pow(10,c)));
p=((int)(s/Math.pow(10,c)));
if((k+p)==n)
{
System.out.println(n+"is a karpekar number");
}
else
{
System.out.println(n+"is not an karpekar number");
}
}
}

