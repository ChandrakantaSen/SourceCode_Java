class vampire1
{
public static void main(int a)
{
String s=Integer.toString(a);
int l=s.length();
char ch,ch1='a',ch2;
int r,t,m,m1,m2,z=0,n=0;
if(l%2==0)
{
for(int i=0;i<l;i++)
{
ch=s.charAt(i);
for(int j=0;j<l;j++)
{
if(j!=i)
{
ch1=s.charAt(j);

}
if(j==i)
{
continue;
}
for(int k=0;k<l;k++)
{
if(k!=j && k!=i)
{
ch2=s.charAt(k);
System.out.println(ch2);
m=Character.getNumericValue(ch);
m1=Character.getNumericValue(ch1);
m2=Character.getNumericValue(ch2);
z=(((m*10)+m1)*10)+m2;
System.out.println(m1);
for(int c=0;c<l;c++)
{
if(c!=i && c!=j && c!=k)
{
n=(n*10)+Character.getNumericValue(s.charAt(c));
}}
if(z*n==a)
{
System.out.println("Vampire");
}}
if(k==i || k==j)
{
continue;
}
}}}}}}

