import java.util.*;
class stringop
{
    String txt;
    stringop()
    {
        txt="";
    }
    void readstring()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String :");
        txt=sc.next();
    }
    char caseconvert(int i)
    {
        if(Character.isUpperCase(txt.charAt(i)))
        return (Character.toLowerCase(txt.charAt(i)));
        else
        return (Character.toUpperCase(txt.charAt(i)));
    }
    void circularcode()
    {
        String st="";
        for(int i=0;i<txt.length();i++)
        {
            char ch=caseconvert(i);
            if(ch==90)
            st=st+'a';
            else if(ch==122)
            st=st+'A';
            else
            st=st+(char)(ch+1);
        }
        System.out.println(st);
    }
}