import java.io.*;
class date_diff
{
    public static int leap(int y)
    {
        if(y%4==0  ||  y%100==0)
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
    public static int countdate(int d,int m,int y,int dd,int mm,int yy)
    {
        int i,td=0;
        if(y==yy)
        {
            td=count(d,m,y)-count(dd,mm,yy);
            if(td<0)
            td=td*-1;
        }
        else if(y>yy)
        {
            for(i=yy+1;i<y;i++)
            td=td+365+leap(i);
            td=td+(365+leap(yy))+count(d,m,y)-count(dd,mm,yy);
        }
        else
        {
            for(i=y+1;i<yy;i++)
            {
                td=td+365+leap(i);
            }
            td=td+(365+leap(y))+count(dd,mm,yy)-count(d,m,y);
        }
        return td;
    }
    public static void main()throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        date_diff obj=new date_diff();
        int d,m,y,dd,mm,yy;
        System.out.print("\nEnter a date  ");
        d=Integer.parseInt(br.readLine());
        System.out.print("\nEnter a month  ");
	m=Integer.parseInt(br.readLine());
	System.out.print("\nEnter a year  ");        
	y=Integer.parseInt(br.readLine());
        System.out.print("\nEnter another date  ");
        dd=Integer.parseInt(br.readLine());
	System.out.print("\nEnter a month  ");        
	mm=Integer.parseInt(br.readLine());
	System.out.print("\nEnter a year  ");       
 	yy=Integer.parseInt(br.readLine());
        System.out.print("The date diff in b/w "+d+"/"+m+"/"+y+" and "+dd+"/"+mm+"/"+yy+"  is:  ");
        System.out.print(obj.countdate(d,m,y,dd,mm,yy));
    }
}


 