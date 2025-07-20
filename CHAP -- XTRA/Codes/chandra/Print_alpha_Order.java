class Print_alpha_Order
{
    public static void main(String str)
    {
        int i,j,len;
        char b;
        
        len = str.length();
        
        for(i=65;i<=90;i++)
        {
            for(j=0;j<len;j++)
            {
                b = str.charAt(j);
                
                if((b == (char)i)||(b == (i+32)))
                {
                    System.out.print(" "+b);
                }
            }
        }
    }
}