import java.io.*;
public class cancel extends reservation
    {
    public static void can()throws Exception
    {
    InputStreamReader isr=new InputStreamReader (System.in);
    BufferedReader br=new BufferedReader (isr);
    int t_pno[]=new int[275];
    String t_name[]=new String[275];
    String t_phno[]=new String[275];
    int t_age[]=new int[275];
    int t_cl[]=new int[275];
    int t_pcount=0;
    int passengerFound=0;
    System.out.println("Please enter your passenger no.");
    int p=Integer.parseInt(br.readLine());
    for(int i=0;i<pcount;i++)
    {
    if(pno[i]!=p)
    {//transfer
    t_pno[t_pcount]=pno[i];
    t_name[t_pcount]=name[i];
    t_phno[t_pcount]=phno[i];
    t_age[t_pcount]=age[i];
    t_cl[t_pcount]=cl[i];
    t_pcount++;
    }
    else
    {
    passengerFound=1;
    if(cl[i]==1)
    {
    max1++;
    System.out.println("Please collect refund of Rs."+1800);
    }
    if(cl[i]==2)
    {
    max2++;
    System.out.println("Please collect refund of Rs."+1500);
    }
    if(cl[i]==3)
    {
    max3++;
    System.out.println("Please collect refund of Rs."+1000);
    }//else
    }//if
    }
    if(passengerFound==1)
    {
    pno=t_pno;
    name=t_name;
    age=t_age;
    cl=t_cl;
    phno=t_phno;
    pcount=t_pcount;
    System.out.println("ticket successfully cancelled");
    }
    System.out.println("Press enter to continue");
}
}