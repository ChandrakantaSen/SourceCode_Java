package All;

import javax.swing.*;

import java.awt.*;

import java.awt.event.*;

import java.sql.*;

class help implements ActionListener

{

private JDialog dialog = new JDialog((Frame)null, "Help", true);

JLabel l1=new JLabel("COACH MAINTANANCE SYSTEM");

JLabel l2=new JLabel("Please Contact :- Sujeet Kumar Singh");

JLabel l3=new JLabel("Address             :-  C/O-R.C.Matho,Veer Sivajee path");

JLabel l4=new JLabel("North S.k.puri,dist-Patna");

JLabel l5=new JLabel("Bihar,   pin-800013");

JLabel l6=new JLabel("Contact no        :- 9308105802");

JLabel l7=new JLabel("Special Thanks For Mr. Rajesh Kumar");

JLabel l8=new JLabel("And Logic Solution");

JLabel image=new JLabel(new ImageIcon("logo2.gif"));

JButton b1=new JButton("Ok");

JPanel p=new JPanel();

help()

{

Container Pane=dialog.getContentPane();

dialog.setBounds(200,200,500,400);

p.setLayout(null);

l1.setBounds(50,30,475,30);

l1.setFont(new Font("",Font.BOLD,22));

l2.setBounds(100,75,300,30);

l2.setFont(new Font("",Font.BOLD,16));

l3.setBounds(100,100,400,30);

l3.setFont(new Font("",Font.BOLD,16));

l4.setBounds(230,125,300,30);

l4.setFont(new Font("",Font.BOLD,16));

l5.setBounds(230,150,300,30);

l5.setFont(new Font("",Font.BOLD,16));

l6.setBounds(100,180,300,30);

l6.setFont(new Font("",Font.BOLD,16));

l7.setBounds(95,275,400,25);

l7.setFont(new Font("",Font.BOLD,16));

l8.setBounds(175,300,400,25);

l8.setFont(new Font("",Font.BOLD,16));

image.setBounds(200,225,100,50);

b1.setBounds(210,325,80,30);

p.add(l1);p.add(l2);p.add(l3);p.add(l4);p.add(l5);

p.add(l6);p.add(l7);p.add(image);p.add(l8);p.add(b1);

b1.addActionListener(this);

Pane.add(p,"Center");

dialog.setVisible(true);

}

public void actionPerformed(ActionEvent e)

{

if(e.getSource()==b1)dialog.setVisible(false);

}

public static void main(String sr[])

{

new help();

}

}
