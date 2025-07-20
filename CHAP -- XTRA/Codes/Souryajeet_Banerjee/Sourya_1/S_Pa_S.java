import java.io.*;
class S_Pa_S
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s="",s1="",s2="",s3="";
        System.out.print("Enter the name. ");
        s=br.readLine();
        s=s+" ";
        int l=s.length();
        for(int i=0;i<l;i++)
        {
            char ch=s.charAt(i);
            if(ch!=' ')
            {
                s1=s1+ch;
                continue;
            }
            int l1=s1.length();
            for(int i1=l1-1;i1>=0;i1--)
            {
                s2=s2+s1.charAt(i1);
            }
            s1=s1.trim();
            s2=s2.trim();
            if(s2.equals(s1)==true)
            {
                System.out.println(s2);
            }
            s1="";
            s2="";
        }
    }
}