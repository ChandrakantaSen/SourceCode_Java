package Pattern;
class Pattern_Descending_Letters
{ 
    public static void main()
    { 
        int z = 1;
        char a = 'A';  
        for(int i = 1;i <= 5;i++)
        { 
            for(int j = 2;j <= i;j++)
            {
                System.out.print(" ");
            }//End of j loop
            for(int k = 5;k >= z;k--)
            { 
                System.out.print(a);
                a++;  
            }//End of k loop
            System.out.println();
            z++;
            a = 'A';
        }//End of i loop
    }//End of main()
}//End of class