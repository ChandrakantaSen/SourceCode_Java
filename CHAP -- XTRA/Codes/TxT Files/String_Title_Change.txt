import java.io.*;
class S_T_C
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s="";
        String s1="";
        String s2="";
        System.out.print("Enter the title: ");
        s=br.readLine();
        System.out.print("Enter the name: ");
        s1=br.readLine();
        System.out.print("Enter the changed title: ");
        s2=br.readLine();
        System.out.println("Name: "+s1+" "+s+".");
        System.out.println("Name: "+s1+" "+s+" is now "+s1+" "+s2+".");
    }
}