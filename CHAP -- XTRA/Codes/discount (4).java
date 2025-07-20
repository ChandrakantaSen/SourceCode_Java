import java.io.*;
public class discount
{
    int cost;
    String name;
    double dc,amt;
    public static void main(String args[])throws IOException
    {
        discount t=new discount();
        t.input();
        t.cal();
        t.display();
    }
    void input()throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        System.out.println("Enter the price of the article");
        cost=Integer.parseInt(in.readLine());
        System.out.println("Enter the name of the customer");
        name=in.readLine();
    }
    void cal()
    {
        if(cost<=5000)
        {
            dc=0;
            amt=cost+dc;
        }
        else if((cost>5000)&&(cost<=10000))
        {
            dc=(10.0/100.0)*cost;
            amt=cost-dc;
        }
        else if((cost>10000)&&(cost<=15000))
        {
            dc=(15.0/100.0)*cost;
            amt=cost-dc;
        }
        else
        {
            dc=(20.0/100.0)*cost;
            amt=cost-dc;
        }
    }
    void display()
    {
        System.out.println("Name of the customer     Discount     Amount to e paid");
        System.out.println(name+"               "+dc+"         "+amt);
    }
}

    
        