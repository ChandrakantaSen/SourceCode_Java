import java.awt.Graphics;
import java.lang.Math;
import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;

/*   <applet code=popup.class width=600 height=600>
      </applet>*/

   public class popup extends Applet implements ActionListener,
                                              MouseListener,
                                              MouseMotionListener
       {
          PopupMenu popup;
          MenuItem fline,sline,rect,cir;
          Point dot[]=new Point[1000];
          Point start,end;
          int dots=0;
          boolean mouseUp=false;
          boolean draw=false;
          boolean line=false;
          boolean rectangle=false;
          boolean circle=false;
             public void init()
                 {
                    popup=new PopupMenu("Menu");
                    fline=new MenuItem("Free hand line");
                    fline.addActionListener(this);
                    sline=new MenuItem("Straight line");
                    sline.addActionListener(this);
                    rect=new MenuItem("Rectangle");
                    rect.addActionListener(this);
                    cir=new MenuItem("Circle");
                    cir.addActionListener(this);
                    popup.add(fline);
                    popup.addSeparator();
                    popup.add(sline);
                    popup.addSeparator();
                    popup.add(rect);
                    popup.addSeparator();
                    popup.add(cir);
                    popup.addSeparator();
                    add(popup);
                    addMouseListener(this);
                    addMouseMotionListener(this);
                 }
               }
                public void mousePressed(MouseEvent e)
                    {
                      mouseUp=false;
                      start=new Point(e.getx(),e.gety());
                      if(e.getModifiers()!=0)
                             {
                             popup.show(this,e.getx(),e.gety());
                             }
                       }
                 public void mouseReleased(MouseEvent e)
                     {
                        if(line)
                          {
                             end=new Point(e.getx(),e.gety());                               
                          }
                         else
                           {
                              end=new Point(Math.max(e.getx(),start.x),Math.max(e.gety(),start.y));
                              start= new Point(Math.max(e.getx(),start.x),Math.max(e.gety(),start.y));
                           }
                  mouseUp=true;
                  repaint();
                     }
                   public void mouseClicked(MouseEvent e)
                        {                           
                        }
                    public void mouseEntered(MouseEvent e)
                        {
                        }
                    public void mouseExited(MouseEvent e)
                        {
                        }
                    public void mouseMoved(MouseEvent e)
                        {
                        }
                    public void Paint(Graphics g)
                        {
                          if(mouseUp)
                              {
                                 int width=end.x-start.x;
                                 int height=end.y-start.y;
                                    if(line)
                                       {
                                         g.drawLine(start.x,start.y,end.x,end.y);
                                       }
                                     if(draw)
                                        {
                                          g.drawLine(start.x,start.y,end.x,end.y); 
                                        }
                                      else if(line)
                                         {
                                          g.drawLine(10,10,50,50);
                                         }
                                       else if(rectangle)
                                          {
                                          g.drawRect(start.x,start.y,width,height); 
                                          }
                                        else if(circle)
                                           {
                                           g.drawOval(120,60,50,50);
                                           }
                              }
                        }
                        public void actionPerformed(ActionEvent event)
                            {
                              if(event.getSource()==fline)
                                   draw=true;
                              else if(event.getSource()==sline)
                                   line=true;
                              else if(event.getSource()==rect)
                                   rectangle=true;
                              else if(event.getSource()==cir)
                                   circle=true;
                           }
                                 void setFlagsFalse()
                                    {
                                       draw=false;
                                       line=false;
                                       rectangle=false;
                                       circle=false;                                       
                                    }                          
                        }
                     }
