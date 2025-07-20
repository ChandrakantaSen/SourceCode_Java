import java.io.*;
public class Abcd
{
    void compare(int n,int m)
    {
        if(m>n)
        {
            System.out.println("M is the greater number:"+m);
        }
        else
        {
            System.out.println("N is the greater number:"+n);
        }
    }
    void compare(char n,char m)
    {
        if(m>n)
        {
            System.out.println("M is the greater charecter:"+m);
        }
        else
        {
            System.out.println("N is the greater charecter:"+n);
        }
    }
    void compare(String n,String m)
    {
        int l=n.length();
        int w=m.length();
        if(w>l)
        {
            System.out.println("M is the greater String:"+m);
        }
        else
        {
            System.out.println("N is the greater String:"+n);
        }
    }
}