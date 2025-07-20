import java.io.*;
class Alphabet_Order
{
    public static void main(String h[])throws IOException
    {
        BufferedReader u=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the sentence in small letter: ");
        String s=u.readLine();
       s=s.toLowerCase();
        int i=0,j=0,a=0,k=0;
        char ch;
        for(i=97;i<=122;i++)
        {
            for(j=0;j<s.length();j++)
            {
                a=s.charAt(j);
                k=a;
         ch=s.charAt(j);
                if(k==i)
           System.out.print(ch);
            }
        }
    }
}
 