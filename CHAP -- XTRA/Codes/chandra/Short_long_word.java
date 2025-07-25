/**
 * The class Short_long_word finds and displays the shortest and the longest word
 * in a sentence along with their lengths
 **/

import java.io.*;
class Short_long_word
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter any sentence : "); //inputting the sentence
        String s=br.readLine();

        s=s+" "; //adding a space at the end, to extract the last word also
        int len=s.length(); //finding the length of the sentence
        String x="",maxw="",minw="";
        char ch;
        int p,maxl=0,minl=len;

        for(int i=0;i<len;i++)
        {
            ch=s.charAt(i); //extracting characters of the string one at a time
            if(ch!=' ')
            {
                x=x+ch; //adding characters to form word if character is not space
            }
            else
            {
                p=x.length();

                if(p<minl) //checking for minimum length
                {
                    minl=p;
                    minw=x;
                }

                if(p>maxl) //checking for maximum length
                {
                    maxl=p;
                    maxw=x;
                }
                x=""; //emptying the temporary variable to store next word
            }
        }
        System.out.println("Shortest word = "+minw+"\tLength = "+minl);
        System.out.println("Longest word = "+maxw+"\tLength = "+maxl);
    }
}