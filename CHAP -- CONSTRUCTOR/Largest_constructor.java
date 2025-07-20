/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
 

/**
 *
 * @author Fritz
*/

public class Largest_constructor {
    public static void main(String args[]) {
        
        Largest obj=new Largest(50,40);
        obj.display();
    }
}

class Largest {
 
    int m,n;
    
    Largest(int x, int y) {
        m=x;
        n=y;
    }
    
    int large() {
        if(m>n) return m;
        else return n;
    }
    
    void display() {
        
        int big;
        big=large();
        System.out.println("Largest Value:" +big);
    }
}
