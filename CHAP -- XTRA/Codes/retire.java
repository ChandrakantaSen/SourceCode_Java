class retire extends personal
{
    int yrs;
    double pf;
    double grat;
    retire(int y,String n,int p,double b,String a)
    {
        super(n,p,b,a);
        yrs=y;
    }
    void provident()
    {
        pf=0.02*basic_pay*yrs;
    }
    void gratuity()
    {
        if(yrs>=10)
        grat=12*basic_pay;
        else
        grat=0.0;
    }
    void display1()
    {
        provident();
        gratuity();
        super.display();
        System.out.println("Years of service= "+yrs);
        System.out.println("Provident= "+pf);
        System.out.println("Gratuity= "+grat);
    }
}