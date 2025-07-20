import java.io.*;
class ste
{
    public static void main (String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int i,c=0;
        char b;
        System.out.println("Sentence");
        String n=br.readLine();
        int l=n.length();
        System.out.println("letter frequency");
        char f=(char)br.read();
        for(i=0;i<l;i++)
        {
            b=n.charAt(i);
            if(b==f)
            {
                c++;
            }
        }
        System.out.println(c);
    }
}