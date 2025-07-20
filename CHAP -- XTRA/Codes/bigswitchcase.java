import java.io.*;
class bigswitchcase
{
public static void main(String args[])throws IOException
{
int n;
int c;
BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the first number  : ");
n=Integer.parseInt(buf.readLine());
System.out.println("Enter your choice ,press 1 to check whether it is an armstrong no. or not,2 to check whether is is a palindrome no. or not,3 to check whether it a magic no or not,4 to check whether is a keith no. or not ,5 to check whether it is a prime no. or not,6 to check whether it s perfect no. or not and 7 to check whether it is a weakarm no or not ");
c=Integer.parseInt(buf.readLine());
switch(c)
{
case 1:
int m=n;
int sum=0;
for(;m>0;m=m/10)
{
int d=m%10;
sum=sum+(d*d*d);
}
if(sum==n)
{
System.out.println(n+"is an armstrong no.");
}
else
{
System.out.println(n+"is not an armstrong number");
}
break;
case 2:
 m=n;
 sum=0;
while(m>0)
{
int d=m%10;
sum=(sum*10)+d;
m=m/10;
}
if(sum==n)
{
System.out.println("it is a palindnome number");
}
else
{
System.out.println("it is not a palindnome number");
}
break;
case 3:
 m=n;
 sum=0;
while(m>0)
{
int d=m%10;
sum=sum+d;
m=m/10;
}
if((sum==10)||(sum==1))
{
System.out.println("it is a magic number  ");
}
else
{
System.out.println("it is not a magic number");
}
break;
case 4:
int z=0,p=0,s=0,f=0,l=0,i=0;
int copy=n;
while(n>0)
{
z=n%10;//4,1
p=p*10+c;//41
s=s+c;//5
n=n/10;//1
    }
    System.out.println(s);//5
        System.out.println(p);//41
    f=p%10;//1,4
    p=p/10;//4
    l=s;//5

    while(i<copy)//i<14
    {
        
        System.out.println(l);//5
        i=l*2-f;//9
        l=i;//5
        if(p>0)
        {
            f=p%10;//4
            p=p/10;//0
        }
        else
        {
        f=s;//5
    }
    }
    if(i==copy)
    {
    System.out.print(copy+" IS A KEITH NUMBER");
}
else
{
    System.out.print(copy+" IS NOT A KEITH NUMBER");
}
break;
case 5:
 int count=0;

 for(i=1;i<=n;i++)
{
if(n%i==0)
{
count++;
}
}
if(count==2)
{
System.out.println(n+" is a prime number ");
}
else
{
System.out.println(n+" is not a prime number ");
}
break;
case 6:

for(i=1;i<n;i++)
{
if(n%i==0)
{
s=s+i;
}
}
if(s==n)
{
System.out.println(n+" is a perfect number ");
}
else
{
System.out.println(n+" is not a perfect number ");
}
break;
case 7:
int d,i1=0;
double s1=0;
p=n;
while(p>0)
{
d=p%10;
s=s*10+d;
p=p/10;
}
while(s>0)
{
i1++;
int d2=s%10;
 s1=s1+(Math.pow(d2,i));
s=s/10;
}
if(s1==n)
{
System.out.println(n+" is a weakarm number");
}
else
{
System.out.println(n+"is not a weakarm number");
}
break;
}
}
}