class days
{
int day1,day2;
days(int d1,int d2)
{
day1=d1;
day2=d2;
    }
}
class difference
{
public static void main()
{
int dd1=20, dd2=30, d;
days obj=new days(dd1,dd2);
d=obj.day1-obj.day2;
System.out.println("difference="+d);
    }
}