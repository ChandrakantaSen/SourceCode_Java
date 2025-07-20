import java.io.*;
public class Surname
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        int x,i,k=0;
        String s,s1="",s2="";
        System.out.println("Enter name");
        s=in.readLine();
        s=s+" ";
        x=s.length();
        for(i=0;i<x;i++)
        {
            if(s.charAt(i)!=' ')
            s1=s1+s.charAt(i);
            else
            {
                k=k+1;                
                if(k!=3)
                {
                    s2=s2+s1+" ";
                }
                else
                {
                    s2=s1+" "+s2;
                }
                s1="";
            }
        }
        System.out.println(s2);
    }
}