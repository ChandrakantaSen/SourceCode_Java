import java.io.*;
class cap_small
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s;
        int k,l,i;
        char ch;
        System.out.println("Enter any text :-  ");
        s=br.readLine();
        l=s.length();
        System.out.println("The length of the text is :-  "+l);
        for(i=0;i<l;i++)
        {
            ch=s.charAt(i);
            k=(int)(ch);
            if((k>=65)&&(k<=90))
            {
                k=k+32;
                System.out.print((char)(k));
            }
            else if((k>=97)&&(k<=122))
            {
                k=k-32;
                System.out.print((char)(k));
            }
            else
            {
                System.out.print((char)(k));
            }
        }
    }
}