package All;

class char_function1
{
    public static void main(char p)
    {
        
        if(Character.isLetter(p)==true)
        {
            System.out.println(p+" is a letter");
        }
        else if(Character.isDigit(p)==true)
        {
            System.out.println(p+" is a digit");
        }
        else if(Character.isLetterOrDigit(p)==true)
        {
            System.out.println(p+" is a digit");
        }
        else
        {
            System.out.println("something else...!");
        }
    }
}