import java.io.*;
import java.util.*;
class writefile
{
    public static void main(String args[])throws IOException
    {
        FileReader fw=new FileReader("R.txt");
        BufferedReader br=new BufferedReader(fw);
        //PrintReader pw=new PrintReader(br);
        //Scanner sc=new Scanner(System.in);
        Scanner sc=new Scanner(new File("R.txt"));
        while(sc.hasNext())
        {
            String name=sc.next();
            int roll=sc.nextInt();
            System.out.println("name="+ name);
            System.out.println("roll="+roll);
        }
        sc.close();
    }
}
