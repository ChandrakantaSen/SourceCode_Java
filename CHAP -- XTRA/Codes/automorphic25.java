class auto
{
public void main(int n)
{
int t=n;
int d;
//int c=0;
double sqn=Math.pow(n,2);
do
{
d=n%10;
//c=c+1;
n=n/10;
}while(n>0);
double rmd=sqn%Math.pow(10,1);
if(t==rmd)
{
System.out.println("Number is a automorphic no.");
}
else
{
System.out.println("Number is not a automorphic no.");
}}}
