import java.io.*;
class S_P_Rever
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s="";
        System.out.print("Enter the name ");
        s=br.readLine();
        System.out.print(s);
        int l=s.length();
        for(int i=l-1;i>=0;i--)
        {
            System.out.print(s.charAt(i));
        }
    }
}