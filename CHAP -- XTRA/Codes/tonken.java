import java.util.StringTokenizer;
import java.util.*;
public class tonken
{
    public static void main()
    {
        Scanner sc =new Scanner(System.in);
        String s;
        System.out.println("Enter the String ");
        s=sc.next();

        StringTokenizer st =new StringTokenizer (s, " ");

        while (st.hasMoreTokens())
        {
            System.out.println(st.nextToken());
        }
    }
}
