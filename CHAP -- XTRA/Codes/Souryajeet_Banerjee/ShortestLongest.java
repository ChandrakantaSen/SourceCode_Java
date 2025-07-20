import java.io.*; 

public class ShortestLongest
{
    public void findMethod(String s)  
    {
        String str=s+" ";
        int len=str.length(), l=0;
        int start_index=0, last_index;
        int min=len,max=0;
        String shortest_word=" ", longest_word=" ", word=" ";
            while(start_index<len)
            {
                last_index=str.indexOf(" ", start_index);
                word=str.substring(start_index,last_index);
                l= word.length();
                if(l<min)
                {
                    min=l;
                    shortest_word=word;
                }
                if(l>max)
                {
                    max=l;
                    longest_word=word;
                }
                start_index=last_index+1;
            }
            System.out.println("Shortest word = "+ shortest_word+" with length "+min);
            System.out.println("Longest word = "+longest_word+" with length "+max);
    }
}