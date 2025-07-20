import java.io.*;
class S_nv
{
    public static void main(String args[])throws IOException
    {
        String  s="";
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the name: ");
        s=br.readLine();
        String word=" ";
        int l=s.length();
        for(int i=0;i<l;i++)
        {
            char ch=s.charAt(i);
            if(ch!='a' && ch!='e' && ch!='i' && ch!='o' && ch!='u')
            {
                System.out.print(ch);
            }
        }
    }
}