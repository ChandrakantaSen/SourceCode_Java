package Modifiers;

class A
{  
    void msg()
    {
        System.out.println("Hello");
    }  
}  

public class deflt_aces_modfr
{  
    public static void main(String args[])
    {  
        A obj = new A();//Compile Time Error  
        obj.msg();//Compile Time Error  
    }  
}  