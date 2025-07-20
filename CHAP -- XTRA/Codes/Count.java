import java.util.*;
class Count
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        String st;
        System.out.println("Enter the sentence :");
        st=sc.nextLine();
        String word="";
        st=st.trim();
        st=st+" ";
        int two=0,three=0,four=0;
        int i;
        for(i=0;i<st.length();i++)
        {
            if(st.charAt(i)!=' ')
            {
                word+=st.charAt(i);
            }
            else
            {
                if(word.length()==2)
                two++;
                if(word.length()==3)
                three++;
                if(word.length()==2)
                four++;
                word="";
            }
        }
        System.out.println("No. of two letter words : "+two);
        System.out.println("No. of three letter words : "+three);
        System.out.println("No. of four letter words : "+four);
    }
}