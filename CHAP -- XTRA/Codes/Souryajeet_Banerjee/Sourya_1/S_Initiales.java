import java.io.*;
class S_Initiales
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s="";
        System.out.print("Enter the name ");
        s=br.readLine();
        int l=s.length();
        for(int i=0;i<l;i++)
        {
            char ch=s.charAt(i);
            if(ch==' ')
            {
                System.out.print(s.charAt(i+1)+".");
            }
        }
    }
}