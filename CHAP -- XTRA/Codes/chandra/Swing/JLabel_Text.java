package Swing;
/*
Create JLabel With Text Example
This java example shows how to create a label with text using
Java Swing JLabel class.
 */

import javax.swing.JApplet;
import javax.swing.JLabel;

/*
<applet code="JLabelWithTextExample" width=200 height=200>
</applet>
 */

class JLabel_Text extends JApplet
{
    public void init()
    {
        /*
         * To create JLabel use
         * JLabel(String caption) constructor
         * of JLabel class.
         */
        JLabel label1 = new JLabel("This is JLabel Example.");

        //add label to applet
        add(label1);
    }
}
