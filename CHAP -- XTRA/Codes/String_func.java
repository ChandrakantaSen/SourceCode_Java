import java.io.*;
class String_func
{
    static int l,i;
    static String s;
    static char ch;
    static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    public static void text()throws IOException
    {
        System.out.println("Enter any text :- ");
        s=br.readLine();
    }
    public static void length()
    {
        l=s.length();
        System.out.println("The length of the text = "+l);
    }
    public static void print()
    {
        for(i=0;i<l;i++)
        {
            ch=s.charAt(i);
            System.out.println(ch);
        }
    }
    public static void main(String args[])throws IOException
    {
        String_func ob=new String_func();
        ob.text();
        ob.length();
        ob.print();
    }
}

