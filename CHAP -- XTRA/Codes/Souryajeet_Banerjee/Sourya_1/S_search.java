import java.io.*;
class S_search
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s="";
        System.out.print("Enter the name ");
        s=br.readLine();
        int f=0;
        System.out.print("Enter the searching charecter ");
        char ch=(char)(br.read());
        int l=s.length();
        for(int i=0;i<l;i++)
        {
            char ch1=s.charAt(i);
            if(ch==ch1)
            {
                f=1;
            }
        }
        if(f==1)
        {
            System.out.print("Searching was Successful");
        }
        else
        {
            System.out.print("Searching was not Successful");
        }
    }
}
/*uy54*/