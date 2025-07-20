class Unique_Triad
{
    static void main(int a)
    {
        int n[]=new int[100];
        int b,c,d=a,e,f,g=0,flag=0,h=0,i,j=3;
        b=a*2;
        c=a*3;
        for(i=0;i<=9;i++)
        {
            while(d>0)
            {
                e=d%10;
                n[h++]=e;
                if(e==i)
                {
                    g++;
                }
                d/=10;
            }
            if(g>1)
            {
                flag=1;
                break;
            }
            g=0;
            if(i==9 && j>=2)
            {
                i=-1;d=a*j--;
            }
        }
        for(i=0;i<=9;i++)
        {
            for(j=0;j<h-1;j++)
            {
                if(n[j]==i)
                {
                    g++;
                }
            }
            if(g>1)
            {
                flag=1;
                break;
            }
            g=0;
        }
        if(flag==1)
            System.out.println(a+", "+b+", "+c+" are not Unique Triad");
        else
            System.out.println(a+", "+b+", "+c+" are Unique Triad");       
    }
}