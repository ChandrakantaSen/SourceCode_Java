/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
 

/**
 *
 * @author Fritz
 */
public class constructor_exp {

      int  value1;
 
      int  value2;
 
      constructor_exp(){
 
         value1 = 10;
 
         value2 = 20;
 
         System.out.println("Inside Constructor");
 
     }
 
     public void display(){
 
        System.out.println("Value1 === "+value1);
 
        System.out.println("Value2 === "+value2);
 
    }
 
   public static void main(String args[]){
 
       constructor_exp d1 = new constructor_exp();
 
      d1.display();
 
  }
 
}
    
}
