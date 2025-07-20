class Compute extends Library
{
    int day,fine;
    Compute(String n,String a,int p,int d)
    {
        name=n;
        author=a;
        price=p;
        day=d;
    }
    void fine()
    {
        fine=0;
        int excess=day-7;
        if((excess>=1)&&(excess<=5))
        fine=excess*2;
        else if((excess>=6)&&(excess<=10))
        fine=excess*3;
        else if(excess>10)
        fine=excess*5;
    }
    void display()
    {
        show();
        System.out.println("No. of days retained :"+day);
        System.out.println("Fine : Rs."+fine);
        double total=(0.02*price*day)+fine;
        System.out.println("Total AMOUNT to be paid : Rs."+total);
    }
}