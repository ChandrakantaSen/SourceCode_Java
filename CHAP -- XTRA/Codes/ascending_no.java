class ascending_no
{
public static void main(int n)
{
String s=Integer.toString(n);
int l=s.length();
String r="",f="";
int m=n,p,h=0;
for(int i=0;i<l;i++)
{
while(n>0)
{
p=n%10;
n=n/10;
if(p>h)
{
h=p;
}
}
r=r+h;
f=f+h;
s=s.replace(r,"");
n=Integer.valueOf(s);
r="";
h=0;
}
System.out.println(f);
}}