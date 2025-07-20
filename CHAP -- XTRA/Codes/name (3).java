import java.io.*;
class name
{
    public static void main (String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int i;
        System.out.println("Enter your name");
        String n=br.readLine();
        int l=n.length();
        for(i=l-1;i>=0;i--)
        {
            if(n.charAt(i)==' ')
            {
                break;
            }
        }
        String p=n.substring(i+1)+" ";
        p=p+n.substring(0,i);
        System.out.println(p);
    }
}