import java.io.*;
class S_Ex_V
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
            char ch=s.charAt(i);
            int c=0;
            if(ch!=' ')
            {
                s1=s1+ch;
                continue;
            }
            s1=s1.toLowerCase();
            System.out.print("Number of vowels present in "+s1+" = ");
            int l1=s1.length();
            for(int j=0;j<l1;j++)
            {
                char ch1=s1.charAt(j);
                if(ch1=='a'||ch1=='e'||ch1=='i'||ch1=='o'||ch1=='u')
                {
                    c=c+1;
                }
            }
            System.out.println(c);
            s1="";
        }
    }
}//mastering information tecnology