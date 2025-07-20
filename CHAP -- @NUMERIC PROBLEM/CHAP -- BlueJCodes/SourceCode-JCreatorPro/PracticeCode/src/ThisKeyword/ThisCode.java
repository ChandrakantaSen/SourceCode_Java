/* this: to refer current class instance variable */
import java.util.*;

class Demo1
{
    int age;
    String name;

    public Demo1(int age, String name)
    {
        this.age = age;
        this.name = name;
    }

    void Show()
    {
        System.out.println();
        System.out.println("Your age is: " + Integer.toString(age));
        System.out.println("Your name is: " + name);
    }
}

class ThisCode
{
    public static void main(String[] args)
    {
        int _age;
        String _name;

		Scanner in = new Scanner(System.in);
        System.out.println("Enter your age: ");
        _age = in.nextInt();

        System.out.println("Enter your name: ");
        _name = in.next();

        Demo1 obj = new Demo1(_age, _name);

        obj.Show();
        System.out.println();
        System.out.println("Please any key to continue...!");
    }
}