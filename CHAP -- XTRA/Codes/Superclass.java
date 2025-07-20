public class Superclass
{
private int iamprivate = 10;
    protected int iamprotected = 20;
    public int iampublic = 30;
  private void privateMethod()
    {
        System.out.println("I am private method in super class ");
    }
    protected void protectedMethod()
    {
        System.out.println("I am protected method in super class ");
    }
    public void publicMethod()
    {
        System.out.println("I am public method in super class ");
    }
}