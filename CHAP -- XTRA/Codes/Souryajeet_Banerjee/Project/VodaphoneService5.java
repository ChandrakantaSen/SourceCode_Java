package Project;
import java.io.*;
import java.util.Date;
import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.util.*;
public class VodaphoneService5
{
    InputStreamReader read=new InputStreamReader(System.in);
    BufferedReader in=new BufferedReader(read);
    static int k,count=0;
    static String mini_state[]=new String[50];
    static String date[]=new String[50];
    static String time[]=new String[50];
    public static void main(String args[]) throws IOException 
    {
        int i=0;
        Calendar calender = Calendar.getInstance();
        SimpleDateFormat dateformatter = new SimpleDateFormat(" dd EEEEEEEEE',' yyyy ");
        SimpleDateFormat timeformatter = new SimpleDateFormat(" hh:mm:ss a");
        System.out.println("                  ****************************************************************       ");
        System.out.println("                  Date - "+ dateformatter.format(calender.getTime()));
        System.out.println("                  Time - "+timeformatter.format(calender.getTime()));
        System.out.println("                  ****************************************************************       ");  
        BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
        int m;
        double balance=0.0,datapackage=0.0;
        double tax=0.0;
         double amt=0.0;
         double bill=0.0;
       for(int g=0;g<=30;g++)
       {
        System.out.println("                  ****************************************************************       ");
        System.out.print("                     Type  the first four disit of your phone number - ");
        int o=Integer.parseInt(obj.readLine());
        System.out.println();
        System.out.println("                  ****************************************************************       ");
         o=o/100;
        if(o==86)
        {
            System.out.println("                  ****************************************************************       ");
            System.out.println("                                          Welcome                 ");
            System.out.println("                                         to Vodaphone              ");
            System.out.println("                                        recharge senter                ");
            System.out.println("                  ****************************************************************       ");
            System.out.println("                  ****************************************************************       ");
            System.out.println("                  Date - "+ dateformatter.format(calender.getTime()));
            System.out.println("                  Time - "+timeformatter.format(calender.getTime()));
            System.out.println("                  ****************************************************************       ");
            System.out.println("                  ****************************************************************       ");
            System.out.println("                                 The bill will be send  ");
            System.out.println("                                      to your home ");
            System.out.println("                  ****************************************************************       ");
          for(int s=0;s<=11;s++)
          {
            System.out.println("                  ****************************************************************       ");
            System.out.println("                    PRESS 1,For balence information");
            System.out.println("                    PRESS 2,For datapackage information");
            System.out.println("                    PRESS 3,For acount information or update");
            System.out.println("                    PRESS 4,For recharge ");
            System.out.println("                    PRESS 5,For datapackage update");
            System.out.println("                    PRESS 6,For My delights");
            System.out.println("                    PRESS 7,For last 3 actyities");
            System.out.println("                    PRESS 8,For Vass and service");
            System.out.println("                    PRESS 9,For Bonus Card");
            System.out.println("                    PRESS 10,For Best Offer");
            System.out.println("                    PRESS 11,For Low Balence Services");
            System.out.println("                    PRESS 12,To Exit");
            System.out.println("                  ****************************************************************       ");
            int n;
            m=Integer.parseInt(obj.readLine());
             if(m==1)
            {
                System.out.println("                  ::::::::::::::::::::::::::::::::::::::::::::::");
                System.out.println("                        Balance  information");
                System.out.println("                  ::::::::::::::::::::::::::::::::::::::::::::::");
                System.out.println("                  ::::::::::::::::::::::::::::::::::::::::::::::");
                System.out.println("                  Please wait while we process your request...");
                System.out.println("                  ::::::::::::::::::::::::::::::::::::::::::::::");
                System.out.println("                  ****************************************************************       ");
                System.out.println("                    YOUR NEW Balance IS RS  " +balance                                   );
                System.out.println("                  ****************************************************************       ");
                System.out.println("                  Date - "+ dateformatter.format(calender.getTime())                      );
                System.out.println("                  Time - "+timeformatter.format(calender.getTime())                       );
                System.out.println("                  ****************************************************************       ");
                System.out.println("                  ****************************************************************       ");
                System.out.println("                                     Extra information"        );
                System.out.println("                             Balance  Valid for "+balance+" days"        );
                System.out.println("                             Datapackage  Valid for "+datapackage+" days"        );
                System.out.println("                  ****************************************************************       ");
                System.out.println("                  ****************************************************************   ");
                System.out.println("                                  Have an good day"        );
                System.out.println("                  ****************************************************************    ");
                System.out.println("                                     Thankyou                                  ");
                System.out.println("                                  visit us again                                 ");
                System.out.println("                  ****************************************************************       ");
            }
            else if(m==2)
            {
                System.out.println("                  ::::::::::::::::::::::::::::::::::::::::::::::");
                System.out.println("                          Datapackage information");
                System.out.println("                  ::::::::::::::::::::::::::::::::::::::::::::::");
                System.out.println("                  ::::::::::::::::::::::::::::::::::::::::::::::");
                System.out.println("                  Please wait while we process your request...");
                System.out.println("                  ::::::::::::::::::::::::::::::::::::::::::::::");
                System.out.println("                  ****************************************************************       ");
                System.out.println("                    YOUR NEW Datapackage IS   " +datapackage +"mb"                          );
                System.out.println("                  ****************************************************************       ");
                System.out.println("                  Date - "+ dateformatter.format(calender.getTime())                      );
                System.out.println("                  Time - "+timeformatter.format(calender.getTime())                       );
                System.out.println("                  ****************************************************************       ");
                System.out.println("                  ****************************************************************       ");
                System.out.println("                                     Extra information"        );
                System.out.println("                             Balance  Valid for "+balance+" days"        );
                System.out.println("                             Datapackage  Valid for "+datapackage+" days"        );
                System.out.println("                  ****************************************************************       ");
                System.out.println("                  ****************************************************************   ");
                System.out.println("                                  Have an good day"        );
                System.out.println("                  ****************************************************************    ");
                System.out.println("                                     Thankyou                                  ");
                System.out.println("                                  visit us again                                 ");
                System.out.println("                  ****************************************************************       ");
            }
            else if(m==3)
            {
                System.out.println("                  ****************************************************************       ");
                System.out.println("                                     ACOUNT information or update"        );
                System.out.println("                             Balance  Valid for "+balance+" days"        );
                System.out.println("                             Datapackage  Valid for "+datapackage+" days"        );
                System.out.println("                  ****************************************************************       ");
                System.out.println("                  ****************************************************************       ");
                System.out.println("                  Date - "+ dateformatter.format(calender.getTime())                      );
                System.out.println("                  Time - "+timeformatter.format(calender.getTime())                       );
                System.out.println("                  ****************************************************************       ");
                System.out.println("                  ****************************************************************   ");
                System.out.println("                                Have an good day"        );
                System.out.println("                  ****************************************************************    ");
                System.out.println("                                     Thankyou                                  ");
                System.out.println("                                  visit us again                                 ");
                System.out.println("                  ****************************************************************       ");
            }
            else if(m==4)
            {
                System.out.println("              ****************************************************************       ");
                System.out.println("                  Date - "+ dateformatter.format(calender.getTime()));
                System.out.println("                  Time - "+timeformatter.format(calender.getTime()) );
                System.out.println("              ****************************************************************       ");
                System.out.println("              ****************************************************************       ");
                System.out.println("                    PRESS 1,For Recharge of Rs 5");
                System.out.println("                    PRESS 2,For Recharge of Rs 10");
                System.out.println("                    PRESS 3,For Recharge of Rs 15");
                System.out.println("                    PRESS 4,For Recharge of Rs 20");
                System.out.println("                    PRESS 5,For Recharge of Rs 30");
                System.out.println("                    PRESS 6,For Recharge of Rs 50");
                System.out.println("                    PRESS 7,For Recharge of Rs 100");
                System.out.println("                    PRESS 8,For Recharge of Rs 150");
                System.out.println("                    PRESS 9,For Recharge of Rs 200");
                System.out.println("                    PRESS 10,For Recharge of Rs 500");
                System.out.println("                    PRESS 11,For Recharge of Rs 1000");
                System.out.println("                    PRESS 12,For Recharge of Rs 5000");
                System.out.println("              ****************************************************************       ");
                System.out.println("                               After choosing  ");
                System.out.println("                              press any number  ");
                System.out.println("                              in the next line ");
                System.out.println("                                to progress ");
                System.out.println("              ****************************************************************       ");
                int cho=Integer.parseInt(obj.readLine());
                switch(cho)
                {
                    case 1:
                    n=Integer.parseInt(obj.readLine());
                    balance=balance+5-1.10-1;
                    System.out.println("                  ::::::::::::::::::::::::::::::::::::::::::::::");
                    System.out.println("                  Please wait while we process your request...");
                    System.out.println("                  ::::::::::::::::::::::::::::::::::::::::::::::");
                    System.out.println("                  ****************************************************************       ");
                    System.out.println("                    YOUR NEW BALENCE including 2.10tax IS RS  " +balance                  );
                    System.out.println("                  ****************************************************************       ");
                    System.out.println("                  Date - "+ dateformatter.format(calender.getTime())                      );
                    System.out.println("                  Time - "+timeformatter.format(calender.getTime())                       );
                    System.out.println("                  ****************************************************************       ");
                    if(balance<=75)
                    {
                      balance=(balance+2.1)/5;
                    }
                    else if(balance<=500)
                    {   
                      balance=(balance+2.1)/5;
                    }
                    else 
                    {
                      balance=(balance+2.1)/5;
                    }
                    System.out.println("                  ****************************************************************       ");
                    System.out.println("                                     Extra information"        );
                    System.out.println("                             Balance  Valid for "+balance+" days"        );
                    System.out.println("                             Datapackage  Valid for "+datapackage+" days"        );
                    System.out.println("                  ****************************************************************       ");
                    System.out.println("                  ****************************************************************   ");
                    System.out.println("                                  Have an good day"        );
                    System.out.println("                  ****************************************************************    ");
                    System.out.println("                                     Thankyou                                  ");
                    System.out.println("                                  visit us again                                 ");
                    System.out.println("                  ****************************************************************       ");
                    break;
                    case 2:
                    n=Integer.parseInt(obj.readLine());
                    balance=balance+10-1.10-1;
                    System.out.println("                  ::::::::::::::::::::::::::::::::::::::::::::::");
                    System.out.println("                  Please wait while we process your request...");
                    System.out.println("                  ::::::::::::::::::::::::::::::::::::::::::::::");
                    System.out.println("                  ****************************************************************       ");
                    System.out.println("                    YOUR NEW BALENCE including 2.10tax IS RS  " +balance                   );
                    System.out.println("                  ****************************************************************       ");
                    System.out.println("                  Date - "+ dateformatter.format(calender.getTime())                      );
                    System.out.println("                  Time - "+timeformatter.format(calender.getTime())                       );
                    System.out.println("                  ****************************************************************       ");
                    if(balance<=75)
                    {
                      balance=(balance+2.1)/5;
                    }
                    else if(balance<=500)
                    {   
                      balance=(balance+2.1)/5;
                    }
                    else 
                    {
                      balance=(balance+2.1)/5;
                    }
                    System.out.println("                  ****************************************************************       ");
                    System.out.println("                                     Extra information"        );
                    System.out.println("                             Balance  Valid for "+balance+" days"        );
                    System.out.println("                             Datapackage  Valid for "+datapackage+" days"        );
                    System.out.println("                  ****************************************************************       ");
                    System.out.println("                  ****************************************************************   ");
                    System.out.println("                                  Have an good day"        );
                    System.out.println("                  ****************************************************************    ");
                    System.out.println("                                     Thankyou                                  ");
                    System.out.println("                                  visit us again                                 ");
                    System.out.println("                  ****************************************************************       ");
                    break;
                    case 3:
                    n=Integer.parseInt(obj.readLine());
                    balance=balance+15-1.10-1;
                    System.out.println("                  ::::::::::::::::::::::::::::::::::::::::::::::");
                    System.out.println("                  Please wait while we process your request...");
                    System.out.println("                  ::::::::::::::::::::::::::::::::::::::::::::::");
                    System.out.println("                  ****************************************************************       ");
                    System.out.println("                    YOUR NEW BALENCE including 2.10tax IS RS  " +balance                   );
                    System.out.println("                  ****************************************************************       ");
                    System.out.println("                  Date - "+ dateformatter.format(calender.getTime())                      );
                    System.out.println("                  Time - "+timeformatter.format(calender.getTime())                       );
                    System.out.println("                  ****************************************************************       ");
                    if(balance<=75)
                    {
                      balance=(balance+2.1)/5;
                    }
                    else if(balance<=500)
                    {   
                      balance=(balance+2.1)/5;
                    }
                    else 
                    {
                      balance=(balance+2.1)/5;
                    }
                    System.out.println("                  ****************************************************************    ");
                    System.out.println("                                     Extra information"        );
                    System.out.println("                             Balance  Valid for "+balance+" days"        );
                    System.out.println("                             Datapackage  Valid for "+datapackage+" days"        );
                    System.out.println("                  ****************************************************************    ");
                    System.out.println("                  ****************************************************************   ");
                    System.out.println("                                  Have an good day"        );
                    System.out.println("                  ****************************************************************    ");
                    System.out.println("                                     Thankyou                                  ");
                    System.out.println("                                  visit us again                                 ");
                    System.out.println("                  ****************************************************************       ");
                    break;
                    case 4:
                    n=Integer.parseInt(obj.readLine());
                    balance=balance+20-1.10-1;
                    System.out.println("                  ::::::::::::::::::::::::::::::::::::::::::::::");
                    System.out.println("                  Please wait while we process your request...");
                    System.out.println("                  ::::::::::::::::::::::::::::::::::::::::::::::");
                    System.out.println("                  ****************************************************************       ");
                    System.out.println("                    YOUR NEW BALENCE including 2.10tax IS RS  " +balance                   );
                    System.out.println("                  ****************************************************************       ");
                    System.out.println("                  Date - "+ dateformatter.format(calender.getTime())                      );
                    System.out.println("                  Time - "+timeformatter.format(calender.getTime())                       );
                    System.out.println("                  ****************************************************************       ");
                    if(balance<=75)
                    {
                      balance=(balance+2.1)/5;
                    }
                    else if(balance<=500)
                    {   
                      balance=(balance+2.1)/5;
                    }
                    else 
                    {
                      balance=(balance+2.1)/5;
                    }
                    System.out.println("                  ****************************************************************    ");
                    System.out.println("                                     Extra information"        );
                    System.out.println("                             Balance  Valid for "+balance+" days"        );
                    System.out.println("                             Datapackage  Valid for "+datapackage+" days"        );
                    System.out.println("                  ****************************************************************    ");
                    System.out.println("                  ****************************************************************   ");
                    System.out.println("                                  Have an good day"        );
                    System.out.println("                  ****************************************************************    ");
                    System.out.println("                                     Thankyou                                  ");
                    System.out.println("                                  visit us again                                 ");
                    System.out.println("                  ****************************************************************       ");
                    break;
                    case 5:
                    n=Integer.parseInt(obj.readLine());
                    balance=balance+30-1.10-1; 
                    System.out.println("                  ::::::::::::::::::::::::::::::::::::::::::::::");
                    System.out.println("                  Please wait while we process your request...");
                    System.out.println("                  ::::::::::::::::::::::::::::::::::::::::::::::");
                    System.out.println("                  ****************************************************************       ");
                    System.out.println("                    YOUR NEW BALENCE including 2.10tax IS RS  " +balance                  );
                    System.out.println("                  ****************************************************************       ");
                    System.out.println("                  Date - "+ dateformatter.format(calender.getTime())                      );
                    System.out.println("                  Time - "+timeformatter.format(calender.getTime())                       );
                    System.out.println("                  ****************************************************************       ");
                    if(balance<=75)
                    {
                      balance=(balance+2.1)/5;
                    }
                    else if(balance<=500)
                    {   
                      balance=(balance+2.1)/5;
                    }
                    else 
                    {
                      balance=(balance+2.1)/5;
                    }
                    System.out.println("                  ****************************************************************       ");
                    System.out.println("                                     Extra information"        );
                    System.out.println("                             Balance  Valid for "+balance+" days"        );
                    System.out.println("                             Datapackage  Valid for "+datapackage+" days"        );
                    System.out.println("                  ****************************************************************       ");
                    System.out.println("                  ****************************************************************   ");
                    System.out.println("                                  Have an good day"        );
                    System.out.println("                  ****************************************************************    ");
                    System.out.println("                                     Thankyou                                  ");
                    System.out.println("                                  visit us again                                 ");
                    System.out.println("                  ****************************************************************       ");
                    break;
                    case 6:
                    n=Integer.parseInt(obj.readLine());
                    balance=balance+50-1.10-1;
                    System.out.println("                  ::::::::::::::::::::::::::::::::::::::::::::::");
                    System.out.println("                  Please wait while we process your request...");
                    System.out.println("                  ::::::::::::::::::::::::::::::::::::::::::::::");
                    System.out.println("                  ****************************************************************       ");
                    System.out.println("                    YOUR NEW BALENCE including 2.10tax IS RS  " +balance                   );
                    System.out.println("                  ****************************************************************       ");
                    System.out.println("                  Date - "+ dateformatter.format(calender.getTime())                      );
                    System.out.println("                  Time - "+timeformatter.format(calender.getTime())                       );
                    System.out.println("                  ****************************************************************       ");
                   if(balance<=75)
                    {
                      balance=(balance+2.1)/5;
                    }
                    else if(balance<=500)
                    {   
                      balance=(balance+2.1)/5;
                    }
                    else 
                    {
                      balance=(balance+2.1)/5;
                    }
                    System.out.println("                  ****************************************************************       ");
                    System.out.println("                                     Extra information"        );
                    System.out.println("                             Balance  Valid for "+balance+" days"        );
                    System.out.println("                             Datapackage  Valid for "+datapackage+" days"        );
                    System.out.println("                  ****************************************************************       ");
                    System.out.println("                  ****************************************************************   ");
                    System.out.println("                                  Have an good day"        );
                    System.out.println("                  ****************************************************************    ");
                    System.out.println("                                     Thankyou                                  ");
                    System.out.println("                                  visit us again                                 ");
                    System.out.println("                  ****************************************************************       ");
                    break;
                    case 7:
                    n=Integer.parseInt(obj.readLine());
                    balance=balance+100-1.10-1;
                    System.out.println("                  ::::::::::::::::::::::::::::::::::::::::::::::");
                    System.out.println("                  Please wait while we process your request...");
                    System.out.println("                  ::::::::::::::::::::::::::::::::::::::::::::::");
                    System.out.println("                  ****************************************************************       ");
                    System.out.println("                    YOUR NEW BALENCE including 2.10tax IS RS  " +balance                   );
                    System.out.println("                  ****************************************************************       ");
                    System.out.println("                  Date - "+ dateformatter.format(calender.getTime())                      );
                    System.out.println("                  Time - "+timeformatter.format(calender.getTime())                       );
                    System.out.println("                  ****************************************************************       ");
                    if(balance<=75)
                    {
                      balance=(balance+2.1)/5;
                    }
                    else if(balance<=500)
                    {   
                      balance=(balance+2.1)/5;
                    }
                    else 
                    {
                      balance=(balance+2.1)/5;
                    }
                    System.out.println("                  ****************************************************************       ");
                    System.out.println("                                     Extra information"        );
                    System.out.println("                             Balance  Valid for "+balance+" days"        );
                    System.out.println("                             Datapackage  Valid for "+datapackage+" days"        );
                    System.out.println("                  ****************************************************************       ");
                    System.out.println("                  ****************************************************************   ");
                    System.out.println("                                  Have an good day"        );
                    System.out.println("                  ****************************************************************    ");
                    System.out.println("                                     Thankyou                                  ");
                    System.out.println("                                  visit us again                                 ");
                    System.out.println("                  ****************************************************************       ");
                    break;
                    case 8:
                    n=Integer.parseInt(obj.readLine());
                    balance=balance+150-1.10-1;
                    System.out.println("                  ::::::::::::::::::::::::::::::::::::::::::::::");
                    System.out.println("                  Please wait while we process your request...");
                    System.out.println("                  ::::::::::::::::::::::::::::::::::::::::::::::");
                    System.out.println("                  ****************************************************************       ");
                    System.out.println("                    YOUR NEW BALENCE including 2.10tax IS RS  " +balance                   );
                    System.out.println("                  ****************************************************************       ");
                    System.out.println("                  Date - "+ dateformatter.format(calender.getTime())                      );
                    System.out.println("                  Time - "+timeformatter.format(calender.getTime())                       );
                    System.out.println("                  ****************************************************************       ");
                    if(balance<=75)
                    {
                      balance=(balance+2.1)/5;
                    }
                    else if(balance<=500)
                    {   
                      balance=(balance+2.1)/5;
                    }
                    else 
                    {
                      balance=(balance+2.1)/5;
                    }
                    System.out.println("                  ****************************************************************       ");
                    System.out.println("                                     Extra information"        );
                    System.out.println("                             Balance  Valid for "+balance+" days"        );
                    System.out.println("                             Datapackage  Valid for "+datapackage+" days"        );
                    System.out.println("                  ****************************************************************       ");
                    System.out.println("                  ****************************************************************   ");
                    System.out.println("                                  Have an good day"        );
                    System.out.println("                  ****************************************************************    ");
                    System.out.println("                                     Thankyou                                  ");
                    System.out.println("                                  visit us again                                 ");
                    System.out.println("                  ****************************************************************       ");
                    break;
                    case 9:
                    n=Integer.parseInt(obj.readLine());
                    balance=balance+200-1.10-1; 
                    System.out.println("                  ::::::::::::::::::::::::::::::::::::::::::::::");
                    System.out.println("                  Please wait while we process your request...");
                    System.out.println("                  ::::::::::::::::::::::::::::::::::::::::::::::");
                    System.out.println("                  ****************************************************************       ");
                    System.out.println("                     YOUR NEW BALENCE including 2.10tax IS RS   " +balance                                   );
                    System.out.println("                  ****************************************************************       ");
                    System.out.println("                  Date - "+ dateformatter.format(calender.getTime())                      );
                    System.out.println("                  Time - "+timeformatter.format(calender.getTime())                       );
                    System.out.println("                  ****************************************************************       ");
                    if(balance<=75)
                    {
                      balance=(balance+2.1)/5;
                    }
                    else if(balance<=500)
                    {   
                      balance=(balance+2.1)/5;
                    }
                    else 
                    {
                      balance=(balance+2.1)/5;
                    }
                    System.out.println("                  ****************************************************************       ");
                    System.out.println("                                     Extra information"        );
                    System.out.println("                             Balance  Valid for "+balance+" days"        );
                    System.out.println("                             Datapackage  Valid for "+datapackage+" days"        );
                    System.out.println("                  ****************************************************************       ");
                    System.out.println("                  ****************************************************************   ");
                    System.out.println("                                  Have an good day"        );
                    System.out.println("                  ****************************************************************    ");
                    System.out.println("                                     Thankyou                                  ");
                    System.out.println("                                  visit us again                                 ");
                    System.out.println("                  ****************************************************************       ");
                    break;
                    case 10:
                    n=Integer.parseInt(obj.readLine());
                    balance=balance+500-1.10-1;
                    System.out.println("                  ::::::::::::::::::::::::::::::::::::::::::::::");
                    System.out.println("                  Please wait while we process your request...");
                    System.out.println("                  ::::::::::::::::::::::::::::::::::::::::::::::");
                    System.out.println("                  ****************************************************************       ");
                    System.out.println("                     YOUR NEW BALENCE including 2.10tax IS RS   " +balance                                   );
                    System.out.println("                  ****************************************************************       ");
                    System.out.println("                  Date - "+ dateformatter.format(calender.getTime())                      );
                    System.out.println("                  Time - "+timeformatter.format(calender.getTime())                       );
                    System.out.println("                  ****************************************************************       ");
                    if(balance<=75)
                    {
                      balance=(balance+2.1)/5;
                    }
                    else if(balance<=500)
                    {   
                      balance=(balance+2.1)/5;
                    }
                    else 
                    {
                      balance=(balance+2.1)/5;
                    }
                    System.out.println("                  ****************************************************************       ");
                    System.out.println("                                     Extra information"        );
                    System.out.println("                             Balance  Valid for "+balance+" days"        );
                    System.out.println("                             Datapackage  Valid for "+datapackage+" days"        );
                    System.out.println("                  ****************************************************************       ");
                    System.out.println("                  ****************************************************************   ");
                    System.out.println("                                  Have an good day"        );
                    System.out.println("                  ****************************************************************    ");
                    System.out.println("                                     Thankyou                                  ");
                    System.out.println("                                  visit us again                                 ");
                    System.out.println("                  ****************************************************************       ");
                    break;
                    case 11:
                    n=Integer.parseInt(obj.readLine());
                    balance=balance+1000-1.10-1;
                    System.out.println("                  ::::::::::::::::::::::::::::::::::::::::::::::");
                    System.out.println("                  Please wait while we process your request...");
                    System.out.println("                  ::::::::::::::::::::::::::::::::::::::::::::::");
                    System.out.println("                  ****************************************************************       ");
                    System.out.println("                     YOUR NEW BALENCE including 2.10tax IS RS   " +balance                                   );
                    System.out.println("                  ****************************************************************       ");
                    System.out.println("                  Date - "+ dateformatter.format(calender.getTime())                      );
                    System.out.println("                  Time - "+timeformatter.format(calender.getTime())                       );
                    System.out.println("                  ****************************************************************       ");
                    if(balance<=75)
                    {
                      balance=(balance+2.1)/5;
                    }
                    else if(balance<=500)
                    {   
                      balance=(balance+2.1)/5;
                    }
                    else 
                    {
                      balance=(balance+2.1)/5;
                    }
                    System.out.println("                  ****************************************************************       ");
                    System.out.println("                                     Extra information"        );
                    System.out.println("                             Balance  Valid for "+balance+" days"        );
                    System.out.println("                             Datapackage  Valid for "+datapackage+" days"        );
                    System.out.println("                  ****************************************************************       ");
                    System.out.println("                  ****************************************************************   ");
                    System.out.println("                                  Have an good day"        );
                    System.out.println("                  ****************************************************************    ");
                    System.out.println("                                     Thankyou                                  ");
                    System.out.println("                                  visit us again                                 ");
                    System.out.println("                  ****************************************************************       ");
                    break;
                    case 12:
                    n=Integer.parseInt(obj.readLine());
                    balance=balance+5000-1.10-1;
                    System.out.println("                  ::::::::::::::::::::::::::::::::::::::::::::::");
                    System.out.println("                  Please wait while we process your request...");
                    System.out.println("                  ::::::::::::::::::::::::::::::::::::::::::::::");
                    System.out.println("                  ****************************************************************       ");
                    System.out.println("                    YOUR NEW BALENCE including 2.10tax IS RS   " +balance                                   );
                    System.out.println("                  ****************************************************************       ");
                    System.out.println("                  Date - "+ dateformatter.format(calender.getTime())                      );
                    System.out.println("                  Time - "+timeformatter.format(calender.getTime())                       );
                    System.out.println("                  ****************************************************************       ");
                    if(balance<=75)
                    {
                      balance=(balance+2.1)/5;
                    }
                    else if(balance<=500)
                    {   
                      balance=(balance+2.1)/5;
                    }
                    else 
                    {
                      balance=(balance+2.1)/5;
                    }
                    System.out.println("                  ****************************************************************       ");
                    System.out.println("                                     Extra information"        );
                    System.out.println("                             Balance  Valid for "+balance+" days"        );
                    System.out.println("                             Datapackage  Valid for "+datapackage+" days"        );
                    System.out.println("                  ****************************************************************       ");
                    System.out.println("                  ****************************************************************   ");
                    System.out.println("                                  Have an good day"        );
                    System.out.println("                  ****************************************************************    ");
                    System.out.println("                                     Thankyou                                  ");
                    System.out.println("                                  visit us again                                 ");
                    System.out.println("                  ****************************************************************       ");
                    break;  
                    default:
                    System.out.println("Sorry try again" );
                }
            }
            else if(m==5)
            {
                System.out.println("        ****************************************************************       ");
                System.out.println("              Date - "+ dateformatter.format(calender.getTime()));
                System.out.println("              Time - "+timeformatter.format(calender.getTime()) );
                System.out.println("        ****************************************************************       ");
                System.out.println("        ****************************************************************       ");
                System.out.println("                    PRESS 1,For Datapackage of Rs 5");
                System.out.println("                    PRESS 2,For Datapackage of Rs 10");
                System.out.println("                    PRESS 3,For Datapackage of Rs 15");
                System.out.println("                    PRESS 4,For Datapackage of Rs 20");
                System.out.println("                    PRESS 5,For Datapackage of Rs 30");
                System.out.println("                    PRESS 6,For Datapackage of Rs 50");
                System.out.println("                    PRESS 7,For Datapackage of Rs 100");
                System.out.println("                    PRESS 8,For Datapackage of Rs 150");
                System.out.println("                    PRESS 9,For Datapackage of Rs 200");
                System.out.println("                    PRESS 10,For Datapackage of Rs 500");
                System.out.println("                    PRESS 11,For Datapackage of Rs 1000");
                System.out.println("                    PRESS 12,For Datapackage of Rs 5000");
                System.out.println("        ****************************************************************       ");
                System.out.println("                               After choosing  ");
                System.out.println("                              press any number  ");
                System.out.println("                              in the next line ");
                System.out.println("                                to progress ");
                System.out.println("        ****************************************************************       ");
                int chj=Integer.parseInt(obj.readLine());
                switch(chj)
            {  
                    case 1:
                    n=Integer.parseInt(obj.readLine());
                    datapackage=datapackage+25;
                    System.out.println("                  ::::::::::::::::::::::::::::::::::::::::::::::");
                    System.out.println("                  Please wait while we process your request...");
                    System.out.println("                  ::::::::::::::::::::::::::::::::::::::::::::::");
                    System.out.println("                  ****************************************************************       ");
                    System.out.println("                    YOUR NEW Datapackage IS   " + datapackage+"mb"                         );
                    System.out.println("                  ****************************************************************       ");
                    System.out.println("                  Date - "+ dateformatter.format(calender.getTime())                      );
                    System.out.println("                  Time - "+timeformatter.format(calender.getTime())                       );
                    System.out.println("                  ****************************************************************       ");
                    if(datapackage<=750)
                    {
                      datapackage=datapackage/5;
                    }
                    else if(datapackage<=2000)
                    {
                        datapackage=datapackage/5;
                    }
                    else
                    {
                        datapackage=datapackage/5;
                    }
                    System.out.println("                  ****************************************************************       ");
                    System.out.println("                                     Extra information"        );
                    System.out.println("                             Balance  Valid for "+balance+" days"        );
                    System.out.println("                             Datapackage  Valid for "+datapackage+" days"        );
                    System.out.println("                  ****************************************************************       ");
                    System.out.println("                  ****************************************************************   ");
                    System.out.println("                                  Have an good day"        );
                    System.out.println("                  ****************************************************************    ");
                    System.out.println("                                     Thankyou                                  ");
                    System.out.println("                                  visit us again                                 ");
                    System.out.println("                  ****************************************************************       ");
                    break;
                    case 2:
                    n=Integer.parseInt(obj.readLine());
                    datapackage=datapackage+50;
                    System.out.println("                  ::::::::::::::::::::::::::::::::::::::::::::::");
                    System.out.println("                  Please wait while we process your request...");
                    System.out.println("                  ::::::::::::::::::::::::::::::::::::::::::::::");
                    System.out.println("                  ****************************************************************       ");
                    System.out.println("                    YOUR NEW Datapackage IS   " +datapackage+"mb"                          );
                    System.out.println("                  ****************************************************************       ");
                    System.out.println("                  Date - "+ dateformatter.format(calender.getTime())                      );
                    System.out.println("                  Time - "+timeformatter.format(calender.getTime())                       );
                    System.out.println("                  ****************************************************************       ");
                   if(datapackage<=750)
                    {
                      datapackage=datapackage/5;
                    }
                    else if(datapackage<=2000)
                    {
                        datapackage=datapackage/5;
                    }
                    else
                    {
                        datapackage=datapackage/5;
                    }
                    System.out.println("                  ****************************************************************       ");
                    System.out.println("                                     Extra information"        );
                    System.out.println("                             Balance  Valid for "+balance+" days"        );
                    System.out.println("                             Datapackage  Valid for "+datapackage+" days"        );
                    System.out.println("                  ****************************************************************       ");
                    System.out.println("                  ****************************************************************   ");
                    System.out.println("                                  Have an good day"        );
                    System.out.println("                  ****************************************************************    ");
                    System.out.println("                                     Thankyou                                  ");
                    System.out.println("                                  visit us again                                 ");
                    System.out.println("                  ****************************************************************       ");
                    break;
                    case 3:
                    n=Integer.parseInt(obj.readLine());
                    datapackage=datapackage+75;
                    System.out.println("                  ::::::::::::::::::::::::::::::::::::::::::::::");
                    System.out.println("                  Please wait while we process your request...");
                    System.out.println("                  ::::::::::::::::::::::::::::::::::::::::::::::");
                    System.out.println("                  ****************************************************************       ");
                    System.out.println("                    YOUR NEW Datapackage IS   " +datapackage+"mb"                         );
                    System.out.println("                  ****************************************************************       ");
                    System.out.println("                  Date - "+ dateformatter.format(calender.getTime())                      );
                    System.out.println("                  Time - "+timeformatter.format(calender.getTime())                       );
                    System.out.println("                  ****************************************************************       ");
                   if(datapackage<=750)
                    {
                      datapackage=datapackage/5;
                    }
                    else if(datapackage<=2000)
                    {
                        datapackage=datapackage/5;
                    }
                    else
                    {
                        datapackage=datapackage/5;
                    }
                    System.out.println("                  ****************************************************************       ");
                    System.out.println("                                     Extra information"        );
                    System.out.println("                             Balance  Valid for "+balance+" days"        );
                    System.out.println("                             Datapackage  Valid for "+datapackage+" days"        );
                    System.out.println("                  ****************************************************************       ");
                    System.out.println("                  ****************************************************************   ");
                    System.out.println("                                  Have an good day"        );
                    System.out.println("                  ****************************************************************    ");
                    System.out.println("                                     Thankyou                                  ");
                    System.out.println("                                  visit us again                                 ");
                    System.out.println("                  ****************************************************************       ");
                    break;
                    case 4:
                    n=Integer.parseInt(obj.readLine());
                    datapackage=datapackage+100;
                    System.out.println("                  ::::::::::::::::::::::::::::::::::::::::::::::");
                    System.out.println("                  Please wait while we process your request...");
                    System.out.println("                  ::::::::::::::::::::::::::::::::::::::::::::::");
                    System.out.println("                  ****************************************************************       ");
                    System.out.println("                    YOUR NEW Datapackage IS   " +datapackage+"mb"                          );
                    System.out.println("                  ****************************************************************       ");
                    System.out.println("                  Date - "+ dateformatter.format(calender.getTime())                      );
                    System.out.println("                  Time - "+timeformatter.format(calender.getTime())                       );
                    System.out.println("                  ****************************************************************       ");;
                    if(datapackage<=750)
                    {
                      datapackage=datapackage/5;
                    }
                    else if(datapackage<=2000)
                    {
                        datapackage=datapackage/5;
                    }
                    else
                    {
                        datapackage=datapackage/5;
                    }
                    System.out.println("                  ****************************************************************       ");
                    System.out.println("                                     Extra information"        );
                    System.out.println("                             Balance  Valid for "+balance+" days"        );
                    System.out.println("                             Datapackage  Valid for "+datapackage+" days"        );
                    System.out.println("                  ****************************************************************       ");
                    System.out.println("                  ****************************************************************   ");
                    System.out.println("                                  Have an good day"        );
                    System.out.println("                  ****************************************************************    ");
                    System.out.println("                                     Thankyou                                  ");
                    System.out.println("                                  visit us again                                 ");
                    System.out.println("                  ****************************************************************       ");
                    break;
                    case 5:
                    n=Integer.parseInt(obj.readLine());
                    datapackage=datapackage+150; 
                    System.out.println("                  ::::::::::::::::::::::::::::::::::::::::::::::");
                    System.out.println("                  Please wait while we process your request...");
                    System.out.println("                  ::::::::::::::::::::::::::::::::::::::::::::::");
                    System.out.println("                  ****************************************************************       ");
                    System.out.println("                    YOUR NEW Datapackage IS   " +datapackage+"mb"                         );
                    System.out.println("                  ****************************************************************       ");
                    System.out.println("                  Date - "+ dateformatter.format(calender.getTime())                      );
                    System.out.println("                  Time - "+timeformatter.format(calender.getTime())                       );
                    System.out.println("                  ****************************************************************       ");
                    if(datapackage<=750)
                    {
                      datapackage=datapackage/5;
                    }
                    else if(datapackage<=2000)
                    {
                        datapackage=datapackage/5;
                    }
                    else
                    {
                        datapackage=datapackage/5;
                    }
                    System.out.println("                  ****************************************************************       ");
                    System.out.println("                                     Extra information"        );
                    System.out.println("                             Balance  Valid for "+balance+" days"        );
                    System.out.println("                             Datapackage  Valid for "+datapackage+" days"        );
                    System.out.println("                  ****************************************************************       ");
                    System.out.println("                  ****************************************************************   ");
                    System.out.println("                                  Have an good day"        );
                    System.out.println("                  ****************************************************************    ");
                    System.out.println("                                     Thankyou                                  ");
                    System.out.println("                                  visit us again                                 ");
                    System.out.println("                  ****************************************************************       ");
                    break;
                    case 6:
                    n=Integer.parseInt(obj.readLine());
                    datapackage=datapackage+250;
                    System.out.println("                  ::::::::::::::::::::::::::::::::::::::::::::::");
                    System.out.println("                  Please wait while we process your request...");
                    System.out.println("                  ::::::::::::::::::::::::::::::::::::::::::::::");
                    System.out.println("                  ****************************************************************       ");
                    System.out.println("                    YOUR NEW Datapackage IS   " +datapackage+"mb"                          );
                    System.out.println("                  ****************************************************************       ");
                    System.out.println("                  Date - "+ dateformatter.format(calender.getTime())                      );
                    System.out.println("                  Time - "+timeformatter.format(calender.getTime())                       );
                    System.out.println("                  ****************************************************************       ");
                    if(datapackage<=750)
                    {
                      datapackage=datapackage/5;
                    }
                    else if(datapackage<=2000)
                    {
                        datapackage=datapackage/5;
                    }
                    else
                    {
                        datapackage=datapackage/5;
                    }
                    System.out.println("                  ****************************************************************       ");
                    System.out.println("                                     Extra information"        );
                    System.out.println("                             Balance  Valid for "+balance+" days"        );
                    System.out.println("                             Datapackage  Valid for "+datapackage+" days"        );
                    System.out.println("                  ****************************************************************       ");
                    System.out.println("                  ****************************************************************   ");
                    System.out.println("                                  Have an good day"        );
                    System.out.println("                  ****************************************************************    ");
                    System.out.println("                                     Thankyou                                  ");
                    System.out.println("                                  visit us again                                 ");
                    System.out.println("                  ****************************************************************       ");
                    break;
                    case 7:
                    n=Integer.parseInt(obj.readLine());
                    datapackage=datapackage+500;
                    System.out.println("                  ::::::::::::::::::::::::::::::::::::::::::::::");
                    System.out.println("                  Please wait while we process your request...");
                    System.out.println("                  ::::::::::::::::::::::::::::::::::::::::::::::");
                    System.out.println("                  ****************************************************************       ");
                    System.out.println("                    YOUR NEW Datapackage IS   " +datapackage+"mb"                       );
                    System.out.println("                  ****************************************************************       ");
                    System.out.println("                  Date - "+ dateformatter.format(calender.getTime())                      );
                    System.out.println("                  Time - "+timeformatter.format(calender.getTime())                       );
                    System.out.println("                  ****************************************************************       ");
                   if(datapackage<=750)
                    {
                      datapackage=datapackage/5;
                    }
                    else if(datapackage<=2000)
                    {
                        datapackage=datapackage/5;
                    }
                    else
                    {
                        datapackage=datapackage/5;
                    }
                    System.out.println("                  ****************************************************************       ");
                    System.out.println("                                     Extra information"        );
                    System.out.println("                             Balance  Valid for "+balance+" days"        );
                    System.out.println("                             Datapackage  Valid for "+datapackage+" days"        );
                    System.out.println("                  ****************************************************************       ");
                    System.out.println("                  ****************************************************************   ");
                    System.out.println("                                  Have an good day"        );
                    System.out.println("                  ****************************************************************    ");
                    System.out.println("                                     Thankyou                                  ");
                    System.out.println("                                  visit us again                                 ");
                    System.out.println("                  ****************************************************************       ");
                    break;
                    case 8:
                    n=Integer.parseInt(obj.readLine());
                    datapackage=datapackage+750;
                    System.out.println("                  ::::::::::::::::::::::::::::::::::::::::::::::");
                    System.out.println("                  Please wait while we process your request...");
                    System.out.println("                  ::::::::::::::::::::::::::::::::::::::::::::::");
                    System.out.println("                  ****************************************************************       ");
                    System.out.println("                    YOUR NEW Datapackage IS   " +datapackage +"mb"                     );
                    System.out.println("                  ****************************************************************       ");
                    System.out.println("                  Date - "+ dateformatter.format(calender.getTime())                      );
                    System.out.println("                  Time - "+timeformatter.format(calender.getTime())                       );
                    System.out.println("                  ****************************************************************       ");
                    if(datapackage<=750)
                    {
                      datapackage=datapackage/5;
                    }
                    else if(datapackage<=2000)
                    {
                        datapackage=datapackage/5;
                    }
                    else
                    {
                        datapackage=datapackage/5;
                    }
                    System.out.println("                  ****************************************************************       ");
                    System.out.println("                                     Extra information"        );
                    System.out.println("                             Balance  Valid for "+balance+" days"        );
                    System.out.println("                             Datapackage  Valid for "+datapackage+" days"        );
                    System.out.println("                  ****************************************************************       ");
                    System.out.println("                  ****************************************************************   ");
                    System.out.println("                                  Have an good day"        );
                    System.out.println("                  ****************************************************************    ");
                    System.out.println("                                     Thankyou                                  ");
                    System.out.println("                                  visit us again                                 ");
                    System.out.println("                  ****************************************************************       ");
                    break;
                    case 9:
                    n=Integer.parseInt(obj.readLine());
                    datapackage=datapackage+1000; 
                    System.out.println("                  ::::::::::::::::::::::::::::::::::::::::::::::");
                    System.out.println("                  Please wait while we process your request...");
                    System.out.println("                  ::::::::::::::::::::::::::::::::::::::::::::::");
                    System.out.println("                  ****************************************************************       ");
                    System.out.println("                    YOUR NEW Datapackage IS   " +datapackage+"mb"                          );
                    System.out.println("                  ****************************************************************       ");
                    System.out.println("                  Date - "+ dateformatter.format(calender.getTime())                      );
                    System.out.println("                  Time - "+timeformatter.format(calender.getTime())                       );
                    System.out.println("                  ****************************************************************       ");
                    if(datapackage<=750)
                    {
                      datapackage=datapackage/5;
                    }
                    else if(datapackage<=2000)
                    {
                        datapackage=datapackage/5;
                    }
                    else
                    {
                        datapackage=datapackage/5;
                    }
                    System.out.println("                  ****************************************************************       ");
                    System.out.println("                                     Extra information"        );
                    System.out.println("                             Balance  Valid for "+balance+" days"        );
                    System.out.println("                             Datapackage  Valid for "+datapackage+" days"        );
                    System.out.println("                  ****************************************************************       ");
                    System.out.println("                  ****************************************************************   ");
                    System.out.println("                                  Have an good day"        );
                    System.out.println("                  ****************************************************************    ");
                    System.out.println("                                     Thankyou                                  ");
                    System.out.println("                                  visit us again                                 ");
                    System.out.println("                  ****************************************************************       ");
                    break;
                    case 10:
                    n=Integer.parseInt(obj.readLine());
                    datapackage=datapackage+2500;
                    System.out.println("                  ::::::::::::::::::::::::::::::::::::::::::::::");
                    System.out.println("                  Please wait while we process your request...");
                    System.out.println("                  ::::::::::::::::::::::::::::::::::::::::::::::");
                    System.out.println("                  ****************************************************************       ");
                    System.out.println("                    YOUR NEW Datapackage IS   "+ datapackage+"mb"                          );
                    System.out.println("                  ****************************************************************       ");
                    System.out.println("                  Date - "+ dateformatter.format(calender.getTime())                      );
                    System.out.println("                  Time - "+timeformatter.format(calender.getTime())                       );
                    System.out.println("                  ****************************************************************       ");
                    if(datapackage<=750)
                    {
                      datapackage=datapackage/5;
                    }
                    else if(datapackage<=2000)
                    {
                        datapackage=datapackage/5;
                    }
                    else
                    {
                        datapackage=datapackage/5;
                    }
                    System.out.println("                  ****************************************************************       ");
                    System.out.println("                                     Extra information"        );
                    System.out.println("                             Balance  Valid for "+balance+" days"        );
                    System.out.println("                             Datapackage  Valid for "+datapackage+" days"        );
                    System.out.println("                  ****************************************************************       ");
                    System.out.println("                  ****************************************************************   ");
                    System.out.println("                                  Have an good day"        );
                    System.out.println("                  ****************************************************************    ");
                    System.out.println("                                     Thankyou                                  ");
                    System.out.println("                                  visit us again                                 ");
                    System.out.println("                  ****************************************************************       ");
                    break;
                    case 11:
                    n=Integer.parseInt(obj.readLine());
                    datapackage=datapackage+5000;
                    System.out.println("                  ::::::::::::::::::::::::::::::::::::::::::::::");
                    System.out.println("                  Please wait while we process your request...");
                    System.out.println("                  ::::::::::::::::::::::::::::::::::::::::::::::");
                    System.out.println("                  ****************************************************************       ");
                    System.out.println("                    YOUR NEW Datapackage IS   " +datapackage+"mb"                         );
                    System.out.println("                  ****************************************************************       ");
                    System.out.println("                  Date - "+ dateformatter.format(calender.getTime())                      );
                    System.out.println("                  Time - "+timeformatter.format(calender.getTime())                       );
                    System.out.println("                  ****************************************************************       ");
                    if(datapackage<=750)
                    {
                      datapackage=datapackage/5;
                    }
                    else if(datapackage<=2000)
                    {
                        datapackage=datapackage/5;
                    }
                    else
                    {
                        datapackage=datapackage/5;
                    }
                    System.out.println("                  ****************************************************************       ");
                    System.out.println("                                     Extra information"        );
                    System.out.println("                             Balance  Valid for "+balance+" days"        );
                    System.out.println("                             Datapackage  Valid for "+datapackage+" days"        );
                    System.out.println("                  ****************************************************************       ");
                    System.out.println("                  ****************************************************************   ");
                    System.out.println("                                  Have an good day"        );
                    System.out.println("                  ****************************************************************    ");
                    System.out.println("                                     Thankyou                                  ");
                    System.out.println("                                  visit us again                                 ");
                    System.out.println("                  ****************************************************************       ");
                    break;
                    case 12:
                    n=Integer.parseInt(obj.readLine());
                    datapackage=datapackage+25000;
                    System.out.println("                  ::::::::::::::::::::::::::::::::::::::::::::::");
                    System.out.println("                  Please wait while we process your request...");
                    System.out.println("                  ::::::::::::::::::::::::::::::::::::::::::::::");
                    System.out.println("                  ****************************************************************       ");
                    System.out.println("                    YOUR NEW Datapackage IS   " +datapackage +"mb"                         );
                    System.out.println("                  ****************************************************************       ");
                    System.out.println("                  Date - "+ dateformatter.format(calender.getTime())                      );
                    System.out.println("                  Time - "+timeformatter.format(calender.getTime())                       );
                    System.out.println("                  ****************************************************************       ");
                    if(datapackage<=750)
                    {
                      datapackage=datapackage/5;
                    }
                    else if(datapackage<=2000)
                    {
                        datapackage=datapackage/5;
                    }
                    else
                    {
                        datapackage=datapackage/5;
                    }
                    System.out.println("                  ****************************************************************   ");
                    System.out.println("                                     Extra information"        );
                    System.out.println("                             Balance  Valid for "+balance+" days"        );
                    System.out.println("                             Datapackage  Valid for "+datapackage+" days"        );
                    System.out.println("                  ****************************************************************    ");
                    System.out.println("                  ****************************************************************   ");
                    System.out.println("                                  Have an good day"        );
                    System.out.println("                  ****************************************************************    ");
                    System.out.println("                                     Thankyou                                  ");
                    System.out.println("                                  visit us again                                 ");
                    System.out.println("                  ****************************************************************       ");
                 break; 
                 default:
              System.out.println("Sorry try again" );
            }
          }
          else if(m==6)
          {
             System.out.println("                  ::::::::::::::::::::::::::::::::::::::::::::::");
             System.out.println("                                  My delights ");
             System.out.println("                  ::::::::::::::::::::::::::::::::::::::::::::::");
             System.out.println("                  ::::::::::::::::::::::::::::::::::::::::::::::");
             System.out.println("                  Please wait while we process your request...");
             System.out.println("                  ::::::::::::::::::::::::::::::::::::::::::::::");  
             System.out.println("                  ****************************************************************       ");
             System.out.println("                  Date - "+ dateformatter.format(calender.getTime()));
             System.out.println("                  Time - "+timeformatter.format(calender.getTime()));
             System.out.println("                  ****************************************************************       ");
             System.out.println("                  ****************************************************************       ");
             System.out.println("                    PRESS 1,For Music RS 5");
             System.out.println("                    PRESS 2,For Vedios RS 10");
             System.out.println("                    PRESS 3,For Movies RS 50"); 
             System.out.println("                  ****************************************************************       ");
             int chs=Integer.parseInt(obj.readLine());
             switch(chs)
             {
                 case 1: 
                 {
                     System.out.println("                     Music ");
                     System.out.println("                 PRESS 1;3 IDIOTS -GIVE ME SOME SUNSHINE -FULL SONG ");
                     System.out.println("                 PRESS 2;122 ");
                     int c=Integer.parseInt(obj.readLine());
                     if(c==1)
                     {
                         balance=balance+5;
                         System.out.println("             3 IDIOTS -GIVE ME SOME SUNSHINE -FULL SONG ");
                         System.out.println("                  ****************************************************************   ");
                         System.out.println("                                  Have an good day"        );
                         System.out.println("                  ****************************************************************    ");
                         System.out.println("                  ****************************************************************     ");
                         System.out.println("                  Date - "+ dateformatter.format(calender.getTime()));
                         System.out.println("                  Time - "+timeformatter.format(calender.getTime()));
                         System.out.println("                  **************************************************************** ");
                         System.out.println("                                     Thankyou                                  ");
                         System.out.println("                                  visit us again                                 ");
                         System.out.println("                  **************************************************************** ");
                     }
                     else if(c==2)
                     {
                         balance=balance+5;
                         System.out.println("                                     122 ");
                         System.out.println("                  ****************************************************************   ");
                         System.out.println("                                  Have an good day"        );
                         System.out.println("                  ****************************************************************    ");
                         System.out.println("                  ****************************************************************  ");
                         System.out.println("                  Date - "+ dateformatter.format(calender.getTime()));
                         System.out.println("                  Time - "+timeformatter.format(calender.getTime()));
                         System.out.println("                  ****************************************************************  ");
                         System.out.println("                                     Thankyou                                  ");
                         System.out.println("                                  visit us again                                 ");
                         System.out.println("                  **************************************************************** ");
                     }
                     else
                     {
                         System.out.println("                  ****************************************************************       ");
                         System.out.println("                                             Sorry try again     " );
                     }
                     break;
                 }
                 case 2: 
                 {
                     System.out.println("                    Vedios ");
                     System.out.println("                   PRESS 1, 3 IDIOTS ");
                     System.out.println("                   PRESS 2,BOSS ");
                     int c=Integer.parseInt(obj.readLine());
                     if(c==1)
                     {
                         balance=balance+10;
                         System.out.println("              ");
                         System.out.println("                  ****************************************************************   ");
                         System.out.println("                                  Have an good day"        );
                         System.out.println("                  ****************************************************************    ");
                         System.out.println("                  ****************************************************************  ");
                         System.out.println("                  Date - "+ dateformatter.format(calender.getTime()));
                         System.out.println("                  Time - "+timeformatter.format(calender.getTime()));
                         System.out.println("                  ****************************************************************");
                         System.out.println("                                     Thankyou                                  ");
                         System.out.println("                                  visit us again                                 ");
                         System.out.println("                  **************************************************************** ");
                     }
                     else if(c==2)
                     {
                         balance=balance+10;
                         System.out.println("                                     BOSS ");
                         System.out.println("                  ****************************************************************   ");
                         System.out.println("                                  Have an good day"        );
                         System.out.println("                  ****************************************************************    ");
                         System.out.println("                  **************************************************************** ");
                         System.out.println("                  Date - "+ dateformatter.format(calender.getTime()));
                         System.out.println("                  Time - "+timeformatter.format(calender.getTime()));
                         System.out.println("                  **************************************************************** ");
                         System.out.println("                                     Thankyou                                  ");
                         System.out.println("                                  visit us again                                 ");
                         System.out.println("                  ****************************************************************    ");
                     }
                     else
                     {
                         System.out.println("                  **************************************************************** ");
                         System.out.println("                                          Sorry try again     " );
                     }
                     break;
                 }
                 case 3: 
                 {
                     System.out.println("                     Movies "); 
                     System.out.println("                   PRESS 1, 3 IDIOTS ");
                     System.out.println("                   PRESS 2,BOSS ");
                     int c=Integer.parseInt(obj.readLine());
                     if(c==1)
                     {
                         balance=balance+50;
                         System.out.println("                                    3 IDIOTS ");
                         System.out.println("                  ****************************************************************   ");
                         System.out.println("                                  Have an good day"        );
                         System.out.println("                  ****************************************************************    ");
                         System.out.println("                  **************************************************************** ");
                         System.out.println("                  Date - "+ dateformatter.format(calender.getTime()));
                         System.out.println("                  Time - "+timeformatter.format(calender.getTime()));
                         System.out.println("                  **************************************************************** ");
                         System.out.println("                                     Thankyou                                  ");
                         System.out.println("                                  visit us again                                 ");
                         System.out.println("                  ****************************************************************  ");
                     }
                     else if(c==2)
                     {
                         balance=balance+50;
                         System.out.println("                                     BOSS ");
                         System.out.println("                  ****************************************************************   ");
                         System.out.println("                                  Have an good day"        );
                         System.out.println("                  ****************************************************************    ");
                         System.out.println("                  ****************************************************************");
                         System.out.println("                  Date - "+ dateformatter.format(calender.getTime()));
                         System.out.println("                  Time - "+timeformatter.format(calender.getTime()));
                         System.out.println("                  ****************************************************************");
                         System.out.println("                                     Thankyou                                  ");
                         System.out.println("                                  visit us again                                 ");
                         System.out.println("                  ****************************************************************    ");
                     }
                     else
                     {
                         System.out.println("                  ****************************************************************    ");
                         System.out.println("                                          Sorry try again     " );
                     }
                     break;
                 }
                 default:
                 System.out.println("Sorry try again" );
             }
          }
          else if(m==7)
          {
            System.out.println("                     last 3 actyities");
            System.out.println("                    PRESS 1, last 3 calls");
            System.out.println("                    PRESS 2, last 3 sms");
            System.out.println("                    PRESS 3, last 3 recarges");
            System.out.println("                    PRESS 4, last 3 download");
            int chc=Integer.parseInt(obj.readLine());
            switch(chc)
            {
                case 1:
                {
                    System.out.println("                     last 3 calls");
                    System.out.println("                  Sorry there is no detales    " );
                    break;
                }
                case 2:
                {
                    System.out.println("                     last 3 sms");
                    System.out.println("                  Sorry there is no detales    " );
                    break;
                }
                case 3:
                {
                    System.out.println("                     last 3 recarges");
                    System.out.println("                  RS 500    RS 500      RS 500" );
                    break;
                }
                case 4:
                {
                    System.out.println("                     last 3 download");
                    System.out.println("              3 IDIOTS[SONG];3 IDIOTS[MOVIES];BOSS[VEDIO] " );
                    break;
                }
                default:
                System.out.println("Sorry try again" );
            }   
          }
          else if(m==8)
          {
            System.out.println("                     Vass and service");
            System.out.println("                     Sorry try at 2am    " );
          }
          else if(m==9)
          {
            System.out.println("                         Bonus Card");
            System.out.println("                         Press 1;BALENCE of Rs 100 get 100");
            int c=Integer.parseInt(obj.readLine());
            if(c==1)
            {
                balance=balance+100;
                System.out.println("                  ****************************************************************       ");
                System.out.println("                                BALENCE="+balance);
                System.out.println("                  ****************************************************************   ");
                System.out.println("                                  Have an good day"        );
                System.out.println("                  ****************************************************************    ");
                System.out.println("                  ****************************************************************       ");
                System.out.println("                  Date - "+ dateformatter.format(calender.getTime())                      );
                System.out.println("                  Time - "+timeformatter.format(calender.getTime())                       );
                System.out.println("                  ****************************************************************       ");
                System.out.println("                                     Thankyou                                  ");
                System.out.println("                                  visit us again                                 ");
                System.out.println("                  ****************************************************************       ");
            }
            else
            {
                System.out.println("                  ****************************************************************       ");
                System.out.println("                                             Sorry try again     " );
            }
          }
          else if(m==10)
          {
            System.out.println("                        Best offer");
            System.out.println("                    TO WIN A GOLD COIN CALL 1112 orth 50,000 charges RS 50");
            int chk=Integer.parseInt(obj.readLine());
            switch(chk)
            {
                case 1112:
                {
                    balance=balance+50;
                    System.out.println("                           CONGRATULATION YOU WON THE GOLD COIN     ");
                    System.out.println("                               IT WILL BE SEND TO YOUR HOME.     ");
                    System.out.println("                  ****************************************************************   ");
                    System.out.println("                                  Have an good day"        );
                    System.out.println("                  ****************************************************************    ");
                    System.out.println("                  ****************************************************************       ");
                    System.out.println("                  Date - "+ dateformatter.format(calender.getTime())                      );
                    System.out.println("                  Time - "+timeformatter.format(calender.getTime())                       );
                    System.out.println("                  ****************************************************************       ");
                    System.out.println("                                     Thankyou                                  ");
                    System.out.println("                                  visit us again                                 ");
                    System.out.println("                  ****************************************************************       ");
                    break;
                }
                 default:
                 System.out.println("Sorry try again" );
            }
          }
          else if(m==11)
          {
            System.out.println("                     Low Balence Services");
            System.out.println("            ****************************************************************       ");
            System.out.println("                  Sorry there is no detales avalable now   " );
          }
          else if(m==12)
          {
              System.out.println("                  ****************************************************************   ");
              System.out.println("                                  Have an good day"        );
              System.out.println("                  ****************************************************************    ");
              System.out.println("                  ****************************************************************       ");
              System.out.println("                  Date - "+ dateformatter.format(calender.getTime())                      );
              System.out.println("                  Time - "+timeformatter.format(calender.getTime())                       );
              System.out.println("                  ****************************************************************       ");
              System.out.println("                  ****************************************************************       ");
              System.out.println("                                     Thankyou                                  ");
              System.out.println("                                  visit us again                                 ");
              System.out.println("                  ****************************************************************       ");
              break;
          }
          else
          {
           
            System.out.println("                                             Sorry try again     " );
          }
         }
         balance=balance*5;
         datapackage=datapackage+0.0;
         bill=bill+balance+datapackage;
         tax= tax+bill*4/100;
         amt=amt+bill+tax;
        }
        
        else
        {
            System.out.println("                  ****************************************************************       ");
            System.out.println("                  Date - "+ dateformatter.format(calender.getTime())                      );
            System.out.println("                  Time - "+timeformatter.format(calender.getTime())                       );
            System.out.println("                  ****************************************************************       ");
            System.out.println("                  ****************************************************************       ");
            System.out.println("                  ****************************************************************       ");
            System.out.println("                                         Sorry       " );
            System.out.println("                                     this service  ");
            System.out.println("                                     is only for ");
            System.out.println("                                    Vodaphone users");
            System.out.println("                  ****************************************************************       ");
        }
        if(amt<=0)
        {
            break;
        }
       }
       System.out.println("                         ");
       System.out.println("                         ");
       System.out.println("                  ****************************************************************       ");
       System.out.println("                  ****************************************************************       ");
       System.out.println("                  ****                  Bill                                  ****" );
       System.out.println("                  ****                balance      = RS  "+balance+"                 ****");
       System.out.println("                  ****                Datapackage  = RS  "+datapackage+"                 ****");
       System.out.println("                  ****                Tax          = RS  "+tax+"                 ****");
       System.out.println("                  ****                Tolal Amount = RS  "+amt+"                ****");
       System.out.println("                  ****************************************************************       ");
       System.out.println("                  ****************************************************************       ");
       System.out.println("                         ");
       System.out.println("                  ****************************************************************   ");
       System.out.println("                                  Have an good day"        );
       System.out.println("                  ****************************************************************    ");
       System.out.println("                         ");
       System.out.println("                  ****************************************************************       ");
       System.out.println("                  Date - "+ dateformatter.format(calender.getTime())                      );
       System.out.println("                  Time - "+timeformatter.format(calender.getTime())                       );
       System.out.println("                  ****************************************************************       ");
       System.out.println("                         ");
       System.out.println("                  ****************************************************************       ");
       System.out.println("                                     Thankyou                                  ");
       System.out.println("                                     visit us                                  ");
       System.out.println("                                      again                                 ");
       System.out.println("                  ****************************************************************       ");
    }
}