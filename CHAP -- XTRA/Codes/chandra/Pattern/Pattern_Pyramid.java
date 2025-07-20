package Pattern;
class Pattern_Pyramid
{ 
    public static void main()
    {
        int z = 1,c = 0;
        for(int i = 1;i <= 3;i++)
        { 
            for(int j = 2;j >= i;j--)
            { 
                System.out.print(" ");
            }//End of j loop
            for(int k = 1;k <= z;k++)
            {
                System.out.print("*");
                for(int l = k;l <= c;l++)
                {
                    System.out.print("*");
                }//End of l loop              
            }//End of k loop
            System.out.println();
            z++;
            c++;
        }//End of i loop
    }//End of main()
}//End of class