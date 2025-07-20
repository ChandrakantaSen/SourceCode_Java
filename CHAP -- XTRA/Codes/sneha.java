class sneha
{
    public static void main(String a,int s)
    {
        double d= 45/100.0*s;
        double h= 20/100.0*s;
        double g=d+h+s;
        if(g>10000)
        {
            double t=20/100.0*g;
        }
        if(g>=5000&&g<=10000)
        {
            double t=15/100.0*g;
        }
        if(g<5000)
        {
            double t=0.0;
            
        }
        double NP=g-t;
        System.out.println("the net salary is"+NP);
        System.out.println("the name of the personis"+a);
    }
}
        