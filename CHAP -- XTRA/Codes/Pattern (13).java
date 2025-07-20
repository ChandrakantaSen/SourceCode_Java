import java.io.*;
class Pattern
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
            
            for(i=0;i<=b;i++)
            {
                System.out.println(st.substring(0,i));
            }
    }
}