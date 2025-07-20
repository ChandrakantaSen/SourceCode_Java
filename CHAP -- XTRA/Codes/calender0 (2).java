import java.io.*;
class calender0
{
    int leap(int yr)
    {
        if(yr%4==0 || yr%400==0)
        return 1;
        else
        return 0;
    }
    void main()throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String month[]={"Jan","Feb","Mar","Apr","May","June","Jul","Aug","Sep","Oct","Nov","Dec"};
        int mon_day[]={31,28,31,30,31,30,31,31,30,31,30,31};
        long day=0;
        int week_d=0;
        System.out.print("This program is to generate the calender of a given year\n ");
        System.out.println("Enter the year : ");
        int yy=Integer.parseInt(br.readLine());
        if(yy>=2006)
        {
            for(int i=2006;i<yy;i++)
            {
                if(leap(i)==1)
                day+=366;
                else 
                day+=365;
            }
            week_d=0;
            for(long k=0;k<day;k++)
            {
                week_d++;
                if(week_d>6)
                week_d=0;
            }
        }
        else if(yy<2006)
        {
            for(int i=yy;i<2006;i++)
            {
                if(leap(i)==1)
                day+=366;
                else 
                day+=365;
            }
            week_d=0;
            for(long k=0;k<day;k++)
            {
                week_d--;
                if(week_d<0)
                week_d=6;
            }
        }
        int l=0;
        l=week_d;
        for(int m=0;m<12;m++)
        {
            if(m==6)
            {
                System.out.print("Enter any number : ");
                int d=Integer.parseInt(br.readLine());
            }
            System.out.println(month[m]+" "+yy);
            System.out.println("Sun \tMon \tTue \tWed \tThur \tFri \tSat");
            for(int j=0;j<l;j++)
            System.out.print(" \t");
            for(int q=1;q<=mon_day[m];q++)
            {
                System.out.print(q+"\t");
                l++;
                if(l==7)
                {
                    System.out.println();
                    l=0;
                }
            }
            if(m==1 && leap(yy)==1)
            {
                System.out.print("29");
                l++;
                if(l==7)
                l=0;          
            }
            System.out.println();
            
        }
    }
}
                