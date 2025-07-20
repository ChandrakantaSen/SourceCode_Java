import java.applet.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;
class WaterTap extends Frame implements MouseListener,Runnable
{
	String msg="Open";
	String msg1="Don't  Waste  Water!";
	String msg2="By";
	String msg3="Navas  Kurian";
	int ix=1,ix1=1,il=350,ir=350;
	int iy=1,iy1=462;
	Thread t=null;
	Thread t1=null;
	int x=51,y=220,limit=220;
	int i,wi=2,iu=311;
	public static void main(String args[])
	{
		new WaterTap();
	}

	WaterTap()
	{
		addWindowListener(new MyWinAdapter());
		setBackground(Color.gray);
		setUndecorated(false);
		setSize(new Dimension(1024,768));
		setVisible(true);
		addMouseListener(this);
		t=new Thread(this);
		t.start();
		repaint();
	}
	public void run()
	{
			while(true)
			{
				try{
				t.sleep(20);
				repaint(1,150,400,600);		//This particular area only painting
			}
			catch(Exception e){}
			}


	}
	public void stop()
	{
		try{
			t.wait();
			t=null;
		}
		catch(Exception e){}
	}

	public void paint(Graphics g)
	{
		g.setColor(Color.blue);
		if(ix<150)
		{
			g.fillRect(0,200,ix,20);		//Water comming into the pipe
			ix+=1;
		}
		else if(iy<=231)
		{
			g.drawString(msg,209,176);
			g.fillRect(0,200,ix,20);
			g.fillRect(232,240,4,iy);		//Water comming from the tap
			iy+=2;
		}
		else
		{
			g.fillRect(0,200,ix,20);
			g.fillRect(232,240,4,iy);
			if(iy1>=350)
			{
				g.fillRect(176,iy1,135,wi);	//Filling the water in the bucket
				iy1-=1;
				wi=wi+1;
			}
			else
			{

				g.fillRect(176,iy1,135,wi);
				if(il<=475||ir<=475)		//Overflow
				{
					g.drawLine(173,350,173,il);
					g.drawLine(172,350,173,il);
					g.drawLine(313,350,311,ir);
					g.drawLine(310,350,310,ir);
					g.drawLine(171,350,173,il);
					g.drawLine(314,350,312,ir);
					g.drawLine(314,350,313,ir);
					g.drawLine(170,350,173,il);
					g.drawLine(169,350,173,il);
					g.drawLine(316,350,314,ir);
					g.drawLine(310,350,310,ir);
					g.drawLine(311,350,311,ir);
					g.drawLine(312,350,312,ir);
					g.drawLine(313,350,313,ir);
					g.drawLine(314,350,314,ir);
					il+=1;
					ir+=4;
				}
				else
				{
					g.drawLine(173,350,173,il);
					g.drawLine(172,350,173,il);
					g.drawLine(313,350,311,ir);
					g.drawLine(310,350,310,ir);
					g.drawLine(171,350,173,il);
					g.drawLine(314,350,312,ir);
					g.drawLine(314,350,313,ir);
					g.drawLine(170,350,173,il);
					g.drawLine(169,350,173,il);
					g.drawLine(316,350,314,ir);
					g.drawLine(310,350,310,ir);
					g.drawLine(311,350,311,ir);
					g.drawLine(312,350,312,ir);
					g.drawLine(313,350,313,ir);
					g.drawLine(314,350,314,ir);
					g.setColor(Color.white);
					g.drawString(msg1,209,176);
					g.drawString(msg2,844,655);
					g.drawString(msg3,860,673);
					t.stop();
				}

			}

		}
		g.setColor(Color.white);
		g.drawLine(0,220,150,220);			//horizontal line of the pipe
		g.drawLine(0,200,150,200);			//"			"		"
		g.setColor(Color.black);
		g.fillRect(150,200,10,22);			//joint of the pipe

		g.drawLine(160,200,187,209);		//small line for joint
		g.drawLine(160,221,187,217);		//"			"

		g.drawLine(187,209,200,209);		//small straight line
		g.drawLine(187,217,200,217);		//small straight line
		g.drawLine(200,209,214,202);
		g.drawLine(200,217,214,224);

		g.drawLine(214,202,214,190);		//opener
		g.drawLine(218,202,218,190);
		g.drawLine(212,190,220,190);
		g.drawLine(214,224,228,217);
		g.drawLine(218,202,228,210);
		g.fillOval(228,205,15,25);
		g.drawLine(232,220,232,240);
		g.drawLine(236,220,236,240);

		g.setColor(Color.orange);			//floor
		g.fillRect(1,468,310,140);
		g.setColor(Color.black);
		g.drawLine(53,468,53,488);
		g.drawLine(83,468,83,488);
		g.drawLine(153,468,153,488);
		g.drawLine(193,468,193,488);
		g.drawLine(253,468,253,488);
		g.drawLine(1,488,310,488);			//straight line
		g.drawLine(69,488,69,509);
		g.drawLine(99,488,99,509);
		g.drawLine(129,488,129,509);
		g.drawLine(269,488,269,509);
		g.drawLine(1,508,310,508);			//straight line
		g.drawLine(1,528,310,528);			//straight line
		g.drawLine(1,548,310,548);			//straight line
		g.drawLine(1,568,310,568);			//straight line

		g.drawLine(53,508,53,528);
		g.drawLine(83,508,83,528);
		g.drawLine(153,508,153,528);
		g.drawLine(193,508,193,528);
		g.drawLine(253,508,253,528);

		g.drawLine(69,528,69,548);
		g.drawLine(99,528,99,548);
		g.drawLine(159,528,159,548);
		g.drawLine(279,528,279,548);

		g.drawLine(53,548,53,568);
		g.drawLine(83,548,83,568);
		g.drawLine(153,548,153,568);
		g.drawLine(193,548,193,568);
		g.drawLine(243,548,243,568);

		g.drawLine(79,568,79,608);
		g.drawLine(99,568,99,608);
		g.drawLine(159,568,159,608);
		g.drawLine(279,568,279,608);
		g.fillRect(1,609,310,200);
		g.fillRect(318,609,810,200);

		g.setColor(Color.red);
		g.fillRect(174,463,140,5);				//bucket
		g.drawLine(174,463,174,350);
		g.drawLine(312,463,312,350);
		g.drawString(msg2,844,655);
		g.drawString(msg3,860,673);

	}
	public void mouseMoved(MouseEvent me){}
	public void mouseClicked(MouseEvent e){}
	public void mouseEntered(MouseEvent e){}
	public void mouseExited(MouseEvent e){}
	public void mousePressed(MouseEvent e){}
	public void mouseReleased(MouseEvent e){}

}