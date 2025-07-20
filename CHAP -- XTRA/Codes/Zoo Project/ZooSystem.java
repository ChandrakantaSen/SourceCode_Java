import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.table.*;
import java.sql.*;
import java.util.*;
import java.applet.*;
import java.net.*;
import java.lang.*;

class ZooSystem extends JFrame
{

    Font dataFont = new Font("Times New Roman", Font.PLAIN,12);
    Font titleFont = new Font("Times New Roman", Font.BOLD,14);
    Font splFont = new Font("Times New Roman", Font.BOLD,18);

    private JInternalFrame jif = null;

    GridBagLayout gb = new GridBagLayout();
	GridBagConstraints c = new GridBagConstraints();
	Container cp = getContentPane();

	//private int m_count;
	//private int m_tencount;

	//private int errorFlag = 0, errorCount = 0;

	String pwd;

	private JRadioButton jrdR = new JRadioButton();
    private JRadioButton jrdP = new JRadioButton();

	// Textbox for Class form

   	private JTextField jtxtClassId = new JTextField();
    private JTextField jtxtClassName = new JTextField();
    private JTextField jtxtRemarks = new JTextField();

    // Textbox for Order entry form

    private JTextField jtxtOrderId = new JTextField();
    private JTextField jtxtOrderName = new JTextField();

    //Textbox for Family entry form

    private JTextField jtxtFamilyId = new JTextField();
    private JTextField jtxtFamilyName = new JTextField();

    // Textbox for Genus entry form

    private JTextField jtxtGenusId = new JTextField();
    private JTextField jtxtGenusName = new JTextField();

    // Textbox for Species entry form

    private JTextField jtxtSpeciesId = new JTextField();
    private JTextField jtxtSpeciesName = new JTextField();

    // Textbox for Zoo Location entry form

    private JTextField jtxtLocId = new JTextField();
    private JTextField jtxtLocName = new JTextField();
    private JTextField jtxtLocSite = new JTextField();
    private JTextField jtxtLocDesc = new JTextField();

    // Textbox for Animal master entry form

    private JTextField jtxtAnimalId = new JTextField();
    private JTextField jtxtAnimalName = new JTextField();
    private JTextField jtxtSCName = new JTextField();
    private JTextField jtxtDOB = new JTextField();
    private JTextField jtxtPOB = new JTextField();
    private JTextField jtxtArrival = new JTextField();
    private JTextField jtxtCName = new JTextField();
    private JTextField jtxtPName = new JTextField();
    private JTextField jtxtRange = new JTextField();
    private JTextField jtxtDist = new JTextField();
    private JTextField jtxtBio = new JTextField();
    private JTextField jtxtStatus = new JTextField();

    // Textbox for Cage Master entry form

    private JTextField jtxtCageNo = new JTextField();
    private JTextField jtxtCageSize = new JTextField();
    private JTextField jtxtCageType = new JTextField();
    private JTextField jtxtDOConst = new JTextField();
    private JTextField jtxtConstBy = new JTextField();
    private JTextField jtxtLastRep = new JTextField();

    // Textbox for Animal Entry and Exit form

    private JTextField jtxtEntryNo = new JTextField();
    private JTextField jtxtEntryType = new JTextField();
    private JTextField jtxtEntryDate = new JTextField();
    private JTextField jtxtReason = new JTextField();

    // Textbox for Animal Health Register

    private JTextField jtxtDOChecking = new JTextField();
    private JTextField jtxtDOCRef = new JTextField();
    private JTextField jtxtDisDet = new JTextField();
    private JTextField jtxtMedicine = new JTextField();
    private JTextField jtxtPreState = new JTextField();

    // Textbox for Zoo employee form

    private JTextField jtxtEmpNo = new JTextField();
    private JTextField jtxtEName = new JTextField();
    private JTextField jtxtEDesig = new JTextField();
    private JTextField jtxtAppDate = new JTextField();
    private JTextField jtxtContNo = new JTextField();
    private JTextField jtxtSalary = new JTextField();

    // Textbox for Job Assignment form

    private JTextField jtxtJobAssign = new JTextField();
    private JTextField jtxtAssignDate = new JTextField();

    // Textbox for Ticket Booking form

    private JTextField jtxtTicketNo = new JTextField();
    private JTextField jtxtDOIssue = new JTextField();
    private JTextField jtxtNOSpec = new JTextField();
    private JTextField jtxtName = new JTextField();
	private JTextField jtxtAmount = new JTextField();

    // Textbox for Zoo Notice form

    private JTextField jtxtNotNo = new JTextField();
    private JTextField jtxtNotDate = new JTextField();
    private JTextField jtxtTopics = new JTextField();
    private JTextField jtxtTopicDesc = new JTextField();

    // Textbox for User master form

    private JTextField jtxtUserId = new JTextField(10);
    private JTextField jtxtUserName = new JTextField();
    private JTextField jtxtUserPD = new JTextField();

	//private JPasswordField jtxtPassword = new JPasswordField(10);

	//******************************************************************//
	// Textbox declaration ends here

	JColorChooser colorChooser;

	// Label for Class entry form
	private JLabel jlblClassId = new JLabel();
    private JLabel jlblClassName = new JLabel();
    private JLabel jlblRemarks = new JLabel();

    // Label for Order entry form
    private JLabel jlblOrderId = new JLabel();
    private JLabel jlblOrderName = new JLabel();

    //Label for Family entry form

    private JLabel jlblFamilyId = new JLabel();
    private JLabel jlblFamilyName = new JLabel();

    // Label for Genus entry form

    private JLabel jlblGenusId = new JLabel();
    private JLabel jlblGenusName = new JLabel();

    // Label for Species entry form

    private JLabel jlblSpeciesId = new JLabel();
    private JLabel jlblSpeciesName = new JLabel();

    // Label for Zoo Location entry form

    private JLabel jlblLocId = new JLabel();
    private JLabel jlblLocName = new JLabel();
    private JLabel jlblLocSite = new JLabel();
    private JLabel jlblLocDesc = new JLabel();

    // Label for Animal master entry form

    private JLabel jlblAnimalId = new JLabel();
    private JLabel jlblAnimalName = new JLabel();
    private JLabel jlblSCName = new JLabel();
    private JLabel jlblDOB = new JLabel();
    private JLabel jlblPOB = new JLabel();
    private JLabel jlblArrival = new JLabel();
    private JLabel jlblCName = new JLabel();
    private JLabel jlblPName = new JLabel();
    private JLabel jlblRange = new JLabel();
    private JLabel jlblDist = new JLabel();
    private JLabel jlblBio = new JLabel();
    private JLabel jlblGender = new JLabel();
    private JLabel jlblStatus = new JLabel();

    // Label for Cage Master entry form

    private JLabel jlblCageNo = new JLabel();
    private JLabel jlblCageSize = new JLabel();
    private JLabel jlblCageType = new JLabel();
    private JLabel jlblDOConst = new JLabel();
    private JLabel jlblConstBy = new JLabel();
    private JLabel jlblLastRep = new JLabel();

    // Label for Animal Entry and Exit form

    private JLabel jlblEntryNo = new JLabel();
    private JLabel jlblEntryType = new JLabel();
    private JLabel jlblEntryDate = new JLabel();
    private JLabel jlblReason = new JLabel();

    // Label for Animal Health Register

    private JLabel jlblDOChecking = new JLabel();
    private JLabel jlblDOCRef = new JLabel();
    private JLabel jlblDisDet = new JLabel();
    private JLabel jlblMedicine = new JLabel();
    private JLabel jlblPreState = new JLabel();

    // Label for Zoo employee form

    private JLabel jlblEmpNo = new JLabel();
    private JLabel jlblEName = new JLabel();
    private JLabel jlblEDesig = new JLabel();
    private JLabel jlblAppDate = new JLabel();
    private JLabel jlblContNo = new JLabel();
    private JLabel jlblSalary = new JLabel();

    // Label for Job Assignment form

    private JLabel jlblJobAssign = new JLabel();
    private JLabel jlblAssignDate = new JLabel();

    // Label for Ticket Booking form

    private JLabel jlblTicketNo = new JLabel();
    private JLabel jlblDOIssue = new JLabel();
    private JLabel jlblNOSpec = new JLabel();
    private JLabel jlblName = new JLabel();
	private JLabel jlblTCategory = new JLabel();
    private JLabel jlblAmount = new JLabel();

    // Label for Zoo Notice form

    private JLabel jlblNotNo = new JLabel();
    private JLabel jlblNotDate = new JLabel();
    private JLabel jlblTopics = new JLabel();
    private JLabel jlblTopicDesc = new JLabel();

    // Label for User master form

    private JLabel jlblUserId = new JLabel();
    private JLabel jlblUserName = new JLabel();
    private JLabel jlblUserPD = new JLabel();

    private JLabel jlblLogo1 = new JLabel();
    private JLabel jlblLogo2 = new JLabel();
    private JLabel jlblLogo3 = new JLabel();

    private JLabel jlblShape1 = new JLabel();
    private JLabel jlblShape2 = new JLabel();

    // Label Declaration ends here

	private JButton jbtnAdd = new JButton();
	private JButton jbtnSave = new JButton();
	private JButton jbtnCancel = new JButton();
	private JButton jbtnDelete = new JButton();
	private JButton jbtnModify = new JButton();
	private JButton jbtnNext = new JButton();
	private JButton jbtnPrevious = new JButton();
	private JButton jbtnLast = new JButton();
	private JButton jbtnFirst = new JButton();

	private JButton jbtnLogin = new JButton();
	private JButton jbtnClick = new JButton();

	private JMenuBar menubar = new JMenuBar();

	private JLabel jlblStatusBar = new JLabel();

	private JLabel jLabel17 = new JLabel();
	private JButton button = new JButton();

	private JDesktopPane m_desktop;

	private JComboBox jComboOrder = new JComboBox();
	private JComboBox jComboFamily = new JComboBox();
	private JComboBox jComboGenus = new JComboBox();
	private JComboBox jComboSpecies = new JComboBox();
	private JComboBox jComboGender = new JComboBox();
	private JComboBox jComboLocId = new JComboBox();
	private JComboBox jComboAnimalId = new JComboBox();
	private JComboBox jComboPhyAnimalId = new JComboBox();
	private JComboBox jComboEmpNo = new JComboBox();
	private JComboBox jComboCageNo = new JComboBox();
	private JComboBox jComboTCategory = new JComboBox();

	JPanel zoop;

	public static void main(String args[])
	{
		// Splash Screen Starts here

		try
		{
			jfrmSplashScreen objSplash = new jfrmSplashScreen("Zoo.jpg");

			for (int i=0; i<5000; i++)
			{
				objSplash.setVisible(true);
			}


			ZooSystem zoomain = new ZooSystem();
			objSplash.mtd_Close();
			zoomain.setVisible(true);
		}
		catch(Throwable t)
		{
			t.printStackTrace();
			System.exit(1);
		}
	}


	public ZooSystem()
	{
		super("Online Zoo Management And Animals Care System");

		m_desktop = new JDesktopPane();
		m_desktop.putClientProperty("JDesktopPane.dragMode", "outline");

		jlblStatusBar.setHorizontalAlignment(SwingConstants.RIGHT);
		jlblStatusBar.setForeground(Color.black);
		jlblStatusBar.setFont(new Font("Dialog", Font.PLAIN, 10));

		new clsTimerTime(jlblStatusBar,1);


		zoop = new JPanel();
		zoop.setLayout(gb);

		cp.setLayout(new BorderLayout());
		cp.add(zoop, BorderLayout.CENTER);
		cp.add(m_desktop, BorderLayout.CENTER);
		cp.add(jlblStatusBar, BorderLayout.SOUTH);

		pack();
		setSize(800,600);
		setVisible(false);
		setLocation((Toolkit.getDefaultToolkit().getScreenSize().width - getWidth())/2,
					(Toolkit.getDefaultToolkit().getScreenSize().height - getHeight())/2);

		addWindowListener(new WindowEventHandler());
		show();


		// Biologic Menu Starts Here
		JMenu ZooBiologic = new JMenu("Biologic Info");
		ZooBiologic.setMnemonic('B');


		JMenuItem ClassEntryMenu = new JMenuItem("Class Entry");
		ClassEntryMenu.addActionListener(new MenuItemHandler());
		//ClassEntryMenu.setEnabled(false);
		ZooBiologic.add(ClassEntryMenu);

		JMenuItem OrdersEntryMenu = new JMenuItem("Orders Entry");
		OrdersEntryMenu.addActionListener(new MenuItemHandler());
		//OrdersEntryMenu.setEnabled(false);
		ZooBiologic.add(OrdersEntryMenu);

		JMenuItem FamilyEntryMenu = new JMenuItem("Family Entry");
		FamilyEntryMenu.addActionListener(new MenuItemHandler());
		//FamilyEntryMenu.setEnabled(false);
		ZooBiologic.add(FamilyEntryMenu);

		JMenuItem GenusEntryMenu = new JMenuItem("Genus Entry");
		GenusEntryMenu.addActionListener(new MenuItemHandler());
		//GenusEntryMenu.setEnabled(false);
		ZooBiologic.add(GenusEntryMenu);

		JMenuItem SpeciesEntryMenu = new JMenuItem("Species Entry");
		SpeciesEntryMenu.addActionListener(new MenuItemHandler());
		//SpeciesEntryMenu.setEnabled(false);
		ZooBiologic.add(SpeciesEntryMenu);


		menubar.add(ZooBiologic);

		//Zoo Authority Menu Starts here
		JMenu ZooAuthority = new JMenu("Zoo Authority");
		ZooAuthority.setMnemonic('Z');
		//ZooAuthority.setEnabled(false);

		JMenuItem LocationMenu = new JMenuItem("Location Entry");
		LocationMenu.addActionListener(new MenuItemHandler());
		ZooAuthority.add(LocationMenu);

		JMenuItem AnimalMasterMenu = new JMenuItem("Animal Master");
		AnimalMasterMenu.addActionListener(new MenuItemHandler());
		ZooAuthority.add(AnimalMasterMenu);

		JMenuItem CageMenu = new JMenuItem("Cage Master");
		CageMenu.addActionListener(new MenuItemHandler());
		ZooAuthority.add(CageMenu);

		JMenuItem EmployeeAppMenu = new JMenuItem("Employee Appointment");
		EmployeeAppMenu.addActionListener(new MenuItemHandler());
		ZooAuthority.add(EmployeeAppMenu);

		menubar.add(ZooAuthority);

		// Report menu starts here

		JMenu ZooReport = new JMenu("Zoo Reports");
		ZooReport.setMnemonic('R');
		//ZooReport.setEnabled(false);

		JMenuItem ListOfLocationMenu = new JMenuItem("List of Location");
		ListOfLocationMenu.addActionListener(new MenuItemHandler());
		ZooReport.add(ListOfLocationMenu);

		JMenuItem ListOfAnimalsMenu = new JMenuItem("List of Animals");
		ListOfAnimalsMenu.addActionListener(new MenuItemHandler());
		ZooReport.add(ListOfAnimalsMenu);

		JMenuItem StaffDetailsMenu = new JMenuItem("Staff Details");
		StaffDetailsMenu.addActionListener(new MenuItemHandler());
		ZooReport.add(StaffDetailsMenu);

		JMenuItem ClassInfoMenu = new JMenuItem("The Class Information");
		ClassInfoMenu.addActionListener(new MenuItemHandler());
		ZooReport.add(ClassInfoMenu);

		menubar.add(ZooReport);

		//Operation Menu Starts Here

		JMenu ZooOperation = new JMenu("Operation");
		ZooOperation.setMnemonic('O');
		//ZooOperation.setEnabled(false);

		JMenuItem AnimalEntryExitMenu = new JMenuItem("Animals Entry & Exit");
		AnimalEntryExitMenu.addActionListener(new MenuItemHandler());
		ZooOperation.add(AnimalEntryExitMenu);

		JMenuItem PhysicalCheckUpMenu = new JMenuItem("Physical Check Up");
		PhysicalCheckUpMenu.addActionListener(new MenuItemHandler());
		ZooOperation.add(PhysicalCheckUpMenu);

		menubar.add(ZooOperation);

		// Employee Job Details related menu starts here
		JMenu EmployeeJob = new JMenu("Employee Job");
		EmployeeJob.setMnemonic('E');
		//EmployeeJob.setEnabled(false);

		JMenuItem JobAssignmentMenu = new JMenuItem("Job Assignment Details");
		JobAssignmentMenu.addActionListener(new MenuItemHandler());
		EmployeeJob.add(JobAssignmentMenu);

		JMenuItem TicketBookingMenu = new JMenuItem("Ticket Booking Details");
		TicketBookingMenu.addActionListener(new MenuItemHandler());
		EmployeeJob.add(TicketBookingMenu);

		JMenuItem NoticeMenu = new JMenuItem("Notice");
		NoticeMenu.addActionListener(new MenuItemHandler());
		EmployeeJob.add(NoticeMenu);

		JMenuItem UserCreationMenu = new JMenuItem("User Creation");
		UserCreationMenu.addActionListener(new MenuItemHandler());
		EmployeeJob.add(UserCreationMenu);

		menubar.add(EmployeeJob);

		//Help Menu Starts Here
		JMenu HelpMenu = new JMenu("Help");
		HelpMenu.setMnemonic('H');
		//HelpMenu.setEnabled(false);

		JMenuItem SystemHelpMenu = new JMenuItem("About the Software");
		SystemHelpMenu.addActionListener(new MenuItemHandler());
		HelpMenu.add(SystemHelpMenu);

		menubar.add(HelpMenu);

		JMenu ExitMenu = new JMenu("Close");
		ExitMenu.setMnemonic('C');

		JMenuItem System_Exit = new JMenuItem("Exit");
		System_Exit.addActionListener(new MenuItemHandler());
		System_Exit.setMnemonic('x');
		ExitMenu.add(System_Exit);

		menubar.add(ExitMenu);

		setJMenuBar(menubar);
	}

	class MenuItemHandler implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			String s = e.getActionCommand();

			if("Class Entry".equals(s))
			{
				zoop.removeAll();
				ClassEntry();
			}
			if("Orders Entry".equals(s))
			{
				zoop.removeAll();
				OrdersEntry();
			}

			if("Family Entry".equals(s))
			{
				zoop.removeAll();
				FamilyEntry();
			}
			if("Genus Entry".equals(s))
			{
				zoop.removeAll();
				GenusEntry();
			}
			if("Species Entry".equals(s))
			{
				zoop.removeAll();
				SpeciesEntry();
			}
			if("Location Entry".equals(s))
			{
				zoop.removeAll();
				LocationEntry();
			}
			if("Animal Master".equals(s))
			{
				zoop.removeAll();
				Animal();
			}
			if("Cage Master".equals(s))
			{
				zoop.removeAll();
				Cage();
			}
			if("Employee Appointment".equals(s))
			{
				zoop.removeAll();
				Employee();
			}
			if("Animals Entry & Exit".equals(s))
			{
				zoop.removeAll();
				AnimalsEntryExit();
			}
			if("Physical Check Up".equals(s))
			{
				zoop.removeAll();
				Physical();
			}
			if("Job Assignment Details".equals(s))
			{
				zoop.removeAll();
				Job();
			}
			if("Ticket Booking Details".equals(s))
			{
				zoop.removeAll();
				Ticket();
			}
			if("Notice".equals(s))
			{
				zoop.removeAll();
				Notice();
			}
			/*if("User Creation".equals(s))
			{
				zoop.removeAll();
				User();
			}*/

            if ( "Exit".equals(s) )
            {
                // show alert if needed
                mtd_exitApplication();
            }
		}
	}

	class ButtonHandler implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{

			String s = e.getActionCommand();

			/*if(s=="Click To Continue...")   // Called from logo_screen()
    		{
    			cp.removeAll();
    			password_screen();

    		}*/
			if(s == "Add New Class")
			{
				ClassEntryToDatabase();
			}
			if(s == "Cancel")
			{
				jif.dispose();
			}


		}
	}

	class WindowEventHandler extends WindowAdapter
	{
		public void windowClosing (WindowEvent e)
		{
            zoop.removeAll();
            mtd_exitApplication();
            System.exit(1);
		}
	}

	class ComboBoxListener implements ItemListener
	{
   		public void itemStateChanged(ItemEvent e)
   		{

   	 	//String sr=(String)e.getItem();
   	 	//if (sr=="Madhyamic")
   	 	}
   	}



	private void mtd_exitApplication()
	{
		try
		{
			int reply = JOptionPane.showConfirmDialog(this,
													   "Do you really want to exit?",
													   "Online Zoo Management System",
													   JOptionPane.YES_NO_OPTION,
													   JOptionPane.QUESTION_MESSAGE);
			if (reply == JOptionPane.YES_OPTION)
			{
				setVisible(false);
				dispose();
				System.exit(0);
			}

		}
		catch(Exception e)
		{

		}
	}

	//*********************Methods declared for Zoo Biologic Menu **********//
	/////////////////////// Screen for Class Entry ///////////////////////

	public void ClassEntry()
	{
        if ( jif != null )
        {
            jif.dispose() ;
            jif = null;
        }

		jif = new JInternalFrame("Class Entry", false, true,false,true);
        jif.setLocation(150,50);
        jif.setSize(415,200);

        zoop.setLayout(null);
        zoop.setBackground(Color.gray);
        jif.getContentPane().add(zoop, BorderLayout.CENTER);

        jlblClassId.setFont(new Font("Dialog", Font.BOLD, 12));
        jlblClassId.setText("Class ID:");
        jlblClassId.setForeground(Color.black);
        jlblClassId.setBounds(12,20,110,20);
        zoop.add(jlblClassId);

        jlblClassName.setFont(new Font("Dialog", Font.BOLD,12));
        jlblClassName.setText("Class Name:");
        jlblClassName.setForeground(Color.black);
        jlblClassName.setBounds(12,40,110,40);
        zoop.add(jlblClassName);

        jlblRemarks.setFont(new Font("Dialog", Font.BOLD,12));
        jlblRemarks.setText("Remarks:");
        jlblRemarks.setForeground(Color.black);
        jlblRemarks.setBounds(12,60,110,60);
        zoop.add(jlblRemarks);

        jtxtClassId.setEnabled(true);
        jtxtClassId.setBounds(125,20,40,25);
        zoop.add(jtxtClassId);

        jtxtClassName.setEnabled(true);
        jtxtClassName.setBounds(125,50,130,25);
        zoop.add(jtxtClassName);

        jtxtRemarks.setEnabled(true);
        jtxtRemarks.setBounds(125,80,250,25);
        zoop.add(jtxtRemarks);

        jbtnAdd.setText("Add New Class");
        jbtnAdd.setMnemonic((int)'A');
        jbtnAdd.setFont(new Font("Dialog",Font.BOLD, 12));
        jbtnAdd.setBounds(100,120,120,30);
        jbtnAdd.setToolTipText("Click here to add new record");
        jbtnAdd.addActionListener(new ButtonHandler());
        zoop.add(jbtnAdd);

        jbtnCancel.setText("Cancel");
        jbtnCancel.setMnemonic((int)'C');
        jbtnCancel.setFont(new Font("Dialog",Font.BOLD, 12));
        jbtnCancel.setBounds(230,120,75,30);
        jbtnCancel.setToolTipText("Click here to cancel");
        jbtnCancel.addActionListener(new ButtonHandler());
        zoop.add(jbtnCancel);

        m_desktop.add(jif);
        jif.show();
    }

	// ***************************** Orders Entry Form *******************

    public void OrdersEntry()
	{
        if ( jif != null )
        {
            jif.dispose() ;
            jif = null;
        }

		jif = new JInternalFrame("Orders Entry", false, true,false,true);
        jif.setLocation(192,152);
        jif.setSize(415,235);

        zoop.setLayout(null);
        zoop.setBackground(new Color(254,247,203));

        jif.getContentPane().add(zoop, BorderLayout.CENTER);

        jlblOrderId.setFont(new Font("Dialog", Font.BOLD, 12));
        jlblOrderId.setText("Orders ID:");
        jlblOrderId.setForeground(Color.black);
        jlblOrderId.setBounds(12,20,110,20);
        zoop.add(jlblOrderId);

        jlblClassId.setFont(new Font("Dialog", Font.BOLD,12));
        jlblClassId.setText("Class ID:");
        jlblClassId.setForeground(Color.blue);
        jlblClassId.setBounds(12,40,110,40);
        zoop.add(jlblClassId);

        jlblOrderName.setFont(new Font("Dialog", Font.BOLD,12));
        jlblOrderName.setText("Order Name:");
        jlblOrderName.setForeground(Color.black);
        jlblOrderName.setBounds(12,70,110,40);
        zoop.add(jlblOrderName);

        jlblRemarks.setFont(new Font("Dialog", Font.BOLD,12));
        jlblRemarks.setText("Remarks:");
        jlblRemarks.setForeground(Color.black);
        jlblRemarks.setBounds(12,90,110,60);
        zoop.add(jlblRemarks);

        jtxtOrderId.setEnabled(true);
        jtxtOrderId.setBounds(125,20,40,25);
        zoop.add(jtxtOrderId);

        jComboOrder.setEnabled(true);
        jComboOrder.setBounds(125,50,60,25);
        zoop.add(jComboOrder);

        jtxtOrderName.setEnabled(true);
        jtxtOrderName.setBounds(125,80,130,25);
        zoop.add(jtxtOrderName);

        jtxtRemarks.setEnabled(true);
        jtxtRemarks.setBounds(125,110,250,25);
        zoop.add(jtxtRemarks);

        jbtnAdd.setText("Add New Order");
        jbtnAdd.setMnemonic((int)'A');
        jbtnAdd.setFont(new Font("Dialog",Font.BOLD, 12));
        jbtnAdd.setBounds(100,150,120,30);
        jbtnAdd.setToolTipText("Click here to add new record");
        zoop.add(jbtnAdd);

        jbtnCancel.setText("Cancel");
        jbtnCancel.setMnemonic((int)'C');
        jbtnCancel.setFont(new Font("Dialog",Font.BOLD, 12));
        jbtnCancel.setBounds(230,150,75,30);
        jbtnCancel.setToolTipText("Click here to cancel");
        jbtnCancel.addActionListener(new ButtonHandler());
        zoop.add(jbtnCancel);

        m_desktop.add(jif);
        jif.show();
    }

    ////////////////////// Family entry form starts here///////////////////////////

    public void FamilyEntry()
	{
        if ( jif != null )
        {
            jif.dispose() ;
            jif = null;
        }

		jif = new JInternalFrame("Family Entry", false, true,false,true);
        jif.setLocation(25,27);
        jif.setSize(415,235);

        zoop.setLayout(null);
        zoop.setBackground(Color.gray);
        jif.getContentPane().add(zoop, BorderLayout.CENTER);

        jlblFamilyId.setFont(new Font("Dialog", Font.BOLD, 12));
        jlblFamilyId.setText("Family ID:");
        jlblFamilyId.setForeground(Color.black);
        jlblFamilyId.setBounds(12,20,110,20);
        zoop.add(jlblFamilyId);

        jlblOrderId.setFont(new Font("Dialog", Font.BOLD,12));
        jlblOrderId.setText("Order ID:");
        jlblOrderId.setForeground(Color.black);
        jlblOrderId.setBounds(12,40,110,40);
        zoop.add(jlblOrderId);

        jlblFamilyName.setFont(new Font("Dialog", Font.BOLD,12));
        jlblFamilyName.setText("Family Name:");
        jlblFamilyName.setForeground(Color.black);
        jlblFamilyName.setBounds(12,70,110,40);
        zoop.add(jlblFamilyName);

        jlblRemarks.setFont(new Font("Dialog", Font.BOLD,12));
        jlblRemarks.setText("Remarks:");
        jlblRemarks.setForeground(Color.black);
        jlblRemarks.setBounds(12,90,110,60);
        zoop.add(jlblRemarks);

        jtxtFamilyId.setEnabled(true);
        jtxtFamilyId.setBounds(125,20,40,25);
        zoop.add(jtxtFamilyId);

        jComboFamily.setEnabled(true);
        jComboFamily.setBounds(125,50,60,25);
        zoop.add(jComboFamily);

        jtxtFamilyName.setEnabled(true);
        jtxtFamilyName.setBounds(125,80,130,25);
        zoop.add(jtxtFamilyName);

        jtxtRemarks.setEnabled(true);
        jtxtRemarks.setBounds(125,110,250,25);
        zoop.add(jtxtRemarks);

        jbtnAdd.setText("Add New Family");
        jbtnAdd.setMnemonic((int)'A');
        jbtnAdd.setFont(new Font("Dialog",Font.BOLD, 12));
        jbtnAdd.setBounds(100,150,140,30);
        jbtnAdd.setToolTipText("Click here to add new record");
        zoop.add(jbtnAdd);

        jbtnCancel.setText("Cancel");
        jbtnCancel.setMnemonic((int)'C');
        jbtnCancel.setFont(new Font("Dialog",Font.BOLD, 12));
        jbtnCancel.setBounds(250,150,75,30);
        jbtnCancel.setToolTipText("Click here to cancel");
        jbtnCancel.addActionListener(new ButtonHandler());
        zoop.add(jbtnCancel);

        m_desktop.add(jif);
        jif.show();
    }

    ///////////////////////// Genus entry form starts here//////////////////////

    public void GenusEntry()
	{
        if ( jif != null )
        {
            jif.dispose() ;
            jif = null;
        }

		jif = new JInternalFrame("Genus Entry", true, true,true,true);
        jif.setLocation(25,27);
        jif.setSize(415,235);

        zoop.setLayout(null);
        zoop.setBackground(Color.gray);
        jif.getContentPane().add(zoop, BorderLayout.CENTER);

        jlblGenusId.setFont(new Font("Dialog", Font.BOLD, 12));
        jlblGenusId.setText("Genus ID:");
        jlblGenusId.setForeground(Color.black);
        jlblGenusId.setBounds(12,20,110,20);
        zoop.add(jlblGenusId);

        jlblClassId.setFont(new Font("Dialog", Font.BOLD,12));
        jlblClassId.setText("Class ID:");
        jlblClassId.setForeground(Color.black);
        jlblClassId.setBounds(12,40,110,40);
        zoop.add(jlblClassId);

        jlblGenusName.setFont(new Font("Dialog", Font.BOLD,12));
        jlblGenusName.setText("Genus Name:");
        jlblGenusName.setForeground(Color.black);
        jlblGenusName.setBounds(12,70,110,40);
        zoop.add(jlblGenusName);

        jlblRemarks.setFont(new Font("Dialog", Font.BOLD,12));
        jlblRemarks.setText("Remarks:");
        jlblRemarks.setForeground(Color.black);
        jlblRemarks.setBounds(12,90,110,60);
        zoop.add(jlblRemarks);

        jtxtGenusId.setEnabled(true);
        jtxtGenusId.setBounds(125,20,40,25);
        zoop.add(jtxtGenusId);

        jComboGenus.setEnabled(true);
        jComboGenus.setBounds(125,50,60,25);
        zoop.add(jComboGenus);

        jtxtGenusName.setEnabled(true);
        jtxtGenusName.setBounds(125,80,130,25);
        zoop.add(jtxtGenusName);

        jtxtRemarks.setEnabled(true);
        jtxtRemarks.setBounds(125,110,250,25);
        zoop.add(jtxtRemarks);

        jbtnAdd.setText("Add New Genus");
        jbtnAdd.setMnemonic((int)'A');
        jbtnAdd.setFont(new Font("Dialog",Font.BOLD, 12));
        jbtnAdd.setBounds(100,150,140,30);
        jbtnAdd.setToolTipText("Click here to add new record");
        zoop.add(jbtnAdd);

        jbtnCancel.setText("Cancel");
        jbtnCancel.setMnemonic((int)'C');
        jbtnCancel.setFont(new Font("Dialog",Font.BOLD, 12));
        jbtnCancel.setBounds(250,150,75,30);
        jbtnCancel.setToolTipText("Click here to cancel");
        jbtnCancel.addActionListener(new ButtonHandler());
        zoop.add(jbtnCancel);

        m_desktop.add(jif);
        jif.show();
    }

    public void SpeciesEntry()
	{
        if ( jif != null )
        {
            jif.dispose() ;
            jif = null;
        }

		jif = new JInternalFrame("Species Entry", false, true,false,true);
        jif.setLocation(25,27);
        jif.setSize(415,235);

        zoop.setLayout(null);
        zoop.setBackground(Color.gray);
        jif.getContentPane().add(zoop, BorderLayout.CENTER);

        jlblSpeciesId.setFont(new Font("Dialog", Font.BOLD, 12));
        jlblSpeciesId.setText("Species ID:");
        jlblSpeciesId.setForeground(Color.black);
        jlblSpeciesId.setBounds(12,20,110,20);
        zoop.add(jlblSpeciesId);

        jlblClassId.setFont(new Font("Dialog", Font.BOLD,12));
        jlblClassId.setText("Class ID:");
        jlblClassId.setForeground(Color.black);
        jlblClassId.setBounds(12,40,110,40);
        zoop.add(jlblClassId);

        jlblSpeciesName.setFont(new Font("Dialog", Font.BOLD,12));
        jlblSpeciesName.setText("Species Name:");
        jlblSpeciesName.setForeground(Color.black);
        jlblSpeciesName.setBounds(12,70,110,40);
        zoop.add(jlblSpeciesName);

        jlblRemarks.setFont(new Font("Dialog", Font.BOLD,12));
        jlblRemarks.setText("Remarks:");
        jlblRemarks.setForeground(Color.black);
        jlblRemarks.setBounds(12,90,110,60);
        zoop.add(jlblRemarks);

        jtxtSpeciesId.setEnabled(true);
        jtxtSpeciesId.setBounds(125,20,40,25);
        zoop.add(jtxtSpeciesId);

        jComboSpecies.setEnabled(true);
        jComboSpecies.setBounds(125,50,60,25);
        zoop.add(jComboSpecies);

        jtxtSpeciesName.setEnabled(true);
        jtxtSpeciesName.setBounds(125,80,130,25);
        zoop.add(jtxtSpeciesName);

        jtxtRemarks.setEnabled(true);
        jtxtRemarks.setBounds(125,110,250,25);
        zoop.add(jtxtRemarks);

        jbtnAdd.setText("Add New Species");
        jbtnAdd.setMnemonic((int)'A');
        jbtnAdd.setFont(new Font("Dialog",Font.BOLD, 12));
        jbtnAdd.setBounds(100,150,140,30);
        jbtnAdd.setToolTipText("Click here to add new record");
        zoop.add(jbtnAdd);

        jbtnCancel.setText("Cancel");
        jbtnCancel.setMnemonic((int)'C');
        jbtnCancel.setFont(new Font("Dialog",Font.BOLD, 12));
        jbtnCancel.setBounds(250,150,75,30);
        jbtnCancel.setToolTipText("Click here to cancel");
        jbtnCancel.addActionListener(new ButtonHandler());
        zoop.add(jbtnCancel);

        m_desktop.add(jif);
        jif.show();
    }

    //////////*********** Methods for Zoo Authority Starts Here **********//

    /////////////// Screen For Location Entry /////////////////////////////

    public void LocationEntry()
	{
        if ( jif != null )
        {
            jif.dispose() ;
            jif = null;
        }

		jif = new JInternalFrame("Location Entry", false, true,false,true);
        jif.setLocation(25,27);
        jif.setSize(425,235);

        zoop.setLayout(null);
        zoop.setBackground(Color.gray);
        jif.getContentPane().add(zoop, BorderLayout.CENTER);

        jlblLocId.setFont(new Font("Dialog", Font.BOLD, 12));
        jlblLocId.setText("Location ID:");
        jlblLocId.setForeground(Color.black);
        jlblLocId.setBounds(12,20,110,20);
        zoop.add(jlblLocId);

        jlblLocName.setFont(new Font("Dialog", Font.BOLD,12));
        jlblLocName.setText("Location Name:");
        jlblLocName.setForeground(Color.black);
        jlblLocName.setBounds(12,40,110,40);
        zoop.add(jlblLocName);

        jlblLocSite.setFont(new Font("Dialog", Font.BOLD,12));
        jlblLocSite.setText("Location Site:");
        jlblLocSite.setForeground(Color.black);
        jlblLocSite.setBounds(12,70,110,40);
        zoop.add(jlblLocSite);

        jlblLocDesc.setFont(new Font("Dialog", Font.BOLD,12));
        jlblLocDesc.setText("Location Description:");
        jlblLocDesc.setForeground(Color.black);
        jlblLocDesc.setBounds(12,90,130,60);
        zoop.add(jlblLocDesc);

        jtxtLocId.setEnabled(true);
        jtxtLocId.setBounds(145,20,40,25);
        zoop.add(jtxtLocId);

        jtxtLocName.setEnabled(true);
        jtxtLocName.setBounds(145,50,100,25);
        zoop.add(jtxtLocName);

        jtxtLocSite.setEnabled(true);
        jtxtLocSite.setBounds(145,80,130,25);
        zoop.add(jtxtLocSite);

        jtxtLocDesc.setEnabled(true);
        jtxtLocDesc.setBounds(145,110,250,25);
        zoop.add(jtxtLocDesc);

        jbtnAdd.setText("Add New Location");
        jbtnAdd.setMnemonic((int)'A');
        jbtnAdd.setFont(new Font("Dialog",Font.BOLD, 12));
        jbtnAdd.setBounds(100,150,140,30);
        jbtnAdd.setToolTipText("Click here to add new record");
        zoop.add(jbtnAdd);

        jbtnCancel.setText("Cancel");
        jbtnCancel.setMnemonic((int)'C');
        jbtnCancel.setFont(new Font("Dialog",Font.BOLD, 12));
        jbtnCancel.setBounds(250,150,75,30);
        jbtnCancel.setToolTipText("Click here to cancel");
        jbtnCancel.addActionListener(new ButtonHandler());
        zoop.add(jbtnCancel);

        m_desktop.add(jif);
        jif.show();
    }

    /////////////////////// Screen for Animal Master Entry ///////////////

    public void Animal()  // Start of Animal Method //
	{
        if ( jif != null )
        {
            jif.dispose() ;
            jif = null;
        }

		jif = new JInternalFrame("Animal Master Entry", false, true,false,true);
        jif.setLocation(25,27);
        jif.setSize(525,375);

        zoop.setLayout(null);
        zoop.setBackground(Color.gray);
        jif.getContentPane().add(zoop, BorderLayout.CENTER);

        jlblAnimalId.setFont(new Font("Dialog", Font.BOLD, 12));
        jlblAnimalId.setText("Animal ID:");
        jlblAnimalId.setForeground(Color.black);
        jlblAnimalId.setBounds(12,20,110,20);
        zoop.add(jlblAnimalId);

        jlblAnimalName.setFont(new Font("Dialog", Font.BOLD,12));
        jlblAnimalName.setText("Animal Name:");
        jlblAnimalName.setForeground(Color.black);
        jlblAnimalName.setBounds(240,20,110,20);
        zoop.add(jlblAnimalName);

        jlblDOB.setFont(new Font("Dialog", Font.BOLD,12));
        jlblDOB.setText("Date of Birth:");
        jlblDOB.setForeground(Color.black);
        jlblDOB.setBounds(12,35,130,60);
        zoop.add(jlblDOB);

        jlblPOB.setFont(new Font("Dialog", Font.BOLD,12));
        jlblPOB.setText("Place of Birth:");
        jlblPOB.setForeground(Color.black);
        jlblPOB.setBounds(240,35,130,60);
        zoop.add(jlblPOB);

        jlblSCName.setFont(new Font("Dialog", Font.BOLD,12));
        jlblSCName.setText("Scientific Name:");
        jlblSCName.setForeground(Color.black);
        jlblSCName.setBounds(12,70,110,40);
        zoop.add(jlblSCName);

        jlblArrival.setFont(new Font("Dialog", Font.BOLD,12));
        jlblArrival.setText("Date of Arrival:");
        jlblArrival.setForeground(Color.black);
        jlblArrival.setBounds(12,100,110,40);
        zoop.add(jlblArrival);

        jlblCName.setFont(new Font("Dialog", Font.BOLD,12));
        jlblCName.setText("Common Name:");
        jlblCName.setForeground(Color.black);
        jlblCName.setBounds(240,100,110,40);
        zoop.add(jlblCName);

    	jlblPName.setFont(new Font("Dialog", Font.BOLD,12));
    	jlblPName.setText("Pet Name:");
    	jlblPName.setForeground(Color.black);
    	jlblPName.setBounds(12,130,110,40);
    	zoop.add(jlblPName);

    	jlblGender.setFont(new Font("Dialog", Font.BOLD,12));
    	jlblGender.setText("Gender:");
    	jlblGender.setForeground(Color.black);
    	jlblGender.setBounds(240,130,110,40);
    	zoop.add(jlblGender);

    	jlblRange.setFont(new Font("Dialog", Font.BOLD,12));
    	jlblRange.setText("Range:");
    	jlblRange.setForeground(Color.black);
    	jlblRange.setBounds(12,160,110,40);
    	zoop.add(jlblRange);

    	jlblDist.setFont(new Font("Dialog", Font.BOLD,12));
    	jlblDist.setText("Distribution:");
    	jlblDist.setForeground(Color.black);
    	jlblDist.setBounds(12,190,110,40);
    	zoop.add(jlblDist);

        jlblBio.setFont(new Font("Dialog", Font.BOLD,12));
    	jlblBio.setText("Biology:");
    	jlblBio.setForeground(Color.black);
    	jlblBio.setBounds(12,220,110,40);
    	zoop.add(jlblBio);

        jlblStatus.setFont(new Font("Dialog", Font.BOLD,12));
    	jlblStatus.setText("Status:");
    	jlblStatus.setForeground(Color.black);
    	jlblStatus.setBounds(12,250,110,40);
    	zoop.add(jlblStatus);

        jtxtAnimalId.setEnabled(true);
        jtxtAnimalId.setBounds(135,20,40,25);
        zoop.add(jtxtAnimalId);

        jtxtAnimalName.setEnabled(true);
        jtxtAnimalName.setBounds(340,20,150,25);
        zoop.add(jtxtAnimalName);

        jtxtDOB.setEnabled(true);
        jtxtDOB.setBounds(135,50,75,25);
        zoop.add(jtxtDOB);

        jtxtPOB.setEnabled(true);
        jtxtPOB.setBounds(340,50,75,25);
        zoop.add(jtxtPOB);

        jtxtSCName.setEnabled(true);
        jtxtSCName.setBounds(135,80,200,25);
        zoop.add(jtxtSCName);

        jtxtArrival.setEnabled(true);
        jtxtArrival.setBounds(135,110,75,25);
        zoop.add(jtxtArrival);

        jtxtCName.setEnabled(true);
        jtxtCName.setBounds(340,110,150,25);
        zoop.add(jtxtCName);

        jtxtPName.setEnabled(true);
        jtxtPName.setBounds(135,140,85,25);
        zoop.add(jtxtPName);

        jComboGender.setEnabled(true);
        jComboGender.addItem("Male");
        jComboGender.addItem("Female");
        jComboGender.setBounds(340,140,80,25);
        jComboGender.addItemListener(new ComboBoxListener());
        zoop.add(jComboGender);

        jtxtRange.setEnabled(true);
        jtxtRange.setBounds(135,170,355,25);
        zoop.add(jtxtRange);

        jtxtDist.setEnabled(true);
        jtxtDist.setBounds(135,200,355,25);
        zoop.add(jtxtDist);

        jtxtBio.setEnabled(true);
        jtxtBio.setBounds(135,230,355,25);
        zoop.add(jtxtBio);

        jtxtStatus.setEnabled(true);
        jtxtStatus.setBounds(135,260,150,25);
        zoop.add(jtxtStatus);

        jbtnAdd.setText("Add New Animal");
        jbtnAdd.setMnemonic((int)'A');
        jbtnAdd.setFont(new Font("Dialog",Font.BOLD, 12));
        jbtnAdd.setBounds(150,300,140,30);
        jbtnAdd.setToolTipText("Click here to add new record");
        zoop.add(jbtnAdd);

        jbtnCancel.setText("Cancel");
        jbtnCancel.setMnemonic((int)'C');
        jbtnCancel.setFont(new Font("Dialog",Font.BOLD, 12));
        jbtnCancel.setBounds(300,300,75,30);
        jbtnCancel.setToolTipText("Click here to cancel");
        jbtnCancel.addActionListener(new ButtonHandler());
        zoop.add(jbtnCancel);

        m_desktop.add(jif);
        jif.show();
    }  // End of Animal Method //
    //***********************************************************************//
    public void Cage()  // Start of Cage Method //
	{
        if ( jif != null )
        {
            jif.dispose() ;
            jif = null;
        }

		jif = new JInternalFrame("Cage Master Entry", false, true,false,true);
        jif.setLocation(25,27);
        jif.setSize(525,275);

        zoop.setLayout(null);
        zoop.setBackground(Color.gray);
        jif.getContentPane().add(zoop, BorderLayout.CENTER);

        jlblCageNo.setFont(new Font("Dialog", Font.BOLD, 12));
        jlblCageNo.setText("Cage No:");
        jlblCageNo.setForeground(Color.black);
        jlblCageNo.setBounds(12,20,110,20);
        zoop.add(jlblCageNo);

        jlblCageSize.setFont(new Font("Dialog", Font.BOLD,12));
        jlblCageSize.setText("Cage Size:");
        jlblCageSize.setForeground(Color.black);
        jlblCageSize.setBounds(240,20,110,20);
        zoop.add(jlblCageSize);

        jlblLocId.setFont(new Font("Dialog", Font.BOLD,12));
        jlblLocId.setText("Location ID:");
        jlblLocId.setForeground(Color.black);
        jlblLocId.setBounds(12,50,110,20);
        zoop.add(jlblLocId);

        jlblAnimalId.setFont(new Font("Dialog", Font.BOLD,12));
        jlblAnimalId.setText("Animal ID:");
        jlblAnimalId.setForeground(Color.black);
        jlblAnimalId.setBounds(240,50,110,20);
        zoop.add(jlblAnimalId);

        jlblDOConst.setFont(new Font("Dialog", Font.BOLD,12));
        jlblDOConst.setText("Date of Construction:");
        jlblDOConst.setForeground(Color.black);
        jlblDOConst.setBounds(12,80,130,20);
        zoop.add(jlblDOConst);

        jlblCageType.setFont(new Font("Dialog", Font.BOLD,12));
        jlblCageType.setText("Cage Type:");
        jlblCageType.setForeground(Color.black);
        jlblCageType.setBounds(240,80,110,20);
        zoop.add(jlblCageType);

        jlblConstBy.setFont(new Font("Dialog", Font.BOLD,12));
        jlblConstBy.setText("Constructed By:");
        jlblConstBy.setForeground(Color.black);
        jlblConstBy.setBounds(12,110,110,20);
        zoop.add(jlblConstBy);

        jlblLastRep.setFont(new Font("Dialog", Font.BOLD,12));
        jlblLastRep.setText("Last Repair:");
        jlblLastRep.setForeground(Color.black);
        jlblLastRep.setBounds(12,140,110,20);
        zoop.add(jlblLastRep);

        jtxtCageNo.setEnabled(true);
        jtxtCageNo.setBounds(135,20,40,25);
        zoop.add(jtxtCageNo);

        jtxtCageSize.setEnabled(true);
        jtxtCageSize.setBounds(340,20,150,25);
        zoop.add(jtxtCageSize);

        jComboLocId.setEnabled(true);
        jComboLocId.setBounds(135,50,60,25);
        zoop.add(jComboLocId);

        jComboAnimalId.setEnabled(true);
        jComboAnimalId.setBounds(340,50,60,25);
        zoop.add(jComboAnimalId);

        jtxtDOConst.setEnabled(true);
		jtxtDOConst.setBounds(135,80,80,25);
		zoop.add(jtxtDOConst);

		jtxtCageType.setEnabled(true);
		jtxtCageType.setBounds(340,80,100,25);
		zoop.add(jtxtCageType);

		jtxtConstBy.setEnabled(true);
		jtxtConstBy.setBounds(135,110,120,25);
		zoop.add(jtxtConstBy);

		jtxtLastRep.setEnabled(true);
		jtxtLastRep.setBounds(135,140,80,25);
		zoop.add(jtxtLastRep);

        jbtnAdd.setText("Add New Cage");
        jbtnAdd.setMnemonic((int)'A');
        jbtnAdd.setFont(new Font("Dialog",Font.BOLD, 12));
        jbtnAdd.setBounds(150,200,140,30);
        jbtnAdd.setToolTipText("Click here to add new record");
        zoop.add(jbtnAdd);

        jbtnCancel.setText("Cancel");
        jbtnCancel.setMnemonic((int)'C');
        jbtnCancel.setFont(new Font("Dialog",Font.BOLD, 12));
        jbtnCancel.setBounds(300,200,75,30);
        jbtnCancel.setToolTipText("Click here to cancel");
        jbtnCancel.addActionListener(new ButtonHandler());
        zoop.add(jbtnCancel);

        m_desktop.add(jif);
        jif.show();

     }  // End of Cage Method //
     //**********************************************************************//
     public void Employee()  // Start of Employee Method //
	{
        if ( jif != null )
        {
            jif.dispose() ;
            jif = null;
        }

		jif = new JInternalFrame("Zoo Employee Data", false, true,false,true);
        jif.setLocation(25,27);
        jif.setSize(475,250);

        zoop.setLayout(null);
        zoop.setBackground(Color.gray);
        jif.getContentPane().add(zoop, BorderLayout.CENTER);

        jlblEmpNo.setFont(new Font("Dialog", Font.BOLD, 12));
        jlblEmpNo.setText("Employee No:");
        jlblEmpNo.setForeground(Color.black);
        jlblEmpNo.setBounds(12,20,110,20);
        zoop.add(jlblEmpNo);

        jlblEName.setFont(new Font("Dialog", Font.BOLD,12));
        jlblEName.setText("Employee Name:");
        jlblEName.setForeground(Color.black);
        jlblEName.setBounds(12,50,110,20);
        zoop.add(jlblEName);

        jlblEDesig.setFont(new Font("Dialog", Font.BOLD,12));
        jlblEDesig.setText("Employee Desig:");
        jlblEDesig.setForeground(Color.black);
        jlblEDesig.setBounds(12,80,110,20);
        zoop.add(jlblEDesig);

        jlblAppDate.setFont(new Font("Dialog", Font.BOLD,12));
        jlblAppDate.setText("Appointment Date:");
        jlblAppDate.setForeground(Color.black);
        jlblAppDate.setBounds(260,80,110,20);
        zoop.add(jlblAppDate);

        jlblContNo.setFont(new Font("Dialog", Font.BOLD,12));
        jlblContNo.setText("Contact No.:");
        jlblContNo.setForeground(Color.black);
        jlblContNo.setBounds(12,110,110,20);
        zoop.add(jlblContNo);

        jlblSalary.setFont(new Font("Dialog", Font.BOLD,12));
        jlblSalary.setText("Salary:");
        jlblSalary.setForeground(Color.black);
        jlblSalary.setBounds(260,110,110,20);
        zoop.add(jlblSalary);

        jlblRemarks.setFont(new Font("Dialog", Font.BOLD,12));
        jlblRemarks.setText("Remarks:");
        jlblRemarks.setForeground(Color.black);
        jlblRemarks.setBounds(12,140,110,20);
        zoop.add(jlblRemarks);

        jtxtEmpNo.setEnabled(true);
        jtxtEmpNo.setBounds(135,20,40,25);
        zoop.add(jtxtEmpNo);

        jtxtEName.setEnabled(true);
        jtxtEName.setBounds(135,50,260,25);
        zoop.add(jtxtEName);

        jtxtEDesig.setEnabled(true);
        jtxtEDesig.setBounds(135,80,100,25);
        zoop.add(jtxtEDesig);

        jtxtAppDate.setEnabled(true);
        jtxtAppDate.setBounds(380,80,75,25);
        zoop.add(jtxtAppDate);

        jtxtContNo.setEnabled(true);
        jtxtContNo.setBounds(135,110,100,25);
        zoop.add(jtxtContNo);

        jtxtSalary.setEnabled(true);
        jtxtSalary.setBounds(380,110,75,25);
        zoop.add(jtxtSalary);

        jtxtRemarks.setEnabled(true);
        jtxtRemarks.setBounds(135,140,100,25);
        zoop.add(jtxtRemarks);

        jbtnAdd.setText("Add Employee");
        jbtnAdd.setMnemonic((int)'A');
        jbtnAdd.setFont(new Font("Dialog",Font.BOLD, 12));
        jbtnAdd.setBounds(150,180,140,30);
        jbtnAdd.setToolTipText("Click here to add new record");
        zoop.add(jbtnAdd);

        jbtnCancel.setText("Cancel");
        jbtnCancel.setMnemonic((int)'C');
        jbtnCancel.setFont(new Font("Dialog",Font.BOLD, 12));
        jbtnCancel.setBounds(300,180,75,30);
        jbtnCancel.setToolTipText("Click here to cancel");
        jbtnCancel.addActionListener(new ButtonHandler());
        zoop.add(jbtnCancel);

        m_desktop.add(jif);
        jif.show();

    }  // End of Employee Method //
    //***********************************************************************//
    public void AnimalsEntryExit()  // Start of Animals Entry and Exit Method //
	{
        if ( jif != null )
        {
            jif.dispose() ;
            jif = null;
        }

		jif = new JInternalFrame("Animals Entry Exit", false, true,false,true);
        jif.setLocation(25,27);
        jif.setSize(415,235);

        zoop.setLayout(null);
        zoop.setBackground(Color.gray);
        jif.getContentPane().add(zoop, BorderLayout.CENTER);

        jlblEntryNo.setFont(new Font("Dialog", Font.BOLD, 12));
        jlblEntryNo.setText("Entry No:");
        jlblEntryNo.setForeground(Color.black);
        jlblEntryNo.setBounds(12,20,110,20);
        zoop.add(jlblEntryNo);

        jlblEntryType.setFont(new Font("Dialog", Font.BOLD,12));
        jlblEntryType.setText("Entry Type:");
        jlblEntryType.setForeground(Color.black);
        jlblEntryType.setBounds(12,50,110,20);
        zoop.add(jlblEntryType);

        jlblEntryDate.setFont(new Font("Dialog", Font.BOLD,12));
        jlblEntryDate.setText("Entry Date:");
        jlblEntryDate.setForeground(Color.black);
        jlblEntryDate.setBounds(12,80,110,20);
        zoop.add(jlblEntryDate);

        jlblReason.setFont(new Font("Dialog", Font.BOLD,12));
        jlblReason.setText("Reason:");
        jlblReason.setForeground(Color.black);
        jlblReason.setBounds(12,110,110,20);
        zoop.add(jlblReason);

        jtxtEntryNo.setEnabled(true);
        jtxtEntryNo.setBounds(125,20,40,25);
        zoop.add(jtxtEntryNo);

        jtxtEntryType.setEnabled(true);
        jtxtEntryType.setBounds(125,50,40,25);
        zoop.add(jtxtEntryType);

        jtxtEntryDate.setEnabled(true);
        jtxtEntryDate.setBounds(125,80,130,25);
        zoop.add(jtxtEntryDate);

        jtxtReason.setEnabled(true);
        jtxtReason.setBounds(125,110,250,25);
        zoop.add(jtxtReason);

        jbtnAdd.setText("Add");
        jbtnAdd.setMnemonic((int)'A');
        jbtnAdd.setFont(new Font("Dialog",Font.BOLD, 12));
        jbtnAdd.setBounds(100,150,75,30);
        jbtnAdd.setToolTipText("Click here to add new record");
        zoop.add(jbtnAdd);

        jbtnCancel.setText("Cancel");
        jbtnCancel.setMnemonic((int)'C');
        jbtnCancel.setFont(new Font("Dialog",Font.BOLD, 12));
        jbtnCancel.setBounds(200,150,75,30);
        jbtnCancel.setToolTipText("Click here to cancel");
        jbtnCancel.addActionListener(new ButtonHandler());
        zoop.add(jbtnCancel);

        m_desktop.add(jif);
        jif.show();
    } // End of Animals Entry and Exit Method //
    //***********************************************************************//
    public void Physical()  // Start of Physical Method //
	{
        if ( jif != null )
        {
            jif.dispose() ;
            jif = null;
        }

		jif = new JInternalFrame("Animal Physical Check Up", false, true,false,true);
        jif.setLocation(25,27);
        jif.setSize(445,260);

        zoop.setLayout(null);
        zoop.setBackground(Color.gray);
        jif.getContentPane().add(zoop, BorderLayout.CENTER);

        jlblAnimalId.setFont(new Font("Dialog", Font.BOLD, 12));
        jlblAnimalId.setText("Animal ID:");
        jlblAnimalId.setForeground(Color.black);
        jlblAnimalId.setBounds(12,20,110,20);
        zoop.add(jlblAnimalId);

        jlblDOChecking.setFont(new Font("Dialog", Font.BOLD, 12));
        jlblDOChecking.setText("Date Of Checking:");
        jlblDOChecking.setForeground(Color.black);
        jlblDOChecking.setBounds(220,20,110,20);
        zoop.add(jlblDOChecking);

        jlblDOCRef.setFont(new Font("Dialog", Font.BOLD, 12));
        jlblDOCRef.setText("Doctore Refer:");
        jlblDOCRef.setForeground(Color.black);
        jlblDOCRef.setBounds(12,50,110,20);
        zoop.add(jlblDOCRef);

        jlblDisDet.setFont(new Font("Dialog", Font.BOLD, 12));
        jlblDisDet.setText("Disease Details:");
        jlblDisDet.setForeground(Color.black);
        jlblDisDet.setBounds(12,80,110,20);
        zoop.add(jlblDisDet);

        jlblMedicine.setFont(new Font("Dialog", Font.BOLD, 12));
        jlblMedicine.setText("Medicine Given:");
        jlblMedicine.setForeground(Color.black);
        jlblMedicine.setBounds(12,110,110,20);
        zoop.add(jlblMedicine);

        jlblPreState.setFont(new Font("Dialog", Font.BOLD, 12));
        jlblPreState.setText("Present State:");
        jlblPreState.setForeground(Color.black);
        jlblPreState.setBounds(12,140,110,20);
        zoop.add(jlblPreState);

        jComboPhyAnimalId.setEnabled(true);
        jComboPhyAnimalId.setBounds(125,20,75,25);
        zoop.add(jComboPhyAnimalId);

        jtxtDOChecking.setEnabled(true);
        jtxtDOChecking.setBounds(330,20,75,25);
        zoop.add(jtxtDOChecking);

        jtxtDOCRef.setEnabled(true);
        jtxtDOCRef.setBounds(125,50,280,25);
        zoop.add(jtxtDOCRef);

        jtxtDisDet.setEnabled(true);
        jtxtDisDet.setBounds(125,80,280,25);
        zoop.add(jtxtDisDet);

        jtxtMedicine.setEnabled(true);
        jtxtMedicine.setBounds(125,110,280,25);
        zoop.add(jtxtMedicine);

        jtxtPreState.setEnabled(true);
        jtxtPreState.setBounds(125,140,280,25);
        zoop.add(jtxtPreState);

        jbtnAdd.setText("Add");
        jbtnAdd.setMnemonic((int)'A');
        jbtnAdd.setFont(new Font("Dialog",Font.BOLD, 12));
        jbtnAdd.setBounds(150,185,75,30);
        jbtnAdd.setToolTipText("Click here to add new record");
        zoop.add(jbtnAdd);

        jbtnCancel.setText("Cancel");
        jbtnCancel.setMnemonic((int)'C');
        jbtnCancel.setFont(new Font("Dialog",Font.BOLD, 12));
        jbtnCancel.setBounds(250,185,75,30);
        jbtnCancel.setToolTipText("Click here to cancel");
        jbtnCancel.addActionListener(new ButtonHandler());
        zoop.add(jbtnCancel);

        m_desktop.add(jif);
        jif.show();

	} // End of Physical Method
	//************************************************************************//
	public void Job()  // Start of Job Method
	{
        if ( jif != null )
        {
            jif.dispose() ;
            jif = null;
        }

		jif = new JInternalFrame("Job Assignment Details", false, true,false,true);
        jif.setLocation(25,27);
        jif.setSize(400,200);

        zoop.setLayout(null);
        zoop.setBackground(Color.gray);
        jif.getContentPane().add(zoop, BorderLayout.CENTER);

        jlblEmpNo.setFont(new Font("Dialog", Font.BOLD, 12));
        jlblEmpNo.setText("Employee No.:");
        jlblEmpNo.setForeground(Color.black);
        jlblEmpNo.setBounds(12,20,110,20);
        zoop.add(jlblEmpNo);

        jlblCageNo.setFont(new Font("Dialog", Font.BOLD, 12));
        jlblCageNo.setText("Cage No.:");
        jlblCageNo.setForeground(Color.black);
        jlblCageNo.setBounds(220,20,110,20);
        zoop.add(jlblCageNo);

        jlblJobAssign.setFont(new Font("Dialog", Font.BOLD, 12));
        jlblJobAssign.setText("Job Assignment:");
        jlblJobAssign.setForeground(Color.black);
        jlblJobAssign.setBounds(12,50,110,20);
        zoop.add(jlblJobAssign);

        jlblAssignDate.setFont(new Font("Dialog", Font.BOLD, 12));
        jlblAssignDate.setText("Assignment Date:");
        jlblAssignDate.setForeground(Color.black);
        jlblAssignDate.setBounds(12,80,110,20);
        zoop.add(jlblAssignDate);

        jComboEmpNo.setEnabled(true);
        jComboEmpNo.setBounds(125,20,75,25);
        zoop.add(jComboEmpNo);

        jComboCageNo.setEnabled(true);
        jComboCageNo.setBounds(290,20,75,25);
        zoop.add(jComboCageNo);

        jtxtJobAssign.setEnabled(true);
        jtxtJobAssign.setBounds(125,50,245,25);
        zoop.add(jtxtJobAssign);

        jtxtAssignDate.setEnabled(true);
        jtxtAssignDate.setBounds(125,80,245,25);
        zoop.add(jtxtAssignDate);

        jbtnAdd.setText("Add");
        jbtnAdd.setMnemonic((int)'A');
        jbtnAdd.setFont(new Font("Dialog",Font.BOLD, 12));
        jbtnAdd.setBounds(135,125,75,30);
        jbtnAdd.setToolTipText("Click here to add new record");
        zoop.add(jbtnAdd);

        jbtnCancel.setText("Cancel");
        jbtnCancel.setMnemonic((int)'C');
        jbtnCancel.setFont(new Font("Dialog",Font.BOLD, 12));
        jbtnCancel.setBounds(210,125,75,30);
        jbtnCancel.setToolTipText("Click here to cancel");
        jbtnCancel.addActionListener(new ButtonHandler());
        zoop.add(jbtnCancel);

        m_desktop.add(jif);
        jif.show();

	} // End of Job Method
	//**********************************************************************//
	public void Ticket()  // Start of Ticket Method
	{
        if ( jif != null )
        {
            jif.dispose() ;
            jif = null;
        }

		jif = new JInternalFrame("Ticket Booking Details", false, true,false,true);
        jif.setLocation(25,27);
        jif.setSize(425,225);

        zoop.setLayout(null);
        zoop.setBackground(Color.gray);
        jif.getContentPane().add(zoop, BorderLayout.CENTER);

        jlblTicketNo.setFont(new Font("Dialog", Font.BOLD, 12));
        jlblTicketNo.setText("Ticket No.:");
        jlblTicketNo.setForeground(Color.black);
        jlblTicketNo.setBounds(12,20,110,20);
        zoop.add(jlblTicketNo);

        jlblDOIssue.setFont(new Font("Dialog", Font.BOLD, 12));
        jlblDOIssue.setText("Date of Issue:");
        jlblDOIssue.setForeground(Color.black);
        jlblDOIssue.setBounds(220,20,110,20);
        zoop.add(jlblDOIssue);

        jlblName.setFont(new Font("Dialog", Font.BOLD, 12));
        jlblName.setText("Name:");
        jlblName.setForeground(Color.black);
        jlblName.setBounds(12,50,110,20);
        zoop.add(jlblName);

        jlblTCategory.setFont(new Font("Dialog", Font.BOLD, 12));
        jlblTCategory.setText("Ticket Category:");
        jlblTCategory.setForeground(Color.black);
        jlblTCategory.setBounds(12,80,110,20);
        zoop.add(jlblTCategory);

        jlblNOSpec.setFont(new Font("Dialog", Font.BOLD, 12));
        jlblNOSpec.setText("No. Of Spectator:");
        jlblNOSpec.setForeground(Color.black);
        jlblNOSpec.setBounds(220,80,110,20);
        zoop.add(jlblNOSpec);

        jlblAmount.setFont(new Font("Dialog", Font.BOLD, 12));
        jlblAmount.setText("Amount:");
        jlblAmount.setForeground(Color.black);
        jlblAmount.setBounds(12,110,110,20);
        zoop.add(jlblAmount);

        jtxtTicketNo.setEnabled(true);
        jtxtTicketNo.setBounds(125,20,75,25);
        zoop.add(jtxtTicketNo);

        jtxtDOIssue.setEnabled(true);
        jtxtDOIssue.setBounds(320,20,75,25);
        zoop.add(jtxtDOIssue);

        jtxtName.setEnabled(true);
        jtxtName.setBounds(125,50,270,25);
        zoop.add(jtxtName);

        jComboTCategory.setEnabled(true);
        jComboTCategory.setBounds(125,80,75,25);
        zoop.add(jComboTCategory);

        jtxtNOSpec.setEnabled(true);
        jtxtNOSpec.setBounds(320,80,75,25);
        zoop.add(jtxtNOSpec);

        jtxtAmount.setEnabled(true);
        jtxtAmount.setBounds(125,110,75,25);
        zoop.add(jtxtAmount);

        jbtnAdd.setText("Add");
        jbtnAdd.setMnemonic((int)'A');
        jbtnAdd.setFont(new Font("Dialog",Font.BOLD, 12));
        jbtnAdd.setBounds(135,150,75,30);
        jbtnAdd.setToolTipText("Click here to add new record");
        zoop.add(jbtnAdd);

        jbtnCancel.setText("Cancel");
        jbtnCancel.setMnemonic((int)'C');
        jbtnCancel.setFont(new Font("Dialog",Font.BOLD, 12));
        jbtnCancel.setBounds(210,150,75,30);
        jbtnCancel.setToolTipText("Click here to cancel");
        jbtnCancel.addActionListener(new ButtonHandler());
        zoop.add(jbtnCancel);

        m_desktop.add(jif);
        jif.show();

	} // End of Ticket Booking Method
	//***********************************************************************//
	public void Notice()  // Start of Notice Method
	{
        if ( jif != null )
        {
            jif.dispose() ;
            jif = null;
        }

		jif = new JInternalFrame("Zoo Notice Details", false, true,false,true);
        jif.setLocation(25,27);
        jif.setSize(425,225);

        zoop.setLayout(null);
        zoop.setBackground(Color.gray);
        jif.getContentPane().add(zoop, BorderLayout.CENTER);

        jlblNotNo.setFont(new Font("Dialog", Font.BOLD, 12));
        jlblNotNo.setText("Notice No.:");
        jlblNotNo.setForeground(Color.black);
        jlblNotNo.setBounds(12,20,110,20);
        zoop.add(jlblNotNo);

        jlblNotDate.setFont(new Font("Dialog", Font.BOLD, 12));
        jlblNotDate.setText("Notice Date:");
        jlblNotDate.setForeground(Color.black);
        jlblNotDate.setBounds(220,20,110,20);
        zoop.add(jlblNotDate);

        jlblTopics.setFont(new Font("Dialog", Font.BOLD, 12));
        jlblTopics.setText("Topics:");
        jlblTopics.setForeground(Color.black);
        jlblTopics.setBounds(12,50,110,20);
        zoop.add(jlblTopics);

        jlblTopicDesc.setFont(new Font("Dialog", Font.BOLD, 12));
        jlblTopicDesc.setText("Topic Description:");
        jlblTopicDesc.setForeground(Color.black);
        jlblTopicDesc.setBounds(12,80,110,20);
        zoop.add(jlblTopicDesc);

        jlblRemarks.setFont(new Font("Dialog", Font.BOLD, 12));
        jlblRemarks.setText("Remarks:");
        jlblRemarks.setForeground(Color.black);
        jlblRemarks.setBounds(12,110,110,20);
        zoop.add(jlblRemarks);

        jtxtNotNo.setEnabled(true);
        jtxtNotNo.setBounds(125,20,75,25);
        zoop.add(jtxtNotNo);

        jtxtNotDate.setEnabled(true);
        jtxtNotDate.setBounds(320,20,75,25);
        zoop.add(jtxtNotDate);

        jtxtTopics.setEnabled(true);
        jtxtTopics.setBounds(125,50,270,25);
        zoop.add(jtxtTopics);

        jtxtTopicDesc.setEnabled(true);
        jtxtTopicDesc.setBounds(125,80,270,25);
        zoop.add(jtxtTopicDesc);

        jtxtRemarks.setEnabled(true);
        jtxtRemarks.setBounds(125,110,270,25);
        zoop.add(jtxtRemarks);

        jbtnAdd.setText("Add");
        jbtnAdd.setMnemonic((int)'A');
        jbtnAdd.setFont(new Font("Dialog",Font.BOLD, 12));
        jbtnAdd.setBounds(135,150,75,30);
        jbtnAdd.setToolTipText("Click here to add new record");
        zoop.add(jbtnAdd);

        jbtnCancel.setText("Cancel");
        jbtnCancel.setMnemonic((int)'C');
        jbtnCancel.setFont(new Font("Dialog",Font.BOLD, 12));
        jbtnCancel.setBounds(210,150,75,30);
        jbtnCancel.setToolTipText("Click here to cancel");
        jbtnCancel.addActionListener(new ButtonHandler());
        zoop.add(jbtnCancel);

        m_desktop.add(jif);
        jif.show();

	}

	void ClassEntryToDatabase()
	{
		try
		{
			String clsid = jtxtClassId.getText().trim();
            String clsname = jtxtClassName.getText().trim();
            String clsrem = jtxtRemarks.getText();
            /**************************/
            String SQL1 = "SELECT COUNT(*) FROM CLASSES";
            System.out.println(SQL1);
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            Connection conn1=DriverManager.getConnection("jdbc:odbc:oraclejava","ZOO","ZOO");
            System.out.println("Connection established");
            Statement stmt1=conn1.createStatement();
            boolean hasresult1=stmt1.execute(SQL1);
            ResultSet result=stmt1.getResultSet();
            result.next();
            String n=result.getString(1);
			/**************************/
            String SQL = "INSERT INTO CLASSES VALUES('" +clsid+"','"+ clsname +"','"+clsrem+"')";
            System.out.println(SQL);
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            Connection conn=DriverManager.getConnection("jdbc:odbc:oraclejava","ZOO","ZOO");
            System.out.println("Connection established");
            Statement stmt=conn.createStatement();
            System.out.println("Statement created");
            boolean hasresult=stmt.execute(SQL);
            System.out.println("Statement executed");
            conn.close();
		}
		catch(Exception ex)
		{
			JButton button1 = new JButton("Rectify It");
			String title = "System Alert";
			String message="Sorry, Input Error";
			int messagetype=JOptionPane.WARNING_MESSAGE;
			JOptionPane.showMessageDialog(button1,message,title,messagetype);

			cp.removeAll();
			ClassEntry();
		}

		jtxtClassId.setText("n");
		jtxtClassName.setText("");
		jtxtRemarks.setText("");
	}
}