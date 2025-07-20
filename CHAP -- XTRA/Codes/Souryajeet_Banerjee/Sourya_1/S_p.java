import java.io.*;
class S_p
{
    public static void main(String args[])throws IOException
    {
        String  s="";
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the name: ");
        s=br.readLine();
        String word=" ";
        int l=s.length();
        for(int i=l-1;i>=0;i--)
        {
            word=word+s.charAt(i);
        }
        s=s.trim();
        word=word.trim();
        if(word.equals(s)==true)
        {
            System.out.println("Pallindrome name = "+word);
        }
        else
        {
            System.out.println("Not a Pallindrome name = "+word);
        }
    }
}