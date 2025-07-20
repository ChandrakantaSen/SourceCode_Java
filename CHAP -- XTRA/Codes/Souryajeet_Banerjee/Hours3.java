    import java.io.*;
    import java.util.*;

    public class Hours3 
    {
        public static final int DAYS = 7;
        public static void main(String[] args)throws FileNotFoundException 
        {
            Scanner input = new Scanner(new File("hours.txt"));
            processFile(input);
        }
        public static void processFile(Scanner input) 
        {
            int[] total = new int[DAYS];
            while (input.hasNextLine())
            {
                String text = input.nextLine();
                int[] next = transferFrom(text);
                System.out.println("Total hours = " + sum(next));
                addTo(total, next);
            }
            System.out.println();
            print(total);
        }
        public static int[] transferFrom(String text) 
        {
            Scanner data = new Scanner(text);
            int[] result = new int[DAYS];
            int i = 0;
            while (data.hasNextInt())   
            {
                result[i] = data.nextInt();
                i++;
            }
            return result;
        }
        public static int sum(int[] numbers)
        {
            int sum = 0;
            for (int n : numbers)
            {
                sum += n;
            }
            return sum;
        }
        public static void addTo(int[] total, int[] next) 
        {
            for (int i = 0; i < DAYS; i++)
            {
                total[i] += next[i];
            }
        }
        public static void print(int[] total)
        {
            String[] dayNames = {"Mon", "Tue", "Wed", "Thu","Fri", "Sat", "Sun"};
            for (int i = 0; i < DAYS; i++)
            {
                System.out.println(dayNames[i] + " hours = " + total[i]);
            }
            System.out.println("Total hours = " + sum(total));
        }
    }