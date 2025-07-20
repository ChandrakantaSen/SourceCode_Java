import java.io.*;
class no_words
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s;
        int i,l,d=0;
        System.out.println("Enter a sentence  ");
        s=br.readLine();
        s=s.toLowerCase();
        s=s.concat(" ");
        s=(" ").concat(s);
        l=s.length();
        System.out.println(s);
        for(i=1;i<l;i++)
        {
            if((s.charAt(i-1)==' ')&&(s.charAt(i)!=' '))
            d++;
        }
        System.out.println("The number of words are  "+d);
    }
}