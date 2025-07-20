class Animal
 {
  int height=10;
  int weight=20;

 void talk()
  {
    System.out.println("Animal talking");
  }

  void food()
  {
    System.out.println("Animal Eating");

  }
 }

class Cat extends Animal                   
 {                                         
   void talk()                             
   {                                       
     System.out.println("meo... meo");   
   }                                        

   void food()
   {
     System.out.println("Drink Milk");
   }

 }


class functionOverride
{

  public static void main(String[] args)
  {
   Animal a = new Animal();
   Cat c = new Cat();

   /* c.height=20 */;

   c.talk();
   c.food();

   System.out.println("Height:\t"+c.height);

  }
}