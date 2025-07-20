import java.io.*;
class hcf_lcm
{
    BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
    public int t,a,b,hcf,lcm,m,n;
    hcf_lcm()
    {
        t=0;
        a=0;
        b=0;
        hcf=0;
        lcm=0;
        m=0;
        n=0;
    }
    void getdata()throws IOException
    {
        System.out.println("Enter first data : ");
        a=Integer.parseInt(buf.readLine());
        System.out.println("Enter next data : ");
        b=Integer.parseInt(buf.readLine());
    }
    void change()
    {
        if(a>b)
        {
            t=a;
            a=b;
            b=t;
        }
        t=a;
    }
    int rech(int p,int q)
    {
        
        if(p%t==0&&q%t==0)
        {
            
            return t;
        }
        t--;
        return rech(p,q);
    }
    int lcm1(int p,int q,int h)
    {
        
        lcm=(p*q)/h;
        return lcm;
    }
    void result()
    {
        change();
        m=rech(a,b);
        n=lcm1(a,b,m);
        System.out.println("H.C.F--->"+m);
        System.out.println("L.C.M--->"+n);
    }
    void main()throws IOException
    {
        hcf_lcm ob=new hcf_lcm();
        ob.getdata();
        ob.change();
        hcf=ob.rech(a,b);
        lcm=ob.lcm1(a,b,hcf);
        ob.result();
    }
   
    
    
}