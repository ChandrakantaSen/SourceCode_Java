import java.io.*;
import java.lang.*;
class longest
{
    public static void main(String h[])throws IOException
    {

        String arr,w1,w=" ";

        int le=0,i,x;
        char ch=' ';
        w1=" ";
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a sentence: ");
        arr=br.readLine(); 
        arr=arr+" ";
        int l=arr.length();
        for(i=0;i<l;i++)
        { 
            ch=arr.charAt(i);

            if(ch!=' ')
            {
                w1=w1+ch;
            }

            else
            {
                x=w1.length();
                if(x>le)
                {
                    le=x;
                    w=w1;
                }
                w1=" ";
            }
        }
        System.out.println("longest word is"+w);
    }
}