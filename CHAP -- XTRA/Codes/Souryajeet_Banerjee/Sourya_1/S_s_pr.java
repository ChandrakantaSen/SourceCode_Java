import java.io.*;
class S_s_pr
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s="";
        String s1="",s11="",s3="",s4="1",s5="2";
        System.out.print("Enter 1 to print directly else 2 to print reverse short");
        s=br.readLine();
        if(s.equals(s4)==true)
        {
            System.out.print("Enter the name ");
            s1=br.readLine();
            s1=" "+s1;
            int n=s1.length();
            for(int i=0;i<n;i++)
            {
                char ch=s1.charAt(i);
                if(ch==' ')
                {
                    s11=s11+s1.charAt(i+1);
                }
            }
            s11=s11.toUpperCase();
            System.out.print(s11);
        }
        if(s.equals(s5)==true)
        {
            System.out.print("Enter the name ");
            s1=br.readLine();
            s1=s1+" ";
            int n=s1.length();
            for(int i=n-1;i>=0;i--)
            {
                char ch=s1.charAt(i);
                if(ch==' ')
                {
                    s11=s11+s1.charAt(i-1);
                }
            }
            s11=s11.toUpperCase();
            System.out.print(s11);
        }
    }
}