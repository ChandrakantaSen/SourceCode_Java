import java.util.*;

class cal1
{
    public static void main()
    {
        Calendar c = Calendar.getInstance();
        int d=c.get(Calendar.DATE);
        int m=c.get(Calendar.MONTH);
        int y=c.get(Calendar.YEAR);
        System.out.println("Today's Date is : "+d+" / "+m+" / "+y);
        c.set(Calendar.DATE,8);
        c.set(Calendar.MONTH,7);
        c.set(Calendar.YEAR,2015);
         d=c.get(Calendar.DATE);
         m=c.get(Calendar.MONTH);
         y=c.get(Calendar.YEAR);
        System.out.println("Today's Date is : "+d+" / "+m+" / "+y);
    }
}