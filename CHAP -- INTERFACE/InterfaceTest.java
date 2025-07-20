 /* Programming on Java_Interface...*/
 
 interface Area {                         //Interface defined
      final static float pi = 3.14F;   
      float compute(float x, float y);
 }
 
 class Rectangle implements Area {          //Interface Implemented 
      public float compute(float x, float y){
           return(x*y);
      }
 }
 
 class Circle implements Area {               //Another Interface Implemented
      public float compute(float x,float y){
           return(pi*x*x);
      }
 }
 
 class InterfaceTest {
      public static void main(String[]args){
            Rectangle rect = new Rectangle();
            Circle cir = new Circle();
            Area area;                         //Interface Object
         
            area = rect;
            System.out.println("Area of Rectngle:\t" +area.compute(10,20));
            
            area = cir;
            System.out.println("Area of Rectngle:\t" +area.compute(10,20));
      }
 }
