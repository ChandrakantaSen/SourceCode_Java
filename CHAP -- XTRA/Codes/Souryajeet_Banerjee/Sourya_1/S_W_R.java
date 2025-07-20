import java.io.*;
class S_W_R
{
    public static void main(String args[])throws IOException
    {
        String  s="",s1="",s2="";
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the name:- ");
        s=br.readLine();
        s=s+" ";
        int l=s.length();
        for(int i=0;i<l;i++)
        {
            char ch=s.charAt(i);
            if(ch!=' ')
            {
                s1=s1+s.charAt(i);
                continue;
            }
            int l1=s1.length();
            for(int j=l-1;j>=0;j++)
            {
                System.out.print(s1.charAt(j));
            }
            s1=" ";
            System.out.print(" ");
        }
    }
}