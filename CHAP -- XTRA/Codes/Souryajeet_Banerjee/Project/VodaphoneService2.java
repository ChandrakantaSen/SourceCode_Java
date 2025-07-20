package Project;
import java.io.*;
import java.util.Date;
import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.util.*;
class VodaphoneService2
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
        double balance=2.1,datapackage=0;
       for(int s=0;s<=2;s++)
       {
        System.out.println("                  ****************************************************************       ");
        System.out.print("                        Type  the first four disit of your phone number - ");
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
            System.out.println("                    PRESS 1,For balence information");
            System.out.println("                    PRESS 2,For datapackage information");
            System.out.println("                    PRESS 3,For acount information");
            System.out.println("                    PRESS 4,For recharge ");
            System.out.println("                    PRESS 5,For datapackage update");
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
                System.out.println("                                     ACOUNT information"        );
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
                        balance=balance/4;
                    }
                    else if(balance<=500)
                    {
                        balance=365;
                    }
                    else 
                    {
                        balance=365*20;
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
                        balance=balance/4;
                    }
                    else if(balance<=500)
                    {
                        balance=365;
                    }
                    else 
                    {
                        balance=365*20;
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
                        balance=balance/4;
                    }
                    else if(balance<=500)
                    {
                        balance=365;
                    }
                    else 
                    {
                        balance=365*20;
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
                        balance=balance/4;
                    }
                    else if(balance<=500)
                    {
                    balance=365;
                    }
                    else 
                    {
                        balance=365*20;
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
                        balance=balance/4;
                    }
                    else if(balance<=500)
                    {
                        balance=365;
                    }
                    else 
                    {
                        balance=365*20;
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
                        balance=balance/4;
                    }
                    else if(balance<=500)
                    {   
                        balance=365;
                    }
                    else 
                    {
                        balance=365*20;
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
                      balance=balance/4;
                    }
                    else if(balance<=500)
                    {   
                        balance=365;
                    }
                    else 
                    {
                        balance=365*20;
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
                      balance=balance/4;
                    }
                    else if(balance<=500)
                    {   
                        balance=365;
                    }
                    else 
                    {
                        balance=365*20;
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
                    System.out.println("                    YOUR NEW BALENCE IS RS  " +balance                                   );
                    System.out.println("                  ****************************************************************       ");
                    System.out.println("                  Date - "+ dateformatter.format(calender.getTime())                      );
                    System.out.println("                  Time - "+timeformatter.format(calender.getTime())                       );
                    System.out.println("                  ****************************************************************       ");
                    if(balance<=75)
                    {
                      balance=balance/4;
                    }
                    else if(balance<=500)
                    {   
                        balance=365;
                    }
                    else 
                    {
                        balance=365*20;
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
                    System.out.println("                    YOUR NEW BALENCE IS RS  " +balance                                   );
                    System.out.println("                  ****************************************************************       ");
                    System.out.println("                  Date - "+ dateformatter.format(calender.getTime())                      );
                    System.out.println("                  Time - "+timeformatter.format(calender.getTime())                       );
                    System.out.println("                  ****************************************************************       ");
                    if(balance<=75)
                    {
                      balance=balance/4;
                    }
                    else if(balance<=500)
                    {   
                        balance=365;
                    }
                    else 
                    {
                        balance=365*20;
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
                    System.out.println("                    YOUR NEW BALENCE IS RS  " +balance                                   );
                    System.out.println("                  ****************************************************************       ");
                    System.out.println("                  Date - "+ dateformatter.format(calender.getTime())                      );
                    System.out.println("                  Time - "+timeformatter.format(calender.getTime())                       );
                    System.out.println("                  ****************************************************************       ");
                    if(balance<=75)
                    {
                      balance=balance/4;
                    }
                    else if(balance<=500)
                    {   
                        balance=365;
                    }
                    else 
                    {
                        balance=365*20;
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
                    System.out.println("                    YOUR NEW BALENCE IS RS  " +balance                                   );
                    System.out.println("                  ****************************************************************       ");
                    System.out.println("                  Date - "+ dateformatter.format(calender.getTime())                      );
                    System.out.println("                  Time - "+timeformatter.format(calender.getTime())                       );
                    System.out.println("                  ****************************************************************       ");
                    if(balance<=75)
                    {
                      balance=balance/4;
                    }
                    else if(balance<=500)
                    {   
                        balance=365;
                    }
                    else 
                    {
                        balance=365*20;
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
                        datapackage=31;
                    }
                    else
                    {
                        datapackage=90;
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
                        datapackage=31;
                    }
                    else
                    {
                        datapackage=90;
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
                    datapackage=datapackage+125;
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
                        datapackage=31;
                    }
                    else
                    {
                        datapackage=90;
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
                    datapackage=datapackage+150;
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
                        datapackage=31;
                    }
                    else
                    {
                        datapackage=90;
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
                    datapackage=datapackage+175; 
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
                        datapackage=31;
                    }
                    else
                    {
                        datapackage=90;
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
                        datapackage=31;
                    }
                    else
                    {
                        datapackage=90;
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
                    datapackage=datapackage+560;
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
                        datapackage=31;
                    }
                    else
                    {
                        datapackage=90;
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
                        datapackage=31;
                    }
                    else
                    {
                        datapackage=90;
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
                        datapackage=31;
                    }
                    else
                    {
                        datapackage=90;
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
                    datapackage=datapackage+2000;
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
                        datapackage=31;
                    }
                    else
                    {
                        datapackage=90;
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
                    datapackage=datapackage+3000;
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
                        datapackage=31;
                    }
                    else
                    {
                        datapackage=90;
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
                    datapackage=datapackage+5000;
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
                        datapackage=31;
                    }
                    else
                    {
                        datapackage=90;
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
          else
          {
            System.out.println("                  ****************************************************************       ");
            System.out.println("                                             Sorry try again     " );
          }
         }
          else
          {
            System.out.println("                  ****************************************************************       ");
            System.out.println("                                         Sorry       " );
            System.out.println("                                     this service  ");
            System.out.println("                                     is only for ");
            System.out.println("                                    Vodaphone users");
            System.out.println("                  ****************************************************************       ");
         }
       }
     }
   }