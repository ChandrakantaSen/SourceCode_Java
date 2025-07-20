package Pattern;
import java.util.*;

class pattern_1_CBS
{
    public static void main()
    {
        int i,j;
        Scanner sc = new Scanner(System.in);
        
        for(i=5;i>=1;i--)
        {
            for(j=i;j>=1;j--)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
