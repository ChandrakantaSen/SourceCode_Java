import java.util.*;
class calendar0
{
public static void main()
{
Calendar ob=Calendar.getInstance();
int d,m,y;
d=ob.get(Calendar.DATE);
m=ob.get(Calendar.MONTH);
m++;
y=ob.get(Calendar.YEAR);
System.out.println("Todays date is : -  "+d+" / "+m+" / "+y);
}
    }