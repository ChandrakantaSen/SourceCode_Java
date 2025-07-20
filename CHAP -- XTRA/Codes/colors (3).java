import java.io.*;
class colours
{
String colTop,colBottom;
colours()
{
colTop="pink";
colBottom="black";
    }
    colours(String t,String p)
    {
        colTop=t;
        colBottom=p;
    }
    public static void main(String args[])throws IOException
    {
        String a=" ",b=" ";
        colours obj=new colours();
        System.out.println(obj.colTop+"\t"+obj.colBottom);
        colours obj1=new colours(a,b);
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter first colour");
        a=br.readLine();
        System.out.println("enter second colour");
        b=br.readLine();
       System.out.println(obj1.colTop+"\t"+obj1.colBottom);
    }
}