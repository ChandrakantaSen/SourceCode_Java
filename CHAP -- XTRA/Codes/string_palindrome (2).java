import java.io.*;
class string_palindrome
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s,k="",p="";
        int l,i;
        System.out.println("Enter any text :----  ");
        s=br.readLine();
        l=s.length();
        System.out.println("String without space");
        for(i=0;i<l;i++)
        {
            if(s.charAt(i)!=' ')
            {
                k=k+s.charAt(i);
                System.out.print(s.charAt(i));
            }
        }
         System.out.println("\nReverse String  ");
        for(i=l-1;i>=0;i--)
        {
           if(s.charAt(i)!=' ')
            {
                p=p+s.charAt(i);
                System.out.print(s.charAt(i));
            }
         }
        if(k.compareTo(p)==0)
        {
            System.out.print("\nString is palindrome");
        }
        else
        {
            System.out.println("String is not palindrome");
        }
    }
}
        