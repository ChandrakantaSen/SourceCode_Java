package Pattern;
class PatternDescendingStars
{ 
    public static void main()
    { 
        int z = 1;
        for(int i = 1;i <= 5;i++)
        { 
            for(int j = 2;j <= i;j++)
            {
                System.out.print(" ");
            }//End of j loop
            for(int k = 5;k >= z;k--)
            { 
                System.out.print("*");
            }//End of k loop
            System.out.println();
            z++;
        }//End of i loop
    }//End of main()
}//End of class
