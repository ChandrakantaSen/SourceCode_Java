import java.io.*;
class Tabil
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n,c;
        System.out.println("Enter the tabils number");
        n=Integer.parseInt(br.readLine());
        System.out.println(" The Tabil of "+n+" =");
        for(int i=1;i<=40;i++)
        {
            c=n*i;
            System.out.println("                    "+n+" * "+i+" = "+c);
        }
    }
} 