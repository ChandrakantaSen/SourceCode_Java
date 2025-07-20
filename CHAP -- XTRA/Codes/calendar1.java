import java.util.*;
class calendar1
{
public static void main()
{
Calendar ob=Calendar.getInstance();
int d,m,y,dow,dom,doy,h,min,s,ms;
d=ob.get(Calendar.DATE);
m=ob.get(Calendar.MONTH);
m++;
y=ob.get(Calendar.YEAR);
dow=ob.get(Calendar.DAY_OF_WEEK);
dom=ob.get(Calendar.DAY_OF_MONTH);
doy=ob.get(Calendar.DAY_OF_YEAR);
h=ob.get(Calendar.HOUR);
min=ob.get(Calendar.MINUTE);
s=ob.get(Calendar.SECOND);
ms=ob.get(Calendar.MILLISECOND);
System.out.println("Todays date is : -  "+d+" / "+m+" / "+y);
System.out.println("Date of week is : -  "+dow);
System.out.println("Date of month is : -  "+dom);
System.out.println("Date of year is : -  "+doy);
System.out.println("The time is : -  "+h+" : "+min+" : "+s+" : "+ms);
}
    }