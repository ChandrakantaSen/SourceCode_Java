import java.io.*;

class Hcf_Lcm
{
    int a,b;
    Hcf_Lcm(int x,int y)
    {
        a=x;
        b=y;
    }

    void calculate()
    {
        int p,i,h=0,l;
        p=a*b;
        for(i=1;i<=p;i++)
        {
            if((a%i==0)&&(b%i==0))
            {
                h=i;
            }
        }
        l=p/h;
        
        System.out.println("Required HCF is: "+h);
        System.out.println("Required LCM is: "+l);
    }
    
    public static void main(String args[])throws IOException
    {
        int m,n;
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Enter the value of first number: ");
        m = Integer.parseInt(in.readLine());

        System.out.println("Enter the value of second number: ");
        n = Integer.parseInt(in.readLine());
        
        Hcf_Lcm obj = new Hcf_Lcm(m,n);
        obj.calculate();
    }
}