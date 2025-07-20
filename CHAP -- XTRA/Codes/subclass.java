public class subclass extends Superclass
{
    public void accessTest()
    {
        //System.out.println(iamprivate);
        System.out.println(iamprotected);
        System.out.println(iampublic);
        //privateMethod();
        protectedMethod();
        publicMethod();
    }
    public void Method()
    {
        System.out.println("I am public method in the class subclass ");
    }
}

    
    
