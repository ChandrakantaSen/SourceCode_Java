import java.awt.*;
import java.awt.event.*;

public class AwtEvent extends Frame implements ActionListener{
	Label lbl;
	public static void main(String argv[]){
		AwtEvent t = new AwtEvent();
	}
	
	public AwtEvent(){
		super("Event in Java awt");
		setLayout(new BorderLayout());
		try{
			Button button = new Button("INSERT_AN_URL_HERE");
			button.addActionListener(this);
			add(button, BorderLayout.NORTH);
			Button button1 = new Button("INSERT_A_FILENAME_HERE");
			button1.addActionListener(this);
			add(button1, BorderLayout.SOUTH);
			lbl = new Label("Roseindia.net");
			add(lbl, BorderLayout.CENTER);
			addWindowListener(new WindowAdapter(){
				public void windowClosing(WindowEvent we){
					System.exit(0);
				}
			});
		}
		catch (Exception e){}
		setSize(400,400);
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e){
		Button bt = (Button)e.getSource();
		String str = bt.getLabel();
		lbl.setText(str);
	}
}