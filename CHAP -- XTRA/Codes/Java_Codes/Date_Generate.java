import java.util.*;
class Date_Generate
{
    int days[]={0,31,0,31,30,31,30,31,31,30,31,30,31};
    String months[]={"","January","February","March","April","May","June","July","August","September","October","November","December"};
    int day,year,n;
    Date_Generate()
    {
        day=0;
        year=0;
        n=0;
    }
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the day number :");
        day=sc.nextInt();
        System.out.println("Enter the year :");
        year=sc.nextInt();
        System.out.println("Enter the value of n :");
        n=sc.nextInt();
        LeapYearCheck();
    }
    void LeapYearCheck()
    {
        if(year%4==0)
        days[2]=29;
        else
        days[2]=28;
    }
    void find_day(int x)
    {
        int sum=0,i=1;
        if((x<1)||(x>366))
        {
            System.out.println("Wrong Input !!!");
            return;
        }
        while(true)
        {
            if(sum+days[i]>=x)
            break;
            else
            sum+=days[i++];
        }
        int d=x-sum;
        String temp="";
        switch(d%10)
        {
            case 1:
            temp="st";
            break;
            case 2:
            temp="nd";
            break;
            case 3:
            temp="rd";
            break;
            default:
            temp="th";
            break;
        }
        System.out.println(d+temp+" "+months[i]+" "+year);
    }
    void display()
    {
        System.out.println("Original Date :");
        find_day(day);
        System.out.println(n+" Days after Original Date :");
        find_day(n+day);
    }
    static void main()
    {
        Date_Generate ob=new Date_Generate();
        ob.input();
        ob.display();
    }
}