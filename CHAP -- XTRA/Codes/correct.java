
public class correct
{
    public static void main(String args[])
    {
        String s="My name is Alok Kumar Gupta and my age is 45 years old";
        int x;
        String s1="",s2="";
        x=s.length();
        for(int i=0;i<x;i++)
        {
            if(s.charAt(i)!=' ')
            s1=s1+s.charAt(i);
            else
            {
                if(s1.equals("Alok"))
                {
                    s2=s2+"Ashok"+" ";
                }
                else if(s1.equals("45"))
                {
                    s2=s2+"35"+" ";
                }
                else
                {
                    s2=s2+s1+" ";
                }
                s1="";
            }
        }
        System.out.println(s2);
    }
}
                
                