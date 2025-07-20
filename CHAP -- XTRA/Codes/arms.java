class arms
{
public void main(int n)
{

int r;
int s=0;
for(int i=100;i<n;i++)
{
int m=i;
while(m>0)
{
r=m%10;
s=s+(r*r*r);
n=n/10;
    }  
    if (s==i)
    
        System.out.println("\n armsstrong");
    }
 
}
    }

