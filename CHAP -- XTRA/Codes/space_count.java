import java.io.*;
class space_count
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s;
        int l;
        System.out.println("Enter any text : -   ");
        s=br.readLine();
        l=s.length();
        System.out.println("The length of the string is = "+l);
        int sp=0;
        for(int i=0;i<l;i++)
        {
            if(s.charAt(i)==' ')
            {
                sp++;
            }
        }
        System.out.println("No. of spaces =  "+sp);
    }
}
    
    
    