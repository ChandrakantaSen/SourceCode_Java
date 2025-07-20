package Modifiers;

class A
{  
    private int data=40;  //private variable 
    private A()           //private constructor 
    {
    }
    private void msg()    //private method 
    {   System.out.println("Hello java");
    }  
}  
  
public class privt_aces_modfr
{  
    public static void main(String args[])
    {  
        A obj=new A();  
        System.out.println(obj.data);//Compile Time Error  
        obj.msg();//Compile Time Error  
   }  
}  