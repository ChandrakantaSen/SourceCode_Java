import java.io.*;
class S_S
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s="",s1="";
        System.out.print("Enter the name ");
        s=br.readLine();
        int l=s.length(),v;
        v=s.lastIndexOf(' ');
        for(int i=v;i<l;i++)
        {
            char ch=s.charAt(i);
            System.out.print(s.charAt(i));
        }
        System.out.print(" ");
        for(int i=0;i<v;i++)
        {
            char ch=s.charAt(i);
            System.out.print(s.charAt(i));
        }
    }
}