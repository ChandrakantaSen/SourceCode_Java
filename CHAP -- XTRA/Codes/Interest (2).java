class Interest
{
    int r,t;
    float si,amt;
    Simple ob=new Simple(12345,10000);
    Interest(int x,int y)
    {
        r=x;
        t=y;
        amt=0;
    }
    void calculate()
    {
        si=(ob.balance*r*t)/100;
        amt=ob.balance+si;
    }
    void display()
    {
        System.out.println("Account number : "+ob.acno);
        System.out.println("Balance : "+ob.balance);
        System.out.println("Interest : "+si);
        System.out.println("Amount : "+amt);
    }
}