class Hcf
{
    public static void main (int m,int n)
    {
        int p,i,h=0,a;
        p=m*n;
        for(i=1;i<=p;i++)
        {
            if((m%i==0)&&(n%i==0))
            {
                h=i;
           }
        }
        a = p/h;
        System.out.println("Required GCD is : "+h);
        System.out.println("Required LCM is : "+a);
         System.out.println("product : "+p);
    }
}
