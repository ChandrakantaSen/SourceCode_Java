package All;

import java.lang.*;

public class CharacterDemo {

   public static void main(String[] args) {

      // create 2 char primitives ch1, ch2
      char ch1, ch2;

      // assign values to ch1, ch2
      ch1 = 'V';
      ch2 = 115;

      // create 2 String objects s1, s2
      String s1, s2;

      // assign String values of ch1, ch2 to s1, s2
      s1 = Character.toString(ch1);
      s2 = Character.toString(ch2);

      String str1 = "String value of " + ch1 + " is " + s1;
      String str2 = "String value of " + ch2 + " is " + s2;

      // print s1, s2 values
      System.out.println( str1 );
      System.out.println( str2 );
   }
}