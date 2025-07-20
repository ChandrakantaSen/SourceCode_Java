import java.io.*;
class discount
{
    int cost;
    String name;
    double dc,amt;
    void input ()throws IOException
    {
        BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
        System.out.println ("Enter COST");
        cost=Integer.parseInt (br.readLine());
        System.out.println ("Enter name");
        name=br.readLine();
    }
        void call ()
    {
        if (cost<=5000)
        dc=0.0;
        else if (cost>=5001 && cost<=10000)
        dc=0.1*cost;
        else if (cost>=10001 && cost<=15000)
        dc=0.15*cost;
        else
        dc=0.2*cost;
        amt=cost-dc;
    }
    void display ()
    {
        System.out.println ("Name of theb customer \t Discount \t Amt to be paid");
        System.out.println (name +"\t\t\t"+ dc +"\t\t\t"+amt);
    }
    void main () throws IOException
    {
        input ();
        call ();
        display ();
    }
}
