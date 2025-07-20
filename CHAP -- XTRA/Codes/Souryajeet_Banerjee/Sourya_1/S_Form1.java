import java.io.*;
import java.util.Date;
import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.util.*;
public class S_Form1
{
    InputStreamReader read=new InputStreamReader(System.in);
    BufferedReader in=new BufferedReader(read);
    static int k,count=0;
    static String mini_state[]=new String[50];
    static String date[]=new String[50];
    static String time[]=new String[50];
    public static void main(String args[])throws IOException
    {
        String  s="",s1="",s2="",s3="",s4="Souryajeet Banerjee",s5="male",s6="A58-07T132mb",s7="A58";
        int n,i,b/*,c,d,e*/;
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        System.out.println("           Create your account.");
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("      Fill up your personal details in this form.");
        System.out.println();
        System.out.println();
        System.out.print("        What is your name:                  ");
        s=br.readLine();
        System.out.println();
        System.out.println();
        System.out.print("        What is your age:                   ");
        i=Integer.parseInt(br.readLine());
        System.out.println();
        System.out.println();
        System.out.print("        What is your gender: (male||female) ");
        s1=br.readLine();
        s1=s1.toLowerCase();
        System.out.println();
        System.out.println();
        System.out.print("        What is your code id:         ");
        s2=br.readLine();
        System.out.println();
        System.out.println();
        System.out.print("        What is your Password:         ");
        s3=br.readLine();
        System.out.println();
        System.out.println();
        Calendar calender = Calendar.getInstance();
        SimpleDateFormat dateformatter = new SimpleDateFormat(" dd EEEEEEEEE',' yyyy ");
        SimpleDateFormat timeformatter = new SimpleDateFormat(" hh:mm:ss a");
        System.out.println("        Date:    "+ dateformatter.format(calender.getTime()));
        System.out.println("        Time:    "+timeformatter.format(calender.getTime()));
        System.out.println("        Name:     "+s);
        System.out.println("        Age:      "+i);
        System.out.println("        Gender:   "+s1);
        System.out.println("        Code id:  "+s2);
        System.out.println("        Password: "+s3);
        System.out.println();
        System.out.println();
        System.out.println("      Please wait while we process your request...");
        for(int j=0;j<=200;j++)
        {
            for(int a=0;a<=999999999;a++)
            {
            }
        }
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        if(s.equals(s4)==true&&i>=15&&s1.equals(s5)==true&&s2.equals(s6)==true&&s3.equals(s7)==true)
        {
            System.out.println("       Welcome to our webside.");
            for(int j=0;j<=200;j++)
            {
                for(int a=0;a<=999999999;a++)
                {
                }
            }
            System.out.println();
            System.out.println();
            System.out.println("       Press 1 for game");
            for(int j=0;j<=200;j++)
            {
                for(int a=0;a<=999999999;a++)
                {
                }
            }
            b=Integer.parseInt(br.readLine());
            if(b==1)
            {
                System.out.println("       Welcome to our game.");
                for(int j=0;j<=100;j++)
                {
                    for(int a=0;a<=999999999;a++)
                    {
                    }
                }
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println("       ******* # ********");
                System.out.println("       *******   ********");
                System.out.println("       *******   ********");
                System.out.println("       *******   ********");
                System.out.println("       *******   ********");
                System.out.println("       *******   ********");
                System.out.println("       *******   ********");
                System.out.println("       *******   ********");
                System.out.println("       *******   ********");
                System.out.println("       *******   ********");
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();/*
            }
            else
            {*/
                System.out.println("       Sorry try tater .");
            }
        }
        else
        {
            System.out.println("       Sorry you are not in our team.");
        }
    }
}