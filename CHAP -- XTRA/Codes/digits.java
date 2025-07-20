class digits
{
public static void main(int a)
{
int p,s=0,n=0;
System.out.println("Digits present in the given no. "+a+" are: ");
while(a>0)
{
p=a%10;
a=a/10;
n++;
s=s+p;
System.out.println(p);
}
System.out.println("\nThe number of digits present in the number are "+n);
System.out.println("\nThe sum of the digits present in the number is "+s);
}}