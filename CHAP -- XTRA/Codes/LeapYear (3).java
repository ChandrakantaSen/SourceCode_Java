package All;

import java.io.*;
class LeapYear
{
    public static void main()throws IOException
    {
        int year;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("oye number dalo");
        year=Integer.parseInt(br.readLine());
        if (year%4==0)
        {
        System.out.println("Leap Year Hai");
    }
    else
    {
        System.out.println("Arre Baba not a Leap Year ufff");
    }
}
}

        