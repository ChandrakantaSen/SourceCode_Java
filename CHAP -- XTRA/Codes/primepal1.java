public class primepal1
{
public static void main(int m)
{
for(int h=1;h<=m;h++)
{
int n=h,p=0,d=0;
while(n>0)
{
p=n%10;
n=n/10;
d=d*10+p;
    }
    if(d==h)
    {
        int t;
        for(t=2;t<h;t++)
        {
            if(h%t==0)
            break;
        }
            if(h==t)
            System.out.println("The primepal"+h);
        }
    }
}
}
        
        
        
        
    