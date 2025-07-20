import java.io.*;
class revision
{
    public static int leap(int y)
    {
        if(y%4==0  ||  y%100==0)
        return 1;
        else 
        return 0;
    }
    public static int date1(int d,int m,int y)
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
    public static int date2(int d,int m,int y,int dd,int mm,int yy)
    {
        int i,td=0;
        if(y==yy)
        {
            td=date1(d,m,y)-date1(dd,mm,yy);
            if(td<0)
            td=td*-1;
        }
        else if(y>yy)
        {
            for(i=yy+1;i<y;i++)
            td=td+365+leap(i);
            td=td+(365+leap(yy))+date1(d,m,y)-date1(dd,mm,yy);
        }
        else
        {
            for(i=y+1;i<yy;i++)
            {
                td=td+365+leap(i);
            }
            td=td+(365+leap(y))+date1(dd,mm,yy)-date1(d,m,y);
        }
        return td;
    }
    public static void main()throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        revision obj=new revision();
        int d,m,y,dd,mm,yy;
        System.out.println("\nEnter a date (dd/mm/yy): ");
        d=Integer.parseInt(br.readLine());
        m=Integer.parseInt(br.readLine());
        y=Integer.parseInt(br.readLine());
        System.out.print("\nEnter another date (dd/mm/yy): ");
        dd=Integer.parseInt(br.readLine());
        mm=Integer.parseInt(br.readLine());
        yy=Integer.parseInt(br.readLine());
        System.out.print("The date diff in b/w "+d+"/"+m+"/"+y+" and "+dd+"/"+mm+"/"+yy+"  is:  ");
        System.out.print(obj.date2(d,m,y,dd,mm,yy));
    }
}