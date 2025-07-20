import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import java.lang.String.*;
import java.applet.Applet;
/*
<applet code=twentytwoone.class width=900 height=900>
</applet>
*/
  class twentytwoone extends Applet
    {
        TextField t1;
        Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,cb1,cb2,cb3,cb4,cb5,cb6;
        int a=0,b=0,c=0,n=0;
        Panel p1,p2,p3,p4,p5,p6,p7,p8,p9,p10;
         CardLayout car;
          public void init()
             {    
               car=new CardLayout();
               p1=new Panel();
               p2=new Panel();
               p3=new Panel();
               p4=new Panel();
               p5=new Panel();
               p6=new Panel();
               p7=new Panel();
               p8=new Panel();
               p9=new Panel();
               p1.setLayout(car);
               p2.setLayout(car);
               p3.setLayout(new FlowLayout());
               p4.setLayout(new FlowLayout());
               p5.setLayout(new FlowLayout());
               p6.setLayout(new FlowLayout());
               p7.setLayout(new FlowLayout());
               p8.setLayout(new FlowLayout());
               p9.setLayout(new FlowLayout());
               p10.setLayout(new FlowLayout());
               t1=new TextField(20);
               b1=new Button("1");
               b2=new Button("2");
               b3=new Button("3");
               b4=new Button("4");
               b5=new Button("5");
               b6=new Button("6");
               b7=new Button("7");
               b8=new Button("8");
               b9=new Button("9");
               b10=new Button("0");
               b1=new Button("1");
               cb1=new Button("+");
               cb2=new Button("-");
               cb3=new Button("*");
               cb4=new Button("/");
               cb5=new Button("=");
               cb6=new Button("OFF");
               p5.add(t1);
               p5.add(p1,"1");
               p5.add(p2,"2");
               p5.add(p3,"3");
               p5.add(p4,"4");
               p5.add(p5,"5");
               p5.add(p6,"6");
               p5.add(p7,"7");
               p5.add(p8,"8");
               p5.add(p9,"9");
               p5.add(p10,"0");
               p5.add()
               b1.addActionListener(this);
               b2.addActionListener(this);
               b3.addActionListener(this);
               b4.addActionListener(this);
               b5.addActionListener(this);
               b6.addActionListener(this);
               b7.addActionListener(this);
               b8.addActionListener(this);
               b9.addActionListener(this);
               b10.addActionListener(this);
               cb1.addActionListener(this);
               cb2.addActionListener(this);
               cb3.addActionListener(this);
               cb4.addActionListener(this);
               cb5.addActionListener(this);
               cb6.addActionListener(this);
        public void actiocPerformed(ActionEvent e)
        {
        if(e.getSource()==b1)
        {
        a=a*10+1;
        t1.setText(String.valueOf(a));
         }
        if(e.getSource()==b2)
        {
        a=a*10+2;
        t1.setText(String.valueOf(a));
         }
        if(e.getSource()==b3)
        {
        a=a*10+3;
        t1.setText(String.valueOf(a));
         }
        if(e.getSource()==b4)
        {
        a=a*10+4;
        t1.setText(String.valueOf(a));
         }
        if(e.getSource()==b5)
        {
        a=a*10+5;
        t1.setText(String.valueOf(a));
         }
        if(e.getSource()==b6)
        {
        a=a*10+6;
        t1.setText(String.valueOf(a));
         }
        if(e.getSource()==b7)
        {
        a=a*10+7;
        t1.setText(String.valueOf(a));
         }
        if(e.getSource()==b8)
        {
        a=a*10+8;
        t1.setText(String.valueOf(a));
         }
        if(e.getSource()==b9)
        {
        a=a*10+9;
        t1.setText(String.valueOf(a));
         }
        if(e.getSource()==b10)
        {
        a=a*10+0;
        t1.setText(String.valueOf(a));
         }
         if(e.getSource()==cb1)
         {
         b=a;
         a=0;
         c=1;
         }
         if(e.getSource()==cb2)
         {
         b=a;
         a=0;
         c=2;
         }
         if(e.getSource()==cb3)
         {
         b=a;
         a=0;
         c=3;
         }
         if(e.getSource()==cb4)
         {
         b=a;
         a=0;
         c=4;
         }
         if(e.getSource()==cb5)
         {
            if(c==1)
            {
            n=b+a;
            a=n;
            t1.setText(String.valueOf(n));
            }
           if(c==2)
            {
            n=b-a;
            a=n;
            t1.setText(String.valueOf(n));
            }
          if(c==3)
            {
            n=b*a;
            a=n;
            t1.setText(String.valueOf(n));
            }
            if(c==4)
            {
            n=b/a;
            a=n;
            t1.setText(String.valueOf(n));
            }
            }
         if(e.getSource()==cb6)
         {
         t1.setText(" ");
         }
         }
  public static void main(String arg[])
     {
     twentytwoone a1=new twentytwoone();
     a1.setSize(500,700);
     a1.show();
     }
     }













        }
               }
    }
