package All;

/* Count the no of vowles */
import java.io.*;
class count_vwls
{
    public static void main(String args[])throws IOException
    {
       int len,i,c=0;
       String st;
       char b;
       
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);
       
       System.out.println("Enter string: ");
       st=in.readLine();
       len=st.length();
       
       for(i=0;i<=len;i++)
       {
           b =(st.charAt(i));
           
           if((b=='a')||(b=='e')||(b=='i')||(b=='o')||(b=='u'))
           {
               c++;
           }
       }
       System.out.println("No of Vowels: "+c);
    }
}