/*
 * String Pattern - XII
 	EDCBA
	DCBA
	CBA
	BA
	A
 */
 
public class Code28 
{
    public static void main(String[] args) 
    {
        String str = "ABCDE";
        char[] chr = str.toCharArray();
        for (int i = chr.length-1; i >= 0; i--) 
        {
            for (int k = i; k >= 0; k--) 
            {
                System.out.print(chr[k]);
            }
            System.out.println();
        }
    }
}