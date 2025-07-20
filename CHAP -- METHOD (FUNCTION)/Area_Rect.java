/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
 

/**
 *
 * @author Fritz
 */
class square {
    
   int side;
  /* public void getData(int x) {
       
       side = x;
   }*/
   public int squarePerimeter() {
       
       int perimeter = 4*side;
       return(perimeter);
   } 
}

public class Area_Rect {
    public static void main(String[]args) {
    int perimeter1;
    
    square s1 = new square();
    
    //s1.getData(10);
    s1.side = 20;
    perimeter1 = s1.squarePerimeter();
    System.out.printf("Required Perimeter:\t%d\n", perimeter1);
    }
}