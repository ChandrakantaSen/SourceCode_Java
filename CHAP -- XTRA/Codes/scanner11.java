import java.util.Scanner;
import java.io.*;
class scanner11
{   
    public static void main(String[] args) throws IOException
    {
        Scanner scanner = new Scanner(new File("bhuto.txt"));
           while (scanner.hasNextLine())
             {
            System.out.println(scanner.nextLine());
    }
}
    }