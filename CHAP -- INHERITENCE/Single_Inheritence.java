/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
 

/**
 *
 * @author Fritz
 */
class Room {
    int length;
    int breadth;
    Room(int x,int y) {
        length=x;
        breadth=y;
    }
    int area() {
        int area;
        area=(length*breadth);
        return(area);
    }
}
class Bedroom extends Room {
    int height;
    Bedroom(int x,int y,int z) {
        super(x,y);
        height=z;
    }
    int volume() {
        return(length*breadth*height);
    }
}
public class Single_Inheritence {
 public static void main(String args[]) {
     Bedroom room1=new Bedroom(14,12,10);
     int area1=room1.area();
     int volume1=room1.volume();
     
     System.out.println("Area1:\t"+area1);
     System.out.println("Volume1:\t"+volume1);
 }   
}
