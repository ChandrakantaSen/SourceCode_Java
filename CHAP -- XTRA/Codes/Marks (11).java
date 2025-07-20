class Marks
{
    public static void main(int n )
    {
        if(n>=80)
        {
            System.out.println("distinction");
        }
        else if((n>=60)&&(n<80))
        {
            System.out.println("first division");
        }
        else if((n>=45)&&(n<60))
        {
            System.out.println("second division");
        }
        else if((n>=40)&&(n<45))
        {
            System.out.println("pass");
        }
        else
        {
            System.out.println("promotion not granted ");
        }
    }
}

     