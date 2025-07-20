import java.io.*;
class krishna
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter any number:");
int n=Integer.parseInt(br.readLine());
int d,i,s=0,f=1,m=n;
if(n>0)
{
do
{
d=m%10;
for(i=1;i<=d;i++)
{
f=f*i;
s=s+f;
} 
m=m/10;
    }while(n!=0);
    if(s==n)
    System.out.println("The no. is Krishnamurti no.");
    else
    System.out.println("The no. is not a Krishnamurti no.");
}
else
System.out.println("The no. must be greater than zero");
    }}