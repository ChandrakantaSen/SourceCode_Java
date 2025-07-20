import java.io.*;
class keith
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int c=0,p=0,s=0,f=0,l=0,i=0,n;
System.out.println("Enter the number :- ");
n=Integer.parseInt(br.readLine());
int copy=n;
while(n>0)
{
c=n%10;
p=p*10+c;
s=s+c;
n=n/10;
    }
    System.out.println(s);
    System.out.println(p);
    f=p%10;
    p=p/10;
    l=s;
    while(i<=copy)
    {
        if(i==copy)
        {
            System.out.println("The number "+i+" is a keith number.");
            System.exit(0);
        }
        System.out.println(l);
        i=l*2-f;
        l=i;
        if(p>0)
        {
            f=p%10;
            p=p/10;
        }
        else 
        f=s;
    }
    System.out.println("The number "+i+" is not keith number. ");
}
    }