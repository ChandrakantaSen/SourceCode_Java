import java.io.*;
public class disp_list extends reservation
    {
    public static void disp()throws Exception
    {
    InputStreamReader isr=new InputStreamReader (System.in);
    BufferedReader br=new BufferedReader (isr);
    System.out.println("Passenger list in AC class");
    System.out.println("pno \t name \t\t age \t phno");
    for(int i=0;i<pcount;i++)
    {
    if(cl[i]==1)
    {
    System.out.println(pno[i]+"\t"+name[i]+"\t\t"+age[i]+"\t"+phno[i]);
    }
    }
    System.out.println("Passenger list in First class");
    System.out.println("pno \t name \t\t age \t phno");
    for(int i=0;i<pcount;i++)
    {
    if(cl[i]==2)
    {
    System.out.println(pno[i]+"\t"+name[i]+"\t\t"+age[i]+"\t"+phno[i]);
    }
    }
    System.out.println("Passenger list in Sleeper class");
    System.out.println("pno \t name \t\t age \t phno");
    for(int i=0;i<pcount;i++)
    {
    if(cl[i]==3)
    {
    System.out.println(pno[i]+"\t"+name[i]+"\t\t"+age[i]+"\t"+phno[i]);
    }
    }
    System.out.println("Press enter to continue");}
}