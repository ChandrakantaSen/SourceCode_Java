import java.io.*;
class Con_Ascii
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s;
        int l,i;
        char ch;
        int c=0;
        System.out.println("Enter any text :- ");
        s=br.readLine();
        l=s.length();
        System.out.println("The length of the text = "+l);
        for(i=0;i<l;i++)
        {
            ch=s.charAt(i);
            int p=(int)(ch);
            if((p>=65)&&(p<=90))
            {
                if(((char)(p)!='A')&&((char)(p)!='E')&&((char)(p)!='I')&&((char)(p)!='O')&&((char)(p)!='U'))
                {
                    c++;
                }
            }
            if((p>=97)&&(p<=122))
            {
if(((char)(p)!='a')&&((char)(p)!='e')&&((char)(p)!='i')&&((char)(p)!='o')&&((char)(p)!='u'))
                {
                    c++;
                }
            }
        }
        System.out.println("Number of consonants =  "+c);
    }
}
            
