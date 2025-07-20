package All;

/* accept a string change to lowercase & replace 'e' with '*' */
import java.io.*;
class replace
{
    public static void main(String args[])throws IOException 
    {
        int i,len,c=0;
        String st;
        char b;

        InputStreamReader read =new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);

        System.out.println("eneter the string: ");
        st = in.readLine();
        System.out.println();
        len= st.length();
        System.out.println("Length is: "+len);
        System.out.println();
        for(i=0;i<len;i++)
        {
            b = st.charAt(i);
            System.out.println("Characters of "+(i+1)+" position: "+b);
        }
        System.out.println();
        System.out.print("Changed String is: ");
        for(i=0;i<len;i++)
        {
            b = st.charAt(i);
            //System.out.println("Characters of "+(i+1)+" position: "+b);
        
            if((b=='e')||(b=='E'))
            {
                b='*';
                c++;
            }  
            System.out.print(b);
        }
        System.out.println();
        System.out.println("Total nos. of 'e': "+c);
    }   
}