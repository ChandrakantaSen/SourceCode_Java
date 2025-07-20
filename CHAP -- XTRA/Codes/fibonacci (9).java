package All;

public class fibonacci
{
    public static void main(String args[])
    {
        int a[]=new int[20];
        int b[]=new int[20];
        int k=19,c=0,f1=1,f2=1,f3,i,j,a1=0;
        a[0]=1;
        while(k>=0)
        {
           f3=f1+f2;
           f1=f2;
           f2=f3;
           a[k]=f3;
           k--;
        }
        for(i=19;i>=0;i--)
        {
            for(j=1;j<=a[i];j++)
            {
                if(a[i]%j==0)
                {
                    c=c+1;
                }
            }
            if(c==2)
            {
            b[a1]=a[i];
            a1=a1+1;
        }
        c=0;
        }
        for(i=0;i<20;i++)
        {
            if(b[i]!=0)
            {
                System.out.print(b[i]+",");
            }
        }
    }
}
    
            

            
            
            
          