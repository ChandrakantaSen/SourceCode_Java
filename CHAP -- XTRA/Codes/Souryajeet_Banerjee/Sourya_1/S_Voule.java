import java.io.*;
class S_Voule
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s="";
        System.out.print("Enter the name ");
        s=br.readLine();
        int f=0;
        int l=s.length();
        for(int i=0;i<l;i++)
        {
            char ch=s.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
            {
                f=f+1;
            }
        }
        if(f>0)
        {
            System.out.println("Voule is present "+f+" times.");
        }
        else
        {
            System.out.println("Voule is not present.");
        }
    }
}
/*uy55*/