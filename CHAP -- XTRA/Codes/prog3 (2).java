import java.io.*;
class prog3
{
    public static void main()throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Input A number");
        int n=Integer.parseInt(br.readLine());int p=n*n;
        String str="";
        str=Integer.toString(p);
        int s=0;
        int l=str.length();
        int c=l/2;
        String z="";String q="";
        q=str.substring(0,c);
        z=str.substring(c,l);
        int y=Integer.parseInt(q);
        int x=Integer.parseInt(z);
        s=x+y;
        if(s==n)
        System.out.print("IS A KAPREKAR NUMBER");
        else
        System.out.print("NOT A KAPREKAR NUMBER");
    }
}
