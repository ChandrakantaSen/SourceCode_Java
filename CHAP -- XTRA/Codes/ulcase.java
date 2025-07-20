import java.io.*;
class ulcase
{
    public static void main (String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int i;
        char c,d;
        System.out.println("Sentence");
        String s=br.readLine();
        s=" "+s;
        int l=s.length();
        for(i=0;i<l;i++)
        {
            c=s.charAt(i);
            if(c==' ')
            {
                d=s.charAt(i+1);
                s=s+" "+Character.toUpperCase(d);
                i++;
            }
            else
            {
                s=s+Character.toLowerCase(c);
            }
        }
        System.out.println(s);
    }
}