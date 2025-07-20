public class char_function3
{
    void main(char c)
    {
        if(Character.isLowerCase(c)==true)
        {
            System.out.println("Before case convert "+c);
            c = Character.toUpperCase(c);
            System.out.println("After case convert "+c);
        }
        else
        {
            System.out.println("Before case convert "+c);
            c = Character.toLowerCase(c);
            System.out.println("After case convert "+c);
        }
    }
}
