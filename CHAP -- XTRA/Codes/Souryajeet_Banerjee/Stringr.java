import java.io.*;
class Stringr
{
    public static void main(String args[])
    {
        StringBuffer str = new StringBuffer("Rohan Saha");
        System.out.println("Name : " + str);
        str.append(" is now Rohan Chatterjee. ");
        System.out.println("Modified Name : " + str);
    }
}