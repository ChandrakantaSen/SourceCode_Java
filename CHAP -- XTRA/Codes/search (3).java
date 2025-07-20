import java.io.*;
public class search extends reservation
    {
    public static void src()throws Exception
    {
    InputStreamReader isr=new InputStreamReader (System.in);
    BufferedReader br=new BufferedReader (isr);
    int passengerFound=0;
    System.out.println("Please enter passenger no. to search");
    int p=Integer.parseInt(br.readLine());
    for(int i=0;i<pcount;i++)
    {
    if(pno[i]==p)
    {
    System.out.println("Detail found");
    passengerFound=1;
    System.out.println("passenger no.="+pno[i]); 
    System.out.println("name="+name[i]);
    System.out.println("class="+cl[i]); 
    System.out.println("phno="+phno[i]);
    System.out.println("age="+age[i]);
    }
    }
    if(passengerFound==0)
    System.out.println("No such passenger");
    System.out.println("Press enter to continue");}
}