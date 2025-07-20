package All;

    import javax.swing.JOptionPane;     
      
    class Demo     
    {     
        public static void main(String[] args)     
        {     
            String g = JOptionPane.showInputDialog("Enter a character");     
            if (g == null)  
            {  
                System.out.println("Cancel was pressed");     
            }  
            else if (g.length() == 0)  
            {  
                System.out.println("No input given");     
            }  
            else  
            {  
                char r = g.charAt(0);     
                System.out.println("The inserted character is: " + r);     
            }  
        }     
    }   