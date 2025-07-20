class Number
{
    public static void main(int a,int b,int c)
    {
      int Max =0;
      if(a>b)
        {
            if(a>c)
            {
               Max = a;
                
            }
            else
            {
                Max = b;
            }
        }
        else{
            if(b>c)
            {
                Max = b;
            }
            else
            {
                Max = c;
            }
        }
        System.out.println("Max "+ Max);
    }
}
           
             