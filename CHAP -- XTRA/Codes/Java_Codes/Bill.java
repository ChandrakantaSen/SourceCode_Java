class Bill extends Detail
{
    int n;
    double amt;
    Bill(String n,String a,String t,int r,int d)
    {
        name=n;
        address=a;
        telno=t;
        rent=r;
        this.n=d;
    }
    void cal()
    {
        if((n>=1)&&(n<=100))
        amt=rent;
        else if((n>=101)&&(n<=200))
        amt=(0.6*n)+rent;
        else if((n>=201)&&(n<=300))
        amt=(0.8*n)+rent;
        else
        amt=n+rent;
    }
    void details()
    {
        super.show();
        System.out.println("Amount to be paid : "+amt);
    }
}