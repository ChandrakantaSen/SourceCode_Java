package All;

import java.util.*;
class Search_replace
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        String st;
        System.out.println("Enter the sentence :");
        st=sc.nextLine();
        System.out.println("Enter the search word :");
        String search=sc.nextLine();
        System.out.println("Enter the replace word :");
        String replace=sc.nextLine();
        String word="",sent="";
        st=st.trim();
        st=st+" ";
        int i;
        for(i=0;i<st.length();i++)
        {
            if(st.charAt(i)!=' ')
            {
                word+=st.charAt(i);
            }
            else
            {
                if(word.equalsIgnoreCase(search))
                sent+=replace+" ";
                else
                sent+=word+" ";
                word="";
            }
        }
        System.out.println("New sentence : "+sent);
    }
}