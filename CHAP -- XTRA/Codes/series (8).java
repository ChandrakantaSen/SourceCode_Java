package All;

import java.io.*;
public class series
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        double s=0.0;
        for(int i=1;i<=100;i++)
        {
            s=s+Math.pow(2,i)-1.0;
        }
        System.out.println(s);
    }
}

        