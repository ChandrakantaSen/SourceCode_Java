import java.io.*;
class S_EVD
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s="";
        System.out.print("Enter the name ");
        s=br.readLine();
        s=s.toLowerCase();
        int f=0;
        int l=s.length();
        for(int i=0;i<l;i++)
        {
            char ch=s.charAt(i);
            if(ch!='a'&&ch!='e'&&ch!='i'&&ch!='o'&&ch!='u'&&ch!=' ')
            {
                f=f+1;
            }
        }
        if(f>0)
        {
            System.out.println("Vowel is not present "+f+" times.");
        }
    }
}