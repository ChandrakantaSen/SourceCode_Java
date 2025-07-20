public class pat
    {
        public static void main(String args[])
        {
            int k=1,i;
            while(k<=9)
            {
                for(i=k;i>=1;i-=2)
                {
                    System.out.print(i);
                }
                System.out.println();
                k=k+2;
            }
        }
    }
    