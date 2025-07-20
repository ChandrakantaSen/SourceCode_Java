//day of the date
import java.io.*;
class date4
{
static int d,m,y,dd;
static int i=0,j=0,ctr=0,c=0;
static int month[]={31,28,31,30,31,30,31,31,30,31,30,31,};
 static int leap(int y)
 {
     if(y%4==0)
     {
         return 1;
        }
        else
        {
            return 0;
        }
    }
    public static int count(int d,int m,int y)
    {
        int mon[]={0,31,28,31,30,31,30,31,31,30,31,30,31};
        int day=0,i;
        for(i=0;i<m;i++)
        {
            day=day+mon[i];
        }
            if(m>2)
            day=day+leap(y)+d;
            else
            day=day+d;
            return day;
    }
    void count_date(int dd,int mm,int yy)
    {
        int td=0;
        int i;
        if(2006==yy)
        {
            td=count(1,1,2006)-count(dd,mm,yy);
            if(td<0)
            {
                td=td*(-1);
            }
        }
        else if(2006>yy)
        {
            for(i=yy+1;i<2006;i++)
            {
                td=td+365+leap(i);
            }
            td=td+(365+leap(yy))+count(1,1,2006)-count(dd,mm,yy);
        }
        else
        {
            for(i=2007;i<yy;i++)
            {
                td=td+365+leap(i);
            }
            td=td+(365)+(count(dd,mm,yy)-count(1,1,2006));
        }
        int x=td%7;
        {
            switch(x)
            {
                case 1:System.out.println("MONDAY");
                       break;
                case 2:System.out.println("TUESDAY");
                       break;       
                case 3:System.out.println("WEDNESDAY");
                       break;
                case 4:System.out.println("THURSDAY");
                       break;
                case 5:System.out.println("FRIDAY");
                       break;
                case 6:System.out.println("SATURDAY");
                       break; 
                case 7:System.out.println("SUNDAY");
                       break;
                 default:System.out.println("wrong");
                }
            }
        }
         public static void main(String args[])throws IOException
 {
     BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
     date4 ob=new date4();
     int x=0;
     System.out.println("Enter a date");
     d=Integer.parseInt(br.readLine());
     m=Integer.parseInt(br.readLine());
     y=Integer.parseInt(br.readLine());
     ob.count_date(d,m,y);
    }
}