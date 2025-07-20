import java.util.*;
class Magic_String
{
    boolean magic(String word)
    {
        for(int i=0;i<word.length()-1;i++)
        {
            char ch1=word.charAt(i);
            char ch2=word.charAt(i+1);
            if(ch2==ch1+1)
            return true;
        }
        return false;
    }
    static void main()
    {
        Scanner sc=new Scanner(System.in);
        Magic_String ob=new Magic_String();
        System.out.println("Enter the String :");
        if(ob.magic(sc.next()))
        System.out.println("Magic String");
        else
        System.out.println("Not Magic String");
    }
}