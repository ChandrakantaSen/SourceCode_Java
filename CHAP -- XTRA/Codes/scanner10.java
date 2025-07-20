import java.util.Scanner;
import java.io.*;
class scanner10
{   
    public static void main(String[] args) throws IOException
    {
        Scanner scanner = new Scanner(new File("rooney.txt"));
           while (scanner.hasNext())
             {
            System.out.println(scanner.next());
    }
}
    }