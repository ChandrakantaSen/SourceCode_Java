class hcf_lcm
{
static int hcf(int a,int b)
{
int s=0,l=0;
if(a>b)
{
s=a%b;
if(s!=0)
l=1;
else
if(s==0)
l=b;}

   if(b>a)
{
s=b%a;
if(s!=0)
l=1;
else
if(s==0)
l=a;
}
 
    return l;
}

public static void main(int x, int y)
{
int p,r=0;
p=hcf(x,y);
r=x*y/p;
System.out.println("LCM="+r);
System.out.println("HCF="+p);
if(p>r)
System.out.println("Difference="+(p-r));
else
if(r>p)
System.out.println("Difference="+(r-p));
    }
}