import java.io.*;
class S_cc
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        String s="";
        System.out.print("Enter the name:-");
        s=br.readLine();
        s=s.toLowerCase();
        int n=s.length();
        for(int i=0;i<n;i++)
        {
            char ch=s.charAt(i);
            if(ch=='a')
            {
                System.out.print("FREQUENCY of 'A'=5");
            }
            else if(ch=='e')
            {
                System.out.print("FREQUENCY of 'E'=4");
            }
            else if(ch=='i')
            {
                System.out.print("FREQUENCY of 'I'=3");
            }
            else if(ch=='o')
            {
                System.out.print("FREQUENCY of 'O'=2");
            }
            else if(ch=='u')
            {
                System.out.print("FREQUENCY of 'U'=1");
            }
        }
    }
}