import java.awt.*;
import java.awt.event.*;

public class AwtItemEvent extends Frame{
	TextArea txtArea;
	public AwtItemEvent(String title){
		super(title);
		txtArea = new TextArea();
		add(txtArea, BorderLayout.CENTER);
		Choice choice = new Choice();
		choice.addItem("red");
		choice.addItem("green");
		choice.addItem("blue");
		choice.addItemListener(new ItemListener(){
			public void itemStateChanged(ItemEvent e){
				txtArea.setText("This is the " + e.getItem() + " color.\n");
			}
		});
		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		});
		add(choice, BorderLayout.NORTH);
		setSize(400,400);
		setVisible(true);
		setResizable(false);
	}
	
	public static void main(String[] args){
		AwtItemEvent f = new AwtItemEvent("AWT Demo");
	}
}