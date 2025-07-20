class krish
{
public static void main(int k)
{
int f=1;
int i;
int s=0;int m=k;
int d;
do
{
d=m%10;
for(i=1;i<=d;i++)
f=f*i;
s=s+i;
m/=10;
    }while(k>0);
    if(s==k)
    System.out.println("The number is Krishnamurty no.");
    else
     System.out.println("The number is not a Krishnamurty no."); 
    }}