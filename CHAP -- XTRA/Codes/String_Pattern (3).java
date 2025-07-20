package All;
import java.io.*;

class String_Pattern
{
    public static void main(String args[]) throws IOException
    {
        int i,b;
        String st;
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);
        System.out.println("enter string: ");
        st=in.readLine();
        b=st.length();
        System.out.println("****:print string:****");
        System.out.println();
        for(i=0;i<=b;i++)
        {
            System.out.print(st.substring(i,b));
            System.out.print(st.substring(0,i));
            System.out.println();   
        }
    }
}