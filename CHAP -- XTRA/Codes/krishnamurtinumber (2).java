class krishnamurtinumber
{
public static void main(int n)
{
int m,d,s=0,fact;
m=n;
while(m>0)
{
d=m%10;
fact=1;
for(int i=1;i<=d;i++)
{
fact=fact*i;
    }//for loop
    s=s+fact;
    m=m/10;
}//while loop
if(s==n)
{
System.out.println(n+" Is a krishnamurti number");
    }
    else
    {
        System.out.println(n+" Is not a krishnamurti number");
    }
}
    }
    