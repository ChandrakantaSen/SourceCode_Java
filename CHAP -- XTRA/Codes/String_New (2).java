import java.io.*;
class String_New
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s;
        int l,i;
        char ch;
        System.out.println("Enter any text :- ");
        s=br.readLine();
        l=s.length();
        System.out.println("The length of the text = "+l);
        for(i=0;i<l;i++)
        {
            ch=s.charAt(i);
            System.out.println(ch);
        }
    }
}
