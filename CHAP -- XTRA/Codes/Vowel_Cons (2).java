package All;

import java.io.*;
class Vowel_Cons
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int v=0,l,c=0;
        String str;
        char b;
        System.out.println("Enter the String");
        str=br.readLine();
        l=str.length();
        for(int i=0;i<l;i++)
        {
            b=str.charAt(i);
            if((b=='A')||(b=='E')||(b=='I')||(b=='O')||(b=='U')||(b=='a')||(b=='e')||(b=='i')||(b=='o')||(b=='u'))
            {
                v=v+1;
            }
            else
            {
                c=c+1;
            }
        }
            System.out.println("No of Vowel : "+v);
            System.out.println("No of Consonant : "+c);
        }
    }

            