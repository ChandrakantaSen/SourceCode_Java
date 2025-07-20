import java.util.Scanner;
import java.io.*;
class scanner2
{   
    public static void main(String[] args) throws IOException
    {
        Scanner scanner = new Scanner(new File("rooney.txt"));
        
        while (scanner.hasNextLine())
            System.out.println(scanner.nextLine());
    }
}