public class Static_Method_Example {
      public static void main (String [ ] args) {
            int result =MathUtility.add(1, 2);
            System.out.println ("(1+2) is : "+result);
      }
}

class MathUtility {
      public static int add ( int first, int second ) {
            return first +second;
      }
}