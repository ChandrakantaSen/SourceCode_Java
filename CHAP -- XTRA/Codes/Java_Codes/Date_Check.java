import java.util.*;
class Date_Check
{
    int days[]={0,31,0,31,30,31,30,31,31,30,31,30,31};
    int dd,mm,yy;
    Date_Check()
    {
        dd=0;
        mm=0;
        yy=0;
    }
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the day :");
        dd=sc.nextInt();
        System.out.println("Enter the month :");
        mm=sc.nextInt();
        System.out.println("Enter the year :");
        yy=sc.nextInt();
    }
    void LeapYearCheck()
    {
        if(yy%4==0)
        days[2]=29;
        else
        days[2]=28;
    }
    boolean check()
    {
        if((mm<1)||(mm>12))
        return false;
        else if((dd<1)||(dd>days[mm]))
        return false;
        else
        return true;
    }
    void dayNumber()
    {
        int sum=0;
        for(int i=1;i<mm;i++)
        sum+=days[i];
        sum+=dd;
        System.out.println("Day Number : "+sum);
    }
    static void main()
    {
        Date_Check ob=new Date_Check();
        ob.input();
        ob.LeapYearCheck();
        if(ob.check())
        {
            System.out.println("Valid Date !!!");
            ob.dayNumber();
        }
        else
        System.out.println("Invalid Date !!!");
    }
}