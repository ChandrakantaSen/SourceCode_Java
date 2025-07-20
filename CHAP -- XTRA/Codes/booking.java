import java.io.*;
public class booking extends reservation
    {
    public static void book()throws Exception
    {
    InputStreamReader isr=new InputStreamReader (System.in);
    BufferedReader br=new BufferedReader (isr);
    System.out.println("Please enter the class of ticket");
    System.out.println("1. AC\t 2. First\t 3. Sleeper\t");
    int c=Integer.parseInt(br.readLine());
    System.out.println("Please enter no. of tickets");
    int t=Integer.parseInt(br.readLine());
    int ticketAvailable=0;
    if(c==1 && max1>=t)
    {
    ticketAvailable=1;
    }
    if(c==2 && max2>=t)
    {
    ticketAvailable=1;
    }
    if(c==3 && max3>=t)
    {
    ticketAvailable=1;
    }
    if(ticketAvailable==1)
    {
    for(int i=0;i<t;i++)
    {
    pno[pcount]=pnum;
    System.out.println("Please enter your name");
    name[pcount]=br.readLine();
    System.out.println("Please enter your age");
    age[pcount]=Integer.parseInt(br.readLine());
    cl[pcount]=c;
    System.out.println("Please enter your phno");
    phno[pcount]=br.readLine();
    pcount++;
    pnum++;
    System.out.println("Ticket successfully booked");
    }//for
    if(c==1)
    {
    max1-=t;
    System.out.println("Please pay Rs."+t*1500);
    }
    if(c==2)
    {
    max2-=t;
    System.out.println("Please pay Rs."+t*1200);
    }
    if(c==3)
    {
    max3-=t;
    System.out.println("Please pay Rs."+t*1000);
    }
    }
    System.out.println("Press enter to continue");
    }
}