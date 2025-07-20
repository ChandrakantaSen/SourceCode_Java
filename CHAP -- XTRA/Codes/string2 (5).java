import java.io.*;
class string2
{
public static void main()throws IOException
{
    int i;
    char a;
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    for(i=1;i<=256;i++)
    {
        a=(char)(i);
        System.out.println(a+" "+(int)(a));
    }
}
}
    
    