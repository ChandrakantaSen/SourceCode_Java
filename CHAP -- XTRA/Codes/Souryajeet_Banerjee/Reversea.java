class  Reversea
    {
        public static String reverseString(String str)
        {
            int s=str.length();
            String backward="";
            for (int i=s-1; i>=0;)
            {
                backward= backward + i;
            }
            return backward;
        }
        public static void main(String args[])
        {
            String backwards = reverseString ("Allen Downey");
            System.out.println(backwards);
        }
    }