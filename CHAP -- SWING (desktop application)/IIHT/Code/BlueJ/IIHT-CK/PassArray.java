public class PassArray
{
  public static void display(int y[])
  {
    System.out.println(y[0]);                  // prints 10
    y[0] = 100;
  }
  
  public static void main(String args[])
  {
    int x[] = { 10, 20, 30 };
    System.out.println(x[0]);                  // prints 10

    display(x);
    System.out.println(x[0]);                  // prints 100
  }
}