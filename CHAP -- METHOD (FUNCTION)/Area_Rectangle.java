/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
 

/**
 *
 * @author Fritz
 */
public class Area_Rectangle {
    public static void main(String args[]) {
     
        int area1,area2;
        void getData(int x,int y) {
        length=x;
        width=y;
    }
    
    int Area_Rectangle () {
        int area;
        area=length*width;
        return(area);
    }
        Area_Rectangle rect1=new Area_Rectangle();
        Area_Rectangle rect2=new Area_Rectangle();
        
        rect1.length=15;
        rect1.width=10;
        
        area=rect1.length*rect1.weadth;
        rect2.getData(20,12);
        area2=rect2.rect_area();
        
        System.out.println("Area1:\t"+area1);
        System.out.println("Area2:\t"+area2);
    }
}

