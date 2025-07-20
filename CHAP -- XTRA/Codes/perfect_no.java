class perfect_no
{
public static void main(int a)
{
int s=0;
for(int i=1;i<a;i++)
{
if(a%i==0)
{
s=s+i;
}
}
if(a==s)
{
System.out.println(a+" is a perfect no.");
}
else
{
System.out.println(a+" is not a perfect no.");
}
}}