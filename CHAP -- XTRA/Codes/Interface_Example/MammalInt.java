/* File Name: MammalInt.java */
public class MammalInt implements Animal,Bird{

   public void eat(){
      System.out.println("Mammal eats");
   }

   public void travel(){
      System.out.println("Mammal travels");
   } 

   public int noOfLegs(){
      return 0;
   }

   public void fly(){
      System.out.println("Mammal can fly");
   }

   public static void main(String args[]){
      MammalInt m = new MammalInt();
      m.eat();
      m.travel();
      m.fly();
   }
} 