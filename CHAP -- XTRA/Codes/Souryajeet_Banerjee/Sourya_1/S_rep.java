import java.io.*;
class S_rep
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s="",s1="",s2="";
        System.out.print("enter the name. ");
        s=br.readLine();
        s=s+" ";
        int l=s.length();
        for(int i=0;i<l;i++)
        {
            char ch =s.charAt(i);
            if(ch=='0')
            {
                System.out.print("o");
            }
            else
            {
                System.out.print(ch);
            }
        }
    }
}