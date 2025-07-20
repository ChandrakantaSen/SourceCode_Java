class program
{
public void main(int a,int b)
{
int hcf=1;
int i;
for (i=1;i<a;i++)
{
if ((a%i==0)&&(b%i==0))
hcf=i;
}
System.out.println("hcf is "+hcf);
}
}

