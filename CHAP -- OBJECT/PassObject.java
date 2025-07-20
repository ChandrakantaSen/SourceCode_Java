 class letter {
    char c;
 }

 public class PassObject {
      static void f(letter y) {
           y.c='z';
      }
      public static void main(String [] args) {
           letter x = new letter();
           x.c='a';
           
           System.out.println("1:\tx.c:\t"+x.c);
           System.out.println("2:\tx.c:\t"+x.c);
      }
 }