import java.awt.*;
import java.awt.event.*;
public class  FrameHide{
	public static void main(String[] args){
		Frame fa= new Frame("Frame Hiding");
		Panel p =new Panel();
		Label l1=new Label("Welcome roseindia");
		p.add(l1);
		fa.add(p);
		fa.setSize(300,200);
		fa.setVisible(true);
		fa.addWindowListener(new WindowAdapter(){
		public void windowClosing(WindowEvent e){
			Frame frame = (Frame)e.getSource();
			frame.setVisible(false);
		   }
		});
	 }  
}
