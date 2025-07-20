import java.io.*;
class no_space
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s;
        int l,i;
        System.out.println("Enter any text :-  ");
        s=br.readLine();
        l=s.length();
        System.out.println("The length of the text is :-  "+l);
        for(i=0;i<l;i++)
        {
            if(s.charAt(i)!=' ')
            {
                System.out.print(s.charAt(i));
            }
        }
    }
}