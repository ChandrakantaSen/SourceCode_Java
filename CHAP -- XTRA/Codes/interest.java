import java.io.*;
class interest
{
    int p;
    int r;
    int t;
    double interest,amt;
    void input ()throws IOException
    {
        BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
        System.out.println ("Enter the principle");
        p=Integer.parseInt (br.readLine ());        
        System.out.println ("Enter the time ");
        t=Integer.parseInt (br.readLine ());
    }
    void cal ()
    {
        if (t==1)
        interest= (p*6.5*t)/100.0;
        else if (t==2)
        interest=(p*7.5*t)/100.0;
        else if (t==3)
        interest=(p*8.5*t)/100.0;
        else
        interest=(p*9.5*t)/100.0;
        amt=interest+p;
    }
    void display ()
    {
        System.out.println ("the principle is "+p);
        System.out.println ("the interest is "+interest);
        System.out.println ("the amt is"+amt);
    }
    void main () throws IOException 
    {
        input ();
        cal ();
        display ();
    }
}
