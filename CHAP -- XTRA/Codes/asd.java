class emicable
{
public static void main(int n1,int n2)
{
int i,j,s1,s2,y=0;s1=0;s2=0;
for(i=1;i<n1;i++)
{
if(n1%i==0)
s1=s1+i;
}
for(j=1;j<n2;j++)
{
if(n2%i==0)
s2=s2+i;
}
if(s1==n2&&s2==n1)

System.out.println("amicable no");
else
System.out.println("not an amicable no");
}
}