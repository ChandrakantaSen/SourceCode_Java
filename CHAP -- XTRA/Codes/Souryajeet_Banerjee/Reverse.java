public class  Reverse
{
    public static String reverseString(String s)
    {
        int l=s.length();
        String backward= " ";
        for (int i=l-1; i>=0; i--)
        {
            backward= backward + s.charAt(i);
        }
        return backward;
        
    }

    public static void main(String args[])
    {
        String backwards = reverseString ("PQRS");
        System.out.println (backwards);
    }
}