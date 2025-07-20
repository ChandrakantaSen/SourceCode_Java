//The java program in which exception is handled in the method in which  it occured
public class example80
{
public static void main(String argv[])
{
System.out.println("Inside main().calling method1()");
method1();
System.out.println("End of the program");
    }
public static void method1()
{
System.out.println("Inside method1().calling method2()");
method2();
System.out.println("Returning from method1()");
    }
public static void method2()
{
System.out.println("Inside method2().calling method3()");
method3();
System.out.println("Returning from method3()");
    }
public static void method3()
{    
System.out.println("Inside method3().executing method3()");
int i=1,j=0,k;
try
{
k=i/j;
    }catch(ArithmeticException ae)
    {
    System.out.println("Division by zero,illegal operation");
}
System.out.println("Returning from method3()");
    }
}