package Puspendu;

class ascending
{
    public static void main(int n)
    {
        String s=Integer.toString(n);
        int l=s.length();
        double a[]=new double[l+10];
        double tmp;int ctr=0;
        while(n!=1)
        {
            int d=n%10;
            a[ctr]=d;
            n=n/10;
            ctr++;
        }
        for(int i=0;i<l;i++)
        {
            for(int j=0;j<l-1;j++)
            {
                if(a[j]>a[j+1])
                {
                    tmp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=tmp;
                }
            }
        }
        for(int i=0;i<l;i++)
        System.out.println((int)a[i]);
        
    }
}
    