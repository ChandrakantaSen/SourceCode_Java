package Modifiers;

class A
{  
    protected void msg()
    {
        System.out.println("Hello");
    }  
}  

public class protctd_aces_modfr 
{  
    public static void main(String args[])
    {  
        A obj = new A();  
        obj.msg();  
    }  
}  