import java.io.*;
class sereis 
{
    public static void main(String args[])throws IOException
    {
     InputStreamReader isr=new InputStreamReader(System.in);
     BufferedReader br = new BufferedReader(isr);
   int i,j,S=0;
   for(i=1;i<=19;i++)
    {
        S= S+(i*(i+1));
    }
    System.out.print(S);
}
    }