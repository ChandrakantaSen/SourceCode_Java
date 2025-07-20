import java.io.*;
class calender0
{
static int t[]={0,31,28,31,30,31,30,31,31,30,31,30,31};
static int isLeap(int year)
{
if(year%400==0||(year%4==0&&year%100!=0))
return 1;
else
return 0;
    }
static boolean isValid(int dd,int mm,int yy)
{
t[2]=isLeap(yy)+28;
if(dd<=0||mm<=0||yy<=0||mm>12)
return false;
else if(dd>t[mm])
return false;
else
return true;
    }
    public static int count(int d,int m,int y)
    {
        int day=0,i;
        for(i=0;i<m;i++)
        {
            day=day+t[i];
        }
            if(m>2)
            day=day+isLeap(y)+d;
            else
            day=day+d;
            return day;
    }
    public static void main()throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int year,i,j,k,d_month=0,yr,x=10,y=5;
long total_days=0,days;
System.out.println("enter the year between (1900-2050):");
year=Integer.parseInt(br.readLine());
if(year<1900||year>2050)
{
System.out.println("invalid input");
System.exit(0);
}
for(yr=1900;yr<year;yr++)
{
if(isLeap(yr)==1)
days=366;
else
days=365;
total_days=total_days+days;
 }
x=(int)(total_days%7);
x=18+x*8;
for(i=1;i<=12;i++)
{
y=8;
switch(i)
{
case 1:
System.out.println("\n\n\n\t\t\t  January ----%d"+year);
d_month=31;
break;
case 2:
System.out.println("\n\n\n\t\t\t February ----%d"+year);
if(isLeap(year)==1)
d_month=29;
else
d_month=28;
break;
case 3:
System.out.println("\n\n\n\t\t\t March ----%d"+year);
d_month=31;
break;
case 4:
System.out.println("\n\n\n\t\t\t April ----%d"+year);
d_month=30;
break;
case 5:
System.out.println("\n\n\n\t\t\t May ----%d"+year);
d_month=31;
break;
case 6:
System.out.println("\n\n\n\t\t\t June ----%d"+year);
d_month=30;
break;
case 7:
System.out.println("\n\n\n\t\t\t July ----%d"+year);
d_month=31;
break;
case 8:
System.out.println("\n\n\n\t\t\t August ----%d"+year);
d_month=31;
break;
case 9:
System.out.println("\n\n\n\t\t\t September ----%d"+year);
d_month=30;
break;
case 10:
System.out.println("\n\n\n\t\t\t October ----%d"+year);
d_month=31;
break;
case 11:
System.out.println("\n\n\n\t\t\t November ----%d"+year);
d_month=30;
break;
case 12:
System.out.println("\n\n\n\t\t\t December ----%d"+year);
d_month=31;
break;
}
heading();
for(k=1;k<=d_month;k++)
{
System.out.println("%2d"+k); x+=8;
if(x>64)
{
x=10;y++;
}
}
System.out.println("\n=========================================================== \n");

}
}
public static void heading()
{
System.out.println("\n\n	Sun     Mon     Tue     Wed     Thu     Fri     Sat");
System.out.println("\n    =======================================================\n");
}
    }