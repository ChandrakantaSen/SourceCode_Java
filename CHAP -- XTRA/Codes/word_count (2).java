import java.io.*;
class word_count
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s;
        int l,i,sp=0;
        System.out.println("Enter any text :-  ");
        s=br.readLine();
        l=s.length();
        System.out.println("The length of the text is :-  "+l);
        for(i=0;i<l;i++)
        {
            if(s.charAt(i)==' ')
            {
                sp++;
            }
        }
        sp=sp+1;
        System.out.print("No. of words  "+sp);
    }
}
