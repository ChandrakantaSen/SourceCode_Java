import java.io.*;

class MenuCard
{
    public static void main(String args[])throws IOException
    {
        String f1,f2,f3,b1,b2;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the main course food items");
        f1 = br.readLine();
        f2 = br.readLine();
        f3 = br.readLine();
        System.out.println("Enter the beverages food items");
        b1 = br.readLine();
        b2 = br.readLine();

        System.out.println();
        System.out.println("--- Breakfast MenuCard ---");
        System.out.println("Main Course");
        System.out.println("-----------");
        System.out.println("1. " + f1);
        System.out.println("2. " + f2);
        System.out.println("3. " + f3);
        System.out.println("Beverages");
        System.out.println("---------");
        System.out.println("4. " + b1);
        System.out.println("5. " + b2);
    }
}