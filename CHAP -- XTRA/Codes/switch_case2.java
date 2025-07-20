import java.io.*;
class switch_case2 
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int a,b,c=0,d,ch,i,n,m,s=0,s1=0,c1;
double d1,c2=0,s2=0;
do
{
System.out.println("..........Menu.........");
System.out.println("Press 1 for prime");
System.out.println("Press 2 for buzz");
System.out.println("Press 3 for perfect");
System.out.println("Press 4 for armstrong");
System.out.println("Press 5 for palindrome");
System.out.println("Press 6 for weakarm");
System.out.println("Press 7 for real armstrong");
System.out.println("Press 8 for amicable");
System.out.println("Press 9 for neon");
System.out.println("Press 10 for fibonacci");
System.out.println("Press 11 for tribonacci");
System.out.println("Press 12 for exit");
System.out.println(".......................");
System.out.println("Enter the choice ");
ch=Integer.parseInt(br.readLine());
switch(ch)
{
case 1:
i=1;
System.out.println("Enter the number to find whether it is a prime number or not");
n=Integer.parseInt(br.readLine());
do
{
if(n%i==0)
{
c++;
    }
    i++;
}
while(i<=n);
if(c==2)
{
System.out.println(n+"is a prime number");
    }
    else
    {
        System.out.println(n+"is not a prime number");
    }
    break;
    case 2:
    System.out.println("Enter a number to check whether it is a buzz number or not");
n=Integer.parseInt(br.readLine());
if((n%7==0)&&(n%10==7))
{
System.out.println(n+" is a buzz number .");
    }
    else
{
System.out.println(n+" is not a buzz number .");
    }
    break;
    case 3:
    System.out.println("Enter the number to find whether it is a perfect number or not");
n=Integer.parseInt(br.readLine());
for(i=1;i<n;i++)
{
if(n%i==0)
{
s=s+i;
    }
}
if(s==n)
{
System.out.println(n+"is a perfect number");
    }
    else
    {
        System.out.println(n+"is not a perfect number");
    }
    break;
    case 4:
    System.out.println("Enter the number to find whether it is armstrong or not ");
n=Integer.parseInt(br.readLine());
m=n;
while(m>0)
{
d=m%10;
s=s+(d*d*d);
m=m/10;
    }
 if(s==n)
 {
     System.out.println(n+"is an armstrong number");
    }
    else
    {
        System.out.println(n+"is not an armstrong number");
    }
    break;
    case 5:
    System.out.println("Enter the number to check whether it is palindrome or not ");
n=Integer.parseInt(br.readLine());
m=n;
while(m>0)
{
d=m%10;
s=s*10+d;
m=m/10;
    }
if(s==n)
{
System.out.println(n+"is a palindrome number");
}
else
{
System.out.println(n+"is not a palindrome number");
}
break;
case 6:
System.out.println("Enter the number to check whether it is weakarm or not");
n=Integer.parseInt(br.readLine());
m=n;
do
{
c2++;
m=m/10;
    }
    while(m>0);
   m=n;
do
   {
       d1=m%10;
       s2=s2+(Math.pow(d1,c2));
       m=m/10;
       c2--;
    }
    while(m>0);
    if((int)(s2)==n)
    {
     System.out.println(n+"is a weakarm number");
    }
    else
    {
         System.out.println(n+"is not a weakarm number");
    }
    break;
    case 7:
    System.out.println("Enter the number to check whether it is real armstrong or not");
n=Integer.parseInt(br.readLine());
m=n;
while(m>0)
{
c2++;
m=m/10;
    }
   m=n;
   while(m>0)
   {
       d1=m%10;
       s2=s2+(Math.pow(d1,c2));
       m=m/10;
    }
    if((int)(s2)==n)
    {
     System.out.println(n+"is a real armstrong number");
    }
    else
    {
         System.out.println(n+"is not a real armstrong number");
    }
    break;
    case 8:
    System.out.println("Enter the 1st number ");
n=Integer.parseInt(br.readLine());
System.out.println("Enter the 2nd number ");
m=Integer.parseInt(br.readLine());
for(i=1;i<n;i++)
{
if(n%i==0)
{
s=s+i;
}
}
for(i=1;i<m;i++)
{
if(m%i==0)
{
s1=s1+i;
    }
}
if((s==m)&&(s1==n))
{
System.out.println(n+"&"+m+"are amicable numbers");
    }
    else
    {
     System.out.println(n+"&"+m+"are not amicable numbers");
    } 
    break;
    case 9:
    System.out.println("Enter the number to check whether it is neon or not ");
n=Integer.parseInt(br.readLine());
m=n*n;
while(m>0)
{
d=m%10;
s=s+d;
m=m/10;
    }
    if(s==n)
    {
    System.out.println(n+"is a neon number");
}
else
{
 System.out.println(n+"is not a neon number");
}
break;
case 10:
System.out.println("Enter the range");
n=Integer.parseInt(br.readLine());
a=0;
b=1;
c=0;
while(c<=n)
{
System.out.println(a);
c=a+b;
b=a;
a=c;
    }
    break;
    case 11:
    System.out.println("Enter the range");
n=Integer.parseInt(br.readLine());
a=0;
b=0;
c=1;
d=0;
while(d<=n)
{
System.out.println(a);
d=a+b+c;
c=b;
b=a;
a=d;
    }
    break;
    case 12:
    System.out.println("Bye...Bye");
System.exit(0);
default:
System.out.println("Wrong Choice");
    }
}
while(true);
    }
}

