package Project;
import java.io.*;
import java.util.Date;
import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.util.*;
public class date
{
InputStreamReader read=new InputStreamReader(System.in);
BufferedReader in=new BufferedReader(read);
static int k,count=0;
static String mini_state[]=new String[50];
static String date[]=new String[50];
static String time[]=new String[50];
void masthead() 
{
int i=0;
Calendar calender = Calendar.getInstance();
SimpleDateFormat dateformatter = new SimpleDateFormat(" dd EEEEEEEEE',' yyyy ");
SimpleDateFormat timeformatter = new SimpleDateFormat(" hh:mm:ss a");
System.out.println("                  ****************************************************************       ");
System.out.println("                  Date - "+ dateformatter.format(calender.getTime()));
System.out.println("                  Time - "+timeformatter.format(calender.getTime()));
System.out.println("                  ****************************************************************       ");
}
}