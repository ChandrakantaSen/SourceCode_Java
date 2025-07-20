import java.io.*;
class string_pal_con
{
static String s,w="";
static int l,i;
static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
string_pal_con()//DEFAULT CONSTRUCTOR
{
i=0;
    }
    public static void input()throws IOException
    {
        System.out.println("Enter your word : ");
        s=br.readLine();
        l=s.length();
    }
    public static void pal()
    {
        for(i=l-1;i>=0;i--)
        {
            w=w+s.charAt(i);
        }
    }
    public static void check()
    {
        if(w.compareTo(s)==0)
        {
            System.out.println(s+" is a palindrome word");
        }
        else
        {
            System.out.println(s+" is not a palindrome word");
        }
    }
    public static void main()throws IOException
    {
       string_pal_con ob=new string_pal_con();
       ob.input();
       ob.pal();
       ob.check();
    }
}
    