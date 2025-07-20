public class palindrome
{
public static void main(int m)
{
int d,i,r=0;i=0;
for(m=i;m>0;m=m/10)
{
d=m%10;
r=r*10+d;
    }
    if(r==m)
    System.out.println("The no. is a palindrome");
    else
    System.out.println("THE no.is not a palindrome");
}
    }

