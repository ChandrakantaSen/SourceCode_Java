package Pattern;

import java.util.*;
class pattern_2_CBS
{
    public static void main()
    {
        int width=7;
        int p_space=width/2;
        int p_height=width-p_space;
        int i,j,k;
        
        for(i=p_height-1;i>=0;i--)
        {
            for(j=p_space;j>=i;j--)
            {
                System.out.print(" ");
            }
            for(k=1;k<=width;k++)
            {
                System.out.print((char)(i+65));
            }
            width-=2;
            System.out.println();
        }
    }
}
