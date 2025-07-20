import java.io.*;
class bigswitchcase10
{
public static void main(String args[])throws IOException
{
int n,c,sum,d,m,i,count;
BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
do
{
System.out.println("\n\n-----------------MENU------------------------\n\n");
System.out.println("Press 1 for Amstrong Number ");
System.out.println("Press 2 for Prime Number ");
System.out.println("Press 3 for Exit ");
System.out.println("Enter your choice : -  ");
c=Integer.parseInt(buf.readLine());
switch(c)
{
case 1:
System.out.println("Enter the number to check wheather it is amstrong or not  : ");
n=Integer.parseInt(buf.readLine());
m=n;
sum=0;
d=0;
for(;m>0;m=m/10)
{
d=m%10;
sum=sum+(d*d*d);
}
if(sum==n)
{
System.out.println(n+" is an armstrong no.");
}
else
{
System.out.println(n+" is not an armstrong number");
}
break;
case 2:
count=0;
System.out.println("Enter the number to check wheather it is prime or not  : ");
n=Integer.parseInt(buf.readLine());
for(i=1;i<=n;i++)
{
if(n%i==0)
{
count++;
}
} 
if(count==2)
{
System.out.println(n+" is a prime no.");
}
else
{
System.out.println(n+" is not a prime no.");
}
break;
case 3:
System.out.println("Good Bye.");
System.exit(0);
break;
default:
System.out.println("Sorry Wrong Input");
}
}
while(c>0);
}
}