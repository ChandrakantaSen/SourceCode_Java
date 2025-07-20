import java.io.*;
public class Frequency
{
    String text;
    int countand,countan,len;
    void Frequency()
    {
        text="";
        countand=0;
        countan=0;
    }
    void accept(String n)
    {
        text=n;
    }
    void checkandfreq()
    {
        int i;
        String s="";
        len=text.length();
        for(i=0;i<len;i++)
        {
            if(text.charAt(i)!=' '&&text.charAt(i)!='.')
            s=s+text.charAt(i);
            else
            {
                if(s.equalsIgnoreCase("and"))
                countand=countand+1;
                s="";
            }
            
        }
    }
    void checkanfreq()
    {
        int i;
        String s="";
        len=text.length();
        for(i=0;i<len;i++)
        {
            if(text.charAt(i)!=' '&&text.charAt(i)!='.')
            {
                s=s+text.charAt(i);
            }
            else
            {
                if(s.equals("an"))
                countan=countan+1;
                s="";
            }
        }
    }
    void display()
    {
        System.out.println("Frequency of and="+countand);
        System.out.println("Frequency of an="+countan);
    }
    public static void main(String args[])throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        String s1;
        System.out.println("Enter a sentence");
        s1=in.readLine();
        Frequency obj=new Frequency();
        obj.accept(s1);
        obj.checkandfreq();
        obj.checkanfreq();
        obj.display();
    }
    
}
    
                
            