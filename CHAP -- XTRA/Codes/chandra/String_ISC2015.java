/**
 * Write a program to accept a sentence which may be terminated by either '.' or '?' only.
 * The words are to be separated by a single blank space. 
 * Print an error message if the input does not terminate with ‘.’ or ‘?’. 
 * You can assume that no word in the sentence exceeds 15 characters, 
 * so that you get a proper formatted output.
 * 
 * Perform the following tasks:
 * (i)  Convert the first letter of each word to uppercase.
 * (ii) Find the number of vowels and consonants in each word and 
 *      display them with proper headings along with the words.
 * 
 * Test your program with the following inputs.
 * 
 * INPUT:  Intelligence plus character is education.
 * OUTPUT: Intelligence Plus Character Is Education
 * 
 * Word         Vowels  Consonants
 * Intelligence    5        7
 * Plus            1        3
 * Character       3        6
 * Is              1        1
 * Education       5        4
 **/

import java.util.*;

class String_ISC2015
{
    int countVowel(String s)
    {
        s = s.toUpperCase();
        int count = 0;
        char ch;
        for(int i=0; i<s.length(); i++)
        {
            ch = s.charAt(i);
            if(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
            {
                count++;
            }
        }
        return count;
    }

    String convert(String s)
    {
        char ch = s.charAt(0);
        ch = Character.toUpperCase(ch); 
        String f = ch + s.substring(1);
        return f;
    }

    String addSpace(String s, int max)
    {
        int x = max-s.length();
        for(int i=1; i<=x; i++)
        {
            s = s+" ";
        }
        return s;
    }

    public static void main(String args[])
    {
        String_ISC2015 ob = new String_ISC2015();
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter a sentence : ");
        String s=sc.nextLine();
        int l = s.length();
        char last = s.charAt(l-1);           

        if(last != '.' && last != '?')
        {
            System.out.println("Invalid Input. End a sentence with either '.' or '?'");
        }
        else
        {
            StringTokenizer str = new StringTokenizer(s," .?");
            int x = str.countTokens();
            String ans="";
            String word[]=new String[x];
            int vow, con, max=0;

            for(int i=0; i<x; i++)
            {
                word[i] = str.nextToken(); 
                ans = ans + " " + ob.convert(word[i]);
                if(word[i].length()>max)
                {
                    max = word[i].length();
                }
            }
            System.out.println();
            System.out.println("Sentence = "+ans.trim());

            String y=ob.addSpace("Word",max);
            System.out.println();
            System.out.println(y+"\tVowels\tConsonant");
            System.out.println();
            for(int i=0; i<x; i++)
            {
                vow = ob.countVowel(word[i]);
                con = word[i].length()-vow; // Consonant = Length - Vowel
                y = ob.addSpace(word[i],max);
                System.out.println(y+"\t"+vow+"\t"+con);
            }
        }
    }
}
