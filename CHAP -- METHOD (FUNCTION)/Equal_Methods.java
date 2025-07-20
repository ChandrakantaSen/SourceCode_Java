/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
 
/**
 *
 * @author Fritz
 */
public class Equal_Methods {
    public static void main(String args[]) {
     value v1 = new value();   
     value v2 = new value();
     v1.i = v2.i = 100;
     System.out.println(v1.equals(v2));
    }
}
