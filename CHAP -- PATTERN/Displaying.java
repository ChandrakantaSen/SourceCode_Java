/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
 

/**
 *
 * @author Fritz
 */
public class Displaying {
    
    public static void main(String args[]) {
        
        System.out.println("Screen Display");
        
        for(int i=1;i<=10;i++) {
            
            for(int j=1;j<=i;j++) {
                
                System.out.print(" ");
                System.out.print(i);
            }
               System.out.print("\n"); 
        }
            System.out.println("Screen Display Done...");
    }
}
