import java.io.*;
class S_Bluej
{
    public static void main(String args[])throws IOException
    {
        String  s="",s1="",s2="";
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the name: ");
        s=br.readLine();
        s=s+" ";
        int n;
        s=s.toUpperCase();
        int l=s.length();
        System.out.print("Enter 1 or 2:");
        n=Integer.parseInt(br.readLine());
        if(n==1)
        {
            for(int i=0;i<l;i++)
            {
                for(int j=0;j<=i;j++)
                {
                    char ch=s.charAt(i);
                    System.out.print(s.charAt(i));
                }
                System.out.println();
            }
        }
        else if(n==2)
        {
            for(int i=0;i<l;i++)
            {
                for(int j=0;j<i;j++)
                {
                    char ch=s.charAt(j);
                    System.out.print(s.charAt(j));
                }
                System.out.println();
            }
        }
        else
        {
            System.out.println("Sorry try again.");
        }
    }
}