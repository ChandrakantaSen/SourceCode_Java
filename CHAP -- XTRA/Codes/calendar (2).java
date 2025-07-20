import java.io.*;
class calendar
{
    static int dd,mm,yy;
    static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    public static int leap(int u)
    {
        if(u%400==0)
        return 1;
        else if(u%4==0&&u%100!=0)
        return 1;
        else
        return 0;
    }
}
