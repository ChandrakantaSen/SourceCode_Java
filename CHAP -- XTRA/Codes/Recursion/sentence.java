import java.io.*;
class sentence
{
    public static void main()throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a sentence");
        String str=br.readLine(),s="";
        char ch;
        str=str+" ";
        int i;
        for(i=1;i<str.length();i++)
        {
            ch=str.charAt(i);
            if(ch!=' ')
            s=s+ch;
            else
            {
                int l=s.length();
                if(s.length()>1)
                {
                    if(s.charAt(0)==s.charAt(l-1))
                    {
                        System.out.println(s);
                    }
                }
                s="";
            }
            
        }
    }
}