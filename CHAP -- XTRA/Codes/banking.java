import java.io.*;
class banking
{
    static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    static int ac[]=new int[100],i,r;
    static String n[]=new String[100];
    static double b[]=new double[100];
    static String d[]=new String[100];
    static String a1[]=new String[100];
    static String a2[]=new String[100];
    static long p[]=new long[100];
    public static void main(String args[])throws IOException
    {
        
        System.out.println("how many records??");
        r=Integer.parseInt(br.readLine());
        for(i=0;i<r;i++)
        {
            System.out.println("enter account number");
            ac[i]=Integer.parseInt(br.readLine());
            System.out.println("enter name");
            n[i]=br.readLine();
            System.out.println("enter balance");
            b[i]=Double.parseDouble(br.readLine());
            int u=100;
            while(u>0)
            {
            System.out.println("enter date of creation");
            String date=br.readLine();
            if(datecheck(date)==true)
            {
                d[i]=date;
               break;
            }
            else
            {
                System.out.println("invalid date");
                for(long v=1;v<=10000000;v++)
                {
                }
            }
            }
            System.out.println("enter address line 1");
            a1[i]=br.readLine();
            System.out.println("enter address line 2");
            a2[i]=br.readLine();
            System.out.println("enter phone number");
            p[i]=Long.parseLong(br.readLine());
        }
        while(true)
        {
        System.out.println("\f");
        System.out.println("                        1 for enquiry");
        System.out.println("                        2 for new account");
        System.out.println("                        3 for withdrawal");
        System.out.println("                        4 for deposit");
        System.out.println("                        5 for delete");
        System.out.println("                        6 for exit");
        System.out.println("enter your choice");
        int ch=Integer.parseInt(br.readLine());
        switch(ch)
        {
            case 1:
            enquiry();
            break;
            case 2:
            newacc();
            break;
            case 3:
            withdrawal();
            break;
            case 4:
            deposit();
            break;
            case 5:
            delete();
            break;
            case 6:
            System.out.println("thank u pls visit again");
            for(i=1;i<10000000;i++)
            {
            }
            System.exit(0);
           
        }
    }
}
        public static void enquiry()throws IOException
        {
            System.out.println("enter account number");
            int acc=Integer.parseInt(br.readLine());int f=0;
            for(i=0;i<ac.length;i++)
            {
                if(acc==ac[i])
                {
                    f=1;
                    break;
                }
            }
                    if(f==1)
                    {
                    System.out.println("name="+n[i]);
                    System.out.println("balance="+b[i]);
                    System.out.println("enter date of creation"+d[i]);
                    System.out.println("enter address line 1"+a1[i]);
                    System.out.println("enter address line 2"+a2[i]);
                    System.out.println("enter phone number"+p[i]);
                    System.out.println("press any key 2 continue");
                    int o=Integer.parseInt(br.readLine());
                    }
                    else
                    {
                        System.out.println("acc. number not found");
                        System.out.println("press any key 2 continue");
                        f=Integer.parseInt(br.readLine());
               
                    }
        }
        public static void withdrawal()throws IOException
        {
            System.out.println("enter account numbr");
            int acc=Integer.parseInt(br.readLine());
            int i,flag=0;double wid;
            for(i=0;i<100;i++)
            {
                if(ac[i]==acc)
                {
                    flag=1;
                    break;
                }
            }
            System.out.println("enter withdrawal amount");
            wid=Double.parseDouble(br.readLine());
            if(b[i]-1000>wid)
            {
                b[i]=b[i]-wid;
                System.out.println("new balance="+b[i]);
            }
            else
            {
                System.out.println("not sufficient fund");
            }
            for(long q=1;q<=1000000000;q++)
            {
            }
        }
        
        public static void deposit()throws IOException
        {
            System.out.println("enter account numbr");
            int acc=Integer.parseInt(br.readLine());
            int i,flag=0;double dep;
            for(i=0;i<100;i++)
            {
                if(ac[i]==acc)
                {
                    flag=1;
                    break;
                }
            }
            System.out.println("enter deposit amount");
            dep=Double.parseDouble(br.readLine());
            b[i]=b[i]+dep;
            System.out.println("new balance="+b[i]);
            for(long k=1;k<=1000000000;k++)
            {
            }
            }
            public static void newacc()throws IOException
            {
                int c=0;
                for(int i=0;i<100;i++)
                {
                    if(ac[i]>0)
                    {
                        c++;
                    }
                }
            System.out.println("enter account number");
            ac[c+1]=Integer.parseInt(br.readLine());
            System.out.println("enter name");
            n[c+1]=br.readLine();
            System.out.println("enter balance");
            b[c+1]=Double.parseDouble(br.readLine());
            int u=100;
            while(u>0)
            {
            System.out.println("enter date of creation");
            String date=br.readLine();
            if(datecheck(date)==true)
            {
                d[c+1]=date;
               break;
            }
            else
            {
                System.out.println("invalid date");
                for(long v=1;v<=10000000;v++)
                {
                }
            }
            }
            System.out.println("enter address line 1");
            a1[c+1]=br.readLine();
            System.out.println("enter address line 2");
            a2[c+1]=br.readLine();
            System.out.println("enter phone number");
            p[c+1]=Long.parseLong(br.readLine());
            for(long z=1;z<=1000000000;z++)
            {
            }
                
        }
        public static void delete()throws IOException
        {
            int accn,f=0;
            System.out.println("enter account number");
            accn=Integer.parseInt(br.readLine());
            for(int y=0;y<100;y++)
            {
                if(ac[y]==accn)
                {
                    f=1;ac[y]=0;
                    n[y]="";
                    b[y]=0;
                    d[y]="";
                    a1[y]="";
                    a2[y]="";
                    p[y]=0;
                    break;
                }
            }
            if(f==1)
            {
                
            for(int h=0;h<99;h++)
            {
                if(ac[h]==0)
                {
                    ac[h]=ac[h+1];
                    n[h]=n[h+1];
                    b[h]=b[h+1];
                    d[h]=d[h+1];
                    a1[h]=a1[h+1];
                    a2[h]=a2[h+1];
                    p[h]=p[h+1];
                }
            }
        }
        else
        {
            System.out.println("deletion unsuccessful as account not found");
            for(long j=1;j<=1000000000;j++)
            {
            }
        }
}
public static boolean datecheck(String date)throws IOException
{
    String year=date.substring(6);
    String month=date.substring(3,5);
    String day=date.substring(0,2);
    int da=Integer.parseInt(day);
    int mon=Integer.parseInt(month);
    int yr=Integer.parseInt(year);    int max=0;
    if(yr%4==0)
    {
        max=29;
    }
    else
    {
        max=28;
    }
    if(mon>0&&mon<13)
    {
        if(mon==1||mon==3||mon==5||mon==7||mon==8||mon==10||mon==12)
        {
            max=31;
        }
        else if(mon==2)
        {
            max=29;
        }
        else
        {
            max=30;
        }    
        if(da>0 && da<=max)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    else
    return false;
    }
}         
 