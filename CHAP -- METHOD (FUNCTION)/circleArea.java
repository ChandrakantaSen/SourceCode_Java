/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
 

/**
 * @author Fritz
 */
class circle {
    private float radius;
    
    circle(float x) {       //creating constructor 
        radius = x;
    }
    public double area1() {
        
        double area =(3.14*(radius*radius));
        return area;
    }
}

public class circleArea {
    
    public static void main(String args[]) {
        double AREA;
        //object creation
        circle c = new circle(4);
        AREA = c.area1();
        System.out.println ("Required_Area:" +AREA);
        
    }
}