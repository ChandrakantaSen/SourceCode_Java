
import java.io.*;
class p2
{
public static void main(String args[])throws IOException
{
int i,m,d,s=0,ch;
BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
do
{
System.out.println("Enter 1 to display all the magic numbers from 1 to 100");
System.out.println("Enter 2 to display all the palindrome numbers from 10 to 100");
System.out.println("Enter 3 to display all the prime numbers from 100 to 500");
System.out.println("Enter 4 to display all the neon numbers from 1 to 100");
System.out.println("Enter 5 to exit from the programme");
System.out.println("Enter your choice");
ch=Integer.parseInt(br.readLine());
switch(ch)
{
case 1:
for(i=1;i<=100;i++)
{
m=i;
s=0;
while(m>9)
{
s=0;
while(m>0)
{
d=m%10;
s=s+d;
m=m/10;
    }
    if(s>9)
    {
        m=s;
    }
}
        if(s==1)
        {
            System.out.println(i);
        }
    }
        break;
        case 2:
        for(i=10;i<=100;i++)
{
m=i;
s=0;
d=0;
while(m>0)
{
d=m%10;
s=s*10+d;
m=m/10;
    }
    if(s==i)
    {
            System.out.println(i);
        }
    }
        break;
        case 3:
        for(i=100;i<=500;i++)
{
m=0;
for(s=1;s<=i;s++)
{
if(i%s==0)
{
m=m+1;
    }
}
if(m==2)
{
System.out.println(i);
    }
}
        break;
        case 4:
        for(i=1;i<=100;i++)
{
m=i*i;
s=0;
while(m>0)
{
d=m%10;
s=s+d;
m=m/10;
    }
    if(s==i)
    {
        System.out.println(i);
    }
}
        break;
        case 5:
        System.exit(0);
        break;
        default:
        System.out.println("Invalid choice");
    }
}
    while(true);
}
    }        