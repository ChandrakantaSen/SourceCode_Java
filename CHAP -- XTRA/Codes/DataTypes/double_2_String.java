package DataTypes;

class double_2_String
{
    public static void main(String args[])
    {

        //int variable
        double i = 251.02565;

        /*
         * To convert int to String, use
         * toString(int i)
         * method of Integer wrapper class.
         */
        String str = Double.toString(i);

        System.out.println("double to String : " + i);
    }
}