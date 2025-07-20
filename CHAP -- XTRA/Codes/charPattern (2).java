package All;

import java.io.*;

class charPattern
{
    public static void main(String args[])throws IOException
    {
        int a,b;
        String st;
        
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);
        
        System.out.println("Enter ur word: ");
        st = in.readLine();
        
        b = st.length();
        
        for(a=0;a<=b;a++)
        {
            System.out.println(st.substring(0,a));
        }
    }
}