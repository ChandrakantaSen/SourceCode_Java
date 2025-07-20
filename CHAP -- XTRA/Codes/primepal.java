public class primepal
{
public static void main(int m)
{
for(int h=1;h<=m;h++)
{
int n=h,p=0,c=0;
while(n>0)
{
p=n%10;
n=n/10;
c=c*10+p;
    }
    if(c==h)
    {
        int t;
        for(t=2;t<h;t++)
        {
            if(h%t==0)
            break;
        }
        if(h==t)
        System.out.println("The primepal="+h);
       
    }
}
    }
}
    
