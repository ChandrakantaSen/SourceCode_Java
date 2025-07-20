class GFG 
{
    static boolean iskaprekar(int n)
    {
        if (n == 1)
           return true;
      
        int sq_n = n * n;
        int count = 0;
        while (sq_n != 0)
        {
            count++;
            sq_n /= 10;
        }
      
        sq_n = n*n;      

        for (int i=1; i<count; i++)
        {
             int eq_parts = (int) Math.pow(10, i);
      
             // To avoid numbers like 10, 100, 1000 (These are not
             // Karprekar numbers
             if (eq_parts == n)
                continue;
      
             // Find sum of current parts and compare with n
             int sum = sq_n/eq_parts + sq_n % eq_parts;
             if (sum == n)
               return true;
        }
      
        // compare with original number
        return false;
    }
     
    // Driver method
    public static void main (String[] args)
    {
        System.out.println("Printing first few Kaprekar Numbers" + " using iskaprekar()");
         
        for (int i=1; i<10000; i++)
            if (iskaprekar(i))
                 System.out.print(i + " ");
    }
}