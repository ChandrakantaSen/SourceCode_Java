/* Printing Triangular number for a range of numbers in Java */

class Triangular_Nqumber
{
    public static void main(String[] args) 
    {
        int b = 10;
        System.out.println("List of Triangular Numbers ");
        for (int i = 1; i <= b; i++) 
        {
            int sum = 0;
            for (int j = 1; j <= i; j++) 
            {
                sum = sum + j;
            }
            System.out.println(i + " = " + sum);
        }
    }
}