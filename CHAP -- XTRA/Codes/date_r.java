import java.io.*;
class date_r
{
    public static int leap(int yr)
    {
        if(yr%4==0 || yr%400 ==0)
        return 1;
        else
        return 0;
    }
     public static int count(int d,int m,int y)
    {
        int i,day=0;
        int mon[]={0,31,28,31,30,31,30,31,31,30,31,30,31};
        for(i=0;i<m;i++)
        day=day+mon[i];
        if(m>2)
        day=day+leap(y)+d;
        else 
        day=day+d;
        return day;
    }
    public static int countdate(int dd,int mm,int yy)
    {
        int i,td=0;
        if(2006==yy)
        {
            td=count(1,1,2006)-count(dd,mm,yy);
            if(td<0)
            td=td*-1;
        }
        else if(2006>yy)
        {
            for(i=yy+1;i<2006;i++)
            td=td+365+leap(i);
            td=td+(365+leap(yy))+count(1,1,2006)-count(dd,mm,yy);
        }
        else
        {
            for(i=2006+1;i<yy;i++)
            {
                td=td+365+leap(i);
            }
            td=td+(365+leap(2006))+count(dd,mm,yy)-count(1,1,2006);
        }
        return td;
    }
    void main()throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int yy,dd,mm,diff=0,week_d=0;
        System.out.print("Enter the year : ");
        yy=Integer.parseInt(br.readLine());
        System.out.print("Enter the month : ");
        mm=Integer.parseInt(br.readLine());
        System.out.print("Enter the day : ");
        dd=Integer.parseInt(br.readLine());
        diff=count(dd,mm,yy);
        if(yy<2006)
        {
            week_d=0;
            for(long k=0;k<diff;k++)
            {
                week_d--;
                if(week_d<0)
                week_d=6;
            }
        }
        else if(yy>=2006)
        {
            week_d=0;
            for(long k=0;k<diff;k++)
            {
                week_d++;
                if(week_d>6)
                week_d=0;
            }
        }
        switch(week_d)
        {
            case 1:
            System.out.println("Sunday");
            break;
            case 2:
            System.out.println("Monday");
            break;
            case 3:
            System.out.println("Tuesday");
            break;
            case 4:
            System.out.println("Wednesday");
            break;
            case 5:
            System.out.println("Thursday");
            break;
            case 6:
            System.out.println("Friday");
            break;
            case 7:
            System.out.println("Saturday");
            break;
            default:
            System.exit(0);
            break;
        }
        
       /* switch(week_d)
        {
            case 1:
            System.out.println("Monday");
            break;
            case 2:
            System.out.println("Tuesday");
            break;
            case 3:
            System.out.println("Wednesday");
            break;
            case 4:
            System.out.println("Thursday");
            break;
            case 5:
            System.out.println("Friday");
            break;
            case 6:
            System.out.println("Saturday");
            break;
            case 7:
            System.out.println("Sunday");
            break;
            default:
            System.exit(0);
            break;
        }*/
    }
}
            