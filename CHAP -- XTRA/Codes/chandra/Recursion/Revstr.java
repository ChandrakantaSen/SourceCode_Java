import java.io.*;
public class Revstr
{
    static String str,revst;
    Revstr()//default constructor
    {
        str="";
        revst="";
    }

    public static void getstr()throws IOException
    {
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(read);
        System.out.println("Enter the string");//accept a string
        str=br.readLine();//store the string in str
    }

    public static void recReverse(int len)throws IOException
    {
        char ch=' ';
        if(len>=0)
        {
            ch=str.charAt(len);//extract each character from the string
            revst=revst+ch;//store the reversed string
            recReverse(--len);//to decrease the value of len by 1
        }
    }

    public static void check()throws IOException
    {
        System.out.println("Original string...."+str);//display the string
        System.out.println("Reversed string...."+revst);//disaply the reversed string
    }

    public static void main(String args[])throws IOException
    {
        Revstr ob=new Revstr();
        ob.getstr();
        ob.recReverse(str.length()-1);
        ob.check();
    }
}