import java.io.*;
class Stringop
{
    static String s;
    Stringop()
    {
        s="";
    }
    void encode ()
    {
        int l,i;
        char c;
        String d="";
        l=s.length();
        for (i=0;i<l;i++)
        {
            c=s.charAt(i);
            if (c>='A'&&c<='X')
            {
                c=(char)((int)c+2);
                d=d+c;
            }
            else if (c>='a'&&c<='x')
            {
                c=(char)((int)c+2);
                d=d+c;
            }
            else if (c=='Y')
            {
                d=d+"A";
            }
            else if (c=='Z')
            {
                d=d+"B";
            }
            else if (c=='y')
            {
                d=d+"a";
            }
            else if (c=='z')
            {
                d=d+"b";
            }
            else 
            d=d+c;                
            }
            s=d;
           System.out.println(d);
        }
    void print()
    {
        int l,i;
        String d="";
        char c;
        s=s+" ";
        l=s.length();
        for (i=0;i<l;i++)
        {
            c=s.charAt(i);
            if (c==' ')
            {
                System.out.println(d);
                d="";
            }
            else
            {
                d=d+c;
            }
        }
    }
    public static void main ()throws IOException
    {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        Stringop ob=new Stringop();
        System.out.println("Enter a text");
        s=br.readLine();
        ob.encode();
        ob.print();
    }
}            