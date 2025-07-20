import java.io.*;
class strng_pal_file
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter buf=new BufferedWriter(new FileWriter("strng_pal.txt"));
        PrintWriter pr=new PrintWriter(buf);
        String s,k="",p="";
        int l,i;
        //System.out.println("Enter any text :----  ");
        s=br.readLine();
        l=s.length();
        //System.out.println("String without space");
        for(i=0;i<l;i++)
        {
            if(s.charAt(i)!=' ')
            {
                k=k+s.charAt(i);
                //System.out.print(s.charAt(i));
            }
        }
        // System.out.println("\nReverse String  ");
        for(i=l-1;i>=0;i--)
        {
           if(s.charAt(i)!=' ')
            {
                p=p+s.charAt(i);
                System.out.print(s.charAt(i));
            }
         }
         pr.println("Enter any text :----  ");
         pr.println(s);
        pr.println("Reverse of the string ");
        pr.println(p);
        if(k.compareTo(p)==0)
        {
            pr.println("\nString is palindrome");
        }
        else
        {
            pr.println("String is not palindrome");
        }
        pr.close();
    }
}
        