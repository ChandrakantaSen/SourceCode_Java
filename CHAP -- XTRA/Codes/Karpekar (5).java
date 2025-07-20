import java.io.*;
class Karpekar
{
public static void main(String args[])throws IOException
{
int n,m,s=0,i=0;
int d=0;
BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the number to find whether it is karpekar or not:");
n=Integer.parseInt(buf.readLine());
m=n*n;//81
int copy=m;//81
while(m>0)
{
i++;
m=m/10;
}
if(i<=2)
{
while(copy>0)
{
d=copy%10;
s=s+d;
copy=copy/10;
}
}
else if(i>2)
{
while(copy>0)
{
 d=copy%100;
s=s+d;
copy=copy/100;
}
}
if(s==n)
{
System.out.println(n+"  is Karpekar number");
}
else
{
System.out.println(n+"  is not a Karpekar number");
}

}
}