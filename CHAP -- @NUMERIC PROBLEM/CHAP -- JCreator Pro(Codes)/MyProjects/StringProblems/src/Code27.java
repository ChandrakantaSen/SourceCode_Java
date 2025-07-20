/*
 * String Pattern - XI
	A
	BA
	CBA
	DCBA
*/

public class Code27
{
    public static void main(String[] args) 
    {
        String str = "ABCD";
        char[] chr = str.toCharArray();
        for (int i = 0; i < chr.length; i++) 
        {
            for (int k = i; k >= 0; k--) 
            {
                System.out.print(chr[k]);
            }
            System.out.println();
        }
    }
}
 