package All;

/* JMenuTest.java
 * Copyright (c) 2014, HerongYang.com, All Rights Reserved.
 */
import javax.swing.*;
public class JMenuTest {
   JFrame myFrame = null;
   public static void main(String[] a) {
      (new JMenuTest()).test();
   }
   private void test() {
      myFrame = new JFrame("Menu Test");
      myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      myFrame.setBounds(50,50,250,150);
      myFrame.setContentPane(new JDesktopPane());

      JMenuBar myMenuBar = new JMenuBar();
      JMenu myMenu = getFileMenu();
      myMenuBar.add(myMenu);
      myMenu = getColorMenu();
      myMenuBar.add(myMenu);

      myFrame.setJMenuBar(myMenuBar);
      myFrame.setVisible(true);
   }
   private JMenu getFileMenu() {
      JMenu myMenu = new JMenu("File");
      JMenu mySubMenu = getOpenMenu();
      myMenu.add(mySubMenu);
      JMenuItem myItem = new JMenuItem("Close");
      myMenu.add(myItem);
      myMenu.addSeparator();
      myItem = new JMenuItem("Exit");
      myMenu.add(myItem);
      return myMenu;
   }
   private JMenu getColorMenu() {
      JMenu myMenu = new JMenu("Color");
      JMenuItem myItem = new JMenuItem("Red");
      myMenu.add(myItem);
      myItem = new JMenuItem("Green");
      myMenu.add(myItem);
      myItem = new JMenuItem("Blue");
      myMenu.add(myItem);
      return myMenu;
   }
   private JMenu getOpenMenu() {
      JMenu myMenu = new JMenu("Open");
      JMenuItem myItem = new JMenuItem("Java");
      myMenu.add(myItem);
      myItem = new JMenuItem("HTML");
      myMenu.add(myItem);
      myItem = new JMenuItem("GIF");
      myMenu.add(myItem);
      return myMenu;
   }
}
