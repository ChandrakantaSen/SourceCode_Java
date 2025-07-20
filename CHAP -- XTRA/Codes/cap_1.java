import java.io.*;
class cap_1
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s;
        int k,l,i;
        char ch;
        System.out.println("Enter any text :-  ");
        s=br.readLine();
        l=s.length();
        ch=s.charAt(0);
        k=(int)(ch);
        if((k>=97)&&(k<=122))
        {
                k=k-32;
                System.out.print((char)(k));
            }
            else
            {
                System.out.print((char)(k));
            }
            for(i=1;i<l;i++)
            {
                System.out.print(s.charAt(i));
            }
        }
    }
            