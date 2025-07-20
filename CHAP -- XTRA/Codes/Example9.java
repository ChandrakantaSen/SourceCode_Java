//A Java Program to illustrate interfaces and its implementation
interface Example
{
//abstract public void method1();
//abstract public void method2();
    }
   
class ExampleClass implements Example
    {
        int aa;
        int bb;
        public void exampleMethod1()
        {
            System.out.println("Hello World");
        }
        public void exampleMethod2()
        {
            System.out.println("Hello LMiit");
        }
        public void Method1()
        {
            System.out.println("Hi World");
        }
        public void Method2()
        {
            System.out.println("Hi LMiit");
        }
    }
        public class Example9
        {
                public static void main(String args[])
                {
                    ExampleClass ec=new ExampleClass();
                    ec.exampleMethod1();
                    ec.exampleMethod1();
                    ec.Method1();
                    ec.Method1();
                }
            }