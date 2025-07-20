import java.io.*;
class vow
{
    public static void main (String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int i,j,p=0;
        String c="";
        System.out.println("Sentence");
        String s=br.readLine();
        s=s+" ";
        int l=s.length();
        for(i=0;i<l;i++)
        {
            if(s.charAt(i)==' ')
            {
                int d=c.length();
                for(j=0;j<d;j++)
                {
                    if(c.charAt(j)=='a'||c.charAt(j)=='e'||c.charAt(j)=='i'||c.charAt(j)=='o'||c.charAt(j)=='u')
                    p++;            
                }
                System.out.println("No. of vowels in "+c+" is "+p);
                p=0;
                c="";
        }
        else
        {
            c=c+s.charAt(i);
        }
    }
}
}