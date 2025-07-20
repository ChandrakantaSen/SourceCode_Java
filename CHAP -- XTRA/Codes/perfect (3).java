class perfect
{
public void main(int n)
{
int i,s=0;
for(i=1;i<n;i++)
{
if(n%i==0)
s=s+i;
}
if(s==n)
System.out.println("this is a perfect no.");
}}