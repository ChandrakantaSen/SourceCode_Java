import java.io.*;
import java.util.*;
public class Tally2
{
    public static void main(String[] args)throws FileNotFoundException 
    {
        Scanner input = new Scanner(new File("tally.dat"));
        int[] count = readData(input);
        reportResults(count);
    }
    public static int[] readData(Scanner input) 
    {
        int[] count = new int[5];
        while (input.hasNextInt()) 
        {
            int next = input.nextInt();
            count[next]++;
        }
        return count;
    }
    public static void reportResults(int[] count) 
    {
        System.out.println("Value\tOccurrences");
        for (int i = 0; i < count.length; i++) 
        {
            System.out.println(i + "\t" + count[i]);
        }
    }
}