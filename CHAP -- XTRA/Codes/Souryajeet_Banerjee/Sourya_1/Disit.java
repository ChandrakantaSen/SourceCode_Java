import java.io.*;
class Disit
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n,s=0,a=0,b=0,c=0,d=0,e=0,f=0,g=0,h=0,i=0;
        System.out.println("Enter the number");
        n=Integer.parseInt(br.readLine());
        while(n>0)
        {
            int r=n%10;
            n=n/10;
            if(r==0)
            {
                s=s+1;
            }
            if(r==1)
            {
                a=a+1;
            }
            if(r==2)
            {
                b=b+1;
            }
            if(r==3)
            {
                c=c+1;
            }
            if(r==4)
            {
                d=d+1;
            }
            if(r==5)
            {
                e=e+1;
            }
            if(r==6)
            {
                f=f+1;
            }
            if(r==7)
            {
                g=g+1;
            }
            if(r==8)
            {
                h=h+1;
            }
            if(r==9)
            {
                i=i+1;
            }
        }
        if(s>=1)
        {
            System.out.println("Zero is present in the number "+s+" times");
        }
        if(a>=1)
        {
            System.out.println("One is present in the number "+a+" times");
        }
        if(b>=1)
        {
            System.out.println("Two is present in the number "+b+" times");
        }
        if(c>=1)
        {
            System.out.println("Three is present in the number "+c+" times");
        }
        if(d>=1)
        {
            System.out.println("Four is present in the number "+d+" times");
        }
        if(e>=1)
        {
            System.out.println("Five is present in the number "+e+" times");
        }
        if(f>=1)
        {
            System.out.println("Six is present in the number "+f+" times");
        }
        if(g>=1)
        {
            System.out.println("Seven is present in the number "+g+" times");
        }
        if(h>=1)
        {
            System.out.println("Eight is present in the number "+h+" times");
        }
        if(i>=1)
        {
            System.out.println("Nine is present in the number "+i+" times");
        }
    }
}