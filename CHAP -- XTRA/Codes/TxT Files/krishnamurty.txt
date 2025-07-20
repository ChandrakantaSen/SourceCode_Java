import java.io.*;
class krishnamurty
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int k,m=1,s=0,y=0,i=0;
System.out.println("Enter any number:");
k=Integer.parseInt(br.readLine());
int b=k;
while(k!=0)
{
y=k%10;
for(i=1;i<=y;i++)
{
m=m*i;
}
s=s+m;
m=1;
k/=10;
}
if(s==b)
System.out.println("The number is a Krishnamurty no.");
else 
System.out.println("The number is not a Krishnamurty no.");
}
}