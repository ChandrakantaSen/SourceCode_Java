/* no of combinations of the digits */
public class cd_digit
{
public static void main(String args[])
{
int n,a[]=new int [4],i=0,j,k,l,x;
do{
n=1234;
System.out.println("Enter Any Four digit Number : ");
if(n>9999)
{
 System.out.println("Invlid Input - Try Again ");
 continue;
}
while(n>0)
{
  a[i++]=n%10;
  n/=10;
}
for(i=0;i<4;i++)
{
 for(j=0;j<4;j++)
 {
  for(k=0;k<4;k++)
  {
   for(l=0;l<4;l++)
   {
    if(a[i]==a[j]||a[i]==a[k]||a[i]==a[l]||a[j]==a[k]||a[j]==a[l]||a[k]==a[l])
     continue;
    x=a[i]*1000+a[j]*100+a[k]*10+a[l];
    System.out.print("\n"+x);
   }
  }
 }
}
}while(false);
}
}
