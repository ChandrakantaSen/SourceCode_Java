import java.io.*;
class employee
{
    int pan;
    String name;
    double taxincome,tax;
    void input ()throws IOException
    {
        BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
        System.out.println ("Enter PAN NUMBER");
        pan=Integer.parseInt (br.readLine());
        System.out.println ("Enter name");
        name=br.readLine();
        System.out.println ("Enter annual tax income");
        taxincome =Double.parseDouble (br.readLine());
    }
    void call ()
    {
        if (taxincome <=100000)
        tax=0.0;
        else if (taxincome>100000 && taxincome<=150000)
        tax=0.1* (taxincome-100000);
        else if (taxincome>15000 && taxincome <=25000)
        tax=0.2*(taxincome-15000)+5000;
        else
        tax=0.3*(taxincome-250000)-25000;
    }
    void display ()
    {
        System.out.println ("Pan Number \t Name \t Taxincome \t tax");
        System.out.println (pan +"\t\t"+ name +"\t"+  taxincome +"\t\t"+ tax);
    }
    void main () throws IOException
    {
        input ();
        call ();
        display ();
    }
}
