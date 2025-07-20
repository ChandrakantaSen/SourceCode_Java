import java.io.*;
class S_se
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        String s="";
        System.out.print("Enter the name ");
        s=br.readLine();
        int f=0;
        System.out.print("Enter the word ");
        char ch=(char)(br.read());
        int n=s.length();
        for(int i=0;i<n;i++)
        {
            char ch1=s.charAt(i);
            if(ch==ch1)
            {
                f=f+1;
            }
        }
        if(f>0)
        {
            System.out.print("The word was found "+f+" times ");
        }
        else
        {
            System.out.print("The word was not found ");
        }
    }
}