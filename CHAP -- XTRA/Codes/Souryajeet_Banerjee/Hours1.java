import java.io.*;
    import java.util.*;
    public class Hours1
    {
        public static void main(String[] args)throws FileNotFoundException
        {
            Scanner input = new Scanner(new File("hours.txt"));
            processFile(input);
        }
        public static void processFile(Scanner input)
        {
            while (input.hasNextLine()) 
            {
                String text = input.nextLine();
                int[] next = transferFrom(text);
                System.out.println(Arrays.toString(next));
            }
        }
        public static int[] transferFrom(String text)
        {
            Scanner data = new Scanner(text);
            int[] result = new int[7];
            int i = 0;
            while (data.hasNextInt()) 
            {
                result[i] = data.nextInt();
                i++;
            }
            return result;
        }
    }