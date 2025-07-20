public class qr1
{
    public void Test(double a, double b, double c)
    {
         double d, root1, root2;
         if (a==0)
            System.out.println("Value of a should not be zero. Aborting!!");
         else
         {
             d = b*b - 4*a*c;
             if (d>0)
             { 
                 root1 = (-b + Math.sqrt(d))/(2*a);
                 root2 = (-b - Math.sqrt(d))/(2*a);
                 System.out.println("Roots are real and unequal.");
                 System.out.println("Root1 : "+root1+" Root2 : "+root2);
              }
             else
                 System.out.println("Roots are complex and imaginary.");
          }
      }
}
