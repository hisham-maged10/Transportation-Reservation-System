package System;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ButtonModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import java.awt.CardLayout;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JScrollPane;
import java.awt.Component;
import java.awt.Dimension;
import javax.swing.JTextArea;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JSlider;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.GridLayout;
import javax.swing.JSpinner;
import javax.swing.SpinnerListModel;

public class adminMenu1 extends FileHandling {
	private JFrame frame;
	public JFrame getFrame() {
		return frame;
	}
	private JPanel contentPane;
	private JPanel busmenu;
	private JPanel Buses;
	private JPanel Booking;
	private JPanel Employee;
	private JPanel BookinglistTblpnl;
	private JPanel Motorlist;
	private JPanel Metrolist;
	private JPanel Trainlist;
	private JPanel Taxilist;
	private JPanel Limousinelist;
	private JPanel MiniBuseslist;
	private JPanel BusesList;
	private JPanel EmpPnl;
	private JPanel ManagerPnl;
	private JPanel UserPnl;
	private JPanel VipPnl;
	private JPanel IntroCars;
	private JPanel BookingIntro;
	private JPanel EmpIntro;
	private File Text=new File("src/System/sounds/Text.WAV");
	private File Press=new File("src/System/sounds/Login.WAV");
	private File Bam=new File("src/System/sounds/bam.WAV");
	private File pop=new File("src/System/sounds/tada.WAV");
	private String username;
	private JLabel Welcome;
	private LoginMenu Login=new LoginMenu();
	private JTable table;
	private JButton btnBookingList;
	private JButton btnAddTrips;
	private JButton button_2;
	private JButton btnTrips;
	private JButton btnBusList;
	private JButton btnMinibuses;
	private JButton btnAddC;
	private JButton btnDeleteC;
	private JButton btnBack;
	private JButton Limousine;
	private JButton btnTaxi;
	private JButton btnTrains;
	private JButton btnMetros;
	private JButton Emplist;
	private JButton Managerlist;
	private JButton Viplist;
	private JButton Userlist;
	private JButton button_5;
	private JButton btnMotorcycles;
	private JTableHeader header;
	private JTableHeader header_1;
	private JTableHeader header_2;
	private JTableHeader header_3;
	private JTableHeader header_4;
	private JTableHeader header_5;
	private JTableHeader header_6;
	private JTableHeader header_7;
	private JTableHeader header_8;
	private JTableHeader header_9;
	private JTableHeader header_10;
	private JTableHeader header_tbl;
	private JPanel TripsTblPnl;
	private JPanel AddMenu;
	private JPanel DeleteMenuCars;
	private int chosenB;
	private int chosenC;
	private int chosenH;
	private Boolean populate=false;
	private Boolean populateB=false;
	private Boolean populateC1=false;
	private Boolean populateC2=false;
	private Boolean populateC3=false;
	private Boolean populateC4=false;
	private Boolean populateC5=false;
	private Boolean populateC6=false;
	private Boolean populateC7=false;
	private Boolean populateH1=false;
	private Boolean populateH2=false;
	private Boolean populateH3=false;
	private Boolean populateH4=false;
	private JTable table_1;
	private JTable tblMini;
	private JTable tblLimo;
	private JTable tblTaxi;
	private JTable tblTrain;
	private JTable tblMetro;
	private JTable tblMotor;
	private JTable tblEmp;
	private JTable tblUser;
	private JTable tblManager;
	private JTable tblVip;
	private JTextField txtFirst;
	private JTextField txtLast;
	private JTextField txtAge;
	private JTextField txtPhone;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JPasswordField textField_3;
	private JTextField CarIDSearch;
	private JPanel infoPnlCars;
	private JButton btnAddM;
	private JButton btnDeleteM;
	private JPanel InfoMem;
	private JPanel AddMenuMem;
	private JPanel DeleteMenuMem;
	private JPanel DeleteMenuMem_1;
	private JPanel infoPanel;
	private JButton btnDeleteB;
	private JButton btnAddB;
	private JTextField BookingIDSearch;
	private JPasswordField txtPassword;
	private JPanel addinBook;
	private JComboBox<?> SourceAddComboBox;
	private JComboBox CarTypeBox;
	private JComboBox<?> Destination;
	private JComboBox DepartBox;
	private JLabel lblReturndate;
	private JLabel lblType_2;
	private JLabel lblPrice;
	private JLabel CarIDLbl;
	private JRadioButton rdbtnRound;
	private JRadioButton rdbtnOneway;
	private JComboBox HumanTypeBox;
	private JButton CreateAccbtn;
	private JComboBox CarBox;
	private JComboBox ComfortabilityBox;
	private JComboBox AvailDriverBox;
	private JLabel lblCarid;
	private JLabel AssigDriverID;
	private JLabel DriverNameLbl;
	private int neededDriverIndex;
	private JPanel AddBookingPnl;
	private JComboBox TripsDestinationBox;
	private JComboBox TripsSourceBox;
	private JComboBox TripsCarBox;
	private JTextField label_17;
	private JComboBox TripsAvailableCarsBox;
	private JComboBox TripsStopsBox;
	private JComboBox DepartDay;
	private JComboBox DepartMonth;
	private JComboBox DepartYear;
	private JComboBox ReturnDay;
	private JComboBox ReturnMonth;
	private JComboBox ReturnYear;
	private JPanel DeleteBooking;
	private JTable tblTrips;
	private JLabel SrcDel;
	private JLabel DestDel;
	private JLabel TypeDel;
	private JLabel CarIDDel;
	private JLabel DepartDel;
	private JLabel ReturnDel;
	private String SearchTargetB;
	private boolean searchedB=false;
	private String SearchTargetH;
	private String SearchTargetC;
	private boolean searchedH=false;
	private boolean searchedC=false;
	private JLabel FirstDel;
	private JLabel LastDel;
	private JTextField IDSearch;
	private JLabel AgeDel;
	private JLabel PhoneDel;
	private JComboBox TypeDelBox;
	private int indextobedeletedH;
	private int indextobedeletedC;
	private JComboBox CarTypeDel;
	private JLabel AvailDel;
	private JLabel ComfortabilityDel;
	private JLabel SrcDelCar;
	private JLabel lblCarid_1;
	private JLabel DestDelCar;
	private JPanel Menu1;
	private JPanel pnlButtons;
	private JPanel pnlCars;
	private JPanel pnlBook;
	private JPanel pnlMembers;
	private int xMouse;
	private int yMouse;
	
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					adminMenu1 frame = new adminMenu1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}*/
	public String getWelcome() {
		return Welcome.getText();
	}
	public void setWelcome(String string) {
		Welcome.setText(string);;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public adminMenu1(String FirstName,String LastName) {
		frame=new JFrame();
		 frame.addMouseListener(new MouseAdapter() {
			 	public void mousePressed(MouseEvent evt) {
			 		xMouse  = evt.getX();

					yMouse = evt.getY();
			 	}
			 });
			 frame.addMouseMotionListener(new MouseMotionAdapter() {
			 	public void mouseDragged(MouseEvent evt) {
			 		int x = evt.getXOnScreen();

					int y = evt.getYOnScreen();
					frame.setLocation(x - xMouse , y - yMouse);
			 	}
			 });
		Border emptyborder=BorderFactory.createEmptyBorder();
		frame.setUndecorated(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(175, 35, 1261, 673);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		frame.setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 1262, 673);
		contentPane.add(panel);
		panel.setLayout(null);
		
		pnlButtons = new JPanel();
		pnlButtons.setBackground(new Color(40,163,163).darker());
		pnlButtons.setBounds(278, 172, 626, 33);
		pnlButtons.setVisible(false);
		panel.add(pnlButtons);
		pnlButtons.setLayout(new CardLayout(0, 0));
		
		pnlCars = new JPanel();
		pnlCars.setBackground(new Color(40,163,163).darker());
		pnlButtons.add(pnlCars, "name_30428949812672");
		pnlCars.setVisible(false);
		pnlCars.setLayout(null);
		
		 btnAddC = new JButton("Add");
		btnAddC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ResetCarsGui();
				IntroCars.setVisible(false);
				infoPnlCars.setVisible(true);
				BusesList.setVisible(false);
				Motorlist.setVisible(false);
				Metrolist.setVisible(false);
				Trainlist.setVisible(false);
				Taxilist.setVisible(false);
				Limousinelist.setVisible(false);
				MiniBuseslist.setVisible(false);
				AddMenu.setVisible(true);
				DeleteMenuCars.setVisible(false);
				
				
				
			}
		});
		btnAddC.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent arg0) {
				playsound(Text);
				btnAddC.setBackground(new Color(40,163,163).darker().darker());
			}
			public void mouseExited(MouseEvent e) {
				if(chosenC!=9)
				btnAddC.setBackground(new Color(40,163,163).darker());
			}
			public void mousePressed(MouseEvent e) {
				playsound(Press);
				setBtnColor(btnAddC);
				resetBtnColor(btnMinibuses);
				resetBtnColor(btnBack);
				resetBtnColor(btnBusList);
				resetBtnColor(btnTaxi);
				resetBtnColor(btnTrains);
				resetBtnColor(btnMetros);
				resetBtnColor(Limousine);
				resetBtnColor(btnDeleteC);
				resetBtnColor(btnMotorcycles);
				chosenC=9;
			}
				
				
		});
		btnAddC.setBackground(new Color(40,163,163).darker());
		btnAddC.setForeground(Color.WHITE);
		btnAddC.setBorder(emptyborder);
		btnAddC.setFocusable(false);
		btnAddC.setFont(new Font("Segoe UI", Font.PLAIN, 29));
		btnAddC.setBounds(12, 0, 165, 33);
		pnlCars.add(btnAddC);
		
		btnDeleteC = new JButton("Delete");
		btnDeleteC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ResetCarsGui();
				IntroCars.setVisible(false);
				infoPnlCars.setVisible(true);
				BusesList.setVisible(false);
				Motorlist.setVisible(false);
				Metrolist.setVisible(false);
				Trainlist.setVisible(false);
				Taxilist.setVisible(false);
				Limousinelist.setVisible(false);
				MiniBuseslist.setVisible(false);
				AddMenu.setVisible(false);
				DeleteMenuCars.setVisible(true);
			}
		});
		btnDeleteC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnDeleteC.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent arg0) {
				playsound(Text);
				btnDeleteC.setBackground(new Color(40,163,163).darker().darker());
			}
			public void mouseExited(MouseEvent e) {
				if(chosenC!=8)
				btnDeleteC.setBackground(new Color(40,163,163).darker());
			}
			public void mousePressed(MouseEvent e) {
				playsound(Press);
				setBtnColor(btnDeleteC);
				resetBtnColor(btnMinibuses);
				resetBtnColor(btnBack);
				resetBtnColor(btnBusList);
				resetBtnColor(btnTaxi);
				resetBtnColor(btnTrains);
				resetBtnColor(btnMetros);
				resetBtnColor(Limousine);
				resetBtnColor(btnMotorcycles);
				resetBtnColor(btnAddC);
				chosenC=8;
			}
				
				
		});
		btnDeleteC.setBackground(new Color(40,163,163).darker());
		btnDeleteC.setForeground(Color.WHITE);
		btnDeleteC.setBorder(emptyborder);
		btnDeleteC.setFocusable(false);
		btnDeleteC.setFont(new Font("Segoe UI", Font.PLAIN, 29));
		btnDeleteC.setBounds(192, 0, 165, 33);
		pnlCars.add(btnDeleteC);
		
		pnlBook = new JPanel();
		pnlBook.setLayout(null);
		pnlBook.setVisible(false);
		pnlBook.setBackground(new Color(28, 114, 114));
		pnlButtons.add(pnlBook, "name_31992951846569");
		
		btnAddB = new JButton("Book");
		btnAddB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ResetBookingGUI();
				loadBookings();
				DeleteBooking.setVisible(false);
		 		addinBook.setVisible(true);
		 		BookingIntro.setVisible(false);
		 		infoPanel.setVisible(true);
		 		AddBookingPnl.setVisible(false);
		 		TripsTblPnl.setVisible(false);
		 		BookinglistTblpnl.setVisible(false);
			}
		});
		btnAddB.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent arg0) {
				playsound(Text);
				btnAddB.setBackground(new Color(40,163,163).darker().darker());
			}
			public void mouseExited(MouseEvent e) {
				if(chosenB!=5)
				btnAddB.setBackground(new Color(40,163,163).darker());
			}
			public void mousePressed(MouseEvent e) {
				playsound(Press);
				setBtnColor(btnAddB);
				resetBtnColor(btnAddTrips);
				resetBtnColor(btnBookingList);
				resetBtnColor(button_2);
				resetBtnColor(btnTrips);
				resetBtnColor(btnDeleteB);
				chosenB=5;
			}
				
				
		});
		btnAddB.setBackground(new Color(40,163,163).darker());
		btnAddB.setForeground(Color.WHITE);
		btnAddB.setBorder(emptyborder);
		btnAddB.setFocusable(false);
		btnAddB.setFont(new Font("Segoe UI", Font.PLAIN, 29));
		btnAddB.setBounds(12, 0, 165, 33);
		pnlBook.add(btnAddB);
		
		btnDeleteB = new JButton("Refund");
		btnDeleteB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ResetBookingGUI();
				DeleteBooking.setVisible(true);
		 		addinBook.setVisible(false);
		 		BookingIntro.setVisible(false);
		 		infoPanel.setVisible(true);
		 		AddBookingPnl.setVisible(false);
		 		TripsTblPnl.setVisible(false);
		 		BookinglistTblpnl.setVisible(false);
			}
		});
		btnDeleteB.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent arg0) {
				playsound(Text);
				btnDeleteB.setBackground(new Color(40,163,163).darker().darker());
			}
			public void mouseExited(MouseEvent e) {
				if(chosenB!=6)
				btnDeleteB.setBackground(new Color(40,163,163).darker());
			}
			public void mousePressed(MouseEvent e) {
				playsound(Press);
				setBtnColor(btnDeleteB);
				resetBtnColor(btnAddTrips);
				resetBtnColor(btnBookingList);
				resetBtnColor(button_2);
				resetBtnColor(btnTrips);
				resetBtnColor(btnAddB);
				chosenB=6;
			}
				
				
		});
		btnDeleteB.setBackground(new Color(40,163,163).darker());
		btnDeleteB.setForeground(Color.WHITE);
		btnDeleteB.setBorder(emptyborder);
		btnDeleteB.setFocusable(false);
		btnDeleteB.setFont(new Font("Segoe UI", Font.PLAIN, 29));
		btnDeleteB.setBounds(192, 0, 165, 33);
		pnlBook.add(btnDeleteB);
		
		pnlMembers = new JPanel();
		pnlMembers.setLayout(null);
		pnlMembers.setVisible(false);
		pnlMembers.setBackground(new Color(28, 114, 114));
		pnlButtons.add(pnlMembers, "name_32015979907861");
		
		btnAddM = new JButton("Add");
		btnAddM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ResetManagementGui();
				EmpIntro.setVisible(false);
				InfoMem.setVisible(true);
				AddMenuMem.setVisible(true);
				DeleteMenuMem_1.setVisible(false);
				EmpPnl.setVisible(false);
				UserPnl.setVisible(false);
				ManagerPnl.setVisible(false);
				VipPnl.setVisible(false);
			}
		});
		btnAddM.setForeground(Color.WHITE);
		btnAddM.setBorder(emptyborder);
		btnAddM.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent arg0) {
				playsound(Text);
				btnAddM.setBackground(new Color(40,163,163).darker().darker());
			}
			public void mouseExited(MouseEvent e) {
				if(chosenH!=6)
				btnAddM.setBackground(new Color(40,163,163).darker());
			}
			public void mousePressed(MouseEvent e) {
				playsound(Press);
				setBtnColor(btnAddM);
				resetBtnColor(Userlist);
				resetBtnColor(Managerlist);
				resetBtnColor(Viplist);
				resetBtnColor(btnDeleteM);
				resetBtnColor(Emplist);
				chosenH=6;
				
			}
				
				
		});
		btnAddM.setFont(new Font("Segoe UI", Font.PLAIN, 29));
		btnAddM.setFocusable(false);
		btnAddM.setBackground(new Color(28, 114, 114));
		btnAddM.setBounds(12, 0, 165, 33);
		pnlMembers.add(btnAddM);
		
		btnDeleteM = new JButton("Delete");
		btnDeleteM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ResetManagementGui();
				EmpIntro.setVisible(false);
				InfoMem.setVisible(true);
				AddMenuMem.setVisible(false);
				DeleteMenuMem_1.setVisible(true);
				EmpPnl.setVisible(false);
				UserPnl.setVisible(false);
				ManagerPnl.setVisible(false);
				VipPnl.setVisible(false);
			}
		});
		btnDeleteM.setForeground(Color.WHITE);
		btnDeleteM.setBorder(emptyborder);
		btnDeleteM.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent arg0) {
				playsound(Text);
				btnDeleteM.setBackground(new Color(40,163,163).darker().darker());
			}
			public void mouseExited(MouseEvent e) {
				if(chosenH!=7)
				btnDeleteM.setBackground(new Color(40,163,163).darker());
			}
			public void mousePressed(MouseEvent e) {
				playsound(Press);
				setBtnColor(btnDeleteM);
				resetBtnColor(Userlist);
				resetBtnColor(Managerlist);
				resetBtnColor(Viplist);
				resetBtnColor(btnAddM);
				resetBtnColor(Emplist);
				chosenH=7;
				
			}
				
				
		});

		btnDeleteM.setFont(new Font("Segoe UI", Font.PLAIN, 29));
		btnDeleteM.setFocusable(false);
		btnDeleteM.setBackground(new Color(28, 114, 114));
		btnDeleteM.setBounds(189, 0, 165, 33);
		pnlMembers.add(btnDeleteM);
		
		JPanel Header = new JPanel();
		Header.setBackground(new Color(40,163,163).darker());
		Header.setBounds(0, 0, 1262, 211);
		panel.add(Header);
		Header.setLayout(null);
		
		JLabel lblNewLabel = new JLabel();
		lblNewLabel.setIcon(new ImageIcon("src/System/images/Bus station2.png"));
		lblNewLabel.setBounds(25, 13, 223, 201);
		Header.add(lblNewLabel);
		
		JSeparator separator = new JSeparator(SwingConstants.VERTICAL);
		separator.setBounds(270, 32, 37, 148);
		Header.add(separator);
		
		JLabel lblBusReversa = new JLabel("Bus Reservation System");
		lblBusReversa.setForeground(Color.WHITE);
		lblBusReversa.setFont(new Font("Segoe UI", Font.PLAIN, 68));
		lblBusReversa.setBounds(280, 13, 825, 92);
		Header.add(lblBusReversa);
		
		JLabel lblUserMenu = new JLabel("Admin Menu");
		lblUserMenu.setForeground(Color.WHITE);
		lblUserMenu.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 25));
		lblUserMenu.setBounds(290, 80, 825, 92);
		Header.add(lblUserMenu);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(290, 102, 65, 14);
		Header.add(separator_1);
		
		Welcome = new JLabel();
		Welcome.setText("Welcome,"+FirstName+" "+LastName);
		Welcome.setForeground(Color.WHITE);
		Welcome.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 25));
		Welcome.setBounds(916, 136, 304, 92);
		Header.add(Welcome);
		
		JButton btnNewButton_1 = new JButton();
		btnNewButton_1.setBackground(new Color(40,163,163).darker());
		btnNewButton_1.setBorder(emptyborder);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent arg0) {
				btnNewButton_1.setBackground(Color.white);
			}
			public void mouseExited(MouseEvent e) {
				btnNewButton_1.setBackground(new Color(40,163,163).darker());
			}
			public void mousePressed(MouseEvent e) {
				btnNewButton_1.setBackground(Color.WHITE);
			}
		});
		btnNewButton_1.setIcon(new ImageIcon("src/System/images/Delete_20px.png"));
		btnNewButton_1.setBounds(1211, 0, 51, 33);
		Header.add(btnNewButton_1);
		
		JButton button = new JButton();
		button.setIcon(new ImageIcon("src/System/images/Back_20px.png"));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login.getFrame().setVisible(true);
				frame.setVisible(false);
				
			}
		});
		button.setBackground(new Color(40, 163, 163).darker());
		button.setBorder(emptyborder);
		button.setFocusable(false);
		button.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent arg0) {
				button.setBackground(Color.white);
				playsound(Text);
			}
			public void mouseExited(MouseEvent e) {
				button.setBackground(new Color(40,163,163).darker());
			}
			public void mousePressed(MouseEvent e) {
				button.setBackground(Color.WHITE);
				playsound(Press);
			}
		});
		button.setBounds(0, 0, 51, 33);
		Header.add(button);
		
		JSeparator separator_9 = new JSeparator();
		separator_9.setBounds(280, 13, 623, 47);
		Header.add(separator_9);
		
		JPanel framesgrp = new JPanel();
		framesgrp.setBounds(0, 211, 1262, 462);
		panel.add(framesgrp);
		framesgrp.setLayout(new CardLayout(0, 0));
		
		Menu1 = new JPanel();
		framesgrp.add(Menu1, "name_95537830144262");
		Menu1.setBackground(SystemColor.control);
		Menu1.setLayout(null);
		
		JButton Bookingsbtn = new JButton();
		Bookingsbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BookinglistTblpnl.setVisible(false);
				BookingIntro.setVisible(true);
				pnlButtons.setVisible(true);
				pnlBook.setVisible(true);
				pnlCars.setVisible(false);
				pnlMembers.setVisible(false);
				loadBookings();
				Menu1.setVisible(false);
				Booking.setVisible(true);
			}
		});
		Bookingsbtn.setIcon(new ImageIcon("src/System/images/Add Database_96px.png"));
		Bookingsbtn.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent arg0) {
				Bookingsbtn.setBackground(new Color(40,163,163));
				playsound(Text);
			}
			public void mouseExited(MouseEvent e) {
				Bookingsbtn.setBackground(SystemColor.controlHighlight);
			}
			public void mousePressed(MouseEvent e) {
				Bookingsbtn.setBackground(new Color(40,163,163).darker());
				playsound(Press);
			}
		});
		Bookingsbtn.setFocusable(false);
		Bookingsbtn.setBackground(SystemColor.controlHighlight);
		Bookingsbtn.setBounds(831, 125, 237, 210);
		Menu1.add(Bookingsbtn);
		
		JButton Carsbtn = new JButton();
		Carsbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pnlButtons.setVisible(true);
				pnlCars.setVisible(true);
				pnlBook.setVisible(false);
				pnlMembers.setVisible(false);
				loadAllCars();
				IntroCars.setVisible(true);
				Menu1.setVisible(false);
				Buses.setVisible(true);
			}
		});
		Carsbtn.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent arg0) {
				Carsbtn.setBackground(new Color(40,163,163));
				playsound(Text);
			}
			public void mouseExited(MouseEvent e) {
				Carsbtn.setBackground(SystemColor.controlHighlight);
			}
			public void mousePressed(MouseEvent e) {
				Carsbtn.setBackground(new Color(40,163,163).darker());
				playsound(Press);
			}
		});
		Carsbtn.setIcon(new ImageIcon("src/System/images/Speedometer_96px.png"));
		Carsbtn.setFocusable(false);
		Carsbtn.setBackground(SystemColor.controlHighlight);
		Carsbtn.setBounds(504, 125, 237, 210);
		Menu1.add(Carsbtn);
		
		JButton Driversbtn = new JButton();
		Driversbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pnlButtons.setVisible(true);
				pnlMembers.setVisible(true);
				pnlBook.setVisible(false);
				pnlCars.setVisible(false);
				EmpIntro.setVisible(true);
				LoadInfo(employee,3);
				Menu1.setVisible(false);
				Employee.setVisible(true);
			}
		});
		Driversbtn.setIcon(new ImageIcon("src/System/images/Valet Parking_100px.png"));
		Driversbtn.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent arg0) {
				Driversbtn.setBackground(new Color(40,163,163));
				playsound(Text);
			}
			public void mouseExited(MouseEvent e) {
				Driversbtn.setBackground(SystemColor.controlHighlight);
			}
			public void mousePressed(MouseEvent e) {
				Driversbtn.setBackground(new Color(40,163,163).darker());
				playsound(Press);
			}
		});
		Driversbtn.setFocusable(false);
		Driversbtn.setBackground(SystemColor.controlHighlight);
		Driversbtn.setBounds(191, 125, 237, 210);
		Menu1.add(Driversbtn);
		
		JLabel lblManageCars = new JLabel("Manage Cars");
		lblManageCars.setForeground(SystemColor.windowBorder);
		lblManageCars.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 30));
		lblManageCars.setHorizontalAlignment(SwingConstants.CENTER);
		lblManageCars.setBounds(504, 49, 237, 51);
		Menu1.add(lblManageCars);
		
		JLabel lblDrivers = new JLabel("Management");
		lblDrivers.setForeground(SystemColor.windowBorder);
		lblDrivers.setHorizontalAlignment(SwingConstants.CENTER);
		lblDrivers.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 30));
		lblDrivers.setBounds(191, 49, 237, 51);
		Menu1.add(lblDrivers);
		
		JLabel lblBookings = new JLabel("Manage Bookings");
		lblBookings.setForeground(SystemColor.windowBorder);
		lblBookings.setHorizontalAlignment(SwingConstants.CENTER);
		lblBookings.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 28));
		lblBookings.setBounds(831, 49, 237, 51);
		Menu1.add(lblBookings);
		
		Booking = new JPanel();
		framesgrp.add(Booking, "name_95883376664000");
		Booking.setLayout(null);
		
		JPanel BookingMenu = new JPanel();
		BookingMenu.setLayout(null);
		BookingMenu.setBackground(new Color(40, 163, 163).darker());
		BookingMenu.setBounds(0, 0, 278, 462);
		Booking.add(BookingMenu);
		
		JSeparator separator_4 = new JSeparator();
		separator_4.setBounds(23, 0, 213, 47);
		BookingMenu.add(separator_4);
		
		 btnAddTrips = new JButton("Add trips");
		btnAddTrips.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ResetBookingGUI();
				DeleteBooking.setVisible(false);
		 		addinBook.setVisible(false);
		 		BookingIntro.setVisible(false);
		 		infoPanel.setVisible(true);
		 		AddBookingPnl.setVisible(true);
		 		TripsTblPnl.setVisible(false);
		 		BookinglistTblpnl.setVisible(false);
			}
		});
		btnAddTrips.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent arg0) {
				btnAddTrips.setBackground(new Color(40,163,163).darker().darker());
				playsound(Text);
			}
			public void mouseExited(MouseEvent e) {
				if(chosenB!=1)
				{
				btnAddTrips.setBackground(new Color(40,163,163).darker());
				}
				
			}
				
			public void mousePressed(MouseEvent e) {
				playsound(Press);
				setBtnColor(btnAddTrips);
				resetBtnColor(btnBookingList);
				resetBtnColor(button_2);
				resetBtnColor(btnTrips);
				resetBtnColor(btnAddB);
				resetBtnColor(btnDeleteB);
				chosenB=1;
			}
			public void mouseClicked(MouseEvent arg0) {
				setBtnColor(btnAddTrips);
				resetBtnColor(btnBookingList);
				resetBtnColor(button_2);
				resetBtnColor(btnTrips);
				resetBtnColor(btnAddB);
				resetBtnColor(btnDeleteB);
				chosenB=1;
				
				
			}
		});
		
		btnAddTrips.setFocusable(false);
		btnAddTrips.setBorder(emptyborder);
		btnAddTrips.setForeground(Color.WHITE);
		btnAddTrips.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 29));
		btnAddTrips.setFocusable(false);
		btnAddTrips.setBackground(new Color(40, 163, 163).darker());
		btnAddTrips.setBounds(12, 166, 254, 40);
		BookingMenu.add(btnAddTrips);
		
		 btnBookingList = new JButton("Booking List");
		 btnBookingList.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent e) {
		 		ResetBookingGUI();
		 		DeleteBooking.setVisible(false);
		 		addinBook.setVisible(false);
		 		BookingIntro.setVisible(false);
		 		infoPanel.setVisible(true);
		 		AddBookingPnl.setVisible(false);
		 		TripsTblPnl.setVisible(false);
		 		BookinglistTblpnl.setVisible(true);
		 		loadBookings();
		 		if(!populate)
		 		{
		 		PopulateBookings();
		 		}
		 		populate=true;
		 		table.setRowSelectionInterval(1,1);
		 		
		 	}
		 });
		 btnBookingList.addMouseListener(new MouseAdapter() {
				public void mouseEntered(MouseEvent arg0) {
					btnBookingList.setBackground(new Color(40,163,163).darker().darker());
					playsound(Text);
				}
				public void mouseExited(MouseEvent e) {
					if(chosenB!=2)
					{
					btnBookingList.setBackground(new Color(40,163,163).darker());
					}
					
				}
					
				public void mousePressed(MouseEvent e) {
					playsound(Press);
					setBtnColor(btnBookingList);
					resetBtnColor(btnAddTrips);
					resetBtnColor(button_2);
					resetBtnColor(btnTrips);
					resetBtnColor(btnAddB);
					resetBtnColor(btnDeleteB);
					chosenB=2;
				}
				public void mouseClicked(MouseEvent arg0) {
					setBtnColor(btnBookingList);
					resetBtnColor(btnAddTrips);
					resetBtnColor(button_2);
					resetBtnColor(btnTrips);
					resetBtnColor(btnAddB);
					resetBtnColor(btnDeleteB);
					chosenB=2;
					
					
				}
			});
		btnBookingList.setFocusable(false);
		btnBookingList.setBorder(emptyborder);
		btnBookingList.setForeground(Color.WHITE);
		btnBookingList.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 29));
		btnBookingList.setFocusable(false);
		btnBookingList.setBackground(new Color(40, 163, 163).darker());
		btnBookingList.setBounds(12, 60, 254, 40);
		BookingMenu.add(btnBookingList);
		
		 button_2 = new JButton("Back");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ResetBookingGUI();
				addinBook.setVisible(false);
				BookingIntro.setVisible(false);
				BookingIntro.setVisible(false);
		 		infoPanel.setVisible(false);
		 		AddBookingPnl.setVisible(false);
		 		TripsTblPnl.setVisible(false);
		 		BookinglistTblpnl.setVisible(false);
		 		pnlButtons.setVisible(false);
		 		pnlBook.setVisible(false);
		 		pnlCars.setVisible(false);
		 		pnlMembers.setVisible(false);
				populate=false;
				populateB=false;
				chosenB=0;
				Menu1.setVisible(true);
				Booking.setVisible(false);
				DefaultTableModel t1 = (DefaultTableModel) table.getModel();
				DefaultTableModel t2 = (DefaultTableModel) tblTrips.getModel();
				t1.setRowCount(0);
				t2.setRowCount(0);
			}
		});
		button_2.addMouseListener(new MouseAdapter() {
				public void mouseEntered(MouseEvent arg0) {
					button_2.setBackground(new Color(40,163,163).darker().darker());
					playsound(Text);
				}
				public void mouseExited(MouseEvent e) {
					if(chosenB!=4)
					{
						button_2.setBackground(new Color(40,163,163).darker());
					}
					
				}
					
				public void mousePressed(MouseEvent e) {
					playsound(Press);
					setBtnColor(button_2);
					resetBtnColor(btnAddTrips);
					resetBtnColor(btnBookingList);
					resetBtnColor(btnTrips);
					resetBtnColor(btnAddB);
					resetBtnColor(btnDeleteB);
				}
				public void mouseClicked(MouseEvent arg0) {
					setBtnColor(button_2);
					resetBtnColor(btnAddTrips);
					resetBtnColor(btnBookingList);
					resetBtnColor(btnTrips);
					resetBtnColor(btnAddB);
					resetBtnColor(btnDeleteB);
					
					
				}
			});
		button_2.setFocusable(false);
		button_2.setBorder(emptyborder);
		button_2.setForeground(Color.WHITE);
		button_2.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 29));
		button_2.setFocusable(false);
		button_2.setBackground(new Color(40, 163, 163).darker());
		button_2.setBounds(12, 219, 254, 40);
		BookingMenu.add(button_2);
		
		btnTrips = new JButton("Trips");
		btnTrips.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ResetBookingGUI();
				DeleteBooking.setVisible(false);
		 		addinBook.setVisible(false);
		 		BookingIntro.setVisible(false);
		 		infoPanel.setVisible(true);
		 		AddBookingPnl.setVisible(false);
		 		TripsTblPnl.setVisible(true);
		 		BookinglistTblpnl.setVisible(false);
		 		loadBookings();
		 		if(!populateB)
		 		{
		 		PopulateTrips();
		 		}
		 		populateB=true;
		 		tblTrips.setRowSelectionInterval(1,1);
			}
		});
		btnTrips.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent arg0) {
				btnTrips.setBackground(new Color(40,163,163).darker().darker());
				playsound(Text);
			}
			public void mouseExited(MouseEvent e) {
				if(chosenB!=3)
				{
					btnTrips.setBackground(new Color(40,163,163).darker());
				}
				
			}
				
			public void mousePressed(MouseEvent e) {
				playsound(Press);
				setBtnColor(btnTrips);
				resetBtnColor(btnAddTrips);
				resetBtnColor(btnBookingList);
				resetBtnColor(button_2);
				resetBtnColor(btnAddB);
				resetBtnColor(btnDeleteB);
				chosenB=3;
			}
			public void mouseClicked(MouseEvent arg0) {
				setBtnColor(btnTrips);
				resetBtnColor(btnAddTrips);
				resetBtnColor(btnBookingList);
				resetBtnColor(button_2);
				resetBtnColor(btnAddB);
				resetBtnColor(btnDeleteB);
				chosenB=3;
			}
		});
		btnTrips.setBorder(emptyborder);
		btnTrips.setForeground(Color.WHITE);
		btnTrips.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 29));
		btnTrips.setFocusable(false);
		btnTrips.setBackground(new Color(40, 163, 163).darker());
		btnTrips.setBounds(12, 113, 254, 40);
		BookingMenu.add(btnTrips);
		
		JSeparator separator_6 = new JSeparator(SwingConstants.VERTICAL);
		separator_6.setBounds(269, 13, 37, 436);
		BookingMenu.add(separator_6);
		
		JSeparator separator_7 = new JSeparator(SwingConstants.VERTICAL);
		separator_7.setBounds(5, 13, 37, 436);
		BookingMenu.add(separator_7);
		
		JSeparator separator_8 = new JSeparator();
		separator_8.setBounds(16, 447, 239, 47);
		BookingMenu.add(separator_8);
		
		JPanel Changer3 = new JPanel();
		Changer3.setBounds(278, 0, 984, 462);
		Booking.add(Changer3);
		Changer3.setLayout(new CardLayout(0, 0));
		
		BookingIntro = new JPanel();
		Changer3.add(BookingIntro, "name_95760297919381");
		BookingIntro.setLayout(null);
		BookingIntro.setBackground(new Color(19, 79, 79));
		
		JSeparator separator_22 = new JSeparator();
		separator_22.setBounds(12, 9, 960, 14);
		BookingIntro.add(separator_22);
		
		JSeparator separator_23 = new JSeparator();
		separator_23.setBounds(12, 450, 960, 14);
		BookingIntro.add(separator_23);
		
		JSeparator separator_24 = new JSeparator();
		separator_24.setOrientation(SwingConstants.VERTICAL);
		separator_24.setBounds(11, 25, 37, 412);
		BookingIntro.add(separator_24);
		
		JSeparator separator_25 = new JSeparator();
		separator_25.setOrientation(SwingConstants.VERTICAL);
		separator_25.setBounds(971, 25, 37, 412);
		BookingIntro.add(separator_25);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("src/System/images/35a1411339dca52c88035f272d0ebcc1.png"));
		label.setBounds(22, 13, 306, 329);
		BookingIntro.add(label);
		
		JSeparator separator_26 = new JSeparator();
		separator_26.setForeground(Color.WHITE);
		separator_26.setBounds(390, 121, 297, 14);
		BookingIntro.add(separator_26);
		
		JLabel lblBookingManagementMenu = new JLabel("Booking Management Menu");
		lblBookingManagementMenu.setHorizontalAlignment(SwingConstants.CENTER);
		lblBookingManagementMenu.setForeground(Color.WHITE);
		lblBookingManagementMenu.setFont(new Font("Segoe UI Semibold", Font.BOLD, 45));
		lblBookingManagementMenu.setBounds(324, 0, 648, 151);
		BookingIntro.add(lblBookingManagementMenu);
		
		JTextArea txtrInTheBooking = new JTextArea();
		txtrInTheBooking.setText("In the Booking Management Menu, you can Check all the Available Trip--s andalso you Can Add to them, also Can add Booking without the nee-d for Extreme Technicalities, Only simply by clicking the Button and cho-osing from the Drop down Menu, Also you can Edit or Delete them.\r\n");
		txtrInTheBooking.setLineWrap(true);
		txtrInTheBooking.setForeground(Color.WHITE);
		txtrInTheBooking.setFont(new Font("Segoe UI", Font.ITALIC, 20));
		txtrInTheBooking.setEditable(false);
		txtrInTheBooking.setBackground(new Color(19, 79, 79));
		txtrInTheBooking.setBounds(327, 148, 632, 108);
		BookingIntro.add(txtrInTheBooking);
		
		JTextArea txtrWellWhatAre_1 = new JTextArea();
		txtrWellWhatAre_1.setText("Well, What are you Waiting For?!\r\nTRY IT NOW!\r\nBy choosing one of the options on the Right, simply by Clicking on Them");
		txtrWellWhatAre_1.setLineWrap(true);
		txtrWellWhatAre_1.setForeground(Color.WHITE);
		txtrWellWhatAre_1.setFont(new Font("Century Gothic", Font.BOLD, 25));
		txtrWellWhatAre_1.setEditable(false);
		txtrWellWhatAre_1.setBackground(new Color(19, 79, 79));
		txtrWellWhatAre_1.setBounds(327, 282, 632, 155);
		BookingIntro.add(txtrWellWhatAre_1);
		
		JSeparator separator_27 = new JSeparator();
		separator_27.setForeground(Color.GRAY);
		separator_27.setBounds(324, 269, 632, 14);
		BookingIntro.add(separator_27);
		
		infoPanel = new JPanel();
		Changer3.add(infoPanel, "name_95763861153376");
		infoPanel.setBackground(Color.WHITE);
		infoPanel.setLayout(new CardLayout(0, 0));
		  
		  addinBook = new JPanel();
		  addinBook.setLayout(null);
		  addinBook.setBackground(new Color(19, 79, 79));
		  infoPanel.add(addinBook, "name_107939428455165");
		  
		  JSeparator separator_72 = new JSeparator();
		  separator_72.setBounds(13, 10, 960, 14);
		  addinBook.add(separator_72);
		  
		  JSeparator separator_73 = new JSeparator();
		  separator_73.setBounds(13, 452, 960, 14);
		  addinBook.add(separator_73);
		  
		  JSeparator separator_74 = new JSeparator();
		  separator_74.setOrientation(SwingConstants.VERTICAL);
		  separator_74.setBounds(11, 29, 37, 412);
		  addinBook.add(separator_74);
		  
		  JSeparator separator_75 = new JSeparator();
		  separator_75.setOrientation(SwingConstants.VERTICAL);
		  separator_75.setBounds(974, 29, 37, 412);
		  addinBook.add(separator_75);
		  
		  CarTypeBox = new JComboBox();
		  CarTypeBox.addActionListener(new ActionListener() {
		  	public void actionPerformed(ActionEvent arg0) {
		  		if(!(CarTypeBox.getSelectedItem().toString().equals("Choose Car Type")))
		  		{
		  		FillSourceInfo(CarTypeBox.getSelectedItem().toString());
		  			Destination.removeAllItems();;
		  			DepartBox.removeAllItems();
		  			lblReturndate.setText("ReturnDate");
		  			lblType_2.setText("Stops");
		  			lblPrice.setText("Price (Manager Discount)");
		  			CarIDLbl.setText("CarID");
		  			rdbtnOneway.setSelected(true);
		  			rdbtnOneway.setEnabled(false);
		  		  rdbtnRound.setEnabled(false);
		  		}
		  	}
		  });
		  CarTypeBox.addMouseListener(new MouseAdapter() {
			 	public void mousePressed(MouseEvent e) {
			 		playsound(Press);
			 	}
			 });
		  CarTypeBox.setModel(new DefaultComboBoxModel(new String[] {"Choose Car Type", "Bus", "Limousine", "Mini-Bus", "Taxi", "Train", "Metro", "Motorcycle"}));
		  CarTypeBox.setForeground(Color.WHITE);
		  CarTypeBox.setFont(new Font("Segoe UI", Font.PLAIN, 21));
		  CarTypeBox.setFocusable(false);
		  CarTypeBox.setBackground(new Color(19, 79, 79));
		  CarTypeBox.setBounds(46, 82, 183, 33);
		  addinBook.add(CarTypeBox);
		  
		  JLabel label_6 = new JLabel("Car Type");
		  label_6.setVerticalAlignment(SwingConstants.TOP);
		  label_6.setToolTipText("Choose which car type u want to add");
		  label_6.setForeground(Color.WHITE);
		  label_6.setFont(new Font("Segoe UI Semilight", Font.ITALIC, 32));
		  label_6.setBounds(46, 31, 183, 63);
		  addinBook.add(label_6);
		  
		  JSeparator separator_76 = new JSeparator();
		  separator_76.setForeground(Color.WHITE);
		  separator_76.setBounds(46, 126, 188, 8);
		  addinBook.add(separator_76);
		  
		  JLabel label_11 = new JLabel("Source");
		  label_11.setVerticalAlignment(SwingConstants.TOP);
		  label_11.setToolTipText("Choose the Source ");
		  label_11.setForeground(Color.WHITE);
		  label_11.setFont(new Font("Segoe UI Semilight", Font.ITALIC, 32));
		  label_11.setBounds(46, 156, 183, 44);
		  addinBook.add(label_11);
		  
		  SourceAddComboBox = new JComboBox();
		  SourceAddComboBox.addActionListener(new ActionListener() {
		  	public void actionPerformed(ActionEvent arg0) {
		  		try
		  		{
		  		FillDestinationInfo(SourceAddComboBox.getSelectedItem().toString(),CarTypeBox.getSelectedItem().toString());
	  			DepartBox.removeAllItems();
	  			lblReturndate.setText("ReturnDate");
	  			lblType_2.setText("Stops");
	  			lblPrice.setText("Price (Manager Discount)");
	  			CarIDLbl.setText("CarID");
		  		}catch(Exception e3)
		  		{
		  			
		  		}
	  			rdbtnOneway.setSelected(true);
	  			rdbtnOneway.setEnabled(false);
	  		  rdbtnRound.setEnabled(false);
		  	}
		  });
		  SourceAddComboBox.addMouseListener(new MouseAdapter() {
			 	public void mousePressed(MouseEvent e) {
			 		playsound(Press);
			 	}
			 });
		  SourceAddComboBox.setForeground(Color.WHITE);
		  SourceAddComboBox.setFont(new Font("Segoe UI", Font.PLAIN, 21));
		  SourceAddComboBox.setFocusable(false);
		  SourceAddComboBox.setBackground(new Color(19, 79, 79));
		  SourceAddComboBox.setBounds(46, 204, 183, 33);
		  addinBook.add(SourceAddComboBox);
		  
		  JSeparator separator_77 = new JSeparator();
		  separator_77.setForeground(Color.WHITE);
		  separator_77.setBounds(46, 248, 188, 8);
		  addinBook.add(separator_77);
		  
		  JLabel label_13 = new JLabel("Destination");
		  label_13.setVerticalAlignment(SwingConstants.TOP);
		  label_13.setToolTipText("Choose the desired destination ");
		  label_13.setForeground(Color.WHITE);
		  label_13.setFont(new Font("Segoe UI Semilight", Font.ITALIC, 31));
		  label_13.setBounds(46, 279, 183, 44);
		  addinBook.add(label_13);
		  
		  Destination = new JComboBox();
		  Destination.addActionListener(new ActionListener() {
		  	public void actionPerformed(ActionEvent e) {
		  		try
		  		{
		  		FillDepartInfo(Destination.getSelectedItem().toString(),SourceAddComboBox.getSelectedItem().toString(),CarTypeBox.getSelectedItem().toString());
		  		lblReturndate.setText("ReturnDate");
	  			lblType_2.setText("Stops");
	  			lblPrice.setText("Price (Manager Discount)");
	  			CarIDLbl.setText("CarID");
		  		}catch(Exception e2){
		  			
		  		}
		  		rdbtnOneway.setSelected(true);
		  		rdbtnOneway.setEnabled(false);
		  		  rdbtnRound.setEnabled(false);
		  	}
		  });
		  Destination.addMouseListener(new MouseAdapter() {
			 	public void mousePressed(MouseEvent e) {
			 		playsound(Press);
		  			
			 	}
			 });
		  Destination.setForeground(Color.WHITE);
		  Destination.setFont(new Font("Segoe UI", Font.PLAIN, 21));
		  Destination.setFocusable(false);
		  Destination.setDoubleBuffered(true);
		  Destination.setBackground(new Color(19, 79, 79));
		  Destination.setBounds(46, 327, 183, 33);
		  addinBook.add(Destination);
		  
		  JSeparator separator_78 = new JSeparator();
		  separator_78.setForeground(Color.WHITE);
		  separator_78.setBounds(46, 371, 188, 8);
		  addinBook.add(separator_78);
		  
		  JLabel lblType_3 = new JLabel("Type:");
		  lblType_3.setVerticalAlignment(SwingConstants.TOP);
		  lblType_3.setToolTipText("Check whether it's Available or not");
		  lblType_3.setForeground(Color.WHITE);
		  lblType_3.setFont(new Font("Segoe UI", Font.ITALIC, 18));
		  lblType_3.setBounds(43, 412, 52, 27);
		  addinBook.add(lblType_3);
		  
		  rdbtnRound = new JRadioButton("Round");
		  rdbtnRound.addActionListener(new ActionListener() {
		  	public void actionPerformed(ActionEvent e) {
		  		double x=Double.parseDouble(lblPrice.getText());
		  		x/=2;
		  		lblPrice.setText(Double.toString(x));
		  	}
		  });
		  rdbtnRound.setForeground(Color.WHITE);
		  rdbtnRound.addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent e) {
					playsound(Press);
				}
				public void mouseEntered(MouseEvent e) {
					playsound(Text);
				}
				public void mouseExited(MouseEvent e) {
					playsound(Text);
				}
			});
		  rdbtnRound.setBackground(new Color(21, 79, 79));
		  rdbtnRound.setBounds(90, 415, 72, 25);
		  addinBook.add(rdbtnRound);
		  
		  rdbtnOneway = new JRadioButton("One-way");
		  rdbtnOneway.addActionListener(new ActionListener() {
		  	public void actionPerformed(ActionEvent e) {
		  		double x=Double.parseDouble(lblPrice.getText());
		  		x*=2;
		  		lblPrice.setText(Double.toString(x));
		  	}
		  });
		  rdbtnOneway.setForeground(Color.WHITE);
		  rdbtnOneway.addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent e) {
					playsound(Press);
				}
				public void mouseEntered(MouseEvent e) {
					playsound(Text);
				}
				public void mouseExited(MouseEvent e) {
					playsound(Text);
				}
			});
		  rdbtnOneway.setBackground(new Color(21, 79, 79));
		  rdbtnOneway.setBounds(166, 415, 93, 25);
		  addinBook.add(rdbtnOneway);
		  ButtonGroup group2=new ButtonGroup();
		  group2.add(rdbtnRound);
		  group2.add(rdbtnOneway);
		  rdbtnOneway.setSelected(true);
		  rdbtnOneway.setEnabled(false);
		  rdbtnRound.setEnabled(false);
		  
		  JSeparator separator_79 = new JSeparator();
		  separator_79.setForeground(Color.WHITE);
		  separator_79.setBounds(309, 126, 183, 8);
		  addinBook.add(separator_79);
		  
		  lblReturndate = new JLabel("ReturnDate");
		  lblReturndate.setVerticalAlignment(SwingConstants.TOP);
		  lblReturndate.setToolTipText("You will return at that Date\r\n");
		  lblReturndate.setForeground(Color.WHITE);
		  lblReturndate.setFont(new Font("Segoe UI Semilight", Font.ITALIC, 25));
		  lblReturndate.setBounds(309, 147, 183, 44);
		  addinBook.add(lblReturndate);
		  
		  JSeparator separator_80 = new JSeparator();
		  separator_80.setForeground(Color.WHITE);
		  separator_80.setBounds(309, 183, 172, 8);
		  addinBook.add(separator_80);
		  
		  JButton btnBookNow = new JButton("Book Now!");
		  btnBookNow.addActionListener(new ActionListener() {
		  	public void actionPerformed(ActionEvent e) {
		  		if(!(lblReturndate.getText().equals("ReturnDate") || lblType_2.getText().equals("Stops") || lblPrice.getText().equals("Price (Manager Discount)") ||
		  				CarIDLbl.getText().equals("CarID")))
		  		{
		  		int check=FindIfAvailable(CarTypeBox.getSelectedItem().toString());
		  		if(check==1)
		  		{
		  		String[] Info=new String[12];
		  		Info[0]=SourceAddComboBox.getSelectedItem().toString();
		  		Info[1]=Destination.getSelectedItem().toString();
		  		if(rdbtnOneway.isSelected())
		  		{
		  		Info[2]="OneWay";
		  		}
		  		else
		  		{
		  			Info[2]="Round";	
		  		}
		  		Info[3]=DepartBox.getSelectedItem().toString();
		  		Info[4]=lblReturndate.getText();
		  		Info[5]=CarTypeBox.getSelectedItem().toString();
		  		Info[6]=lblType_2.getText();
		  		Info[7]=CarIDLbl.getText();
		  		Info[8]=lblPrice.getText();
		  		Info[9]=FirstName+"(Manager)";
		  		Info[10]=LastName+"(Manager)";
		  		Info[11]="10001";
		  		try
				{
					playsound(pop);
					int button=JOptionPane.YES_NO_OPTION;
					int result=JOptionPane.showConfirmDialog(frame, "By clicking Yes, your Booking will be created","Warning",button);
					playsound(pop);
					if(result==JOptionPane.YES_OPTION)
					{
						WriteInfo(book,Info,2);
					playsound(Bam);
					switch(CarTypeBox.getSelectedIndex())
					{
					case 1:
					{
						bus.setTxtFile();
						PrintWriter OutPut=CreatePrintWriterinTryCatch(bus.getTxtFile());
						for(Bus iterate: buses)
						{
							String InfoTobeWritten=iterate.getCompCarID()+","+ iterate.getNoOfSeats() 
							+","+ iterate.getAvailNoOfSeats()+","+Integer.toString(iterate.getDriverID())+","+Boolean.toString(iterate.getAvailable())+","+iterate.getDepartedTime()
							+","+iterate.getAvailableTime()+","+iterate.getCurrDest()+","+iterate.getSource()
							+","+iterate.getComfortability();
							OutPut.println(InfoTobeWritten);
						}
						buses.trimToSize();
						OutPut.close();
						LoadInfo(bus,1);
						break;
					}
					case 2:
					{
						limo.setTxtFile();
						PrintWriter OutPut=CreatePrintWriterinTryCatch(limo.getTxtFile());
						for(Limo iterate: limos)
						{
							String InfoTobeWritten=iterate.getCompCarID()+","+ iterate.getNoOfSeats() 
							+","+ iterate.getAvailNoOfSeats()+","+Integer.toString(iterate.getDriverID())+","+Boolean.toString(iterate.getAvailable())+","+iterate.getDepartedTime()
							+","+iterate.getAvailableTime()+","+iterate.getCurrDest()+","+iterate.getSource()
							+","+iterate.getComfortability();
							OutPut.println(InfoTobeWritten);
						}
						limos.trimToSize();
						OutPut.close();
						LoadInfo(limo,1);
						break;
					}
					case 3:
					{
						minibus.setTxtFile();
						PrintWriter OutPut=CreatePrintWriterinTryCatch(minibus.getTxtFile());
						for(MiniBus iterate: minibuses)
						{
							String InfoTobeWritten=iterate.getCompCarID()+","+ iterate.getNoOfSeats() 
							+","+ iterate.getAvailNoOfSeats()+","+Integer.toString(iterate.getDriverID())+","+Boolean.toString(iterate.getAvailable())+","+iterate.getDepartedTime()
							+","+iterate.getAvailableTime()+","+iterate.getCurrDest()+","+iterate.getSource()
							+","+iterate.getComfortability();
							OutPut.println(InfoTobeWritten);
						}
						minibuses.trimToSize();
						OutPut.close();
						LoadInfo(minibus,1);
						break;
					}
					case 4:
					{
						taxi.setTxtFile();
						PrintWriter OutPut=CreatePrintWriterinTryCatch(taxi.getTxtFile());
						for(RegionalTaxi iterate: taxis)
						{
							String InfoTobeWritten=iterate.getCompCarID()+","+ iterate.getNoOfSeats() 
							+","+ iterate.getAvailNoOfSeats()+","+Integer.toString(iterate.getDriverID())+","+Boolean.toString(iterate.getAvailable())+","+iterate.getDepartedTime()
							+","+iterate.getAvailableTime()+","+iterate.getCurrDest()+","+iterate.getSource()
							+","+iterate.getComfortability();
							OutPut.println(InfoTobeWritten);
						}
						trains.trimToSize();
						OutPut.close();
						LoadInfo(taxi,1);
						break;
					}
					case 5:
					{
						train.setTxtFile();
						PrintWriter OutPut=CreatePrintWriterinTryCatch(train.getTxtFile());
						for(Train iterate: trains)
						{
							String InfoTobeWritten=iterate.getCompCarID()+","+ iterate.getNoOfSeats() 
							+","+ iterate.getAvailNoOfSeats()+","+Integer.toString(iterate.getDriverID())+","+Boolean.toString(iterate.getAvailable())+","+iterate.getDepartedTime()
							+","+iterate.getAvailableTime()+","+iterate.getCurrDest()+","+iterate.getSource()
							+","+iterate.getComfortability();
							OutPut.println(InfoTobeWritten);
						}
						trains.trimToSize();
						OutPut.close();
						LoadInfo(train,1);
						break;
					}
					case 6:
					{
						metro.setTxtFile();
						PrintWriter OutPut=CreatePrintWriterinTryCatch(metro.getTxtFile());
						for(Metro iterate: metros)
						{
							String InfoTobeWritten=iterate.getCompCarID()+","+ iterate.getNoOfSeats() 
							+","+ iterate.getAvailNoOfSeats()+","+Integer.toString(iterate.getDriverID())+","+Boolean.toString(iterate.getAvailable())+","+iterate.getDepartedTime()
							+","+iterate.getAvailableTime()+","+iterate.getCurrDest()+","+iterate.getSource()
							+","+iterate.getComfortability();
							OutPut.println(InfoTobeWritten);
						}
						trains.trimToSize();
						OutPut.close();
						LoadInfo(metro,1);
						break;
					}
					case 7:
					{
						motor.setTxtFile();
						PrintWriter OutPut=CreatePrintWriterinTryCatch(motor.getTxtFile());
						for(Motorcylce iterate: motorcycles)
						{
							String InfoTobeWritten=iterate.getCompCarID()+","+ iterate.getNoOfSeats() 
							+","+ iterate.getAvailNoOfSeats()+","+Integer.toString(iterate.getDriverID())+","+Boolean.toString(iterate.getAvailable())+","+iterate.getDepartedTime()
							+","+iterate.getAvailableTime()+","+iterate.getCurrDest()+","+iterate.getSource()
							+","+iterate.getComfortability();
							OutPut.println(InfoTobeWritten);
						}
						motorcycles.trimToSize();
						OutPut.close();
						LoadInfo(motor,1);
						break;
					}
					}
					JOptionPane.showMessageDialog(frame, "Saved Successfully!");
					ResetBookingGUI();
					populate=false;
					populateB=false;
					DefaultTableModel t1 = (DefaultTableModel) table.getModel();
					DefaultTableModel t2 = (DefaultTableModel) tblTrips.getModel();
					t1.setRowCount(0);
					t2.setRowCount(0);
					}
				}catch(Exception e1)
				{
					playsound(pop);
					JOptionPane.showMessageDialog(null, "Missing Inputs","Input Failure",JOptionPane.ERROR_MESSAGE);
				}
		  		}
		  		else if(check==0)
		  		{
		  			playsound(pop);
		  			JOptionPane.showMessageDialog(frame, "Sorry,There Are no Available Places for This Trip!");
		  			ResetBookingGUI();
		  		}
		  		}
		  		else
		  		{
		  			playsound(pop);
		  			JOptionPane.showMessageDialog(frame, "Please input all the fields");
		  		}
		  	}
		  });
		  btnBookNow.addMouseListener(new MouseAdapter() {
			  	public void mouseClicked(MouseEvent arg0) {
			  		btnBookNow.setBackground(new Color(21, 79, 79).darker());
			  		playsound(Press);
			  	}
			  	public void mouseEntered(MouseEvent e) {
			  		btnBookNow.setBackground(new Color(21, 79, 79).darker());
			  		playsound(Text);
			  	}
			  	public void mouseExited(MouseEvent e) {
			  		btnBookNow.setBackground(new Color(21, 79, 79));
			  		playsound(Text);
			  	}
			  });
		  btnBookNow.setToolTipText("It will be saved once u Create it");
		  btnBookNow.setForeground(Color.WHITE);
		  btnBookNow.setFont(new Font("Segoe UI Semilight", Font.BOLD, 19));
		  btnBookNow.setBackground(new Color(21, 79, 79));
		  btnBookNow.setBounds(314, 377, 151, 44);
		  addinBook.add(btnBookNow);
		  
		  JLabel label_18 = new JLabel("");
		  label_18.setIcon(new ImageIcon("src/System/images/m42q3.png"));
		  label_18.setHorizontalAlignment(SwingConstants.CENTER);
		  label_18.setBounds(524, 24, 436, 380);
		  addinBook.add(label_18);
		  
		  lblType_2 = new JLabel("Stops");
		  lblType_2.setVerticalAlignment(SwingConstants.TOP);
		  lblType_2.setToolTipText("How many Stops in the trip");
		  lblType_2.setForeground(Color.WHITE);
		  lblType_2.setFont(new Font("Segoe UI Semilight", Font.ITALIC, 25));
		  lblType_2.setBounds(309, 203, 183, 44);
		  addinBook.add(lblType_2);
		  
		  JSeparator separator_92 = new JSeparator();
		  separator_92.setForeground(Color.WHITE);
		  separator_92.setBounds(309, 239, 172, 8);
		  addinBook.add(separator_92);
		  
		  lblPrice = new JLabel("Price (Manager Discount)");
		  lblPrice.setVerticalAlignment(SwingConstants.TOP);
		  lblPrice.setToolTipText("the Price of the Trip");
		  lblPrice.setForeground(Color.WHITE);
		  lblPrice.setFont(new Font("Segoe UI Semilight", Font.ITALIC, 21));
		  lblPrice.setBounds(309, 256, 227, 44);
		  addinBook.add(lblPrice);
		  
		  JSeparator separator_93 = new JSeparator();
		  separator_93.setForeground(Color.WHITE);
		  separator_93.setBounds(309, 292, 227, 8);
		  addinBook.add(separator_93);
		  
		  DepartBox = new JComboBox();
		  DepartBox.addActionListener(new ActionListener() {
		  	public void actionPerformed(ActionEvent e) {
		  		try
		  		{
		  		FillLabels(DepartBox.getSelectedItem().toString() , Destination.getSelectedItem().toString() , 
		  				SourceAddComboBox.getSelectedItem().toString(),CarTypeBox.getSelectedItem().toString());
		  		}catch(Exception e3)
		  		{
		  			
		  		}
		  	}
		  });
		  DepartBox.addMouseListener(new MouseAdapter() {
			 	public void mousePressed(MouseEvent e) {
			 		playsound(Press);
			 	}
			 });
		  DepartBox.setForeground(Color.WHITE);
		  DepartBox.setFont(new Font("Segoe UI", Font.PLAIN, 21));
		  DepartBox.setFocusable(false);
		  DepartBox.setBackground(new Color(19, 79, 79));
		  DepartBox.setBounds(309, 82, 183, 33);
		  addinBook.add(DepartBox);
		  
		  JLabel lblDepartdate = new JLabel("DepartDate");
		  lblDepartdate.setVerticalAlignment(SwingConstants.TOP);
		  lblDepartdate.setToolTipText("Choose Which date u want to depart\r\n");
		  lblDepartdate.setForeground(Color.WHITE);
		  lblDepartdate.setFont(new Font("Segoe UI Semilight", Font.ITALIC, 32));
		  lblDepartdate.setBounds(309, 31, 183, 63);
		  addinBook.add(lblDepartdate);
		  
		  CarIDLbl = new JLabel("CarID");
		  CarIDLbl.setVerticalAlignment(SwingConstants.TOP);
		  CarIDLbl.setToolTipText("The CarID that you will travel in");
		  CarIDLbl.setForeground(Color.WHITE);
		  CarIDLbl.setFont(new Font("Segoe UI Semilight", Font.ITALIC, 25));
		  CarIDLbl.setBounds(309, 303, 183, 44);
		  addinBook.add(CarIDLbl);
		  
		  JSeparator separator_94 = new JSeparator();
		  separator_94.setForeground(Color.WHITE);
		  separator_94.setBounds(309, 339, 172, 8);
		  addinBook.add(separator_94);
		 
		 
		  BookinglistTblpnl = new JPanel();
		  infoPanel.add(BookinglistTblpnl, "name_449828689728541");
		  BookinglistTblpnl.setLayout(null);
		  
		  JScrollPane scrollPane = new JScrollPane();
		  scrollPane.setFont(new Font("Segoe UI", Font.BOLD, 12));
		  scrollPane.setBounds(0, 1, 984, 462);
		  BookinglistTblpnl.add(scrollPane);
		  
		  table = new JTable();
		  table.addMouseListener(new MouseAdapter() {
		  	public void mouseClicked(MouseEvent arg0) {
		  		playsound(Press);
		  	}
		  	public void mouseEntered(MouseEvent e) {
		  		playsound(Text);
		  	}
		  	public void mouseExited(MouseEvent e) {
		  		playsound(Text);
		  	}
		  });
		  table.setShowVerticalLines(false);
		  table.setShowHorizontalLines(false);
		  table.setAlignmentX(3.0f);
		  table.setFont(new Font("Segoe UI",Font.ITALIC, 13));
		  table.setRowHeight(32);
		  table.setSelectionBackground(new Color(40, 163, 163).darker().darker());
		  table.setForeground(new Color(51,51,51));
		  table.setGridColor(Color.WHITE);
		  table.setSelectionForeground(Color.WHITE);
		  table.setBorder(emptyborder);
		  table.setShowGrid(false);
		  table.setIntercellSpacing(new Dimension(0, 0));
		  header=table.getTableHeader();
		  
		 table.setModel(new DefaultTableModel(
		 	new Object[][] {
		 	},
		 	new String[] {
		 		"Destination", "Type", "Date", "Car", "Stops", "CarID", "Price", "Seat", "FirstName", "LastName", "BookingID","UserID"
		 	}
		 ));
		 scrollPane.setViewportView(table);
		
		
		 TripsTblPnl = new JPanel();
		infoPanel.add(TripsTblPnl, "name_449832736732070");
		TripsTblPnl.setLayout(null);
		
		JScrollPane scrollPane_11 = new JScrollPane();
		scrollPane_11.setFont(new Font("Segoe UI", Font.BOLD, 12));
		scrollPane_11.setBounds(0, 0, 984, 462);
		TripsTblPnl.add(scrollPane_11);
		
		tblTrips = new JTable();
		tblTrips.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
					"Source", "Destination", "DepartDate", "ReturnDate", "Type", "Price", "CarID"
			}
		));
		tblTrips.addMouseListener(new MouseAdapter() {
		  	public void mouseClicked(MouseEvent arg0) {
		  		playsound(Press);
		  	}
		  	public void mouseEntered(MouseEvent e) {
		  		playsound(Text);
		  	}
		  	public void mouseExited(MouseEvent e) {
		  		playsound(Text);
		  	}
		  });
		tblTrips.setShowVerticalLines(false);
		tblTrips.setShowHorizontalLines(false);
		tblTrips.setAlignmentX(3.0f);
		tblTrips.setFont(new Font("Segoe UI",Font.ITALIC, 13));
		tblTrips.setRowHeight(32);
		tblTrips.setSelectionBackground(new Color(40, 163, 163).darker().darker());
		tblTrips.setForeground(new Color(51,51,51));
		tblTrips.setGridColor(Color.WHITE);
		tblTrips.setSelectionForeground(Color.WHITE);
		tblTrips.setBorder(emptyborder);
		tblTrips.setShowGrid(false);
		tblTrips.setIntercellSpacing(new Dimension(0, 0));
		  header_tbl=table.getTableHeader();
		  
		scrollPane_11.setViewportView(tblTrips);
		
		DeleteBooking = new JPanel();
		DeleteBooking.setLayout(null);
		DeleteBooking.setBackground(new Color(19, 79, 79));
		DeleteBooking.setAlignmentY(0.0f);
		infoPanel.add(DeleteBooking, "name_107955784054288");
		
		JSeparator separator_81 = new JSeparator();
		separator_81.setBounds(13, 10, 960, 14);
		DeleteBooking.add(separator_81);
		
		JSeparator separator_82 = new JSeparator();
		separator_82.setBounds(13, 452, 960, 14);
		DeleteBooking.add(separator_82);
		
		JSeparator separator_83 = new JSeparator();
		separator_83.setOrientation(SwingConstants.VERTICAL);
		separator_83.setBounds(11, 29, 37, 412);
		DeleteBooking.add(separator_83);
		
		JSeparator separator_84 = new JSeparator();
		separator_84.setOrientation(SwingConstants.VERTICAL);
		separator_84.setBounds(974, 29, 37, 412);
		DeleteBooking.add(separator_84);
		
		JLabel label_19 = new JLabel("Source");
		label_19.setVerticalAlignment(SwingConstants.TOP);
		label_19.setToolTipText("Type the first name");
		label_19.setForeground(Color.WHITE);
		label_19.setFont(new Font("Segoe UI Semilight", Font.ITALIC, 32));
		label_19.setBounds(46, 50, 183, 63);
		DeleteBooking.add(label_19);
		
		JSeparator separator_85 = new JSeparator();
		separator_85.setForeground(Color.WHITE);
		separator_85.setBounds(46, 126, 188, 8);
		DeleteBooking.add(separator_85);
		
		JLabel label_21 = new JLabel("Type");
		label_21.setVerticalAlignment(SwingConstants.TOP);
		label_21.setToolTipText("Type of the car to be deleted");
		label_21.setForeground(Color.WHITE);
		label_21.setFont(new Font("Segoe UI Semilight", Font.ITALIC, 32));
		label_21.setBounds(46, 147, 183, 44);
		DeleteBooking.add(label_21);
		
		JSeparator separator_86 = new JSeparator();
		separator_86.setForeground(Color.WHITE);
		separator_86.setFont(new Font("Century Gothic", Font.ITALIC, 15));
		separator_86.setBounds(46, 225, 188, 8);
		DeleteBooking.add(separator_86);
		
		JLabel lblDeparttime = new JLabel("DepartTime");
		lblDeparttime.setVerticalAlignment(SwingConstants.TOP);
		lblDeparttime.setToolTipText("when will the trip start");
		lblDeparttime.setForeground(Color.WHITE);
		lblDeparttime.setFont(new Font("Segoe UI Semilight", Font.ITALIC, 23));
		lblDeparttime.setBounds(46, 246, 183, 44);
		DeleteBooking.add(lblDeparttime);
		
		JSeparator separator_87 = new JSeparator();
		separator_87.setForeground(Color.WHITE);
		separator_87.setBounds(46, 302, 188, 8);
		DeleteBooking.add(separator_87);
		
		JSeparator separator_88 = new JSeparator();
		separator_88.setForeground(Color.WHITE);
		separator_88.setBounds(309, 126, 188, 8);
		DeleteBooking.add(separator_88);
		
		JLabel label_23 = new JLabel("Destination");
		label_23.setVerticalAlignment(SwingConstants.TOP);
		label_23.setToolTipText("Type the Age of the member");
		label_23.setForeground(Color.WHITE);
		label_23.setFont(new Font("Segoe UI Semilight", Font.ITALIC, 25));
		label_23.setBounds(309, 58, 183, 44);
		DeleteBooking.add(label_23);
		
		JLabel label_24 = new JLabel("Car ID");
		label_24.setVerticalAlignment(SwingConstants.TOP);
		label_24.setToolTipText("The ID of the car");
		label_24.setForeground(Color.WHITE);
		label_24.setFont(new Font("Segoe UI Semilight", Font.ITALIC, 25));
		label_24.setBounds(309, 155, 183, 44);
		DeleteBooking.add(label_24);
		
		JSeparator separator_89 = new JSeparator();
		separator_89.setForeground(Color.WHITE);
		separator_89.setBounds(309, 225, 188, 8);
		DeleteBooking.add(separator_89);
		
		JButton button_8 = new JButton("Delete");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(searchedB)
				{
					playsound(pop);
					int button=JOptionPane.YES_NO_OPTION;
					int result=JOptionPane.showConfirmDialog(frame, "By clicking Yes, This booking will be deleted","Warning",button);
					playsound(pop);
					if(result==JOptionPane.YES_OPTION)
					{
					DeleteFromObject(book,SearchTargetB,2);
					playsound(Bam);
					JOptionPane.showMessageDialog(frame, "Deleted Successfully!");
					ResetBookingGUI();
					populate=false;
					populateB=false;
					DefaultTableModel t1 = (DefaultTableModel) table.getModel();
					DefaultTableModel t2 = (DefaultTableModel) tblTrips.getModel();
					t1.setRowCount(0);
					t2.setRowCount(0);
				}
				}
				else
				{
					playsound(pop);
					JOptionPane.showMessageDialog(frame, "You need to Search for the Booking ID First");
				}
			}
		});
		button_8.setToolTipText("It will be Deleted once u hit that button\r\n");
		button_8.setForeground(Color.WHITE);
		button_8.setFont(new Font("Segoe UI Semilight", Font.BOLD, 19));
		button_8.setBackground(new Color(21, 79, 79));
		button_8.addMouseListener(new MouseAdapter() {
			  	public void mouseClicked(MouseEvent arg0) {
			  		button_8.setBackground(new Color(21, 79, 79).darker());
			  		playsound(Press);
			  	}
			  	public void mouseEntered(MouseEvent e) {
			  		button_8.setBackground(new Color(21, 79, 79).darker());
			  		playsound(Text);
			  	}
			  	public void mouseExited(MouseEvent e) {
			  		button_8.setBackground(new Color(21, 79, 79));
			  		playsound(Text);
			  	}
			  });
		button_8.setBounds(309, 395, 151, 44);
		DeleteBooking.add(button_8);
		
		JLabel label_25 = new JLabel("");
		label_25.setIcon(new ImageIcon("src/System/images/Cancel_delete_remove_stop_x_no_close_cross.png"));
		label_25.setHorizontalAlignment(SwingConstants.CENTER);
		label_25.setBounds(524, 24, 436, 380);
		DeleteBooking.add(label_25);
		
		SrcDel = new JLabel();
		SrcDel.setText("Example:Alexandria");
		SrcDel.setForeground(SystemColor.menu);
		SrcDel.setFont(new Font("Century Gothic", Font.ITALIC, 15));
		SrcDel.setBackground(new Color(19, 79, 79));
		SrcDel.setBounds(46, 100, 188, 22);
		DeleteBooking.add(SrcDel);
		
		TypeDel = new JLabel();
		TypeDel.setText("Example:Bus");
		TypeDel.setForeground(SystemColor.menu);
		TypeDel.setFont(new Font("Century Gothic", Font.ITALIC, 15));
		TypeDel.setBackground(new Color(19, 79, 79));
		TypeDel.setBounds(46, 200, 188, 22);
		DeleteBooking.add(TypeDel);
		
		DestDel = new JLabel();
		DestDel.setText("Example:Cairo");
		DestDel.setForeground(SystemColor.menu);
		DestDel.setFont(new Font("Century Gothic", Font.ITALIC, 15));
		DestDel.setBackground(new Color(19, 79, 79));
		DestDel.setBounds(309, 100, 188, 22);
		DeleteBooking.add(DestDel);
		
		CarIDDel = new JLabel();
		CarIDDel.setText("Example:B-4789");
		CarIDDel.setForeground(SystemColor.menu);
		CarIDDel.setFont(new Font("Century Gothic", Font.ITALIC, 15));
		CarIDDel.setBackground(new Color(19, 79, 79));
		CarIDDel.setBounds(309, 200, 188, 22);
		DeleteBooking.add(CarIDDel);
		
		JButton button_9 = new JButton("Search");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!(BookingIDSearch.getText().equals("Example:521") || BookingIDSearch.getText().equals("")))
				{
					SearchTargetB=BookingIDSearch.getText();
				loadBookings();
				bookings.trimToSize();
				boolean flag=false;
				for(int i=0;i<bookings.size();i++)
				{
					if(bookings.get(i).getBookingID()==Integer.parseInt(SearchTargetB))
					{
						SrcDel.setText(bookings.get(i).getSource());
						TypeDel.setText(bookings.get(i).getCarType());
						DestDel.setText(bookings.get(i).getTripDest());
						CarIDDel.setText(bookings.get(i).getCarID());
						DepartDel.setText(bookings.get(i).getTripDate());
						ReturnDel.setText(bookings.get(i).getReturnDate());
						flag=true;
						searchedB=true;
						break;
					}
					
				}
				if(!flag)
				{
					JOptionPane.showMessageDialog(frame, "The booking ID Doesn't Exist","Input Failure",JOptionPane.ERROR_MESSAGE);
				}
				
				
				
				}
				else
				{
					playsound(pop);
					JOptionPane.showMessageDialog(frame, "Please Input the booking ID first","Input Failure",JOptionPane.ERROR_MESSAGE);
				}
				
				
				
				
			}
		});
		button_9.setToolTipText("Press here to Search\r\n");
		button_9.setForeground(Color.WHITE);
		button_9.setFont(new Font("Segoe UI Semilight", Font.BOLD, 19));
		button_9.setBackground(new Color(21, 79, 79));
		 button_9.addMouseListener(new MouseAdapter() {
			  	public void mouseClicked(MouseEvent arg0) {
			  		button_9.setBackground(new Color(21, 79, 79).darker());
			  		playsound(Press);
			  	}
			  	public void mouseEntered(MouseEvent e) {
			  		button_9.setBackground(new Color(21, 79, 79).darker());
			  		playsound(Text);
			  	}
			  	public void mouseExited(MouseEvent e) {
			  		button_9.setBackground(new Color(21, 79, 79));
			  		playsound(Text);
			  	}
			  });
		button_9.setBounds(46, 392, 151, 44);
		DeleteBooking.add(button_9);
		
		JLabel lblBookingid = new JLabel("BookingID");
		lblBookingid.setVerticalAlignment(SwingConstants.TOP);
		lblBookingid.setToolTipText("ID You want to delete");
		lblBookingid.setForeground(Color.WHITE);
		lblBookingid.setFont(new Font("Segoe UI Semilight", Font.ITALIC, 22));
		lblBookingid.setBounds(46, 314, 183, 44);
		DeleteBooking.add(lblBookingid);
		
		BookingIDSearch = new JTextField();
		BookingIDSearch.addFocusListener(new FocusAdapter() {
			public void focusGained(FocusEvent arg0) {
				if((BookingIDSearch.getText().equals("Example:521")))
				{
					BookingIDSearch.setText("");
				}
			}
		});
		BookingIDSearch.addKeyListener(new KeyAdapter() {
		public void keyTyped(KeyEvent e) {
			char ch=e.getKeyChar();
			if(!(Character.isDigit(ch) || e.getKeyChar()==KeyEvent.VK_BACK_SPACE))
			{
				e.consume();
				playsound(pop);
					JOptionPane.showMessageDialog(frame, "You can only Enter Numbers Here","Wrong Input",JOptionPane.ERROR_MESSAGE);
			}
		}
	});
		BookingIDSearch.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent arg0) {
				playsound(Text);
			}
		});
		BookingIDSearch.setText("Example:521");
		BookingIDSearch.setBorder(emptyborder);
		BookingIDSearch.setForeground(SystemColor.menu);
		BookingIDSearch.setFont(new Font("Century Gothic", Font.ITALIC, 15));
		BookingIDSearch.setBackground(new Color(19, 79, 79));
		BookingIDSearch.setBounds(41, 345, 188, 28);
		DeleteBooking.add(BookingIDSearch);
		
		JSeparator separator_90 = new JSeparator();
		separator_90.setForeground(Color.WHITE);
		separator_90.setBounds(41, 377, 188, 8);
		DeleteBooking.add(separator_90);
		
		DepartDel = new JLabel();
		DepartDel.setText("Example:20/10/2018");
		DepartDel.setForeground(SystemColor.menu);
		DepartDel.setFont(new Font("Century Gothic", Font.ITALIC, 15));
		DepartDel.setBackground(new Color(19, 79, 79));
		DepartDel.setBounds(46, 280, 188, 22);
		DeleteBooking.add(DepartDel);
		
		JLabel lblReturntime = new JLabel("ReturnTime");
		lblReturntime.setVerticalAlignment(SwingConstants.TOP);
		lblReturntime.setToolTipText("when will the trip start");
		lblReturntime.setForeground(Color.WHITE);
		lblReturntime.setFont(new Font("Segoe UI Semilight", Font.ITALIC, 23));
		lblReturntime.setBounds(309, 246, 183, 44);
		DeleteBooking.add(lblReturntime);
		
		ReturnDel = new JLabel();
		ReturnDel.setText("Example:20/10/2018");
		ReturnDel.setForeground(SystemColor.menu);
		ReturnDel.setFont(new Font("Century Gothic", Font.ITALIC, 15));
		ReturnDel.setBackground(new Color(19, 79, 79));
		ReturnDel.setBounds(309, 280, 188, 22);
		DeleteBooking.add(ReturnDel);
		
		JSeparator separator_108 = new JSeparator();
		separator_108.setForeground(Color.WHITE);
		separator_108.setBounds(309, 302, 188, 8);
		DeleteBooking.add(separator_108);
		
		AddBookingPnl = new JPanel();
		AddBookingPnl.setLayout(null);
		AddBookingPnl.setBackground(new Color(19, 79, 79));
		infoPanel.add(AddBookingPnl, "name_182088437330897");
		
		JSeparator separator_96 = new JSeparator();
		separator_96.setBounds(13, 10, 960, 14);
		AddBookingPnl.add(separator_96);
		
		JSeparator separator_97 = new JSeparator();
		separator_97.setBounds(13, 452, 960, 14);
		AddBookingPnl.add(separator_97);
		
		JSeparator separator_98 = new JSeparator();
		separator_98.setOrientation(SwingConstants.VERTICAL);
		separator_98.setBounds(11, 29, 37, 412);
		AddBookingPnl.add(separator_98);
		
		JSeparator separator_99 = new JSeparator();
		separator_99.setOrientation(SwingConstants.VERTICAL);
		separator_99.setBounds(974, 29, 37, 412);
		AddBookingPnl.add(separator_99);
		
		TripsCarBox = new JComboBox();
		TripsCarBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!(TripsCarBox.getSelectedItem().toString().equalsIgnoreCase("Choose Car Type")))
				{
					FillAvailableCarsTrips(TripsCarBox.getSelectedItem().toString());
				}
			}
		});
		TripsCarBox.setModel(new DefaultComboBoxModel(new String[] {"Choose Car Type", "Bus", "Mini-Bus", "Limousine", "Taxi", "Train", "Metro", "Motorcycle"}));
		TripsCarBox.setForeground(Color.WHITE);
		 TripsCarBox.addMouseListener(new MouseAdapter() {
			 	public void mousePressed(MouseEvent e) {
			 		playsound(Press);
			 	}
			 });
		TripsCarBox.setFont(new Font("Segoe UI", Font.PLAIN, 21));
		TripsCarBox.setFocusable(false);
		TripsCarBox.setBackground(new Color(19, 79, 79));
		TripsCarBox.setBounds(46, 82, 183, 33);
		AddBookingPnl.add(TripsCarBox);
		
		JLabel label_5 = new JLabel("Car Type");
		label_5.setVerticalAlignment(SwingConstants.TOP);
		label_5.setToolTipText("Choose which car type u want to add");
		label_5.setForeground(Color.WHITE);
		label_5.setFont(new Font("Segoe UI Semilight", Font.ITALIC, 32));
		label_5.setBounds(46, 31, 183, 63);
		AddBookingPnl.add(label_5);
		
		JSeparator separator_100 = new JSeparator();
		separator_100.setForeground(Color.WHITE);
		separator_100.setBounds(46, 126, 188, 8);
		AddBookingPnl.add(separator_100);
		
		JLabel label_14 = new JLabel("Source");
		label_14.setVerticalAlignment(SwingConstants.TOP);
		label_14.setToolTipText("Choose the Source ");
		label_14.setForeground(Color.WHITE);
		label_14.setFont(new Font("Segoe UI Semilight", Font.ITALIC, 32));
		label_14.setBounds(46, 137, 183, 44);
		AddBookingPnl.add(label_14);
		
		TripsSourceBox = new JComboBox();
		TripsSourceBox.setModel(new DefaultComboBoxModel(new String[] {"Choose Source", "Alexandria", "Cairo", "Port-Said", "Ismalia", "Behyra", "Dahab", "Mansoura", "Ras-Shitan", "Marsa-Matrouh", "Luxor", "Aswan", "Saudi-Arabia", "Tanta", "Libya", "Sharn-Elsheikh", "Hurghada", "Marsa-Alam", "El-Gouna", "Sahl-Hasheesh", "Siwa", "Giza"}));
		TripsSourceBox.setForeground(Color.WHITE);
		 TripsSourceBox.addMouseListener(new MouseAdapter() {
			 	public void mousePressed(MouseEvent e) {
			 		playsound(Press);
			 	}
			 });
		TripsSourceBox.setFont(new Font("Segoe UI", Font.PLAIN, 21));
		TripsSourceBox.setFocusable(false);
		TripsSourceBox.setBackground(new Color(19, 79, 79));
		TripsSourceBox.setBounds(46, 185, 183, 33);
		AddBookingPnl.add(TripsSourceBox);
		
		JSeparator separator_101 = new JSeparator();
		separator_101.setForeground(Color.WHITE);
		separator_101.setBounds(46, 229, 188, 8);
		AddBookingPnl.add(separator_101);
		
		JLabel label_16 = new JLabel("Destination");
		label_16.setVerticalAlignment(SwingConstants.TOP);
		label_16.setToolTipText("Choose the desired destination ");
		label_16.setForeground(Color.WHITE);
		label_16.setFont(new Font("Segoe UI Semilight", Font.ITALIC, 31));
		label_16.setBounds(46, 247, 183, 44);
		AddBookingPnl.add(label_16);
		
		TripsDestinationBox = new JComboBox();
		TripsDestinationBox.setModel(new DefaultComboBoxModel(new String[] {"Choose Destination", "Alexandria", "Cairo", "Port-Said", "Ismalia", "Behyra", "Dahab", "Mansoura", "Ras-Shitan", "Marsa-Matrouh", "Luxor", "Aswan", "Saudi-Arabia", "Tanta", "Libya", "Sharn-Elsheikh", "Hurghada", "Marsa-Alam", "El-Gouna", "Sahl-Hasheesh", "Siwa", "Giza"}));
		TripsDestinationBox.setForeground(Color.WHITE);
		 TripsDestinationBox.addMouseListener(new MouseAdapter() {
			 	public void mousePressed(MouseEvent e) {
			 		playsound(Press);
			 	}
			 });
		TripsDestinationBox.setFont(new Font("Segoe UI", Font.PLAIN, 21));
		TripsDestinationBox.setFocusable(false);
		TripsDestinationBox.setDoubleBuffered(true);
		TripsDestinationBox.setBackground(new Color(19, 79, 79));
		TripsDestinationBox.setBounds(46, 295, 183, 33);
		AddBookingPnl.add(TripsDestinationBox);
		
		JSeparator separator_102 = new JSeparator();
		separator_102.setForeground(Color.WHITE);
		separator_102.setBounds(46, 339, 188, 8);
		AddBookingPnl.add(separator_102);
		
		JSeparator separator_103 = new JSeparator();
		separator_103.setForeground(Color.WHITE);
		separator_103.setBounds(309, 126, 183, 8);
		AddBookingPnl.add(separator_103);
		
		JLabel lblStops = new JLabel("Stops");
		lblStops.setVerticalAlignment(SwingConstants.TOP);
		lblStops.setToolTipText("Choose how many stops");
		lblStops.setForeground(Color.WHITE);
		lblStops.setFont(new Font("Segoe UI Semilight", Font.ITALIC, 25));
		lblStops.setBounds(309, 145, 183, 44);
		AddBookingPnl.add(lblStops);
		
		JButton button_1 = new JButton("Book Now!");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!(TripsCarBox.getSelectedItem().toString().equalsIgnoreCase("Choose Car Type")
					|| TripsSourceBox.getSelectedItem().toString().equalsIgnoreCase("Choose Source")	
					|| TripsDestinationBox.getSelectedItem().toString().equalsIgnoreCase("Choose Destination")
					|| label_17.getText().equals("") 
					|| label_17.getText().equalsIgnoreCase("Price")
					|| TripsStopsBox.getSelectedItem().toString().equalsIgnoreCase("Choose Stops")
					|| TripsAvailableCarsBox.getItemCount()==0
					|| DepartDay.getSelectedItem().toString().equalsIgnoreCase("dd")
					|| DepartMonth.getSelectedItem().toString().equalsIgnoreCase("mm")
					|| DepartYear.getSelectedItem().toString().equalsIgnoreCase("yyyy")
					|| ReturnDay.getSelectedItem().toString().equalsIgnoreCase("dd")
					|| ReturnMonth.getSelectedItem().toString().equalsIgnoreCase("mm")
					|| ReturnYear.getSelectedItem().toString().equalsIgnoreCase("yyyy")
					|| TripsSourceBox.getSelectedItem().toString().equalsIgnoreCase(TripsDestinationBox.getSelectedItem().toString())
						))
				{
					String[] Info=new String[7];
					Info[0]=TripsSourceBox.getSelectedItem().toString();
					Info[1]=TripsDestinationBox.getSelectedItem().toString();
					String DepartDate=DepartDay.getSelectedItem().toString()+"/"+DepartMonth.getSelectedItem().toString()+"/"+DepartYear.getSelectedItem().toString();
					Info[2]=DepartDate;
					String ReturnDate=ReturnDay.getSelectedItem().toString()+"/"+ReturnMonth.getSelectedItem().toString()+"/"+ReturnYear.getSelectedItem().toString();
					Info[3]=ReturnDate;
					Info[4]=TripsCarBox.getSelectedItem().toString();
					Info[5]=label_17.getText();
					Info[6]=TripsAvailableCarsBox.getSelectedItem().toString();
					try
					{
						playsound(pop);
						int button=JOptionPane.YES_NO_OPTION;
						int result=JOptionPane.showConfirmDialog(frame, "By clicking Yes, your Trip will be created","Warning",button);
						playsound(pop);
						if(result==JOptionPane.YES_OPTION)
						{
							WriteInfo(trip,Info,4);
							loadAllCars();
							buses.trimToSize();
							limos.trimToSize();
							trains.trimToSize();
							metros.trimToSize();
							minibuses.trimToSize();
							taxis.trimToSize();
							motorcycles.trimToSize();
							switch(TripsCarBox.getSelectedItem().toString())
							{
							case"Bus":
							{
								for(int i=0;i<buses.size();i++)
								{
									if(buses.get(i).getCompCarID().equalsIgnoreCase(TripsAvailableCarsBox.getSelectedItem().toString()))
									{
										buses.get(i).setAvailable(false);
										buses.get(i).setSource(TripsSourceBox.getSelectedItem().toString());
										buses.get(i).setCurrDest(TripsDestinationBox.getSelectedItem().toString());
										buses.get(i).setAvailableTime(ReturnDate);
										buses.get(i).setDepartedTime(DepartDate);
										break;
									}
								}
								bus.setTxtFile();
								PrintWriter OutPut=CreatePrintWriterinTryCatch(bus.getTxtFile());
								for(Bus iterate: buses)
								{
									String InfoTobeWritten=iterate.getCompCarID()+","+ iterate.getNoOfSeats() 
									+","+ iterate.getAvailNoOfSeats()+","+Integer.toString(iterate.getDriverID())+","+Boolean.toString(iterate.getAvailable())+","+iterate.getDepartedTime()
									+","+iterate.getAvailableTime()+","+iterate.getCurrDest()+","+iterate.getSource()
									+","+iterate.getComfortability();
									OutPut.println(InfoTobeWritten);
								}
								buses.trimToSize();
								OutPut.close();
								break;
							}
							case"Limousine":
							{
								for(int i=0;i<limos.size();i++)
								{
									if(limos.get(i).getCompCarID().equalsIgnoreCase(TripsAvailableCarsBox.getSelectedItem().toString()))
									{
										limos.get(i).setAvailable(false);
										limos.get(i).setSource(TripsSourceBox.getSelectedItem().toString());
										limos.get(i).setCurrDest(TripsDestinationBox.getSelectedItem().toString());
										limos.get(i).setAvailableTime(ReturnDate);
										limos.get(i).setDepartedTime(DepartDate);
										break;
									}
								}
								limo.setTxtFile();
								PrintWriter OutPut=CreatePrintWriterinTryCatch(limo.getTxtFile());
								for(Limo iterate: limos)
								{
									String InfoTobeWritten=iterate.getCompCarID()+","+ iterate.getNoOfSeats() 
									+","+ iterate.getAvailNoOfSeats()+","+Integer.toString(iterate.getDriverID())+","+Boolean.toString(iterate.getAvailable())+","+iterate.getDepartedTime()
									+","+iterate.getAvailableTime()+","+iterate.getCurrDest()+","+iterate.getSource()
									+","+iterate.getComfortability();
									OutPut.println(InfoTobeWritten);
								}
								limos.trimToSize();
								OutPut.close();
								
								break;
							}
							case"Mini-Bus":
							{
								for(int i=0;i<minibuses.size();i++)
								{
									if(minibuses.get(i).getCompCarID().equalsIgnoreCase(TripsAvailableCarsBox.getSelectedItem().toString()))
									{
										minibuses.get(i).setAvailable(false);
										minibuses.get(i).setSource(TripsSourceBox.getSelectedItem().toString());
										minibuses.get(i).setCurrDest(TripsDestinationBox.getSelectedItem().toString());
										minibuses.get(i).setAvailableTime(ReturnDate);
										minibuses.get(i).setDepartedTime(DepartDate);
										break;
									}
								}
								minibus.setTxtFile();
								PrintWriter OutPut=CreatePrintWriterinTryCatch(minibus.getTxtFile());
								for(MiniBus iterate: minibuses)
								{
									String InfoTobeWritten=iterate.getCompCarID()+","+ iterate.getNoOfSeats() 
									+","+ iterate.getAvailNoOfSeats()+","+Integer.toString(iterate.getDriverID())+","+Boolean.toString(iterate.getAvailable())+","+iterate.getDepartedTime()
									+","+iterate.getAvailableTime()+","+iterate.getCurrDest()+","+iterate.getSource()
									+","+iterate.getComfortability();
									OutPut.println(InfoTobeWritten);
								}
								minibuses.trimToSize();
								OutPut.close();
								break;
							}
							case"Taxi":
							{
								for(int i=0;i<taxis.size();i++)
								{
									if(taxis.get(i).getCompCarID().equalsIgnoreCase(TripsAvailableCarsBox.getSelectedItem().toString()))
									{
										taxis.get(i).setAvailable(false);
										taxis.get(i).setSource(TripsSourceBox.getSelectedItem().toString());
										taxis.get(i).setCurrDest(TripsDestinationBox.getSelectedItem().toString());
										taxis.get(i).setAvailableTime(ReturnDate);
										taxis.get(i).setDepartedTime(DepartDate);
										break;
									}
								}
								taxi.setTxtFile();
								PrintWriter OutPut=CreatePrintWriterinTryCatch(taxi.getTxtFile());
								for(RegionalTaxi iterate: taxis)
								{
									String InfoTobeWritten=iterate.getCompCarID()+","+ iterate.getNoOfSeats() 
									+","+ iterate.getAvailNoOfSeats()+","+Integer.toString(iterate.getDriverID())+","+Boolean.toString(iterate.getAvailable())+","+iterate.getDepartedTime()
									+","+iterate.getAvailableTime()+","+iterate.getCurrDest()+","+iterate.getSource()
									+","+iterate.getComfortability();
									OutPut.println(InfoTobeWritten);
								}
								taxis.trimToSize();
								OutPut.close();
								
								break;
							}
							case"Train":
							{
								for(int i=0;i<trains.size();i++)
								{
									if(trains.get(i).getCompCarID().equalsIgnoreCase(TripsAvailableCarsBox.getSelectedItem().toString()))
									{
										trains.get(i).setAvailable(false);
										trains.get(i).setSource(TripsSourceBox.getSelectedItem().toString());
										trains.get(i).setCurrDest(TripsDestinationBox.getSelectedItem().toString());
										trains.get(i).setAvailableTime(ReturnDate);
										trains.get(i).setDepartedTime(DepartDate);
										break;
									}
								}
								train.setTxtFile();
								PrintWriter OutPut=CreatePrintWriterinTryCatch(train.getTxtFile());
								for(Train iterate: trains)
								{
									String InfoTobeWritten=iterate.getCompCarID()+","+ iterate.getNoOfSeats() 
									+","+ iterate.getAvailNoOfSeats()+","+Integer.toString(iterate.getDriverID())+","+Boolean.toString(iterate.getAvailable())+","+iterate.getDepartedTime()
									+","+iterate.getAvailableTime()+","+iterate.getCurrDest()+","+iterate.getSource()
									+","+iterate.getComfortability();
									OutPut.println(InfoTobeWritten);
								}
								trains.trimToSize();
								OutPut.close();
								
								break;
							}
							case"Metro":
							{
								for(int i=0;i<metros.size();i++)
								{
									if(metros.get(i).getCompCarID().equalsIgnoreCase(TripsAvailableCarsBox.getSelectedItem().toString()))
									{
										metros.get(i).setAvailable(false);
										metros.get(i).setSource(TripsSourceBox.getSelectedItem().toString());
										metros.get(i).setCurrDest(TripsDestinationBox.getSelectedItem().toString());
										metros.get(i).setAvailableTime(ReturnDate);
										metros.get(i).setDepartedTime(DepartDate);
										break;
									}
								}
								metro.setTxtFile();
								PrintWriter OutPut=CreatePrintWriterinTryCatch(metro.getTxtFile());
								for(Metro iterate: metros)
								{
									String InfoTobeWritten=iterate.getCompCarID()+","+ iterate.getNoOfSeats() 
									+","+ iterate.getAvailNoOfSeats()+","+Integer.toString(iterate.getDriverID())+","+Boolean.toString(iterate.getAvailable())+","+iterate.getDepartedTime()
									+","+iterate.getAvailableTime()+","+iterate.getCurrDest()+","+iterate.getSource()
									+","+iterate.getComfortability();
									OutPut.println(InfoTobeWritten);
								}
								metros.trimToSize();
								OutPut.close();
								
								break;
							}
							case"Motorcycle":
							{
								for(int i=0;i<motorcycles.size();i++)
								{
									if(motorcycles.get(i).getCompCarID().equalsIgnoreCase(TripsAvailableCarsBox.getSelectedItem().toString()))
									{
										motorcycles.get(i).setAvailable(false);
										motorcycles.get(i).setSource(TripsSourceBox.getSelectedItem().toString());
										motorcycles.get(i).setCurrDest(TripsDestinationBox.getSelectedItem().toString());
										motorcycles.get(i).setAvailableTime(ReturnDate);
										motorcycles.get(i).setDepartedTime(DepartDate);
										break;
									}
								}
								motor.setTxtFile();
								PrintWriter OutPut=CreatePrintWriterinTryCatch(motor.getTxtFile());
								for(Motorcylce iterate: motorcycles)
								{
									String InfoTobeWritten=iterate.getCompCarID()+","+ iterate.getNoOfSeats() 
									+","+ iterate.getAvailNoOfSeats()+","+Integer.toString(iterate.getDriverID())+","+Boolean.toString(iterate.getAvailable())+","+iterate.getDepartedTime()
									+","+iterate.getAvailableTime()+","+iterate.getCurrDest()+","+iterate.getSource()
									+","+iterate.getComfortability();
									OutPut.println(InfoTobeWritten);
								}
								motorcycles.trimToSize();
								OutPut.close();
								
								break;
							}
							}
						playsound(Bam);
						JOptionPane.showMessageDialog(frame, "Saved Successfully!");
						ResetBookingGUI();
						populate=false;
						populateB=false;
						DefaultTableModel t1 = (DefaultTableModel) table.getModel();
						DefaultTableModel t2 = (DefaultTableModel) tblTrips.getModel();
						t1.setRowCount(0);
						t2.setRowCount(0);
						}
					}catch(Exception e3)
					{
						playsound(pop);
						e3.printStackTrace();
						JOptionPane.showMessageDialog(null, "Missing Inputs","Input Failure",JOptionPane.ERROR_MESSAGE);
					}
					
				}
				else
				{
					playsound(pop);
					JOptionPane.showMessageDialog(frame, "Please Input all the fields", "Input Error", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		button_1.setToolTipText("It will be saved once u Create it");
		button_1.setForeground(Color.WHITE);
		button_1.addMouseListener(new MouseAdapter() {
		  	public void mouseClicked(MouseEvent arg0) {
		  		button_1.setBackground(new Color(21, 79, 79).darker());
		  		playsound(Press);
		  	}
		  	public void mouseEntered(MouseEvent e) {
		  		button_1.setBackground(new Color(21, 79, 79).darker());
		  		playsound(Text);
		  	}
		  	public void mouseExited(MouseEvent e) {
		  		button_1.setBackground(new Color(21, 79, 79));
		  		playsound(Text);
		  	}
		  });
		button_1.setFont(new Font("Segoe UI Semilight", Font.BOLD, 19));
		button_1.setBackground(new Color(21, 79, 79));
		button_1.setBounds(56, 371, 151, 44);
		AddBookingPnl.add(button_1);
		
		JLabel label_32 = new JLabel("");
		label_32.setIcon(new ImageIcon("src/System/images/map-icon.png"));
		label_32.setHorizontalAlignment(SwingConstants.CENTER);
		label_32.setBounds(540, 13, 422, 391);
		AddBookingPnl.add(label_32);
		
		JSeparator separator_105 = new JSeparator();
		separator_105.setForeground(Color.WHITE);
		separator_105.setBounds(309, 229, 172, 8);
		AddBookingPnl.add(separator_105);
		
		label_17 = new JTextField();
		label_17.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent e) {
				char ch=e.getKeyChar();
				if(!(Character.isDigit(ch) || e.getKeyChar()==KeyEvent.VK_BACK_SPACE))
				{
					e.consume();
					playsound(pop);
						JOptionPane.showMessageDialog(frame, "You can only input numbers here!","Wrong Input",JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		label_17.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent arg0) {
				playsound(Text);
			}
		});
		label_17.addFocusListener(new FocusAdapter() {
			public void focusGained(FocusEvent arg0) {
				if(label_17.getText().equals("Price"))
				{
					label_17.setText("");
				}
			}
		});
		label_17.setText("Price");
		label_17.setBorder(emptyborder);
		label_17.setToolTipText("the Price of the Trip");
		label_17.setForeground(Color.WHITE);
		label_17.setBackground(new Color(19, 79, 79));
		label_17.setFont(new Font("Segoe UI Semilight", Font.ITALIC, 25));
		label_17.setBounds(497, 381, 183, 33);
		AddBookingPnl.add(label_17);
		
		JSeparator separator_106 = new JSeparator();
		separator_106.setForeground(Color.WHITE);
		separator_106.setBounds(497, 417, 188, 8);
		AddBookingPnl.add(separator_106);
		
		TripsAvailableCarsBox = new JComboBox();
		TripsAvailableCarsBox.setForeground(Color.WHITE);
		TripsAvailableCarsBox.setFont(new Font("Segoe UI", Font.PLAIN, 21));
		TripsAvailableCarsBox.setFocusable(false);
		 TripsAvailableCarsBox.addMouseListener(new MouseAdapter() {
			 	public void mousePressed(MouseEvent e) {
			 		playsound(Press);
			 	}
			 });
		TripsAvailableCarsBox.setBackground(new Color(19, 79, 79));
		TripsAvailableCarsBox.setBounds(309, 82, 183, 33);
		AddBookingPnl.add(TripsAvailableCarsBox);
		
		JLabel lblAvailableCars = new JLabel("Available Cars");
		lblAvailableCars.setVerticalAlignment(SwingConstants.TOP);
		lblAvailableCars.setToolTipText("Choose the Car ID");
		lblAvailableCars.setForeground(Color.WHITE);
		lblAvailableCars.setFont(new Font("Segoe UI Semilight", Font.ITALIC, 28));
		lblAvailableCars.setBounds(309, 31, 183, 63);
		AddBookingPnl.add(lblAvailableCars);
		
		JLabel lblDepartDate = new JLabel("Depart Date");
		lblDepartDate.setVerticalAlignment(SwingConstants.TOP);
		lblDepartDate.setToolTipText("Choose the DepartDate");
		lblDepartDate.setForeground(Color.WHITE);
		lblDepartDate.setFont(new Font("Segoe UI Semilight", Font.ITALIC, 25));
		lblDepartDate.setBounds(309, 235, 183, 44);
		AddBookingPnl.add(lblDepartDate);
		
		JSeparator separator_107 = new JSeparator();
		separator_107.setForeground(Color.WHITE);
		separator_107.setBounds(309, 320, 172, 8);
		AddBookingPnl.add(separator_107);
		
		TripsStopsBox = new JComboBox();
		TripsStopsBox.setModel(new DefaultComboBoxModel(new String[] {"Choose Stops", "Many Stops", "One Stop", "NonStop"}));
		TripsStopsBox.setForeground(Color.WHITE);
		 TripsStopsBox.addMouseListener(new MouseAdapter() {
			 	public void mousePressed(MouseEvent e) {
			 		playsound(Press);
			 	}
			 });
		TripsStopsBox.setFont(new Font("Segoe UI", Font.PLAIN, 21));
		TripsStopsBox.setFocusable(false);
		TripsStopsBox.setBackground(new Color(19, 79, 79));
		TripsStopsBox.setBounds(309, 185, 172, 33);
		AddBookingPnl.add(TripsStopsBox);
		
		DepartDay = new JComboBox();
		DepartDay.setModel(new DefaultComboBoxModel(new String[] {"dd", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
		DepartDay.setForeground(Color.WHITE);
		 DepartDay.addMouseListener(new MouseAdapter() {
			 	public void mousePressed(MouseEvent e) {
			 		playsound(Press);
			 	}
			 });
		DepartDay.setFont(new Font("Segoe UI", Font.PLAIN, 17));
		DepartDay.setFocusable(false);
		DepartDay.setDoubleBuffered(true);
		DepartDay.setBackground(new Color(19, 79, 79));
		DepartDay.setBounds(309, 276, 46, 33);
		AddBookingPnl.add(DepartDay);
		
		DepartMonth = new JComboBox();
		DepartMonth.setModel(new DefaultComboBoxModel(new String[] {"MM", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"}));
		DepartMonth.setForeground(Color.WHITE);
		 DepartMonth.addMouseListener(new MouseAdapter() {
			 	public void mousePressed(MouseEvent e) {
			 		playsound(Press);
			 	}
			 });
		DepartMonth.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		DepartMonth.setFocusable(false);
		DepartMonth.setDoubleBuffered(true);
		DepartMonth.setBackground(new Color(19, 79, 79));
		DepartMonth.setBounds(367, 276, 46, 33);
		AddBookingPnl.add(DepartMonth);
		
		DepartYear = new JComboBox();
		DepartYear.setModel(new DefaultComboBoxModel(new String[] {"yyyy", "2018", "2019", "2020", "2021"}));
		DepartYear.setForeground(Color.WHITE);
		DepartYear.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		DepartYear.setFocusable(false);
		 DepartYear.addMouseListener(new MouseAdapter() {
			 	public void mousePressed(MouseEvent e) {
			 		playsound(Press);
			 	}
			 });
		DepartYear.setDoubleBuffered(true);
		DepartYear.setBackground(new Color(19, 79, 79));
		DepartYear.setBounds(425, 276, 56, 33);
		AddBookingPnl.add(DepartYear);
		
		JLabel lblReturnDate = new JLabel("Return Date");
		lblReturnDate.setVerticalAlignment(SwingConstants.TOP);
		lblReturnDate.setToolTipText("Choose the Return Date");
		lblReturnDate.setForeground(Color.WHITE);
		lblReturnDate.setFont(new Font("Segoe UI Semilight", Font.ITALIC, 25));
		lblReturnDate.setBounds(309, 330, 183, 44);
		AddBookingPnl.add(lblReturnDate);
		
		ReturnYear = new JComboBox();
		ReturnYear.setModel(new DefaultComboBoxModel(new String[] {"yyyy", "2018", "2019", "2020", "2021"}));
		ReturnYear.setForeground(Color.WHITE);
		ReturnYear.addMouseListener(new MouseAdapter() {
		 	public void mousePressed(MouseEvent e) {
		 		playsound(Press);
		 	}
		 });
		ReturnYear.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		ReturnYear.setFocusable(false);
		ReturnYear.setDoubleBuffered(true);
		ReturnYear.setBackground(new Color(19, 79, 79));
		ReturnYear.setBounds(425, 371, 56, 33);
		AddBookingPnl.add(ReturnYear);
		
		ReturnMonth = new JComboBox();
		ReturnMonth.setModel(new DefaultComboBoxModel(new String[] {"MM", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"}));
		ReturnMonth.setForeground(Color.WHITE);
		ReturnMonth.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		ReturnMonth.setFocusable(false);
		ReturnMonth.addMouseListener(new MouseAdapter() {
		 	public void mousePressed(MouseEvent e) {
		 		playsound(Press);
		 	}
		 });
		ReturnMonth.setDoubleBuffered(true);
		ReturnMonth.setBackground(new Color(19, 79, 79));
		ReturnMonth.setBounds(367, 371, 46, 33);
		AddBookingPnl.add(ReturnMonth);
		
		ReturnDay = new JComboBox();
		ReturnDay.setModel(new DefaultComboBoxModel(new String[] {"dd", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
		ReturnDay.setForeground(Color.WHITE);
		ReturnDay.addMouseListener(new MouseAdapter() {
		 	public void mousePressed(MouseEvent e) {
		 		playsound(Press);
		 	}
		 });
		ReturnDay.setFont(new Font("Segoe UI", Font.PLAIN, 17));
		ReturnDay.setFocusable(false);
		ReturnDay.setDoubleBuffered(true);
		ReturnDay.setBackground(new Color(19, 79, 79));
		ReturnDay.setBounds(309, 371, 46, 33);
		AddBookingPnl.add(ReturnDay);
		
		JSeparator separator_104 = new JSeparator();
		separator_104.setForeground(Color.WHITE);
		separator_104.setBounds(309, 415, 172, 8);
		AddBookingPnl.add(separator_104);
		 header.setBackground(new Color(222,222,222));
			header.setForeground(new Color(51,51,51));
			header.setFont(new Font("Segoe UI",Font.ITALIC,14));
		
		Employee = new JPanel();
		framesgrp.add(Employee, "name_95696800176731");
		Employee.setLayout(null);
		
		JPanel Employeemenu = new JPanel();
		Employeemenu.setBackground(new Color(40,163,163).darker());
		Employeemenu.setBounds(0, 0, 278, 462);
		Employee.add(Employeemenu);
		Employeemenu.setLayout(null);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setBounds(23, 0, 213, 47);
		Employeemenu.add(separator_3);
		
		 Emplist = new JButton("Employees");
		Emplist.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LoadAllHumans();
				EmpIntro.setVisible(false);
				InfoMem.setVisible(true);
				AddMenuMem.setVisible(false);
				DeleteMenuMem_1.setVisible(false);
				EmpPnl.setVisible(true);
				UserPnl.setVisible(false);
				ManagerPnl.setVisible(false);
				VipPnl.setVisible(false);
				ResetManagementGui();
		 		if(!populateH1)
		 		{
		 		PopulateEmployee();
		 		tblEmp.setRowSelectionInterval(1,1);
		 		}
		 		populateH1=true;
			}
		});
		Emplist.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent arg0) {
				playsound(Text);
				Emplist.setBackground(new Color(40,163,163).darker().darker());
			}
			public void mouseExited(MouseEvent e) {
				if(chosenH!=1)
					Emplist.setBackground(new Color(40,163,163).darker());
			}
			public void mousePressed(MouseEvent e) {
				playsound(Press);
				setBtnColor(Emplist);
				resetBtnColor(Userlist);
				resetBtnColor(Managerlist);
				resetBtnColor(Viplist);
				resetBtnColor(btnDeleteM);
				resetBtnColor(btnAddM);
				chosenH=1;
			}
			public void mouseClicked(MouseEvent arg0) {
				setBtnColor(Emplist);
				resetBtnColor(Userlist);
				resetBtnColor(Managerlist);
				resetBtnColor(Viplist);
				resetBtnColor(btnDeleteM);
				resetBtnColor(btnAddM);
				chosenH=1;
				
				
			}
		});
		Emplist.setBorder(emptyborder);
		Emplist.setForeground(Color.WHITE);
		Emplist.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 29));
		Emplist.setFocusable(false);
		Emplist.setBackground(new Color(40, 163, 163).darker());
		Emplist.setBounds(23, 60, 230, 47);
		Employeemenu.add(Emplist);
		
		Managerlist = new JButton("Managers");
		Managerlist.setForeground(Color.WHITE);
		Managerlist.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 29));
		Managerlist.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LoadAllHumans();
				EmpIntro.setVisible(false);
				InfoMem.setVisible(true);
				AddMenuMem.setVisible(false);
				DeleteMenuMem_1.setVisible(false);
				EmpPnl.setVisible(false);
				UserPnl.setVisible(false);
				ManagerPnl.setVisible(true);
				VipPnl.setVisible(false);
				ResetManagementGui();
		 		if(!populateH2)
		 		{
		 		PopulateManager();
		 		tblManager.setRowSelectionInterval(1,1);
		 		}
		 		populateH2=true;
			}
		});
		
		Managerlist.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent arg0) {
				playsound(Text);
				Managerlist.setBackground(new Color(40,163,163).darker().darker());
			}
			public void mouseExited(MouseEvent e) {
				if(chosenH!=2)
					Managerlist.setBackground(new Color(40,163,163).darker());
			}
			public void mousePressed(MouseEvent e) {
				playsound(Press);
				setBtnColor(Managerlist);
				resetBtnColor(Userlist);
				resetBtnColor(Emplist);
				resetBtnColor(Viplist);
				resetBtnColor(btnDeleteM);
				resetBtnColor(btnAddM);
				chosenH=2;
			}
			public void mouseClicked(MouseEvent arg0) {
				setBtnColor(Managerlist);
				resetBtnColor(Userlist);
				resetBtnColor(Emplist);
				resetBtnColor(Viplist);
				resetBtnColor(btnDeleteM);
				resetBtnColor(btnAddM);
				chosenH=2;
				
				
			}
		});
		Managerlist.setBorder(emptyborder);
		Managerlist.setFocusable(false);
		Managerlist.setBackground(new Color(40, 163, 163).darker());
		Managerlist.setBounds(23, 113, 230, 47);
		Employeemenu.add(Managerlist);
		
		Viplist = new JButton("VIP Users");
		Viplist.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			LoadAllHumans();
			EmpIntro.setVisible(false);
			InfoMem.setVisible(true);
			AddMenuMem.setVisible(false);
			DeleteMenuMem_1.setVisible(false);
			EmpPnl.setVisible(false);
			UserPnl.setVisible(false);
			ManagerPnl.setVisible(false);
			VipPnl.setVisible(true);
			ResetManagementGui();
		 		if(!populateH4)
		 		{
		 		PopulateVIP();
		 		}
		 		populateH4=true;
		 		try
		 		{
		 	tblVip.setRowSelectionInterval(0,0);
			}
	 		catch(Exception e2)
	 		{
	 			playsound(pop);
	 			JOptionPane.showMessageDialog(frame, "There are no vip members yet","Information Error",JOptionPane.ERROR_MESSAGE);
				playsound(pop);
				EmpIntro.setVisible(true);
				InfoMem.setVisible(false);
				AddMenuMem.setVisible(false);
				DeleteMenuMem_1.setVisible(false);
				EmpPnl.setVisible(false);
				UserPnl.setVisible(false);
				ManagerPnl.setVisible(false);
				VipPnl.setVisible(false);
	 		}
			}
		});
		Viplist.setForeground(Color.WHITE);
		Viplist.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 29));
		Viplist.setFocusable(false);
		Viplist.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent arg0) {
				playsound(Text);
				Viplist.setBackground(new Color(40,163,163).darker().darker());
			}
			public void mouseExited(MouseEvent e) {
				if(chosenH!=4)
					Viplist.setBackground(new Color(40,163,163).darker());
			}
			public void mousePressed(MouseEvent e) {
				playsound(Press);
				setBtnColor(Viplist);
				resetBtnColor(Userlist);
				resetBtnColor(Managerlist);
				resetBtnColor(Emplist);
				resetBtnColor(btnDeleteM);
				resetBtnColor(btnAddM);
				chosenH=4;
			}
			public void mouseClicked(MouseEvent arg0) {
				setBtnColor(Viplist);
				resetBtnColor(Userlist);
				resetBtnColor(Managerlist);
				resetBtnColor(Emplist);
				resetBtnColor(btnDeleteM);
				resetBtnColor(btnAddM);
				chosenH=4;
				
				
			}
		});
		Viplist.setBorder(emptyborder);
		Viplist.setBackground(new Color(40, 163, 163).darker());
		Viplist.setBounds(23, 219, 230, 47);
		Employeemenu.add(Viplist);
		
		Userlist = new JButton("Users");
		Userlist.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				LoadAllHumans();
				EmpIntro.setVisible(false);
				InfoMem.setVisible(true);
				AddMenuMem.setVisible(false);
				DeleteMenuMem_1.setVisible(false);
				EmpPnl.setVisible(false);
				UserPnl.setVisible(true);
				ManagerPnl.setVisible(false);
				VipPnl.setVisible(false);
				ResetManagementGui();
		 		if(!populateH3)
		 		{
		 		PopulateUser();
		 		tblUser.setRowSelectionInterval(1,1);
		 		}
		 		populateH3=true;
			}
		});
		Userlist.setForeground(Color.WHITE);
		Userlist.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 29));
		Userlist.setFocusable(false);
		Userlist.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent arg0) {
				playsound(Text);
				Userlist.setBackground(new Color(40,163,163).darker().darker());
			}
			public void mouseExited(MouseEvent e) {
				if(chosenH!=3)
					Userlist.setBackground(new Color(40,163,163).darker());
			}
			public void mousePressed(MouseEvent e) {
				playsound(Press);
				setBtnColor(Userlist);
				resetBtnColor(Emplist);
				resetBtnColor(Managerlist);
				resetBtnColor(Viplist);
				resetBtnColor(btnDeleteM);
				resetBtnColor(btnAddM);
				chosenH=3;
			}
			public void mouseClicked(MouseEvent arg0) {
				setBtnColor(Userlist);
				resetBtnColor(Emplist);
				resetBtnColor(Managerlist);
				resetBtnColor(Viplist);
				resetBtnColor(btnDeleteM);
				resetBtnColor(btnAddM);
				chosenH=3;
				
				
			}
		});
		Userlist.setBorder(emptyborder);
		Userlist.setBackground(new Color(40, 163, 163).darker());
		Userlist.setBounds(23, 166, 230, 47);
		Employeemenu.add(Userlist);
		
		button_5 = new JButton("Back");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ResetManagementGui();
				Menu1.setVisible(true);
				Employee.setVisible(false);
				pnlButtons.setVisible(false);
				pnlMembers.setVisible(false);
				chosenH=0;
				populateH1=false;
				populateH2=false;
				populateH3=false;
				populateH4=false;
				DefaultTableModel t1 = (DefaultTableModel) tblEmp.getModel();
				DefaultTableModel t2 = (DefaultTableModel) tblUser.getModel();
				DefaultTableModel t3 = (DefaultTableModel) tblManager.getModel();
				DefaultTableModel t4 = (DefaultTableModel) tblVip.getModel();
				t1.setRowCount(0);
				t2.setRowCount(0);
				t3.setRowCount(0);
				t4.setRowCount(0);
			}
		});
		button_5.setForeground(Color.WHITE);
		button_5.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 29));
		button_5.setFocusable(false);
		button_5.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent arg0) {
				button_5.setBackground(new Color(40,163,163).darker().darker());
				playsound(Text);
			}
			public void mouseExited(MouseEvent e) {
				button_5.setBackground(new Color(40,163,163).darker());
			}
			public void mousePressed(MouseEvent e) {
				button_5.setBackground(new Color(40,163,163).darker().darker());
				playsound(Press);
				resetBtnColor(Userlist);
				resetBtnColor(Emplist);
				resetBtnColor(Managerlist);
				resetBtnColor(Viplist);
				resetBtnColor(btnDeleteM);
				resetBtnColor(btnAddM);
			}
		});
		button_5.setBorder(emptyborder);
		button_5.setBackground(new Color(40, 163, 163).darker());
		button_5.setBounds(23, 279, 230, 40);
		Employeemenu.add(button_5);
		
		JSeparator separator_13 = new JSeparator(SwingConstants.VERTICAL);
		separator_13.setBounds(265, 13, 37, 436);
		Employeemenu.add(separator_13);
		
		JSeparator separator_14 = new JSeparator(SwingConstants.VERTICAL);
		separator_14.setBounds(12, 13, 37, 436);
		Employeemenu.add(separator_14);
		
		JSeparator separator_15 = new JSeparator();
		separator_15.setBounds(23, 447, 233, 47);
		Employeemenu.add(separator_15);
		
		JPanel Changer2 = new JPanel();
		Changer2.setBounds(278, 0, 984, 462);
		Employee.add(Changer2);
		Changer2.setLayout(new CardLayout(0, 0));
		
		EmpIntro = new JPanel();
		Changer2.add(EmpIntro, "name_95631857333119");
		EmpIntro.setLayout(null);
		EmpIntro.setBackground(new Color(19, 79, 79));
		
		JSeparator separator_28 = new JSeparator();
		separator_28.setBounds(12, 9, 960, 14);
		EmpIntro.add(separator_28);
		
		JSeparator separator_29 = new JSeparator();
		separator_29.setBounds(12, 450, 960, 14);
		EmpIntro.add(separator_29);
		
		JSeparator separator_30 = new JSeparator();
		separator_30.setOrientation(SwingConstants.VERTICAL);
		separator_30.setBounds(11, 25, 37, 412);
		EmpIntro.add(separator_30);
		
		JSeparator separator_31 = new JSeparator();
		separator_31.setOrientation(SwingConstants.VERTICAL);
		separator_31.setBounds(971, 25, 37, 412);
		EmpIntro.add(separator_31);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon("src/System/images/d796c8ce6e3716adbc19e9d86978cf2f.png"));
		label_1.setBounds(22, 13, 306, 329);
		EmpIntro.add(label_1);
		
		JSeparator separator_32 = new JSeparator();
		separator_32.setForeground(Color.WHITE);
		separator_32.setBounds(390, 121, 297, 14);
		EmpIntro.add(separator_32);
		
		JLabel lblMembersManagementMenu = new JLabel("Members Management Menu");
		lblMembersManagementMenu.setHorizontalAlignment(SwingConstants.CENTER);
		lblMembersManagementMenu.setForeground(Color.WHITE);
		lblMembersManagementMenu.setFont(new Font("Segoe UI Semibold", Font.BOLD, 45));
		lblMembersManagementMenu.setBounds(324, 0, 648, 151);
		EmpIntro.add(lblMembersManagementMenu);
		
		JTextArea txtrInTheMembers = new JTextArea();
		txtrInTheMembers.setText("In the Members Management Menu, you can Check all the Employees,M-anagers,Users and Vip Users' Information also you Can Add to them, w-ithout the need to enter a new ID for any of them where The Program Automatically Generate a Random ID for them, also you can Edit or Del-ete any of the Information\r\n");
		txtrInTheMembers.setLineWrap(true);
		txtrInTheMembers.setForeground(Color.WHITE);
		txtrInTheMembers.setFont(new Font("Segoe UI", Font.ITALIC, 20));
		txtrInTheMembers.setEditable(false);
		txtrInTheMembers.setBackground(new Color(19, 79, 79));
		txtrInTheMembers.setBounds(324, 140, 632, 141);
		EmpIntro.add(txtrInTheMembers);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setText("Well, What are you Waiting For?!\r\nTRY IT NOW!\r\nBy choosing one of the options on the Right, simply by Clicking on Them");
		textArea_1.setLineWrap(true);
		textArea_1.setForeground(Color.WHITE);
		textArea_1.setFont(new Font("Century Gothic", Font.BOLD, 25));
		textArea_1.setEditable(false);
		textArea_1.setBackground(new Color(19, 79, 79));
		textArea_1.setBounds(324, 294, 632, 155);
		EmpIntro.add(textArea_1);
		
		JSeparator separator_33 = new JSeparator();
		separator_33.setForeground(Color.GRAY);
		separator_33.setBounds(327, 289, 632, 14);
		EmpIntro.add(separator_33);
		
		InfoMem = new JPanel();
		Changer2.add(InfoMem, "name_95627457626497");
		InfoMem.setLayout(new CardLayout(0, 0));
		
		EmpPnl = new JPanel();
		InfoMem.add(EmpPnl, "name_50994029048932");
		EmpPnl.setLayout(null);
		
		JScrollPane scrollPane_7 = new JScrollPane();
		scrollPane_7.setBounds(0, 0, 984, 462);
		EmpPnl.add(scrollPane_7);
		
		tblEmp = new JTable();
		tblEmp.addMouseListener(new MouseAdapter() {
		 	public void mouseClicked(MouseEvent arg0) {
		 		playsound(Press);
		 	}
		 	public void mouseEntered(MouseEvent e) {
		 		playsound(Text);
		 	}
		 	public void mouseExited(MouseEvent e) {
		 		playsound(Text);
		 	}
		 });
		tblEmp.setShowVerticalLines(false);
		tblEmp.setShowHorizontalLines(false);
		tblEmp.setAlignmentX(3.0f);
		tblEmp.setFont(new Font("Segoe UI",Font.ITALIC, 13));
		tblEmp.setRowHeight(32);
		tblEmp.setSelectionBackground(new Color(40, 163, 163).darker().darker());
		tblEmp.setForeground(new Color(51,51,51));
		tblEmp.setGridColor(Color.WHITE);
		tblEmp.setSelectionForeground(Color.WHITE);
		tblEmp.setBorder(emptyborder);
		tblEmp.setShowGrid(false);
		tblEmp.setIntercellSpacing(new Dimension(0, 0));
		header_7=tblEmp.getTableHeader();
		tblEmp.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"FirstName", "SecondName", "EmpID", "PhoneNumber", "StartingDate", "Availablity", "CarID", "Destination", "DepartTime", "AvailableTime", "Salary", "Age", "Level", "Type", "Trips Made"
			}
		));
		scrollPane_7.setViewportView(tblEmp);
		
		 UserPnl = new JPanel();
		 InfoMem.add(UserPnl, "name_50994029048932");
		 UserPnl.setLayout(null);
		 
		 JScrollPane scrollPane_8 = new JScrollPane();
		 scrollPane_8.setBounds(0, 0, 984, 462);
		 UserPnl.add(scrollPane_8);
		 
		 tblUser = new JTable();
		 tblUser.addMouseListener(new MouseAdapter() {
		  	public void mouseClicked(MouseEvent arg0) {
		  		playsound(Press);
		  	}
		  	public void mouseEntered(MouseEvent e) {
		  		playsound(Text);
		  	}
		  	public void mouseExited(MouseEvent e) {
		  		playsound(Text);
		  	}
		  });
		 tblUser.setShowVerticalLines(false);
		 tblUser.setShowHorizontalLines(false);
		 tblUser.setAlignmentX(3.0f);
		 tblUser.setFont(new Font("Segoe UI",Font.ITALIC, 13));
		 tblUser.setRowHeight(32);
		 tblUser.setSelectionBackground(new Color(40, 163, 163).darker().darker());
		 tblUser.setForeground(new Color(51,51,51));
		 tblUser.setGridColor(Color.WHITE);
		 tblUser.setSelectionForeground(Color.WHITE);
		 tblUser.setBorder(emptyborder);
		 tblUser.setShowGrid(false);
		 tblUser.setIntercellSpacing(new Dimension(0, 0));
		 header_8=tblUser.getTableHeader();
		 tblUser.setModel(new DefaultTableModel(
		 	new Object[][] {
		 	},
		 	new String[] {
		 			"FirstName", "SecondName", "UserID", "PhoneNumber", "Age", "State", "TripCounter","Trips Currently In"
		 	}
		 ));
		 scrollPane_8.setViewportView(tblUser);
		 
		 ManagerPnl = new JPanel();
		 InfoMem.add(ManagerPnl, "name_50994029048932");
		 ManagerPnl.setLayout(null);
		 
		 JScrollPane scrollPane_9 = new JScrollPane();
		 scrollPane_9.setBounds(0, 0, 984, 462);
		 ManagerPnl.add(scrollPane_9);
		 
		 tblManager = new JTable();
		 tblManager.addMouseListener(new MouseAdapter() {
		  	public void mouseClicked(MouseEvent arg0) {
		  		playsound(Press);
		  	}
		  	public void mouseEntered(MouseEvent e) {
		  		playsound(Text);
		  	}
		  	public void mouseExited(MouseEvent e) {
		  		playsound(Text);
		  	}
		  });
		 tblManager.setShowVerticalLines(false);
		 tblManager.setShowHorizontalLines(false);
		 tblManager.setAlignmentX(3.0f);
		 tblManager.setFont(new Font("Segoe UI",Font.ITALIC, 13));
		 tblManager.setRowHeight(32);
		 tblManager.setSelectionBackground(new Color(40, 163, 163).darker().darker());
		 tblManager.setForeground(new Color(51,51,51));
		 tblManager.setGridColor(Color.WHITE);
		 tblManager.setSelectionForeground(Color.WHITE);
		 tblManager.setBorder(emptyborder);
		 tblManager.setShowGrid(false);
		 tblManager.setIntercellSpacing(new Dimension(0, 0));
		 header_9=tblManager.getTableHeader();
		 tblManager.setModel(new DefaultTableModel(
		 	new Object[][] {
		 	},
		 	new String[] {
		 		"FirstName", "SecondName", "ManagerID", "PhoneNumber", "Salary", "Age", "Type"
		 	}
		 ));
		 scrollPane_9.setViewportView(tblManager);
		 
		 VipPnl = new JPanel();
		 InfoMem.add(VipPnl, "name_50994029048932");
		 VipPnl.setLayout(null);
		 
		 JScrollPane scrollPane_10 = new JScrollPane();
		 scrollPane_10.setBounds(0, 0, 984, 462);
		 VipPnl.add(scrollPane_10);
		 
		 tblVip = new JTable();
		 tblVip.addMouseListener(new MouseAdapter() {
		  	public void mouseClicked(MouseEvent arg0) {
		  		playsound(Press);
		  	}
		  	public void mouseEntered(MouseEvent e) {
		  		playsound(Text);
		  	}
		  	public void mouseExited(MouseEvent e) {
		  		playsound(Text);
		  	}
		  });
		 tblVip.setShowVerticalLines(false);
		 tblVip.setShowHorizontalLines(false);
		 tblVip.setAlignmentX(3.0f);
		 tblVip.setFont(new Font("Segoe UI",Font.ITALIC, 13));
		 tblVip.setRowHeight(32);
		 tblVip.setSelectionBackground(new Color(40, 163, 163).darker().darker());
		 tblVip.setForeground(new Color(51,51,51));
		 tblVip.setGridColor(Color.WHITE);
		 tblVip.setSelectionForeground(Color.WHITE);
		 tblVip.setBorder(emptyborder);
		 tblVip.setShowGrid(false);
		 tblVip.setIntercellSpacing(new Dimension(0, 0));
		 header_10=tblVip.getTableHeader();
		 tblVip.setModel(new DefaultTableModel(
		 	new Object[][] {
		 	},
		 	new String[] {
		 			"FirstName", "SecondName", "VIPUserID", "PhoneNumber", "Salary", "Age", "Type"
		 	}
		 ));
		 scrollPane_10.setViewportView(tblVip);
		 
		 AddMenuMem = new JPanel();
		 AddMenuMem.setAlignmentY(Component.TOP_ALIGNMENT);
		 AddMenuMem.setLayout(null);
		 AddMenuMem.setBackground(new Color(19, 79, 79));
		 InfoMem.add(AddMenuMem, "name_38817476418888");
		 
		 JSeparator separator_43 = new JSeparator();
		 separator_43.setBounds(13, 10, 960, 14);
		 AddMenuMem.add(separator_43);
		 
		 JSeparator separator_44 = new JSeparator();
		 separator_44.setBounds(13, 452, 960, 14);
		 AddMenuMem.add(separator_44);
		 
		 JSeparator separator_45 = new JSeparator();
		 separator_45.setOrientation(SwingConstants.VERTICAL);
		 separator_45.setBounds(11, 29, 37, 412);
		 AddMenuMem.add(separator_45);
		 
		 JSeparator separator_46 = new JSeparator();
		 separator_46.setOrientation(SwingConstants.VERTICAL);
		 separator_46.setBounds(974, 29, 37, 412);
		 AddMenuMem.add(separator_46);
		 
		 JLabel lblFirstname = new JLabel("Firstname");
		 lblFirstname.setVerticalAlignment(SwingConstants.TOP);
		 lblFirstname.setToolTipText("Type the first name");
		 lblFirstname.setForeground(Color.WHITE);
		 lblFirstname.setFont(new Font("Segoe UI Semilight", Font.ITALIC, 32));
		 lblFirstname.setBounds(46, 50, 183, 63);
		 AddMenuMem.add(lblFirstname);
		 
		 JSeparator separator_47 = new JSeparator();
		 separator_47.setForeground(Color.WHITE);
		 separator_47.setBounds(46, 126, 188, 8);
		 AddMenuMem.add(separator_47);
		 
		 JLabel lblLastname = new JLabel("Lastname");
		 lblLastname.setVerticalAlignment(SwingConstants.TOP);
		 lblLastname.setToolTipText("Type the last name");
		 lblLastname.setForeground(Color.WHITE);
		 lblLastname.setFont(new Font("Segoe UI Semilight", Font.ITALIC, 32));
		 lblLastname.setBounds(46, 192, 183, 44);
		 AddMenuMem.add(lblLastname);
		 
		 JSeparator separator_48 = new JSeparator();
		 separator_48.setFont(new Font("Century Gothic", Font.ITALIC, 15));
		 separator_48.setForeground(Color.WHITE);
		 separator_48.setBounds(46, 262, 188, 8);
		 AddMenuMem.add(separator_48);
		 
		 JLabel lblType = new JLabel("Type");
		 lblType.setVerticalAlignment(SwingConstants.TOP);
		 lblType.setToolTipText("Choose the State of the Member");
		 lblType.setForeground(Color.WHITE);
		 lblType.setFont(new Font("Segoe UI Semilight", Font.ITALIC, 31));
		 lblType.setBounds(46, 306, 183, 44);
		 AddMenuMem.add(lblType);
		 
		 HumanTypeBox = new JComboBox();
		 HumanTypeBox.setModel(new DefaultComboBoxModel(new String[] {"Choose Type", "User", "Employee", "Manager"}));
		 HumanTypeBox.setForeground(SystemColor.control);
		 HumanTypeBox.addMouseListener(new MouseAdapter() {
			 	public void mousePressed(MouseEvent e) {
			 		playsound(Press);
			 	}
			 	public void mouseEntered(MouseEvent e) {
			 		playsound(Text);
			 	}
			 });
		 HumanTypeBox.setFont(new Font("Segoe UI", Font.PLAIN, 21));
		 HumanTypeBox.setFocusable(false);
		 HumanTypeBox.setDoubleBuffered(true);
		 HumanTypeBox.setBackground(new Color(19, 79, 79));
		 HumanTypeBox.setBounds(46, 354, 183, 33);
		 AddMenuMem.add(HumanTypeBox);
		 
		 JSeparator separator_49 = new JSeparator();
		 separator_49.setForeground(Color.WHITE);
		 separator_49.setBounds(46, 398, 188, 8);
		 AddMenuMem.add(separator_49);
		 
		 JSeparator separator_50 = new JSeparator();
		 separator_50.setForeground(Color.WHITE);
		 separator_50.setBounds(309, 126, 188, 8);
		 AddMenuMem.add(separator_50);
		 
		 JLabel lblAge = new JLabel("Age");
		 lblAge.setVerticalAlignment(SwingConstants.TOP);
		 lblAge.setToolTipText("Type the Age of the member");
		 lblAge.setForeground(Color.WHITE);
		 lblAge.setFont(new Font("Segoe UI Semilight", Font.ITALIC, 25));
		 lblAge.setBounds(309, 58, 183, 44);
		 AddMenuMem.add(lblAge);
		 
		 JLabel lblPhonenumber = new JLabel("Phonenumber");
		 lblPhonenumber.setVerticalAlignment(SwingConstants.TOP);
		 lblPhonenumber.setToolTipText("Enter the phonenumber of the member");
		 lblPhonenumber.setForeground(Color.WHITE);
		 lblPhonenumber.setFont(new Font("Segoe UI Semilight", Font.ITALIC, 25));
		 lblPhonenumber.setBounds(309, 158, 183, 44);
		 AddMenuMem.add(lblPhonenumber);
		 
		 JSeparator separator_51 = new JSeparator();
		 separator_51.setForeground(Color.WHITE);
		 separator_51.setBounds(309, 228, 188, 8);
		 AddMenuMem.add(separator_51);
		 
		 CreateAccbtn = new JButton("Create");
		 CreateAccbtn.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent arg0) {
		 		char[] pwdc=txtPassword.getPassword();
				String check=new String(pwdc);
				String[] Info= new String[5];
				System.out.println(check);
				if(!((txtFirst.getText().equals("") ||txtFirst.getText().equals("Example:Hisham") )|| (txtLast.getText().equals("") || txtLast.getText().equals("Example:Maged"))
						||(txtPhone.getText().equals("")|| txtPhone.getText().equals("Example:01228961190"))
						||(txtAge.getText().equals("") || txtAge.getText().equals("Example:19")) ||(txtPassword.getPassword().length==0|| check.equals("asdasd")) || (HumanTypeBox.getSelectedItem().toString().equals("Choose Type"))))
				{
				Info[0]=txtFirst.getText();
				Info[1]=txtLast.getText();
				Info[2]=txtPhone.getText();
				Info[3]=txtAge.getText();
				char[] pwd=txtPassword.getPassword();
				Info[4]=new String(pwd);
				try
				{
					playsound(pop);
					int button=JOptionPane.YES_NO_OPTION;
					int result=JOptionPane.showConfirmDialog(frame, "By clicking Yes, your account will be created","Warning",button);
					playsound(pop);
					if(result==JOptionPane.YES_OPTION)
					{
						switch(HumanTypeBox.getSelectedItem().toString())
						{
						case "User":WriteInfo(user,Info,3);break;
						case "Employee":WriteInfo(employee,Info,3);break;
						case "Manager":WriteInfo(manager,Info,3);break;
						default:{
							playsound(pop);
							JOptionPane.showMessageDialog(frame, "Please Choose a Type","Creation Failure",JOptionPane.ERROR_MESSAGE);
							break;
						}
						}
						
					playsound(Bam);
					JOptionPane.showMessageDialog(frame, "Saved Successfully!");
					populateH1=false;
					populateH2=false;
					populateH3=false;
					populateH4=false;
					DefaultTableModel t1 = (DefaultTableModel) tblEmp.getModel();
					DefaultTableModel t2 = (DefaultTableModel) tblUser.getModel();
					DefaultTableModel t3 = (DefaultTableModel) tblManager.getModel();
					DefaultTableModel t4 = (DefaultTableModel) tblVip.getModel();
					t1.setRowCount(0);
					t2.setRowCount(0);
					t3.setRowCount(0);
					t4.setRowCount(0);
					ResetManagementGui();
					
					}
				}catch(Exception e)
				{
					playsound(pop);
					JOptionPane.showMessageDialog(frame, "Missing Inputs","Input Failure",JOptionPane.ERROR_MESSAGE);
				}
			}
				else
				{
					playsound(pop);
					JOptionPane.showMessageDialog(frame, "Please input all the fields");
				}
				
			}
		 });
		 CreateAccbtn.setToolTipText("It will be saved once u Create it");
		 CreateAccbtn.addMouseListener(new MouseAdapter() {
			  	public void mouseClicked(MouseEvent arg0) {
			  		CreateAccbtn.setBackground(new Color(21, 79, 79).darker());
			  		playsound(Press);
			  	}
			  	public void mouseEntered(MouseEvent e) {
			  		CreateAccbtn.setBackground(new Color(21, 79, 79).darker());
			  		playsound(Text);
			  	}
			  	public void mouseExited(MouseEvent e) {
			  		CreateAccbtn.setBackground(new Color(21, 79, 79));
			  		playsound(Text);
			  	}
			  });
		 CreateAccbtn.setForeground(Color.WHITE);
		 CreateAccbtn.setFont(new Font("Segoe UI Semilight", Font.BOLD, 19));
		 CreateAccbtn.setBackground(new Color(21, 79, 79));
		 CreateAccbtn.setBounds(321, 369, 151, 44);
		 AddMenuMem.add(CreateAccbtn);
		 
		 JLabel label_8 = new JLabel("");
		 label_8.setIcon(new ImageIcon("src/System/images/1463426558_profle.original.png"));
		 label_8.setHorizontalAlignment(SwingConstants.CENTER);
		 label_8.setBounds(524, 24, 436, 380);
		 AddMenuMem.add(label_8);
		 
		 txtFirst = new JTextField();
		 txtFirst.addKeyListener(new KeyAdapter() {
				public void keyTyped(KeyEvent e) {
					char ch=e.getKeyChar();
					if(!(Character.isAlphabetic(ch) || e.getKeyChar()==KeyEvent.VK_BACK_SPACE))
					{
						e.consume();
						playsound(pop);
							JOptionPane.showMessageDialog(frame, "You Can enter Alphabits in names only","Wrong Input",JOptionPane.ERROR_MESSAGE);
					}
				}
			});
		 txtFirst.setText("Example:Hisham");
		 txtFirst.setFont(new Font("Century Gothic", Font.ITALIC, 15));
		 txtFirst.addFocusListener(new FocusAdapter() {
		 	public void focusGained(FocusEvent arg0) {
		 		playsound(Text);
		 		txtFirst.setText("");
		 	}
		 });
		 txtFirst.setForeground(SystemColor.control);
		 txtFirst.setBackground(new Color(19, 79, 79));
		 txtFirst.setBounds(46, 100, 188, 22);
		 txtFirst.setBorder(emptyborder);
		 AddMenuMem.add(txtFirst);
		 txtFirst.setColumns(10);
		 
		 txtLast = new JTextField();
		 txtLast.setFont(new Font("Century Gothic", Font.ITALIC, 15));
		 txtLast.setText("Example:Maged");
		 txtLast.setForeground(SystemColor.control);
		 txtLast.addKeyListener(new KeyAdapter() {
				public void keyTyped(KeyEvent e) {
					char ch=e.getKeyChar();
					if(!(Character.isAlphabetic(ch) || e.getKeyChar()==KeyEvent.VK_BACK_SPACE))
					{
						e.consume();
						playsound(pop);
							JOptionPane.showMessageDialog(frame, "You Can enter Alphabits in names only","Wrong Input",JOptionPane.ERROR_MESSAGE);
					}
				}
			});
		 txtLast.addFocusListener(new FocusAdapter() {
			 	public void focusGained(FocusEvent arg0) {
			 		playsound(Text);
			 		txtLast.setText("");
			 	}
			 });
		 txtLast.setColumns(10);
		 txtLast.addMouseListener(new MouseAdapter() {
			 	public void mousePressed(MouseEvent e) {
			 		playsound(Text);
			 	}
			 });
		 txtLast.setBorder(emptyborder);
		 txtLast.setBackground(new Color(19, 79, 79));
		 txtLast.setBounds(46, 237, 188, 22);
		 AddMenuMem.add(txtLast);
		 
		 txtAge = new JTextField();
		 txtAge.addKeyListener(new KeyAdapter() {
				public void keyTyped(KeyEvent e) {
					char ch=e.getKeyChar();
					if(!(Character.isDigit(ch) || e.getKeyChar()==KeyEvent.VK_BACK_SPACE))
					{
						e.consume();
						playsound(pop);
							JOptionPane.showMessageDialog(frame, "You Can Only Enter Numbers here","Wrong Input",JOptionPane.ERROR_MESSAGE);
							
					}
				}
			});
		 txtAge.setText("Example:19");
		 txtAge.setFont(new Font("Century Gothic", Font.ITALIC, 15));
		 txtAge.setForeground(SystemColor.control);
		 txtAge.setColumns(10);
		 txtAge.addFocusListener(new FocusAdapter() {
			 	public void focusGained(FocusEvent arg0) {
			 		playsound(Text);
			 		txtAge.setText("");
			 	}
			 });
		 txtAge.addMouseListener(new MouseAdapter() {
			 	public void mousePressed(MouseEvent e) {
			 		playsound(Text);
			 	}
			 });
		 txtAge.setBorder(emptyborder);
		 txtAge.setBackground(new Color(19, 79, 79));
		 txtAge.setBounds(309, 100, 188, 22);
		 AddMenuMem.add(txtAge);
		 
		 txtPhone = new JTextField();
		 txtPhone.addKeyListener(new KeyAdapter() {
				public void keyTyped(KeyEvent e) {
					char ch=e.getKeyChar();
					if(!(Character.isDigit(ch) || e.getKeyChar()==KeyEvent.VK_BACK_SPACE))
					{
						e.consume();
						playsound(pop);
							JOptionPane.showMessageDialog(frame, "You Can Only Enter Numbers here","Wrong Input",JOptionPane.ERROR_MESSAGE);
							
					}
				}
			});
		 txtPhone.setText("Example:01228961190");
		 txtPhone.setFont(new Font("Century Gothic", Font.ITALIC, 15));
		 txtPhone.setForeground(SystemColor.control);
		 txtPhone.setBorder(emptyborder);
		 txtPhone.addFocusListener(new FocusAdapter() {
			 	public void focusGained(FocusEvent arg0) {
			 		playsound(Text);
			 		txtPhone.setText("");
			 	}
			 });
		 txtPhone.addMouseListener(new MouseAdapter() {
			 	public void mousePressed(MouseEvent e) {
			 		playsound(Text);
			 	}
			 });
		 txtPhone.setColumns(10);
		 txtPhone.setBackground(new Color(19, 79, 79));
		 txtPhone.setBounds(309, 203, 188, 22);
		 AddMenuMem.add(txtPhone);
		 
		 JLabel lblPassword = new JLabel("Password");
		 lblPassword.setVerticalAlignment(SwingConstants.TOP);
		 lblPassword.setToolTipText("Enter the phonenumber of the member");
		 lblPassword.setForeground(Color.WHITE);
		 lblPassword.setFont(new Font("Segoe UI Semilight", Font.ITALIC, 25));
		 lblPassword.setBounds(309, 250, 183, 44);
		 AddMenuMem.add(lblPassword);
		 
		 txtPassword = new JPasswordField();
		 txtPassword.setText("asdasd");
		 txtPassword.setForeground(SystemColor.menu);
		 txtPassword.setFont(new Font("Century Gothic", Font.ITALIC, 15));
		 txtPassword.setColumns(10);
		 txtPassword.setBorder(emptyborder);
		 txtPassword.addFocusListener(new FocusAdapter() {
			 	public void focusGained(FocusEvent arg0) {
			 		playsound(Text);
			 		txtPassword.setText("");
			 	}
			 });
		 txtPassword.addMouseListener(new MouseAdapter() {
			 	public void mousePressed(MouseEvent e) {
			 		playsound(Text);
			 	}
			 });
		 txtPassword.setBackground(new Color(19, 79, 79));
		 txtPassword.setBounds(309, 295, 188, 22);
		 AddMenuMem.add(txtPassword);
		 
		 JSeparator separator_91 = new JSeparator();
		 separator_91.setForeground(Color.WHITE);
		 separator_91.setBounds(309, 320, 188, 8);
		 AddMenuMem.add(separator_91);
		 
		DeleteMenuMem_1 = new JPanel();
		 DeleteMenuMem_1.setLayout(null);
		 DeleteMenuMem_1.setBackground(new Color(19, 79, 79));
		 DeleteMenuMem_1.setAlignmentY(0.0f);
		 InfoMem.add(DeleteMenuMem_1, "name_40972124153057");
		 
		 JSeparator separator_52 = new JSeparator();
		 separator_52.setBounds(13, 10, 960, 14);
		 DeleteMenuMem_1.add(separator_52);
		 
		 JSeparator separator_53 = new JSeparator();
		 separator_53.setBounds(13, 452, 960, 14);
		 DeleteMenuMem_1.add(separator_53);
		 
		 JSeparator separator_54 = new JSeparator();
		 separator_54.setOrientation(SwingConstants.VERTICAL);
		 separator_54.setBounds(11, 29, 37, 412);
		 DeleteMenuMem_1.add(separator_54);
		 
		 JSeparator separator_55 = new JSeparator();
		 separator_55.setOrientation(SwingConstants.VERTICAL);
		 separator_55.setBounds(974, 29, 37, 412);
		 DeleteMenuMem_1.add(separator_55);
		 
		 JLabel label_2 = new JLabel("Firstname");
		 label_2.setVerticalAlignment(SwingConstants.TOP);
		 label_2.setToolTipText("Type the first name");
		 label_2.setForeground(Color.WHITE);
		 label_2.setFont(new Font("Segoe UI Semilight", Font.ITALIC, 32));
		 label_2.setBounds(46, 50, 183, 63);
		 DeleteMenuMem_1.add(label_2);
		 
		 JSeparator separator_56 = new JSeparator();
		 separator_56.setForeground(Color.WHITE);
		 separator_56.setBounds(46, 126, 188, 8);
		 DeleteMenuMem_1.add(separator_56);
		 
		 JLabel label_3 = new JLabel("Lastname");
		 label_3.setVerticalAlignment(SwingConstants.TOP);
		 label_3.setToolTipText("Type the last name");
		 label_3.setForeground(Color.WHITE);
		 label_3.setFont(new Font("Segoe UI Semilight", Font.ITALIC, 32));
		 label_3.setBounds(46, 170, 183, 44);
		 DeleteMenuMem_1.add(label_3);
		 
		 JSeparator separator_57 = new JSeparator();
		 separator_57.setForeground(Color.WHITE);
		 separator_57.setFont(new Font("Century Gothic", Font.ITALIC, 15));
		 separator_57.setBounds(46, 248, 188, 8);
		 DeleteMenuMem_1.add(separator_57);
		 
		 JLabel label_4 = new JLabel("Type");
		 label_4.setVerticalAlignment(SwingConstants.TOP);
		 label_4.setToolTipText("Choose the State of the Member");
		 label_4.setForeground(Color.WHITE);
		 label_4.setFont(new Font("Segoe UI Semilight", Font.ITALIC, 31));
		 label_4.setBounds(46, 279, 183, 44);
		 DeleteMenuMem_1.add(label_4);
		 
		 TypeDelBox = new JComboBox();
		 TypeDelBox.addMouseListener(new MouseAdapter() {
		 	public void mousePressed(MouseEvent e) {
		 		playsound(Press);
		 	}
		 });
		 TypeDelBox.setModel(new DefaultComboBoxModel(new String[] {"Choose one", "User", "Employee", "Manager"}));
		 TypeDelBox.setForeground(SystemColor.menu);
		 TypeDelBox.setFont(new Font("Segoe UI", Font.PLAIN, 21));
		 TypeDelBox.setFocusable(false);
		 TypeDelBox.setDoubleBuffered(true);
		 TypeDelBox.setBackground(new Color(19, 79, 79));
		 TypeDelBox.setBounds(46, 327, 183, 33);
		 DeleteMenuMem_1.add(TypeDelBox);
		 
		 JSeparator separator_58 = new JSeparator();
		 separator_58.setForeground(Color.WHITE);
		 separator_58.setBounds(46, 371, 188, 8);
		 DeleteMenuMem_1.add(separator_58);
		 
		 JSeparator separator_59 = new JSeparator();
		 separator_59.setForeground(Color.WHITE);
		 separator_59.setBounds(309, 126, 188, 8);
		 DeleteMenuMem_1.add(separator_59);
		 
		 JLabel label_7 = new JLabel("Age");
		 label_7.setVerticalAlignment(SwingConstants.TOP);
		 label_7.setToolTipText("Type the Age of the member");
		 label_7.setForeground(Color.WHITE);
		 label_7.setFont(new Font("Segoe UI Semilight", Font.ITALIC, 25));
		 label_7.setBounds(309, 58, 183, 44);
		 DeleteMenuMem_1.add(label_7);
		 
		 JLabel label_9 = new JLabel("Phonenumber");
		 label_9.setVerticalAlignment(SwingConstants.TOP);
		 label_9.setToolTipText("Enter the phonenumber of the member");
		 label_9.setForeground(Color.WHITE);
		 label_9.setFont(new Font("Segoe UI Semilight", Font.ITALIC, 25));
		 label_9.setBounds(309, 178, 183, 44);
		 DeleteMenuMem_1.add(label_9);
		 
		 JSeparator separator_60 = new JSeparator();
		 separator_60.setForeground(Color.WHITE);
		 separator_60.setBounds(309, 248, 188, 8);
		 DeleteMenuMem_1.add(separator_60);
		 
		 JButton btnDelete = new JButton("Delete");
		 btnDelete.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent e) {
		 		if(searchedH)
				{
					playsound(pop);
					int button=JOptionPane.YES_NO_OPTION;
					int result=JOptionPane.showConfirmDialog(frame, "By clicking Yes, This Member will be deleted","Warning",button);
					playsound(pop);
					if(result==JOptionPane.YES_OPTION)
					{
						switch(indextobedeletedH)
						{
						case 1:DeleteFromObject(user,SearchTargetH,3);break;
						case 2:DeleteFromObject(employee,SearchTargetH,3);break;
						case 3:DeleteFromObject(manager,SearchTargetH,3);break;
						}
					playsound(Bam);
					JOptionPane.showMessageDialog(frame, "Deleted Successfully!");
					populateH1=false;
					populateH2=false;
					populateH3=false;
					populateH4=false;
					DefaultTableModel t1 = (DefaultTableModel) tblEmp.getModel();
					DefaultTableModel t2 = (DefaultTableModel) tblUser.getModel();
					DefaultTableModel t3 = (DefaultTableModel) tblManager.getModel();
					DefaultTableModel t4 = (DefaultTableModel) tblVip.getModel();
					t1.setRowCount(0);
					t2.setRowCount(0);
					t3.setRowCount(0);
					t4.setRowCount(0);
					ResetManagementGui();
				}
				}
				else
				{
					playsound(pop);
					JOptionPane.showMessageDialog(frame, "You need to Search for the member ID First");
				}
		 	}
		 });
		 btnDelete.addMouseListener(new MouseAdapter() {
			  	public void mouseClicked(MouseEvent arg0) {
			  		btnDelete.setBackground(new Color(21, 79, 79).darker());
			  		playsound(Press);
			  	}
			  	public void mouseEntered(MouseEvent e) {
			  		btnDelete.setBackground(new Color(21, 79, 79).darker());
			  		playsound(Text);
			  	}
			  	public void mouseExited(MouseEvent e) {
			  		btnDelete.setBackground(new Color(21, 79, 79));
			  		playsound(Text);
			  	}
			  });
		 btnDelete.setToolTipText("It will be Deleted once u hit that button\r\n");
		 btnDelete.setForeground(Color.WHITE);
		 btnDelete.setFont(new Font("Segoe UI Semilight", Font.BOLD, 19));
		 btnDelete.setBackground(new Color(21, 79, 79));
		 btnDelete.setBounds(309, 395, 151, 44);
		 DeleteMenuMem_1.add(btnDelete);
		 
		 JLabel label_10 = new JLabel("");
		 label_10.setIcon(new ImageIcon("src/System/images/Cancel_delete_remove_stop_x_no_close_cross.png"));
		 label_10.setHorizontalAlignment(SwingConstants.CENTER);
		 label_10.setBounds(524, 24, 436, 380);
		 DeleteMenuMem_1.add(label_10);
		 
		 FirstDel = new JLabel();
		 FirstDel.setText("Example:Hisham");
		 FirstDel.setForeground(SystemColor.menu);
		 FirstDel.setBorder(emptyborder);
		 FirstDel.setFont(new Font("Century Gothic", Font.ITALIC, 15));
		 FirstDel.setBackground(new Color(19, 79, 79));
		 FirstDel.setBounds(46, 100, 188, 22);
		 DeleteMenuMem_1.add(FirstDel);
		 
		 LastDel = new JLabel();
		 LastDel.setText("Example:Maged");
		 LastDel.setForeground(SystemColor.menu);
		 LastDel.setFont(new Font("Century Gothic", Font.ITALIC, 15));
		 LastDel.setBorder(emptyborder);
		 LastDel.setBackground(new Color(19, 79, 79));
		 LastDel.setBounds(46, 223, 188, 22);
		 DeleteMenuMem_1.add(LastDel);
		 
		AgeDel = new JLabel();
		 AgeDel.setText("Example:19");
		 AgeDel.setForeground(SystemColor.menu);
		 AgeDel.setFont(new Font("Century Gothic", Font.ITALIC, 15));
		 AgeDel.setBorder(emptyborder);
		 AgeDel.setBackground(new Color(19, 79, 79));
		 AgeDel.setBounds(309, 100, 188, 22);
		 DeleteMenuMem_1.add(AgeDel);
		 
		PhoneDel = new JLabel();
		 PhoneDel.setText("Example:01228961190");
		 PhoneDel.setForeground(SystemColor.menu);
		 PhoneDel.setFont(new Font("Century Gothic", Font.ITALIC, 15));
		 PhoneDel.setBorder(emptyborder);
		 PhoneDel.setBackground(new Color(19, 79, 79));
		 PhoneDel.setBounds(309, 223, 188, 22);
		 DeleteMenuMem_1.add(PhoneDel);
		 
		 JButton btnSearch = new JButton("Search");
		 btnSearch.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent e) {
		 		if(!(IDSearch.getText().equals("Example:4725") || IDSearch.getText().equals("") || TypeDelBox.getSelectedItem().toString().equalsIgnoreCase("Choose One")))
				{
					SearchTargetH=IDSearch.getText();
				LoadAllHumans();
				users.trimToSize();
				managers.trimToSize();
				employees.trimToSize();
				boolean flag=false;
				switch(TypeDelBox.getSelectedItem().toString())
				{
				case "User":
				{
					for(int i=0;i<users.size();i++)
					{
						if(users.get(i).getHumanID()==Integer.parseInt(SearchTargetH))
						{
							FirstDel.setText(users.get(i).getFirstName());
							LastDel.setText(users.get(i).getLastName());
							AgeDel.setText(Integer.toString(users.get(i).getAge()));
							PhoneDel.setText(users.get(i).getPhoneNumber());
							flag=true;
							searchedH=true;
							break;
						}
						
					}
					indextobedeletedH=1;
					break;
				}
				case "Manager":
				{
					for(int i=0;i<managers.size();i++)
					{
						if(managers.get(i).getHumanID()==Integer.parseInt(SearchTargetH))
						{
							FirstDel.setText(managers.get(i).getFirstName());
							LastDel.setText(managers.get(i).getLastName());
							AgeDel.setText(Integer.toString(managers.get(i).getAge()));
							PhoneDel.setText(managers.get(i).getPhoneNumber());
							flag=true;
							searchedH=true;
							break;
						}
						
					}
					indextobedeletedH=3;
					break;
				}
				case "Employee":
				{
					for(int i=0;i<employees.size();i++)
					{
						if(employees.get(i).getHumanID()==Integer.parseInt(SearchTargetH))
						{
							FirstDel.setText(employees.get(i).getFirstName());
							LastDel.setText(employees.get(i).getLastName());
							AgeDel.setText(Integer.toString(employees.get(i).getAge()));
							PhoneDel.setText(employees.get(i).getPhoneNumber());
							flag=true;
							searchedH=true;
							break;
						}
						
					}
					indextobedeletedH=2;
					break;
				}
				
				}
				if(!flag)
				{
					playsound(pop);
					JOptionPane.showMessageDialog(frame, "The booking ID Doesn't Exist","Input Failure",JOptionPane.ERROR_MESSAGE);
				}
				
				
				
				}
				else
				{
					playsound(pop);
					JOptionPane.showMessageDialog(frame, "Please Input the Member ID first","Input Failure",JOptionPane.ERROR_MESSAGE);
				}
				
				
				
				
			}
		});
		 btnSearch.addMouseListener(new MouseAdapter() {
			  	public void mouseClicked(MouseEvent arg0) {
			  		btnSearch.setBackground(new Color(21, 79, 79).darker());
			  		playsound(Press);
			  	}
			  	public void mouseEntered(MouseEvent e) {
			  		btnSearch.setBackground(new Color(21, 79, 79).darker());
			  		playsound(Text);
			  	}
			  	public void mouseExited(MouseEvent e) {
			  		btnSearch.setBackground(new Color(21, 79, 79));
			  		playsound(Text);
			  	}
			  });
		 btnSearch.setToolTipText("Press here to Search\r\n");
		 btnSearch.setForeground(Color.WHITE);
		 btnSearch.setFont(new Font("Segoe UI Semilight", Font.BOLD, 19));
		 btnSearch.setBackground(new Color(21, 79, 79));
		 btnSearch.setBounds(46, 392, 151, 44);
		 DeleteMenuMem_1.add(btnSearch);
		 
		 JLabel lblId = new JLabel("ID");
		 lblId.setVerticalAlignment(SwingConstants.TOP);
		 lblId.setToolTipText("ID You want to delete");
		 lblId.setForeground(Color.WHITE);
		 lblId.setFont(new Font("Segoe UI Semilight", Font.ITALIC, 25));
		 lblId.setBounds(309, 303, 183, 44);
		 DeleteMenuMem_1.add(lblId);
		 
		 IDSearch = new JTextField();
		 IDSearch.setText("Example:4725");
		 IDSearch.setBorder(emptyborder);
		 IDSearch.setForeground(SystemColor.menu);
		 IDSearch.addFocusListener(new FocusAdapter() {
			 	public void focusGained(FocusEvent arg0) {
			 		playsound(Text);
			 		 IDSearch.setText("");
			 	}
			 });
		 IDSearch.addKeyListener(new KeyAdapter() {
				public void keyTyped(KeyEvent e) {
					char ch=e.getKeyChar();
					if(!(Character.isDigit(ch) || e.getKeyChar()==KeyEvent.VK_BACK_SPACE))
					{
						e.consume();
						playsound(pop);
							JOptionPane.showMessageDialog(frame, "You can only enter numbers here!","Wrong Input",JOptionPane.ERROR_MESSAGE);
					}
				}
			});
		 IDSearch.setFont(new Font("Century Gothic", Font.ITALIC, 15));
		 IDSearch.setBackground(new Color(19, 79, 79));
		 IDSearch.setBounds(309, 345, 188, 22);
		 DeleteMenuMem_1.add(IDSearch);
		 
		 JSeparator separator_61 = new JSeparator();
		 separator_61.setForeground(Color.WHITE);
		 separator_61.setBounds(309, 371, 188, 8);
		 DeleteMenuMem_1.add(separator_61);
		 header_7.setBackground(new Color(222,222,222));
			header_7.setForeground(new Color(51,51,51));
			header_7.setFont(new Font("Segoe UI",Font.ITALIC,10));
		 header_8.setBackground(new Color(222,222,222));
			header_8.setForeground(new Color(51,51,51));
			header_8.setFont(new Font("Segoe UI",Font.ITALIC,16));
		 header_9.setBackground(new Color(222,222,222));
			header_9.setForeground(new Color(51,51,51));
			header_9.setFont(new Font("Segoe UI",Font.ITALIC,16));
		 header_10.setBackground(new Color(222,222,222));
			header_10.setForeground(new Color(51,51,51));
			header_10.setFont(new Font("Segoe UI",Font.ITALIC,16));
		
		 Buses = new JPanel();
		framesgrp.add(Buses, "name_95540696934980");
		Buses.setLayout(null);
		
		 busmenu = new JPanel();
		busmenu.setBounds(0, 0, 278, 462);
		busmenu.setBackground(new Color(40,163,163).darker());
		Buses.add(busmenu);
		busmenu.setLayout(null);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(23, 0, 213, 47);
		busmenu.add(separator_2);
		
		btnBusList = new JButton("Buses");
		btnBusList.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				loadAllCars();
				ResetCarsGui();
				IntroCars.setVisible(false);
				infoPnlCars.setVisible(true);
				BusesList.setVisible(true);
				Motorlist.setVisible(false);
				Metrolist.setVisible(false);
				Trainlist.setVisible(false);
				Taxilist.setVisible(false);
				Limousinelist.setVisible(false);
				MiniBuseslist.setVisible(false);
				AddMenu.setVisible(false);
				DeleteMenuCars.setVisible(false);
		 		if(!populateC1)
		 		{
		 		PopulateBus();
		 		table_1.setRowSelectionInterval(1,1);
		 		}
		 		populateC1=true;
		 		

			}
		});
		btnBusList.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 29));
		btnBusList.setBackground(new Color(40,163,163).darker());
		btnBusList.setForeground(Color.WHITE);
		btnBusList.setBorder(emptyborder);
		btnBusList.setFocusable(false);
		btnBusList.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent arg0) {
				playsound(Text);
				btnBusList.setBackground(new Color(40,163,163).darker().darker());
			}
			public void mouseExited(MouseEvent e) {
				if(chosenC!=1)
					btnBusList.setBackground(new Color(40,163,163).darker());
			}
			public void mousePressed(MouseEvent e) {
				playsound(Press);
				setBtnColor(btnBusList);
				resetBtnColor(btnMinibuses);
				resetBtnColor(Limousine);
				resetBtnColor(btnBack);
				resetBtnColor(btnTaxi);
				resetBtnColor(btnTrains);
				resetBtnColor(btnMetros);
				resetBtnColor(btnMotorcycles);
				resetBtnColor(btnDeleteC);
				resetBtnColor(btnAddC);
				chosenC=1;
			}
			public void mouseClicked(MouseEvent arg0) {
				setBtnColor(btnBusList);
				resetBtnColor(btnMinibuses);
				resetBtnColor(Limousine);
				resetBtnColor(btnBack);
				resetBtnColor(btnTaxi);
				resetBtnColor(btnTrains);
				resetBtnColor(btnMetros);
				resetBtnColor(btnMotorcycles);
				resetBtnColor(btnDeleteC);
				resetBtnColor(btnAddC);
				chosenC=1;
				
				
			}
		});
		btnBusList.setBounds(12, 13, 254, 40);
		busmenu.add(btnBusList);
		
		btnMinibuses = new JButton("Mini-buses");
		btnMinibuses.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				loadAllCars();
				ResetCarsGui();
				IntroCars.setVisible(false);
				infoPnlCars.setVisible(true);
				BusesList.setVisible(false);
				Motorlist.setVisible(false);
				Metrolist.setVisible(false);
				Trainlist.setVisible(false);
				Taxilist.setVisible(false);
				Limousinelist.setVisible(false);
				MiniBuseslist.setVisible(true);
				AddMenu.setVisible(false);
				DeleteMenuCars.setVisible(false);
		 		if(!populateC2)
		 		{
		 		PopulateMini();
		 		tblMini.setRowSelectionInterval(1,1);
		 		}
		 		populateC2=true;
			}
		});
		btnMinibuses.setForeground(Color.WHITE);
		btnMinibuses.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 29));
		btnMinibuses.setBorder(emptyborder);
		btnMinibuses.setFocusable(false);
		btnMinibuses.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent arg0) {
				playsound(Text);
				btnMinibuses.setBackground(new Color(40,163,163).darker().darker());
			}
			public void mouseExited(MouseEvent e) {
				if(chosenC!=2)
				btnMinibuses.setBackground(new Color(40,163,163).darker());
			}
			public void mousePressed(MouseEvent e) {
				playsound(Press);
				setBtnColor(btnMinibuses);
				resetBtnColor(btnBusList);
				resetBtnColor(Limousine);
				resetBtnColor(btnBack);
				resetBtnColor(btnTaxi);
				resetBtnColor(btnTrains);
				resetBtnColor(btnMetros);
				resetBtnColor(btnMotorcycles);
				resetBtnColor(btnDeleteC);
				resetBtnColor(btnAddC);
				chosenC=2;
			}
			public void mouseClicked(MouseEvent arg0) {
				setBtnColor(btnMinibuses);
				resetBtnColor(btnBusList);
				resetBtnColor(Limousine);
				resetBtnColor(btnBack);
				resetBtnColor(btnTaxi);
				resetBtnColor(btnTrains);
				resetBtnColor(btnMetros);
				resetBtnColor(btnMotorcycles);
				resetBtnColor(btnDeleteC);
				resetBtnColor(btnAddC);
				chosenC=2;
				
				
			}
		});
		btnMinibuses.setBackground(new Color(40, 163, 163).darker());
		btnMinibuses.setBounds(12, 66, 254, 40);
		busmenu.add(btnMinibuses);
		
		btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Buses.setVisible(false);
				Menu1.setVisible(true);
				ResetCarsGui();
				pnlButtons.setVisible(false);
				pnlCars.setVisible(false);
				chosenC=0;
				populateC1=false;
				populateC2=false;
				populateC3=false;
				populateC4=false;
				populateC5=false;
				populateC6=false;
				populateC7=false;
				DefaultTableModel t1 = (DefaultTableModel) tblMini.getModel();
				DefaultTableModel t2 = (DefaultTableModel) tblLimo.getModel();
				DefaultTableModel t3 = (DefaultTableModel) tblTaxi.getModel();
				DefaultTableModel t4 = (DefaultTableModel) tblTrain.getModel();
				DefaultTableModel t5 = (DefaultTableModel) tblMetro.getModel();
				DefaultTableModel t6 = (DefaultTableModel) tblMotor.getModel();
				DefaultTableModel t7 = (DefaultTableModel) table_1.getModel();
				t1.setRowCount(0);
				t2.setRowCount(0);
				t3.setRowCount(0);
				t4.setRowCount(0);
				t5.setRowCount(0);
				t6.setRowCount(0);
				t7.setRowCount(0);
			}
		});
		btnBack.setForeground(Color.WHITE);
		btnBack.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 29));
		btnBack.setBorder(emptyborder);
		btnBack.setFocusable(false);
		btnBack.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent arg0) {
				playsound(Text);
				btnBack.setBackground(new Color(40,163,163).darker().darker());
			}
			public void mouseExited(MouseEvent e) {
				if(chosenC!=8)
					btnBack.setBackground(new Color(40,163,163).darker());
			}
			public void mousePressed(MouseEvent e) {
				playsound(Press);
				setBtnColor(btnBack);
				resetBtnColor(btnMinibuses);
				resetBtnColor(Limousine);
				resetBtnColor(btnBusList);
				resetBtnColor(btnTaxi);
				resetBtnColor(btnTrains);
				resetBtnColor(btnMetros);
				resetBtnColor(btnMotorcycles);
				resetBtnColor(btnDeleteC);
				resetBtnColor(btnAddC);
				chosenC=8;
			}
			public void mouseClicked(MouseEvent arg0) {
				setBtnColor(btnBack);
				resetBtnColor(btnMinibuses);
				resetBtnColor(Limousine);
				resetBtnColor(btnBusList);
				resetBtnColor(btnTaxi);
				resetBtnColor(btnTrains);
				resetBtnColor(btnMetros);
				resetBtnColor(btnMotorcycles);
				resetBtnColor(btnDeleteC);
				resetBtnColor(btnAddC);
				chosenC=8;
				
				
			}
		});
		btnBack.setBackground(new Color(40, 163, 163).darker());
		btnBack.setBounds(12, 384, 254, 40);
		busmenu.add(btnBack);
		
		Limousine = new JButton("Limousines");
		Limousine.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				loadAllCars();
				ResetCarsGui();
				IntroCars.setVisible(false);
				infoPnlCars.setVisible(true);
				BusesList.setVisible(false);
				Motorlist.setVisible(false);
				Metrolist.setVisible(false);
				Trainlist.setVisible(false);
				Taxilist.setVisible(false);
				Limousinelist.setVisible(true);
				MiniBuseslist.setVisible(false);
				AddMenu.setVisible(false);
				DeleteMenuCars.setVisible(false);
		 		if(!populateC3)
		 		{
		 		PopulateLimo();
		 		tblLimo.setRowSelectionInterval(1,1);
		 		}
		 		populateC3=true;
			}
		});
		Limousine.setForeground(Color.WHITE);
		Limousine.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 29));
		Limousine.setFocusable(false);
		Limousine.setBorder(emptyborder);
		Limousine.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent arg0) {
				playsound(Text);
				Limousine.setBackground(new Color(40,163,163).darker().darker());
			}
			public void mouseExited(MouseEvent e) {
				if(chosenC!=3)
					Limousine.setBackground(new Color(40,163,163).darker());
			}
			public void mousePressed(MouseEvent e) {
				playsound(Press);
				setBtnColor(Limousine);
				resetBtnColor(btnMinibuses);
				resetBtnColor(btnBack);
				resetBtnColor(btnBusList);
				resetBtnColor(btnTaxi);
				resetBtnColor(btnTrains);
				resetBtnColor(btnMetros);
				resetBtnColor(btnMotorcycles);
				resetBtnColor(btnDeleteC);
				resetBtnColor(btnAddC);
				chosenC=3;
			}
			public void mouseClicked(MouseEvent arg0) {
				setBtnColor(Limousine);
				resetBtnColor(btnMinibuses);
				resetBtnColor(btnBack);
				resetBtnColor(btnBusList);
				resetBtnColor(btnTaxi);
				resetBtnColor(btnTrains);
				resetBtnColor(btnMetros);
				resetBtnColor(btnMotorcycles);
				resetBtnColor(btnDeleteC);
				resetBtnColor(btnAddC);
				chosenC=3;
				
				
			}
		});
		Limousine.setBackground(new Color(40, 163, 163).darker());
		Limousine.setBounds(12, 119, 254, 40);
		busmenu.add(Limousine);
		
		
		JSeparator separator_10 = new JSeparator(SwingConstants.VERTICAL);
		separator_10.setBounds(269, 13, 37, 436);
		busmenu.add(separator_10);
		
		JSeparator separator_11 = new JSeparator(SwingConstants.VERTICAL);
		separator_11.setBounds(5, 13, 37, 436);
		busmenu.add(separator_11);
		
		JSeparator separator_12 = new JSeparator();
		separator_12.setBounds(16, 447, 239, 47);
		busmenu.add(separator_12);
		
		btnTaxi = new JButton("Taxis");
		btnTaxi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				loadAllCars();
				ResetCarsGui();
				IntroCars.setVisible(false);
				infoPnlCars.setVisible(true);
				BusesList.setVisible(false);
				Motorlist.setVisible(false);
				Metrolist.setVisible(false);
				Trainlist.setVisible(false);
				Taxilist.setVisible(true);
				Limousinelist.setVisible(false);
				MiniBuseslist.setVisible(false);
				AddMenu.setVisible(false);
				DeleteMenuCars.setVisible(false);
		 		if(!populateC4)
		 		{
		 		PopulateTaxi();
		 		tblTaxi.setRowSelectionInterval(1,1);
		 		}
		 		populateC4=true;
			}
		});
		btnTaxi.setForeground(Color.WHITE);
		btnTaxi.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 29));
		btnTaxi.setBackground(new Color(40, 163, 163).darker());
		btnTaxi.setBounds(12, 172, 254, 40);
		btnTaxi.setFocusable(false);
		btnTaxi.setBorder(emptyborder);
		btnTaxi.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent arg0) {
				playsound(Text);
				btnTaxi.setBackground(new Color(40,163,163).darker().darker());
			}
			public void mouseExited(MouseEvent e) {
				if(chosenC!=4)
					btnTaxi.setBackground(new Color(40,163,163).darker());
			}
			public void mousePressed(MouseEvent e) {
				playsound(Press);
				setBtnColor(btnTaxi);
				resetBtnColor(btnMinibuses);
				resetBtnColor(btnBack);
				resetBtnColor(btnBusList);
				resetBtnColor(Limousine);
				resetBtnColor(btnTrains);
				resetBtnColor(btnMetros);
				resetBtnColor(btnMotorcycles);
				resetBtnColor(btnDeleteC);
				resetBtnColor(btnAddC);
				chosenC=4;
			}
			public void mouseClicked(MouseEvent arg0) {
				setBtnColor(btnTaxi);
				resetBtnColor(btnMinibuses);
				resetBtnColor(btnBack);
				resetBtnColor(btnBusList);
				resetBtnColor(Limousine);
				resetBtnColor(btnTrains);
				resetBtnColor(btnMetros);
				resetBtnColor(btnMotorcycles);
				resetBtnColor(btnDeleteC);
				resetBtnColor(btnAddC);
				chosenC=4;
				
				
			}
		});
		busmenu.add(btnTaxi);
		
		btnTrains = new JButton("Trains");
		btnTrains.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				loadAllCars();
				ResetCarsGui();
				IntroCars.setVisible(false);
				infoPnlCars.setVisible(true);
				BusesList.setVisible(false);
				Motorlist.setVisible(false);
				Metrolist.setVisible(false);
				Trainlist.setVisible(true);
				Taxilist.setVisible(false);
				Limousinelist.setVisible(false);
				MiniBuseslist.setVisible(false);
				AddMenu.setVisible(false);
				DeleteMenuCars.setVisible(false);
		 		if(!populateC5)
		 		{
		 		PopulateTrain();
		 		tblTrain.setRowSelectionInterval(1,1);
		 		}
		 		populateC5=true;
			}
		});
		btnTrains.setForeground(Color.WHITE);
		btnTrains.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 29));
		btnTrains.setBackground(new Color(40, 163, 163).darker());
		btnTrains.setBounds(12, 225, 254, 40);
		btnTrains.setFocusable(false);
		btnTrains.setBorder(emptyborder);
		btnTrains.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent arg0) {
				playsound(Text);
				btnTrains.setBackground(new Color(40,163,163).darker().darker());
			}
			public void mouseExited(MouseEvent e) {
				if(chosenC!=5)
					btnTrains.setBackground(new Color(40,163,163).darker());
			}
			public void mousePressed(MouseEvent e) {
				playsound(Press);
				setBtnColor(btnTrains);
				resetBtnColor(btnMinibuses);
				resetBtnColor(btnBack);
				resetBtnColor(btnBusList);
				resetBtnColor(btnTaxi);
				resetBtnColor(Limousine);
				resetBtnColor(btnMetros);
				resetBtnColor(btnMotorcycles);
				resetBtnColor(btnDeleteC);
				resetBtnColor(btnAddC);
				chosenC=5;
			}
			public void mouseClicked(MouseEvent arg0) {
				setBtnColor(btnTrains);
				resetBtnColor(btnMinibuses);
				resetBtnColor(btnBack);
				resetBtnColor(btnBusList);
				resetBtnColor(btnTaxi);
				resetBtnColor(Limousine);
				resetBtnColor(btnMetros);
				resetBtnColor(btnMotorcycles);
				resetBtnColor(btnDeleteC);
				resetBtnColor(btnAddC);
				chosenC=5;
				
				
			}
		});
		
		busmenu.add(btnTrains);
		
		btnMetros = new JButton("Metros");
		btnMetros.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				loadAllCars();
				ResetCarsGui();
				IntroCars.setVisible(false);
				infoPnlCars.setVisible(true);
				BusesList.setVisible(false);
				Motorlist.setVisible(false);
				Metrolist.setVisible(true);
				Trainlist.setVisible(false);
				Taxilist.setVisible(false);
				Limousinelist.setVisible(false);
				MiniBuseslist.setVisible(false);
				AddMenu.setVisible(false);
				DeleteMenuCars.setVisible(false);
				if(!populateC6)
		 		{
		 		PopulateMetro();
		 		tblMetro.setRowSelectionInterval(1,1);
		 		}
		 		populateC6=true;
			}
		});
		btnMetros.setForeground(Color.WHITE);
		btnMetros.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 29));
		btnMetros.setBackground(new Color(40, 163, 163).darker());
		btnMetros.setBounds(12, 278, 254, 40);
		btnMetros.setFocusable(false);
		btnMetros.setBorder(emptyborder);
		btnMetros.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent arg0) {
				playsound(Text);
				btnMetros.setBackground(new Color(40,163,163).darker().darker());
			}
			public void mouseExited(MouseEvent e) {
				if(chosenC!=6)
					btnMetros.setBackground(new Color(40,163,163).darker());
			}
			public void mousePressed(MouseEvent e) {
				playsound(Press);
				setBtnColor(btnMetros);
				resetBtnColor(btnMinibuses);
				resetBtnColor(btnBack);
				resetBtnColor(btnBusList);
				resetBtnColor(btnTaxi);
				resetBtnColor(btnTrains);
				resetBtnColor(Limousine);
				resetBtnColor(btnMotorcycles);
				resetBtnColor(btnDeleteC);
				resetBtnColor(btnAddC);
				chosenC=6;
			}
			public void mouseClicked(MouseEvent arg0) {
				setBtnColor(btnMetros);
				resetBtnColor(btnMinibuses);
				resetBtnColor(btnBack);
				resetBtnColor(btnBusList);
				resetBtnColor(btnTaxi);
				resetBtnColor(btnTrains);
				resetBtnColor(Limousine);
				resetBtnColor(btnMotorcycles);
				resetBtnColor(btnDeleteC);
				resetBtnColor(btnAddC);
				chosenC=6;
				
				
			}
		});
		busmenu.add(btnMetros);
		
		btnMotorcycles = new JButton("Motorcycles");
		btnMotorcycles.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				loadAllCars();
				ResetCarsGui();
				IntroCars.setVisible(false);
				infoPnlCars.setVisible(true);
				BusesList.setVisible(false);
				Motorlist.setVisible(true);
				Metrolist.setVisible(false);
				Trainlist.setVisible(false);
				Taxilist.setVisible(false);
				Limousinelist.setVisible(false);
				MiniBuseslist.setVisible(false);
				AddMenu.setVisible(false);
				DeleteMenuCars.setVisible(false);
		 		if(!populateC7)
		 		{
		 		PopulateMotor();
		 		tblMotor.setRowSelectionInterval(1,1);
		 		}
		 		populateC7=true;
			}
		});
		btnMotorcycles.setForeground(Color.WHITE);
		btnMotorcycles.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 29));
		btnMotorcycles.setBackground(new Color(40, 163, 163).darker());
		btnMotorcycles.setBounds(12, 331, 254, 40);
		btnMotorcycles.setFocusable(false);
		btnMotorcycles.setBorder(emptyborder);
		btnMotorcycles.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent arg0) {
				playsound(Text);
				btnMotorcycles.setBackground(new Color(40,163,163).darker().darker());
			}
			public void mouseExited(MouseEvent e) {
				if(chosenC!=7)
					btnMotorcycles.setBackground(new Color(40,163,163).darker());
			}
			public void mousePressed(MouseEvent e) {
				playsound(Press);
				setBtnColor(btnMotorcycles);
				resetBtnColor(btnMinibuses);
				resetBtnColor(btnBack);
				resetBtnColor(btnBusList);
				resetBtnColor(btnTaxi);
				resetBtnColor(btnTrains);
				resetBtnColor(btnMetros);
				resetBtnColor(Limousine);
				resetBtnColor(btnDeleteC);
				resetBtnColor(btnAddC);
				chosenC=7;
			}
			public void mouseClicked(MouseEvent arg0) {
				setBtnColor(btnMotorcycles);
				resetBtnColor(btnMinibuses);
				resetBtnColor(btnBack);
				resetBtnColor(btnBusList);
				resetBtnColor(btnTaxi);
				resetBtnColor(btnTrains);
				resetBtnColor(btnMetros);
				resetBtnColor(Limousine);
				resetBtnColor(btnDeleteC);
				resetBtnColor(btnAddC);
				chosenC=7;
				
				
			}
		});
		busmenu.add(btnMotorcycles);
		
		JPanel Changer = new JPanel();
		Changer.setBounds(278, 0, 984, 462);
		Buses.add(Changer);
		Changer.setLayout(new CardLayout(0, 0));
		IntroCars = new JPanel();
		Changer.add(IntroCars, "name_94558681925361");
		IntroCars.setBackground(new Color(40, 163, 163).darker().darker());
		IntroCars.setLayout(null);
		
		JSeparator separator_16 = new JSeparator();
		separator_16.setBounds(12, 9, 960, 14);
		IntroCars.add(separator_16);
		
		JSeparator separator_17 = new JSeparator();
		separator_17.setBounds(12, 450, 960, 14);
		IntroCars.add(separator_17);
		
		JSeparator separator_18 = new JSeparator();
		separator_18.setOrientation(SwingConstants.VERTICAL);
		separator_18.setBounds(11, 25, 37, 412);
		IntroCars.add(separator_18);
		
		JSeparator separator_19 = new JSeparator();
		separator_19.setOrientation(SwingConstants.VERTICAL);
		separator_19.setBounds(971, 25, 37, 412);
		IntroCars.add(separator_19);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("src/System/images/1493429048-transportasi.png"));
		lblNewLabel_1.setBounds(22, 13, 306, 329);
		IntroCars.add(lblNewLabel_1);
		
		JSeparator separator_20 = new JSeparator();
		separator_20.setForeground(Color.WHITE);
		separator_20.setBounds(398, 123, 297, 14);
		IntroCars.add(separator_20);
		
		JLabel lblNewLabel_2 = new JLabel("Cars Management Menu");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Segoe UI Semibold", Font.BOLD, 53));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(324, 0, 648, 151);
		IntroCars.add(lblNewLabel_2);
		
		JTextArea txtrGhfhgf = new JTextArea();
		txtrGhfhgf.setLineWrap(true);
		txtrGhfhgf.setForeground(Color.WHITE);
		txtrGhfhgf.setFont(new Font("Segoe UI", Font.ITALIC, 19));
		txtrGhfhgf.setBackground(new Color(40, 163, 163).darker().darker());
		txtrGhfhgf.setText("In the cars Management Menu, you can Check all the Available Buses,Mini-B-uses,Limousines,Taxis,Trains,Metros,MotorCycles and also you Can Add to t-hem without the need to Create an ID for each of them, where the program will generate a Random ID unique To each Car Making the Program so Easy to use.\r\n");
		txtrGhfhgf.setEditable(false);
		txtrGhfhgf.setBounds(307, 148, 632, 133);
		IntroCars.add(txtrGhfhgf);
		
		JTextArea txtrWellWhatAre = new JTextArea();
		txtrWellWhatAre.setText("Well, What are you Waiting For?!\r\nTRY IT NOW!\r\nBy choosing one of the options on the Right, simply by-Clicking on Them");
		txtrWellWhatAre.setLineWrap(true);
		txtrWellWhatAre.setForeground(Color.WHITE);
		txtrWellWhatAre.setFont(new Font("Century Gothic", Font.BOLD, 24));
		txtrWellWhatAre.setEditable(false);
		txtrWellWhatAre.setBackground(new Color(19, 79, 79));
		txtrWellWhatAre.setBounds(307, 304, 632, 133);
		IntroCars.add(txtrWellWhatAre);
		
		JSeparator separator_21 = new JSeparator();
		separator_21.setForeground(Color.GRAY);
		separator_21.setBounds(307, 294, 632, 14);
		IntroCars.add(separator_21);
		
		infoPnlCars = new JPanel();
		Changer.add(infoPnlCars, "name_94552114544233");
		infoPnlCars.setBackground(Color.WHITE);
		infoPnlCars.setLayout(new CardLayout(0, 0));
		
		
		BusesList = new JPanel();
		BusesList.setLayout(null);
		infoPnlCars.add(BusesList, "name_487910039153916");
		
		JScrollPane busList = new JScrollPane();
		busList.setFont(new Font("Segoe UI", Font.BOLD, 12));
		busList.setBounds(0, 0, 984, 462);
		BusesList.add(busList);
		
		table_1 = new JTable();
		table_1.addMouseListener(new MouseAdapter() {
			 	public void mouseClicked(MouseEvent arg0) {
			 		playsound(Press);
			 	}
			 	public void mouseEntered(MouseEvent e) {
			 		playsound(Text);
			 	}
			 	public void mouseExited(MouseEvent e) {
			 		playsound(Text);
			 	}
			 });
		table_1.setShowVerticalLines(false);
		table_1.setShowHorizontalLines(false);
		table_1.setAlignmentX(3.0f);
		table_1.setFont(new Font("Segoe UI",Font.ITALIC, 13));
		table_1.setRowHeight(32);
		table_1.setSelectionBackground(new Color(40, 163, 163).darker().darker().darker());
		table_1.setForeground(new Color(51,51,51));
		table_1.setGridColor(Color.WHITE);
		table_1.setSelectionForeground(Color.WHITE);
		table_1.setBorder(emptyborder);
		table_1.setShowGrid(false);
		table_1.setIntercellSpacing(new Dimension(0, 0));
		header_1=table_1.getTableHeader();
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"BusID", "DriverID", "Availablity", "DepartedDate", "AvailableDate", "CurrentDestination", "Source", "Comfortability", "NumberOfSeats", "AvailableSeats"
			}
		));
		busList.setViewportView(table_1);
		AddMenu = new JPanel();
		AddMenu.setBackground(new Color(40, 163, 163).darker().darker());
		infoPnlCars.add(AddMenu, "name_32761079534615");
		AddMenu.setLayout(null);
		
		JSeparator separator_34 = new JSeparator();
		separator_34.setBounds(13, 10, 960, 14);
		AddMenu.add(separator_34);
		
		JSeparator separator_35 = new JSeparator();
		separator_35.setBounds(13, 452, 960, 14);
		AddMenu.add(separator_35);
		
		JSeparator separator_36 = new JSeparator();
		separator_36.setOrientation(SwingConstants.VERTICAL);
		separator_36.setBounds(11, 29, 37, 412);
		AddMenu.add(separator_36);
		
		JSeparator separator_37 = new JSeparator();
		separator_37.setOrientation(SwingConstants.VERTICAL);
		separator_37.setBounds(974, 29, 37, 412);
		AddMenu.add(separator_37);
		
		CarBox = new JComboBox();
		CarBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(!(CarBox.getSelectedItem().toString().equals("Choose Car Type")))
				{
				FillAvailDriverBox();
				FillComfortabilityBox();
				try
				{
	  			DriverNameLbl.setText("Driver name");
				}catch(Exception e)
				{
					
				}
				}
			}
		});
		CarBox.setModel(new DefaultComboBoxModel(new String[] {"Choose Car Type", "Bus", "Mini-Buses", "Limousine", "Taxi", "Train", "Metro", "Motorcycle"}));
		CarBox.setForeground(Color.WHITE);
		CarBox.setBackground(new Color(40, 163, 163).darker().darker());
		CarBox.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				playsound(Press);
			}
			public void mouseEntered(MouseEvent e) {
				playsound(Text);
			}
			public void mouseExited(MouseEvent e) {
				playsound(Text);
			}
		});
		CarBox.setFocusable(false);
		CarBox.setBorder(emptyborder);
		CarBox.setFont(new Font("Segoe UI", Font.PLAIN, 21));
		CarBox.setBounds(46, 82, 183, 33);
		AddMenu.add(CarBox);
		
		JLabel lblNewLabel_3 = new JLabel("Car Type");
		lblNewLabel_3.setToolTipText("Choose which car type u want to add");
		lblNewLabel_3.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_3.setFont(new Font("Segoe UI Semilight", Font.ITALIC, 32));
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setBounds(46, 31, 183, 63);
		AddMenu.add(lblNewLabel_3);
		
		JSeparator separator_38 = new JSeparator();
		separator_38.setForeground(Color.WHITE);
		separator_38.setBounds(46, 126, 188, 8);
		AddMenu.add(separator_38);
		
		JLabel lblSource = new JLabel("Comfortability");
		lblSource.setVerticalAlignment(SwingConstants.TOP);
		lblSource.setToolTipText("Choose Level of Comfortability");
		lblSource.setForeground(Color.WHITE);
		lblSource.setFont(new Font("Segoe UI Semilight", Font.ITALIC, 28));
		lblSource.setBounds(46, 156, 183, 44);
		AddMenu.add(lblSource);
		
		ComfortabilityBox = new JComboBox();
		ComfortabilityBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		ComfortabilityBox.setForeground(Color.WHITE);
		ComfortabilityBox.setFont(new Font("Segoe UI", Font.PLAIN, 21));
		ComfortabilityBox.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				playsound(Press);
			}
			public void mouseEntered(MouseEvent e) {
				playsound(Text);
			}
			public void mouseExited(MouseEvent e) {
				playsound(Text);
			}
		});
		ComfortabilityBox.setFocusable(false);
		ComfortabilityBox.setBackground(new Color(19, 79, 79));
		ComfortabilityBox.setBounds(46, 204, 183, 33);
		AddMenu.add(ComfortabilityBox);
		
		JSeparator separator_39 = new JSeparator();
		separator_39.setForeground(Color.WHITE);
		separator_39.setBounds(46, 248, 188, 8);
		AddMenu.add(separator_39);
		
		JLabel AvailEmpBox = new JLabel("Available Drivers' ID");
		AvailEmpBox.setVerticalAlignment(SwingConstants.TOP);
		AvailEmpBox.setToolTipText("Choose the desired Driver ID");
		AvailEmpBox.setForeground(Color.WHITE);
		AvailEmpBox.setFont(new Font("Segoe UI Semilight", Font.ITALIC, 25));
		AvailEmpBox.setBounds(46, 288, 229, 35);
		AddMenu.add(AvailEmpBox);
		
		AvailDriverBox = new JComboBox();
		AvailDriverBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try
				{
				FillDriverLbl(AvailDriverBox.getSelectedItem().toString());
				}
				catch(Exception e5)
				{
					
				}
				}
		});
		AvailDriverBox.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				playsound(Press);
			}
			public void mouseEntered(MouseEvent e) {
				playsound(Text);
			}
			public void mouseExited(MouseEvent e) {
				playsound(Text);
			}
		});
		AvailDriverBox.setDoubleBuffered(true);
		AvailDriverBox.setForeground(Color.WHITE);
		AvailDriverBox.setFont(new Font("Segoe UI", Font.PLAIN, 21));
		AvailDriverBox.setFocusable(false);
		AvailDriverBox.setBackground(new Color(19, 79, 79));
		AvailDriverBox.setBounds(46, 327, 210, 33);
		AddMenu.add(AvailDriverBox);
		
		JSeparator separator_40 = new JSeparator();
		separator_40.setForeground(Color.WHITE);
		separator_40.setBounds(46, 371, 210, 8);
		AddMenu.add(separator_40);
		
		
		JSeparator separator_41 = new JSeparator();
		separator_41.setForeground(Color.WHITE);
		separator_41.setBounds(309, 218, 188, 8);
		AddMenu.add(separator_41);
		
		lblCarid = new JLabel("Generated CarID");
		lblCarid.setVerticalAlignment(SwingConstants.TOP);
		lblCarid.setToolTipText("Generated Car ID");
		lblCarid.setForeground(Color.WHITE);
		lblCarid.setFont(new Font("Segoe UI Semilight", Font.ITALIC, 24));
		lblCarid.setBounds(309, 182, 183, 44);
		AddMenu.add(lblCarid);
		
		AssigDriverID = new JLabel("Assigned DriverID");
		AssigDriverID.setVerticalAlignment(SwingConstants.TOP);
		AssigDriverID.setToolTipText("Assigned employee ID");
		AssigDriverID.setForeground(Color.WHITE);
		AssigDriverID.setFont(new Font("Segoe UI Semilight", Font.ITALIC, 24));
		AssigDriverID.setBounds(309, 239, 183, 44);
		AddMenu.add(AssigDriverID);
		
		JSeparator separator_42 = new JSeparator();
		separator_42.setForeground(Color.WHITE);
		separator_42.setBounds(309, 275, 188, 8);
		AddMenu.add(separator_42);
		
		JButton btnNewButton = new JButton("Create");
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(new Color(43,163,163).darker().darker());
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!(DriverNameLbl.getText().equalsIgnoreCase("Driver name")))
				{
					String[] Info=new String[2];
					Info[0]=ComfortabilityBox.getSelectedItem().toString();
					Info[1]=AvailDriverBox.getSelectedItem().toString();
					try
					{
						playsound(pop);
						int button=JOptionPane.YES_NO_OPTION;
						int result=JOptionPane.showConfirmDialog(frame, "By clicking Yes, the info you entered will be Saved","Warning",button);
						playsound(pop);
						if(result==JOptionPane.YES_OPTION)
						{
							switch(CarBox.getSelectedItem().toString())
							{
							case"Bus":WriteInfo(bus,Info,1);break;
							case"Limousine":WriteInfo(limo,Info,1);break;
							case"Mini-Buses":WriteInfo(minibus,Info,1);break;
							case"Taxi":WriteInfo(taxi,Info,1);break;
							case"Train":WriteInfo(train,Info,1);break;
							case"Metro":WriteInfo(metro,Info,1);break;
							case"Motorcycle":WriteInfo(motor,Info,1);break;
							default:{
								playsound(pop);
								JOptionPane.showMessageDialog(framesgrp, "Please Choose a Car", "Input Failure", JOptionPane.ERROR_MESSAGE);
								break;
							}
							}
							loadAllCars();
							buses.trimToSize();
							limos.trimToSize();
							trains.trimToSize();
							metros.trimToSize();
							minibuses.trimToSize();
							taxis.trimToSize();
							motorcycles.trimToSize();
							switch(CarBox.getSelectedItem().toString())
							{
							case"Bus":lblCarid.setText(buses.get(buses.size()-1).getCompCarID());break;
							case"Limousine":lblCarid.setText(limos.get(limos.size()-1).getCompCarID());break;
							case"Mini-Bus":lblCarid.setText(minibuses.get(minibuses.size()-1).getCompCarID());break;
							case"Taxi":lblCarid.setText(taxis.get(taxis.size()-1).getCompCarID());break;
							case"Train":lblCarid.setText(trains.get(trains.size()-1).getCompCarID());break;
							case"Metro":lblCarid.setText(metros.get(metros.size()-1).getCompCarID());break;
							case"Motorcycle":lblCarid.setText(motorcycles.get(motorcycles.size()-1).getCompCarID());break;
							}
							AssigDriverID.setText(Integer.toString(employees.get(neededDriverIndex).getHumanID()));
							employees.get(neededDriverIndex).setCarDrivingID(lblCarid.getText());
							employees.get(neededDriverIndex).setAvailable(false);
							employee.setTxtFile();
							PrintWriter OutPut=CreatePrintWriterinTryCatch(employee.getTxtFile());
							for(Employee iterate: employees)
							{
								String InfoTobeWritten=iterate.getFirstName()+","+ iterate.getLastName() 
								+","+ iterate.getHumanID()+","+iterate.getPhoneNumber()+","+iterate.getStartDate()+","+iterate.getAvailable()+","
								+iterate.getCarDrivingID()+","+iterate.getCurrDest()+","+iterate.getDepartedTime()+","+iterate.getAvailTime()+","
								+Double.toString(iterate.getSalary())+","+Integer.toString(iterate.getAge())+","+iterate.getProfessionality()+","
								+iterate.getState()+","+Integer.toString(iterate.getTripsMade())+","+iterate.getPassword();
								OutPut.println(InfoTobeWritten);
							}
							OutPut.close();
							LoadAllHumans();
						playsound(Bam);
						JOptionPane.showMessageDialog(frame, "Saved Successfully!");
						 populateC1=false;
						populateC2=false;
						populateC3=false;
						populateC4=false;
						populateC5=false;
						populateC6=false;
						populateC7=false;
						ResetCarsGui();
						DefaultTableModel t1 = (DefaultTableModel) tblMini.getModel();
						DefaultTableModel t2 = (DefaultTableModel) tblLimo.getModel();
						DefaultTableModel t3 = (DefaultTableModel) tblTaxi.getModel();
						DefaultTableModel t4 = (DefaultTableModel) tblTrain.getModel();
						DefaultTableModel t5 = (DefaultTableModel) tblMetro.getModel();
						DefaultTableModel t6 = (DefaultTableModel) tblMotor.getModel();
						DefaultTableModel t7 = (DefaultTableModel) table_1.getModel();
						t1.setRowCount(0);
						t2.setRowCount(0);
						t3.setRowCount(0);
						t4.setRowCount(0);
						t5.setRowCount(0);
						t6.setRowCount(0);
						t7.setRowCount(0);
						}
					}catch(Exception e3)
					{
						playsound(pop);
						e3.printStackTrace();
						JOptionPane.showMessageDialog(null, "Missing Inputs","Input Failure",JOptionPane.ERROR_MESSAGE);
					}
					
				}
				else
				{
					playsound(pop);
					JOptionPane.showMessageDialog(frame, "Please Input all the fields", "Input Error", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		btnNewButton.addMouseListener(new MouseAdapter() {
		public void mouseEntered(MouseEvent arg0) {
			playsound(Text);
			btnNewButton.setBackground(new Color(40,163,163).darker());
		}
		public void mouseExited(MouseEvent e) {
				btnNewButton.setBackground(new Color(40,163,163).darker().darker());
		}
		});
		btnNewButton.setToolTipText("It will be saved once u Create it");
		btnNewButton.setFont(new Font("Segoe UI Semilight", Font.BOLD, 19));
		btnNewButton.setBounds(309, 322, 151, 44);
		AddMenu.add(btnNewButton);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setIcon(new ImageIcon("src/System/images/Car-icon.png"));
		lblNewLabel_5.setBounds(524, 24, 436, 380);
		AddMenu.add(lblNewLabel_5);
		
		JSeparator separator_95 = new JSeparator();
		separator_95.setForeground(Color.WHITE);
		separator_95.setBounds(309, 118, 188, 8);
		AddMenu.add(separator_95);
		
		DriverNameLbl = new JLabel("Driver name");
		DriverNameLbl.setVerticalAlignment(SwingConstants.TOP);
		DriverNameLbl.setToolTipText("Chosen Driver's Name");
		DriverNameLbl.setForeground(Color.WHITE);
		DriverNameLbl.setFont(new Font("Segoe UI Semilight", Font.ITALIC, 22));
		DriverNameLbl.setBounds(309, 86, 183, 44);
		AddMenu.add(DriverNameLbl);
		
		MiniBuseslist = new JPanel();
		MiniBuseslist.setLayout(null);
		infoPnlCars.add(MiniBuseslist, "name_602955079182069");
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setFont(new Font("Segoe UI", Font.BOLD, 12));
		scrollPane_1.setBounds(0, 0, 984, 462);
		MiniBuseslist.add(scrollPane_1);
		
		tblMini = new JTable();
		tblMini.addMouseListener(new MouseAdapter() {
			 	public void mouseClicked(MouseEvent arg0) {
			 		playsound(Press);
			 	}
			 	public void mouseEntered(MouseEvent e) {
			 		playsound(Text);
			 	}
			 	public void mouseExited(MouseEvent e) {
			 		playsound(Text);
			 	}
			 });
		tblMini.setShowVerticalLines(false);
		tblMini.setShowHorizontalLines(false);
		tblMini.setShowGrid(false);
		tblMini.setSelectionForeground(Color.WHITE);
		tblMini.setSelectionBackground(new Color(40, 163, 163).darker().darker());
		tblMini.setRowHeight(32);
		tblMini.setIntercellSpacing(new Dimension(0, 0));
		tblMini.setGridColor(Color.WHITE);
		tblMini.setForeground(new Color(51, 51, 51));
		tblMini.setFont(new Font("Segoe UI", Font.ITALIC, 13));
		tblMini.setAlignmentX(3.0f);
		tblMini.setBounds(0, 0, 982, 1);
		header_2=tblMini.getTableHeader();
		tblMini.setModel(new DefaultTableModel(
		new Object[][] {
		},
		new String[] {
		"MiniBusID", "DriverID", "Availablity", "DepartedDate", "AvailableDate", "CurrentDestination", "Source", "Comfortability", "NumberOfSeats", "AvailableSeats"
		}
	));
		scrollPane_1.setViewportView(tblMini);
		
		Limousinelist = new JPanel();
		Limousinelist.setLayout(null);
		infoPnlCars.add(Limousinelist, "name_602955099182069");
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setFont(new Font("Segoe UI", Font.BOLD, 12));
		scrollPane_2.setBounds(0, 0, 984, 462);
		Limousinelist.add(scrollPane_2);
		
		tblLimo = new JTable();
		tblLimo.addMouseListener(new MouseAdapter() {
			 	public void mouseClicked(MouseEvent arg0) {
			 		playsound(Press);
			 	}
			 	public void mouseEntered(MouseEvent e) {
			 		playsound(Text);
			 	}
			 	public void mouseExited(MouseEvent e) {
			 		playsound(Text);
			 	}
			 });
		tblLimo.setShowVerticalLines(false);
		tblLimo.setShowHorizontalLines(false);
		tblLimo.setShowGrid(false);
		tblLimo.setSelectionForeground(Color.WHITE);
		tblLimo.setSelectionBackground(new Color(40, 163, 163).darker().darker());
		tblLimo.setRowHeight(32);
		tblLimo.setIntercellSpacing(new Dimension(0, 0));
		tblLimo.setGridColor(Color.WHITE);
		tblLimo.setForeground(new Color(51, 51, 51));
		tblLimo.setFont(new Font("Segoe UI", Font.ITALIC, 13));
		tblLimo.setAlignmentX(3.0f);
		tblLimo.setBounds(0, 0, 982, 1);
		header_3=tblLimo.getTableHeader();
		tblLimo.setModel(new DefaultTableModel(
		new Object[][] {
		},
		new String[] {
		"LimousineID", "DriverID", "Availablity", "DepartedDate", "AvailableDate", "CurrentDestination", "Source", "Comfortability", "NumberOfSeats", "AvailableSeats"
		}
	));
		scrollPane_2.setViewportView(tblLimo);
		
			
			Taxilist = new JPanel();	
			Taxilist.setLayout(null);
			infoPnlCars.add(Taxilist, "name_602955099182069");
			
			JScrollPane scrollPane_3 = new JScrollPane();
			scrollPane_3.setFont(new Font("Segoe UI", Font.BOLD, 12));
			scrollPane_3.setBounds(0, 0, 984, 462);
			Taxilist.add(scrollPane_3);
			
			tblTaxi = new JTable();
			tblTaxi.addMouseListener(new MouseAdapter() {
				 	public void mouseClicked(MouseEvent arg0) {
				 		playsound(Press);
				 	}
				 	public void mouseEntered(MouseEvent e) {
				 		playsound(Text);
				 	}
				 	public void mouseExited(MouseEvent e) {
				 		playsound(Text);
				 	}
				 });
			tblTaxi.setShowVerticalLines(false);
			tblTaxi.setShowHorizontalLines(false);
			tblTaxi.setShowGrid(false);
			tblTaxi.setSelectionForeground(Color.WHITE);
			tblTaxi.setSelectionBackground(new Color(40, 163, 163).darker().darker());
			tblTaxi.setRowHeight(32);
			tblTaxi.setIntercellSpacing(new Dimension(0, 0));
			tblTaxi.setGridColor(Color.WHITE);
			tblTaxi.setForeground(new Color(51, 51, 51));
			tblTaxi.setFont(new Font("Segoe UI", Font.ITALIC, 13));
			tblTaxi.setAlignmentX(3.0f);
			tblTaxi.setBounds(0, 0, 982, 1);
			header_3=tblTaxi.getTableHeader();
			tblTaxi.setModel(new DefaultTableModel(
	new Object[][] {
	},
	new String[] {
			"TaxiID", "DriverID", "Availablity", "DepartedDate", "AvailableDate", "CurrentDestination", "Source", "Comfortability", "NumberOfSeats", "AvailableSeats"
	}
));
			scrollPane_3.setViewportView(tblTaxi);
			
			
			
			
			Trainlist = new JPanel();	
			Trainlist.setLayout(null);
			infoPnlCars.add(Trainlist, "name_602955099182069");
			
			
			
			JScrollPane scrollPane_4 = new JScrollPane();
			scrollPane_4.setFont(new Font("Segoe UI", Font.BOLD, 12));
			scrollPane_4.setBounds(0, 0, 984, 462);
			Trainlist.add(scrollPane_4);
			
			tblTrain = new JTable();
			tblTrain.addMouseListener(new MouseAdapter() {
				 	public void mouseClicked(MouseEvent arg0) {
				 		playsound(Press);
				 	}
				 	public void mouseEntered(MouseEvent e) {
				 		playsound(Text);
				 	}
				 	public void mouseExited(MouseEvent e) {
				 		playsound(Text);
				 	}
				 });
			tblTrain.setShowVerticalLines(false);
			tblTrain.setShowHorizontalLines(false);
			tblTrain.setShowGrid(false);
			tblTrain.setSelectionForeground(Color.WHITE);
			tblTrain.setSelectionBackground(new Color(40, 163, 163).darker().darker());
			tblTrain.setRowHeight(32);
			tblTrain.setIntercellSpacing(new Dimension(0, 0));
			tblTrain.setGridColor(Color.WHITE);
			tblTrain.setForeground(new Color(51, 51, 51));
			tblTrain.setFont(new Font("Segoe UI", Font.ITALIC, 13));
			tblTrain.setAlignmentX(3.0f);
			tblTrain.setBounds(0, 0, 982, 1);
			header_4=tblTrain.getTableHeader();
			tblTrain.setModel(new DefaultTableModel(
new Object[][] {
},
new String[] {
			"TrainID", "DriverID", "Availablity", "DepartedDate", "AvailableDate", "CurrentDestination", "Source", "Comfortability", "NumberOfSeats", "AvailableSeats"
}
));
			scrollPane_4.setViewportView(tblTrain);
			
			
			Metrolist = new JPanel();
			Metrolist.setLayout(null);
			infoPnlCars.add(Metrolist, "name_602955099182069");
			
			JScrollPane scrollPane_5 = new JScrollPane();
			scrollPane_5.setFont(new Font("Segoe UI", Font.BOLD, 12));
			scrollPane_5.setBounds(0, 0, 984, 462);
			Metrolist.add(scrollPane_5);
			
			tblMetro = new JTable();
			tblMetro.addMouseListener(new MouseAdapter() {
				 	public void mouseClicked(MouseEvent arg0) {
				 		playsound(Press);
				 	}
				 	public void mouseEntered(MouseEvent e) {
				 		playsound(Text);
				 	}
				 	public void mouseExited(MouseEvent e) {
				 		playsound(Text);
				 	}
				 });
			tblMetro.setShowVerticalLines(false);
			tblMetro.setShowHorizontalLines(false);
			tblMetro.setShowGrid(false);
			tblMetro.setSelectionForeground(Color.WHITE);
			tblMetro.setSelectionBackground(new Color(40, 163, 163).darker().darker());
			tblMetro.setRowHeight(32);
			tblMetro.setIntercellSpacing(new Dimension(0, 0));
			tblMetro.setGridColor(Color.WHITE);
			tblMetro.setForeground(new Color(51, 51, 51));
			tblMetro.setFont(new Font("Segoe UI", Font.ITALIC, 13));
			tblMetro.setAlignmentX(3.0f);
			tblMetro.setBounds(0, 0, 982, 1);
			header_5=tblMetro.getTableHeader();
			tblMetro.setModel(new DefaultTableModel(
new Object[][] {
},
new String[] {
			"MetroID", "DriverID", "Availablity", "DepartedDate", "AvailableDate", "CurrentDestination", "Source", "Comfortability", "NumberOfSeats", "AvailableSeats"
}
));
			scrollPane_5.setViewportView(tblMetro);
			
			 Motorlist = new JPanel();
			 Motorlist.setLayout(null);
			 infoPnlCars.add(Motorlist, "name_602955099182069");
			 
			 JScrollPane scrollPane_6 = new JScrollPane();
			 scrollPane_6.setFont(new Font("Segoe UI", Font.BOLD, 12));
			 scrollPane_6.setBounds(0, 0, 984, 462);
			 Motorlist.add(scrollPane_6);
			 
			 tblMotor = new JTable();
			 tblMotor.addMouseListener(new MouseAdapter() {
			 	 	public void mouseClicked(MouseEvent arg0) {
			 	 		playsound(Press);
			 	 	}
			 	 	public void mouseEntered(MouseEvent e) {
			 	 		playsound(Text);
			 	 	}
			 	 	public void mouseExited(MouseEvent e) {
			 	 		playsound(Text);
			 	 	}
			 	 });
			 tblMotor.setShowVerticalLines(false);
			 tblMotor.setShowHorizontalLines(false);
			 tblMotor.setShowGrid(false);
			 tblMotor.setSelectionForeground(Color.WHITE);
			 tblMotor.setSelectionBackground(new Color(40, 163, 163).darker().darker());
			 tblMotor.setRowHeight(32);
			 tblMotor.setIntercellSpacing(new Dimension(0, 0));
			 tblMotor.setGridColor(Color.WHITE);
			 tblMotor.setForeground(new Color(51, 51, 51));
			 tblMotor.setFont(new Font("Segoe UI", Font.ITALIC, 13));
			 tblMotor.setAlignmentX(3.0f);
			 tblMotor.setBounds(0, 0, 982, 1);
			 header_6=tblMotor.getTableHeader();
			 tblMotor.setModel(new DefaultTableModel(
new Object[][] {
},
new String[] {
			 "MotorcycleID", "DriverID", "Availablity", "DepartedDate", "AvailableDate", "CurrentDestination", "Source", "Comfortability", "NumberOfSeats", "AvailableSeats"
}
));
			 scrollPane_6.setViewportView(tblMotor);
			 DeleteMenuCars = new JPanel();
			 DeleteMenuCars.setLayout(null);
			 DeleteMenuCars.setBackground(new Color(19, 79, 79));
			 DeleteMenuCars.setAlignmentY(0.0f);
			 infoPnlCars.add(DeleteMenuCars, "name_42488531866209");
			 JSeparator separator_62 = new JSeparator();
			 separator_62.setBounds(13, 10, 960, 14);
			 DeleteMenuCars.add(separator_62);
			 JSeparator separator_63 = new JSeparator();
			 separator_63.setBounds(13, 452, 960, 14);
			 DeleteMenuCars.add(separator_63);
			 JSeparator separator_64 = new JSeparator();
			 separator_64.setOrientation(SwingConstants.VERTICAL);
			 separator_64.setBounds(11, 29, 37, 412);
			 DeleteMenuCars.add(separator_64);
			 JSeparator separator_65 = new JSeparator();
			 separator_65.setOrientation(SwingConstants.VERTICAL);
			 separator_65.setBounds(974, 29, 37, 412);
			 DeleteMenuCars.add(separator_65);
			 JLabel lblSource_1 = new JLabel("Source");
			 lblSource_1.setVerticalAlignment(SwingConstants.TOP);
			 lblSource_1.setToolTipText("Type the first name");
			 lblSource_1.setForeground(Color.WHITE);
			 lblSource_1.setFont(new Font("Segoe UI Semilight", Font.ITALIC, 32));
			 lblSource_1.setBounds(46, 50, 183, 63);
			 DeleteMenuCars.add(lblSource_1);
			 JSeparator separator_66 = new JSeparator();
			 separator_66.setForeground(Color.WHITE);
			 separator_66.setBounds(46, 126, 188, 8);
			 DeleteMenuCars.add(separator_66);
			 JLabel lblType_1 = new JLabel("Comfortability");
			 lblType_1.setVerticalAlignment(SwingConstants.TOP);
			 lblType_1.setToolTipText("Type of the car to be deleted");
			 lblType_1.setForeground(Color.WHITE);
			 lblType_1.setFont(new Font("Segoe UI Semilight", Font.ITALIC, 28));
			 lblType_1.setBounds(46, 174, 183, 44);
			 DeleteMenuCars.add(lblType_1);
			 JSeparator separator_67 = new JSeparator();
			 separator_67.setForeground(Color.WHITE);
			 separator_67.setFont(new Font("Century Gothic", Font.ITALIC, 15));
			 separator_67.setBounds(46, 248, 188, 8);
			 DeleteMenuCars.add(separator_67);
			 JLabel label_12 = new JLabel("Type");
			 label_12.setVerticalAlignment(SwingConstants.TOP);
			 label_12.setToolTipText("Choose the State of the Member");
			 label_12.setForeground(Color.WHITE);
			 label_12.setFont(new Font("Segoe UI Semilight", Font.ITALIC, 31));
			 label_12.setBounds(46, 279, 183, 44);
			 DeleteMenuCars.add(label_12);
			 CarTypeDel = new JComboBox();
			 CarTypeDel.addMouseListener(new MouseAdapter() {
			 	public void mousePressed(MouseEvent e) {
			 		playsound(Press);
			 	}
			 	public void mouseEntered(MouseEvent e) {
			 		playsound(Text);
			 	}
			 });
			 CarTypeDel.setModel(new DefaultComboBoxModel(new String[] {"Choose One", "Bus", "Mini-Bus", "Limousine", "Taxi", "Train", "Metro", "Motorcycle"}));
			 CarTypeDel.setForeground(SystemColor.menu);
			 CarTypeDel.setFont(new Font("Segoe UI", Font.PLAIN, 21));
			 CarTypeDel.setFocusable(false);
			 CarTypeDel.setDoubleBuffered(true);
			 CarTypeDel.setBorder(emptyborder);
			 CarTypeDel.setBackground(new Color(19, 79, 79));
			 CarTypeDel.setBounds(46, 327, 183, 33);
			 DeleteMenuCars.add(CarTypeDel);
			 JSeparator separator_68 = new JSeparator();
			 separator_68.setForeground(Color.WHITE);
			 separator_68.setBounds(46, 371, 188, 8);
			 DeleteMenuCars.add(separator_68);
			 JSeparator separator_69 = new JSeparator();
			 separator_69.setForeground(Color.WHITE);
			 separator_69.setBounds(309, 126, 188, 8);
			 DeleteMenuCars.add(separator_69);
			 JLabel lblDestination_1 = new JLabel("Destination");
			 lblDestination_1.setVerticalAlignment(SwingConstants.TOP);
			 lblDestination_1.setToolTipText("Type the Age of the member");
			 lblDestination_1.setForeground(Color.WHITE);
			 lblDestination_1.setFont(new Font("Segoe UI Semilight", Font.ITALIC, 25));
			 lblDestination_1.setBounds(309, 58, 183, 44);
			 DeleteMenuCars.add(lblDestination_1);
			 JLabel lblCarId = new JLabel("AvailableDate");
			 lblCarId.setVerticalAlignment(SwingConstants.TOP);
			 lblCarId.setToolTipText("The ID of the car");
			 lblCarId.setForeground(Color.WHITE);
			 lblCarId.setFont(new Font("Segoe UI Semilight", Font.ITALIC, 25));
			 lblCarId.setBounds(309, 178, 183, 44);
			 DeleteMenuCars.add(lblCarId);
			 JSeparator separator_70 = new JSeparator();
			 separator_70.setForeground(Color.WHITE);
			 separator_70.setBounds(309, 248, 188, 8);
			 DeleteMenuCars.add(separator_70);
			 JButton button_3 = new JButton("Delete");
			 button_3.addActionListener(new ActionListener() {
			 	public void actionPerformed(ActionEvent e) {
			 		if(searchedC )
					{
						playsound(pop);
						int button=JOptionPane.YES_NO_OPTION;
						int result=JOptionPane.showConfirmDialog(frame, "By clicking Yes, This Car will be deleted","Warning",button);
						playsound(pop);
						if(result==JOptionPane.YES_OPTION)
						{
							switch(indextobedeletedC)
							{
							case 1:DeleteFromObject(bus,SearchTargetC,1);break;
							case 2:DeleteFromObject(minibus,SearchTargetC,1);break;
							case 3:DeleteFromObject(limo,SearchTargetC,1);break;
							case 4:DeleteFromObject(taxi,SearchTargetC,1);break;
							case 5:DeleteFromObject(train,SearchTargetC,1);break;
							case 6:DeleteFromObject(metro,SearchTargetC,1);break;
							case 7:DeleteFromObject(motor,SearchTargetC,1);break;
							}
						playsound(Bam);
						JOptionPane.showMessageDialog(frame, "Deleted Successfully!");
						ResetCarsGui();
						populateC1=false;
						populateC2=false;
						populateC3=false;
						populateC4=false;
						populateC5=false;
						populateC6=false;
						populateC7=false;
						DefaultTableModel t1 = (DefaultTableModel) tblMini.getModel();
						DefaultTableModel t2 = (DefaultTableModel) tblLimo.getModel();
						DefaultTableModel t3 = (DefaultTableModel) tblTaxi.getModel();
						DefaultTableModel t4 = (DefaultTableModel) tblTrain.getModel();
						DefaultTableModel t5 = (DefaultTableModel) tblMetro.getModel();
						DefaultTableModel t6 = (DefaultTableModel) tblMotor.getModel();
						DefaultTableModel t7 = (DefaultTableModel) table_1.getModel();
						t1.setRowCount(0);
						t2.setRowCount(0);
						t3.setRowCount(0);
						t4.setRowCount(0);
						t5.setRowCount(0);
						t6.setRowCount(0);
						t7.setRowCount(0);
					}
					}
					else
					{
						playsound(pop);
						JOptionPane.showMessageDialog(frame, "You need to Search for the Car ID First");
						
					}
			 	}
			 });
			 button_3.addMouseListener(new MouseAdapter() {
				 	public void mouseEntered(MouseEvent e) {
				 		button_3.setBackground(new Color(21, 79, 79).darker());
				 		playsound(Text);
				 	}
				 	public void mouseExited(MouseEvent e) {
				 		button_3.setBackground(new Color(21, 79, 79));
				 	}
				 	public void mousePressed(MouseEvent e) {
				 		playsound(Press);
				 		button_3.setBackground(new Color(21, 79, 79).darker());
				 	}
				 });
			 button_3.setToolTipText("It will be Deleted once u hit that button\r\n");
			 button_3.setForeground(Color.WHITE);
			 button_3.setFont(new Font("Segoe UI Semilight", Font.BOLD, 19));
			 button_3.setBackground(new Color(21, 79, 79));
			 button_3.setBorder(emptyborder);
			 button_3.setBounds(309, 395, 151, 44);
			 DeleteMenuCars.add(button_3);
			 JLabel label_15 = new JLabel("");
			 label_15.setIcon(new ImageIcon("src/System/images/Cancel_delete_remove_stop_x_no_close_cross.png"));
			 label_15.setHorizontalAlignment(SwingConstants.CENTER);
			 label_15.setBounds(524, 24, 436, 380);
			 DeleteMenuCars.add(label_15);
			 SrcDelCar = new JLabel();
			 SrcDelCar.setText("Example:Alexandria");
			 SrcDelCar.setForeground(SystemColor.menu);
			 SrcDelCar.setFont(new Font("Century Gothic", Font.ITALIC, 15));
			 SrcDelCar.setBackground(new Color(19, 79, 79));
			 SrcDelCar.setBounds(46, 100, 188, 22);
			 DeleteMenuCars.add(SrcDelCar);
			 ComfortabilityDel = new JLabel();
			 ComfortabilityDel.setText("Example:Low");
			 ComfortabilityDel.setForeground(SystemColor.menu);
			 ComfortabilityDel.setFont(new Font("Century Gothic", Font.ITALIC, 15));
			 ComfortabilityDel.setBackground(new Color(19, 79, 79));
			 ComfortabilityDel.setBounds(46, 223, 188, 22);
			 DeleteMenuCars.add(ComfortabilityDel);
			 DestDelCar = new JLabel();
			 DestDelCar.setText("Example:Cairo");
			 DestDelCar.setForeground(SystemColor.menu);
			 DestDelCar.setFont(new Font("Century Gothic", Font.ITALIC, 15));
			 DestDelCar.setBackground(new Color(19, 79, 79));
			 DestDelCar.setBounds(309, 100, 188, 22);
			 DeleteMenuCars.add(DestDelCar);
			 AvailDel = new JLabel();
			 AvailDel.setText("Example:20/10/2018");
			 AvailDel.setForeground(SystemColor.menu);
			 AvailDel.setFont(new Font("Century Gothic", Font.ITALIC, 15));
			 AvailDel.setBackground(new Color(19, 79, 79));
			 AvailDel.setBounds(309, 223, 188, 22);
			 DeleteMenuCars.add(AvailDel);
			 JButton button_4 = new JButton("Search");
			 button_4.addActionListener(new ActionListener() {
			 	public void actionPerformed(ActionEvent e) {
			 		if(!(CarIDSearch.getText().equals("Example:B-4725") || CarIDSearch.getText().equals("") || CarTypeDel.getSelectedItem().toString().equalsIgnoreCase("Choose One")))
					{
					SearchTargetC=CarIDSearch.getText();
					loadAllCars();
					buses.trimToSize();
					limos.trimToSize();
					motorcycles.trimToSize();
					trains.trimToSize();
					metros.trimToSize();
					taxis.trimToSize();
					minibuses.trimToSize();
					boolean flag=false;
					switch(CarTypeDel.getSelectedItem().toString())
					{
					case "Bus":
					{
						for(int i=0;i<buses.size();i++)
						{
							if(buses.get(i).getCompCarID().equalsIgnoreCase((SearchTargetC)))
							{
								AvailDel.setText(buses.get(i).getAvailableTime());
								ComfortabilityDel.setText(buses.get(i).getComfortability());
								SrcDelCar.setText(buses.get(i).getSource());
								DestDelCar.setText(buses.get(i).getCurrDest());
								flag=true;
								searchedC=true;
								break;
							}
							
						}
						indextobedeletedC=1;
						break;
					}
					case "Mini-Bus":
					{
						for(int i=0;i<minibuses.size();i++)
						{
							if(minibuses.get(i).getCompCarID().equalsIgnoreCase((SearchTargetC)))
							{
								AvailDel.setText(minibuses.get(i).getAvailableTime());
								ComfortabilityDel.setText(minibuses.get(i).getComfortability());
								SrcDelCar.setText(minibuses.get(i).getSource());
								DestDelCar.setText(minibuses.get(i).getCurrDest());
								flag=true;
								searchedC=true;
								break;
							}
							
						}
						indextobedeletedC=2;
						break;
					}
					case "Limousine":
					{
						for(int i=0;i<limos.size();i++)
						{
							if(limos.get(i).getCompCarID().equalsIgnoreCase((SearchTargetC)))
							{
								AvailDel.setText(limos.get(i).getAvailableTime());
								ComfortabilityDel.setText(limos.get(i).getComfortability());
								SrcDelCar.setText(limos.get(i).getSource());
								DestDelCar.setText(limos.get(i).getCurrDest());
								flag=true;
								searchedC=true;
								break;
							}
							
						}
						indextobedeletedC=3;
						break;
					}
					case "Train":
					{
						for(int i=0;i<trains.size();i++)
						{
							if(trains.get(i).getCompCarID().equalsIgnoreCase((SearchTargetC)))
							{
								AvailDel.setText(trains.get(i).getAvailableTime());
								ComfortabilityDel.setText(trains.get(i).getComfortability());
								SrcDelCar.setText(trains.get(i).getSource());
								DestDelCar.setText(trains.get(i).getCurrDest());
								flag=true;
								searchedC=true;
								break;
							}
							
						}
						indextobedeletedC=5;
						break;
					}
					case "Metro":
					{
						for(int i=0;i<metros.size();i++)
						{
							if(metros.get(i).getCompCarID().equalsIgnoreCase((SearchTargetC)))
							{
								AvailDel.setText(metros.get(i).getAvailableTime());
								ComfortabilityDel.setText(metros.get(i).getComfortability());
								SrcDelCar.setText(metros.get(i).getSource());
								DestDelCar.setText(metros.get(i).getCurrDest());
								flag=true;
								searchedC=true;
								break;
							}
							
						}
						indextobedeletedC=6;
						break;
					}
					case "Motorcycle":
					{
						for(int i=0;i<motorcycles.size();i++)
						{
							if(motorcycles.get(i).getCompCarID().equalsIgnoreCase((SearchTargetC)))
							{
								AvailDel.setText(motorcycles.get(i).getAvailableTime());
								ComfortabilityDel.setText(motorcycles.get(i).getComfortability());
								SrcDelCar.setText(motorcycles.get(i).getSource());
								DestDelCar.setText(motorcycles.get(i).getCurrDest());
								flag=true;
								searchedC=true;
								break;
							}
							
						}
						indextobedeletedC=7;
						break;
					}
					case "Taxi":
					{
						for(int i=0;i<taxis.size();i++)
						{
							if(taxis.get(i).getCompCarID().equalsIgnoreCase((SearchTargetC)))
							{
								AvailDel.setText(taxis.get(i).getAvailableTime());
								ComfortabilityDel.setText(taxis.get(i).getComfortability());
								SrcDelCar.setText(taxis.get(i).getSource());
								DestDelCar.setText(taxis.get(i).getCurrDest());
								flag=true;
								searchedC=true;
								break;
							}
							
						}
						indextobedeletedC=4;
						break;
					}
					
					
					}
					if(SrcDelCar.getText().equals("null"))
					{
						SrcDelCar.setText("None");
					}
					if(DestDelCar.getText().equals("null"))
					{
						DestDelCar.setText("None");
					}
					if(!flag)
					{
						playsound(pop);
						JOptionPane.showMessageDialog(frame, "The Car ID Doesn't Exist","Input Failure",JOptionPane.ERROR_MESSAGE);
					}
					
					
					
					}
					else
					{
						playsound(pop);
						JOptionPane.showMessageDialog(frame, "Please Input the Car ID first","Input Failure",JOptionPane.ERROR_MESSAGE);
					}
					
					
					
			 	}
			 });
			 button_4.addMouseListener(new MouseAdapter() {
			 	public void mouseEntered(MouseEvent e) {
			 		button_4.setBackground(new Color(21, 79, 79).darker());
			 		playsound(Text);
			 	}
			 	public void mouseExited(MouseEvent e) {
			 		button_4.setBackground(new Color(21, 79, 79));
			 	}
			 	public void mousePressed(MouseEvent e) {
			 		playsound(Press);
			 		button_4.setBackground(new Color(21, 79, 79).darker());
			 	}
			 });
			 button_4.setToolTipText("Press here to Search\r\n");
			 button_4.setForeground(Color.WHITE);
			 button_4.setFont(new Font("Segoe UI Semilight", Font.BOLD, 19));
			 button_4.setBackground(new Color(21, 79, 79));
			 button_4.setBorder(emptyborder);
			 button_4.setBounds(46, 392, 151, 44);
			 DeleteMenuCars.add(button_4);
			 lblCarid_1 = new JLabel("CarID");
			 lblCarid_1.setVerticalAlignment(SwingConstants.TOP);
			 lblCarid_1.setToolTipText("ID You want to delete");
			 lblCarid_1.setForeground(Color.WHITE);
			 lblCarid_1.setFont(new Font("Segoe UI Semilight", Font.ITALIC, 25));
			 lblCarid_1.setBounds(309, 303, 183, 44);
			 DeleteMenuCars.add(lblCarid_1);
			 CarIDSearch = new JTextField();
			 CarIDSearch.addFocusListener(new FocusAdapter() {
			 	public void focusGained(FocusEvent e) {
			 		playsound(Text);
			 		CarIDSearch.setText("");
			 	}
			 });
			 CarIDSearch.setText("Example:B-4725");
			 CarIDSearch.setBorder(emptyborder);
			 CarIDSearch.setForeground(SystemColor.menu);
			 CarIDSearch.setFont(new Font("Century Gothic", Font.ITALIC, 15));
			 CarIDSearch.setBackground(new Color(19, 79, 79));
			 CarIDSearch.setBounds(309, 345, 188, 22);
			 DeleteMenuCars.add(CarIDSearch);
			 JSeparator separator_71 = new JSeparator();
			 separator_71.setForeground(Color.WHITE);
			 separator_71.setBounds(309, 371, 188, 8);
			 DeleteMenuCars.add(separator_71);
		ButtonGroup group=new ButtonGroup();
			 header_1.setBackground(new Color(222,222,222));
				header_1.setForeground(new Color(51,51,51));
				header_1.setFont(new Font("Segoe UI",Font.ITALIC,14));
		 header_2.setBackground(new Color(222,222,222));
			header_2.setForeground(new Color(51,51,51));
			header_2.setFont(new Font("Segoe UI",Font.ITALIC,14));
		 header_3.setBackground(new Color(222,222,222));
			header_3.setForeground(new Color(51,51,51));
			header_3.setFont(new Font("Segoe UI",Font.ITALIC,14));
	 header_3.setBackground(new Color(222,222,222));
		header_3.setForeground(new Color(51,51,51));
		header_3.setFont(new Font("Segoe UI",Font.ITALIC,14));
 header_4.setBackground(new Color(222,222,222));
	header_4.setForeground(new Color(51,51,51));
	header_4.setFont(new Font("Segoe UI",Font.ITALIC,14));
 header_5.setBackground(new Color(222,222,222));
	header_5.setForeground(new Color(51,51,51));
	header_5.setFont(new Font("Segoe UI",Font.ITALIC,14));
 header_6.setBackground(new Color(222,222,222));
	header_6.setForeground(new Color(51,51,51));
	header_6.setFont(new Font("Segoe UI",Font.ITALIC,14));

}
	void playsound(File sound)
	{
		try
		{
			Clip clip=AudioSystem.getClip();
			clip.open(AudioSystem.getAudioInputStream(sound));
			clip.start();
		}catch(Exception e)
		{
			
		}
	}
	void setBtnColor(JButton btn)
	{
		btn.setBackground(new Color(40,163,163).darker().darker());
	}
	void resetBtnColor(JButton btn)
	{
		btn.setBackground(new Color(40,163,163).darker());
	}
	void loadBookings()
	{
		LoadInfo(book,2);
		LoadInfo(trip,4);
	}
	void loadAllCars()
	{
		LoadInfo(bus,1);
		LoadInfo(limo,1);
		LoadInfo(train,1);
		LoadInfo(metro,1);
		LoadInfo(minibus,1);
		LoadInfo(car,1);
		LoadInfo(taxi,1);
		LoadInfo(motor,1);
	}
	void LoadAllHumans()
	{
		LoadInfo(user,3);
		LoadInfo(employee,3);
		LoadInfo(manager,3);
		
	}
	void PopulateBookings()
	{
		addRowBooking();
	}
	void PopulateTrips()
	{
		addRowTrips();
	}
	void PopulateBus()
	{
		addRowBus();
	}
	void PopulateLimo()
	{
		addRowLimousine();
	}
	void PopulateMini()
	{
		addRowMini();
	}
	void PopulateTrain()
	{
		addRowTrain();
	}
	void PopulateMetro()
	{
		addRowMetro();
	}
	void PopulateTaxi()
	{
		addRowTaxi();
	}
	void PopulateMotor()
	{
		addRowMotor();
	}
	void PopulateEmployee()
	{
		addRowEmployee();
	}
	void PopulateUser()
	{
		addRowUsers();
	}
	void PopulateManager()
	{
		addRowManager();
	}
	void PopulateVIP()
	{
		addRowVip();
	}
	void addRowBooking()
	{
		DefaultTableModel tablemodel= (DefaultTableModel)table.getModel();
		Object[] rowData=new Object[12];
		bookings.trimToSize();
		for(int i=0;i<bookings.size();i++)
		{
			rowData[0]=bookings.get(i).getTripDest();
			rowData[1]=bookings.get(i).getTripType();
			rowData[2]=bookings.get(i).getTripDate();
			rowData[3]=bookings.get(i).getCarType();
			rowData[4]=bookings.get(i).getCarStops();
			rowData[5]=bookings.get(i).getCarID();
			rowData[6]=bookings.get(i).getPrice();
			rowData[7]=bookings.get(i).getSeats();
			rowData[8]=bookings.get(i).getUserFirstName();
			rowData[9]=bookings.get(i).getUserLastName();
			rowData[10]=bookings.get(i).getBookingID();
			rowData[11]=bookings.get(i).getUserID();
			tablemodel.addRow(rowData);
			
		}
		
		
	}
	void addRowTrips()
	{
		DefaultTableModel tablemodel= (DefaultTableModel)tblTrips.getModel();
		Object[] rowData=new Object[7];
		trips.trimToSize();
		for(int i=0;i<trips.size();i++)
		{
			rowData[0]=trips.get(i).getSource();
			rowData[1]=trips.get(i).getDestination();
			rowData[2]=trips.get(i).getDepartDate();
			rowData[3]=trips.get(i).getReturnDate();
			rowData[4]=trips.get(i).getType();
			rowData[5]=trips.get(i).getPrice();
			rowData[6]=trips.get(i).getCarID();
			tablemodel.addRow(rowData);
			
		}
	}
	void addRowBus()
	{
		DefaultTableModel tablemodel= (DefaultTableModel)table_1.getModel();
		Object[] rowData=new Object[10];
		buses.trimToSize();
		for(int i=0;i<buses.size();i++)
		{
			rowData[0]=buses.get(i).getCompCarID();
			rowData[1]=buses.get(i).getDriverID();
			rowData[2]=buses.get(i).getAvailable();
			rowData[3]=buses.get(i).getDepartedTime();
			rowData[4]=buses.get(i).getAvailableTime();
			rowData[5]=buses.get(i).getCurrDest();
			rowData[6]=buses.get(i).getSource();
			rowData[7]=buses.get(i).getComfortability();
			rowData[8]=buses.get(i).getNoOfSeats();
			rowData[9]=buses.get(i).getAvailNoOfSeats();
			tablemodel.addRow(rowData);
			
		}
		
	}
	void addRowMini()
	{
		DefaultTableModel tablemodel= (DefaultTableModel)tblMini.getModel();
		Object[] rowData=new Object[10];
		minibuses.trimToSize();
		for(int i=0;i<minibuses.size();i++)
		{
			rowData[0]=minibuses.get(i).getCompCarID();
			rowData[1]=minibuses.get(i).getDriverID();
			rowData[2]=minibuses.get(i).getAvailable();
			rowData[3]=minibuses.get(i).getDepartedTime();
			rowData[4]=minibuses.get(i).getAvailableTime();
			rowData[5]=minibuses.get(i).getCurrDest();
			rowData[6]=minibuses.get(i).getSource();
			rowData[7]=minibuses.get(i).getComfortability();
			rowData[8]=minibuses.get(i).getNoOfSeats();
			rowData[9]=minibuses.get(i).getAvailNoOfSeats();
			tablemodel.addRow(rowData);
			
		}
		
	}
	void addRowLimousine()
	{
		DefaultTableModel tablemodel= (DefaultTableModel)tblLimo.getModel();
		Object[] rowData=new Object[10];
		limos.trimToSize();
		for(int i=0;i<limos.size();i++)
		{
			rowData[0]=limos.get(i).getCompCarID();
			rowData[1]=limos.get(i).getDriverID();
			rowData[2]=limos.get(i).getAvailable();
			rowData[3]=limos.get(i).getDepartedTime();
			rowData[4]=limos.get(i).getAvailableTime();
			rowData[5]=limos.get(i).getCurrDest();
			rowData[6]=limos.get(i).getSource();
			rowData[7]=limos.get(i).getComfortability();
			rowData[8]=limos.get(i).getNoOfSeats();
			rowData[9]=limos.get(i).getAvailNoOfSeats();
			tablemodel.addRow(rowData);
			
		}
		
	}
	void addRowTaxi()
	{
		DefaultTableModel tablemodel= (DefaultTableModel)tblTaxi.getModel();
		Object[] rowData=new Object[10];
		taxis.trimToSize();
		for(int i=0;i<taxis.size();i++)
		{
			rowData[0]=taxis.get(i).getCompCarID();
			rowData[1]=taxis.get(i).getDriverID();
			rowData[2]=taxis.get(i).getAvailable();
			rowData[3]=taxis.get(i).getDepartedTime();
			rowData[4]=taxis.get(i).getAvailableTime();
			rowData[5]=taxis.get(i).getCurrDest();
			rowData[6]=taxis.get(i).getSource();
			rowData[7]=taxis.get(i).getComfortability();
			rowData[8]=taxis.get(i).getNoOfSeats();
			rowData[9]=taxis.get(i).getAvailNoOfSeats();
			tablemodel.addRow(rowData);
			
		}
		
	}
	void addRowTrain()
	{
		DefaultTableModel tablemodel= (DefaultTableModel)tblTrain.getModel();
		Object[] rowData=new Object[10];
		trains.trimToSize();
		for(int i=0;i<trains.size();i++)
		{
			rowData[0]=trains.get(i).getCompCarID();
			rowData[1]=trains.get(i).getDriverID();
			rowData[2]=trains.get(i).getAvailable();
			rowData[3]=trains.get(i).getDepartedTime();
			rowData[4]=trains.get(i).getAvailableTime();
			rowData[5]=trains.get(i).getCurrDest();
			rowData[6]=trains.get(i).getSource();
			rowData[7]=trains.get(i).getComfortability();
			rowData[8]=trains.get(i).getNoOfSeats();
			rowData[9]=trains.get(i).getAvailNoOfSeats();
			tablemodel.addRow(rowData);
			
		}
		
	}
	void addRowMetro()
	{
		DefaultTableModel tablemodel= (DefaultTableModel)tblMetro.getModel();
		Object[] rowData=new Object[10];
		metros.trimToSize();
		for(int i=0;i<metros.size();i++)
		{
			rowData[0]=metros.get(i).getCompCarID();
			rowData[1]=metros.get(i).getDriverID();
			rowData[2]=metros.get(i).getAvailable();
			rowData[3]=metros.get(i).getDepartedTime();
			rowData[4]=metros.get(i).getAvailableTime();
			rowData[5]=metros.get(i).getCurrDest();
			rowData[6]=metros.get(i).getSource();
			rowData[7]=metros.get(i).getComfortability();
			rowData[8]=metros.get(i).getNoOfSeats();
			rowData[9]=metros.get(i).getAvailNoOfSeats();
			tablemodel.addRow(rowData);
			
		}
		
	}
	void addRowMotor()
	{
		DefaultTableModel tablemodel= (DefaultTableModel)tblMotor.getModel();
		Object[] rowData=new Object[10];
		motorcycles.trimToSize();
		for(int i=0;i<motorcycles.size();i++)
		{
			rowData[0]=motorcycles.get(i).getCompCarID();
			rowData[1]=motorcycles.get(i).getDriverID();
			rowData[2]=motorcycles.get(i).getAvailable();
			rowData[3]=motorcycles.get(i).getDepartedTime();
			rowData[4]=motorcycles.get(i).getAvailableTime();
			rowData[5]=motorcycles.get(i).getCurrDest();
			rowData[6]=motorcycles.get(i).getSource();
			rowData[7]=motorcycles.get(i).getComfortability();
			rowData[8]=motorcycles.get(i).getNoOfSeats();
			rowData[9]=motorcycles.get(i).getAvailNoOfSeats();
			tablemodel.addRow(rowData);
			
		}
		
	}
	void addRowEmployee()
	{
		DefaultTableModel tablemodel= (DefaultTableModel)tblEmp.getModel();
		Object[] rowData=new Object[15];
		employees.trimToSize();
		for(int i=0;i<employees.size();i++)
		{
			rowData[0]=employees.get(i).getFirstName();
			rowData[1]=employees.get(i).getLastName();
			rowData[2]=employees.get(i).getHumanID();
			rowData[3]=employees.get(i).getPhoneNumber();
			rowData[4]=employees.get(i).getStartDate();
			rowData[5]=employees.get(i).getAvailable();
			rowData[6]=employees.get(i).getCarDrivingID();
			rowData[7]=employees.get(i).getCurrDest();
			rowData[8]=employees.get(i).getDepartedTime();
			rowData[9]=employees.get(i).getAvailTime();
			rowData[10]=employees.get(i).getSalary();
			rowData[11]=employees.get(i).getAge();
			rowData[12]=employees.get(i).getProfessionality();
			rowData[13]=employees.get(i).getState();
			rowData[14]=employees.get(i).getTripsMade();
			tablemodel.addRow(rowData);
			
		}
		
	}
	void addRowUsers()
	{
		DefaultTableModel tablemodel= (DefaultTableModel)tblUser.getModel();
		Object[] rowData=new Object[8];
		users.trimToSize();
		for(int i=0;i<users.size();i++)
		{
			rowData[0]=users.get(i).getFirstName();
			rowData[1]=users.get(i).getLastName();
			rowData[2]=users.get(i).getHumanID();
			rowData[3]=users.get(i).getPhoneNumber();
			rowData[4]=users.get(i).getAge();
			rowData[5]=users.get(i).getState();
			rowData[6]=users.get(i).getTripsCounter();
			rowData[7]=users.get(i).getTripsIN();
			tablemodel.addRow(rowData);
			
		}
		
	}
	void addRowVip()
	{
		DefaultTableModel tablemodel= (DefaultTableModel)tblVip.getModel();
		Object[] rowData=new Object[8];
		users.trimToSize();
		for(int i=0;i<users.size();i++)
		{
			if(users.get(i).getState().equalsIgnoreCase("vip"))
			{
			rowData[0]=users.get(i).getFirstName();
			rowData[1]=users.get(i).getLastName();
			rowData[2]=users.get(i).getHumanID();
			rowData[3]=users.get(i).getPhoneNumber();
			rowData[4]=users.get(i).getAge();
			rowData[5]=users.get(i).getState();
			rowData[6]=users.get(i).getTripsCounter();
			rowData[7]=users.get(i).getTripsIN();
			tablemodel.addRow(rowData);
			}
		}
		
	}
	void addRowManager()
	{
		DefaultTableModel tablemodel= (DefaultTableModel)tblManager.getModel();
		Object[] rowData=new Object[7];
		managers.trimToSize();
		for(int i=0;i<managers.size();i++)
		{
			rowData[0]=managers.get(i).getFirstName();
			rowData[1]=managers.get(i).getLastName();
			rowData[2]=managers.get(i).getHumanID();
			rowData[3]=managers.get(i).getPhoneNumber();
			rowData[4]=managers.get(i).getSalary();
			rowData[5]=managers.get(i).getAge();
			rowData[6]=managers.get(i).getState();
			tablemodel.addRow(rowData);
			
		}
		
	}
	void FillSourceInfo(String selected)
	{
		switch(selected)
		{
		case "Bus":
		{
			ArrayList<String> SourceOptions=new ArrayList<String>();
			trips.trimToSize();
			for(int i=0;i<trips.size();i++)
			{
				if(trips.get(i).getCarID().charAt(0)=='B')
				{
				SourceOptions.add(trips.get(i).getSource());
				}
			}
			SourceOptions.trimToSize();
			for(int i=SourceOptions.size()-1;i>0;i--)
			{
				for(int j=i-1;j>=0;j--)
				{
					if(SourceOptions.get(i).equals(SourceOptions.get(j)))
					{
						SourceOptions.remove(i);
						break;
					}
				}
			}
			SourceAddComboBox.setModel(new DefaultComboBoxModel(SourceOptions.toArray()));
			break;
		}
		case "Mini-Bus":
		{
			ArrayList<String> SourceOptions=new ArrayList<String>();
			trips.trimToSize();
			for(int i=0;i<trips.size();i++)
			{
				if(trips.get(i).getCarID().charAt(0)=='M' && trips.get(i).getCarID().charAt(1)=='B')
				{
				SourceOptions.add(trips.get(i).getSource());
				}
			}
			SourceOptions.trimToSize();
			for(int i=SourceOptions.size()-1;i>0;i--)
			{
				for(int j=i-1;j>=0;j--)
				{
					if(SourceOptions.get(i).equals(SourceOptions.get(j)))
					{
						SourceOptions.remove(i);
						break;
					}
				}
			}
			SourceAddComboBox.setModel(new DefaultComboBoxModel(SourceOptions.toArray()));
			break;
		}
		case "Taxi":
		{
			ArrayList<String> SourceOptions=new ArrayList<String>();
			trips.trimToSize();
			for(int i=0;i<trips.size();i++)
			{
				if(trips.get(i).getCarID().charAt(0)=='R' && trips.get(i).getCarID().charAt(1)=='T')
				{
				SourceOptions.add(trips.get(i).getSource());
				}
			}
			SourceOptions.trimToSize();
			for(int i=SourceOptions.size()-1;i>0;i--)
			{
				for(int j=i-1;j>=0;j--)
				{
					if(SourceOptions.get(i).equals(SourceOptions.get(j)))
					{
						SourceOptions.remove(i);
						break;
					}
				}
			}
			SourceAddComboBox.setModel(new DefaultComboBoxModel(SourceOptions.toArray()));
			break;
		}
		case "Train":
		{
			ArrayList<String> SourceOptions=new ArrayList<String>();
			trips.trimToSize();
			for(int i=0;i<trips.size();i++)
			{
				if(trips.get(i).getCarID().charAt(0)=='T')
				{
				SourceOptions.add(trips.get(i).getSource());
				}
			}
			SourceOptions.trimToSize();
			for(int i=SourceOptions.size()-1;i>0;i--)
			{
				for(int j=i-1;j>=0;j--)
				{
					if(SourceOptions.get(i).equals(SourceOptions.get(j)))
					{
						SourceOptions.remove(i);
						break;
					}
				} 	
			}
			SourceAddComboBox.setModel(new DefaultComboBoxModel(SourceOptions.toArray()));
			break;
		}
		case "Limousine":
		{
			ArrayList<String> SourceOptions=new ArrayList<String>();
			trips.trimToSize();
			for(int i=0;i<trips.size();i++)
			{
				if(trips.get(i).getCarID().charAt(0)=='L')
				{
				SourceOptions.add(trips.get(i).getSource());
				}
			}
			SourceOptions.trimToSize();
			for(int i=SourceOptions.size()-1;i>0;i--)
			{
				for(int j=i-1;j>=0;j--)
				{
					if(SourceOptions.get(i).equals(SourceOptions.get(j)))
					{
						SourceOptions.remove(i);
						break;
					}
				}
			}
			SourceAddComboBox.setModel(new DefaultComboBoxModel(SourceOptions.toArray()));
			break;
		}
		case "Metro":
		{
			ArrayList<String> SourceOptions=new ArrayList<String>();
			trips.trimToSize();
			for(int i=0;i<trips.size();i++)
			{
				if(trips.get(i).getCarID().charAt(0)=='M' && trips.get(i).getCarID().charAt(1)=='T')
				{
				SourceOptions.add(trips.get(i).getSource());
				}
			}
			SourceOptions.trimToSize();
			for(int i=SourceOptions.size()-1;i>0;i--)
			{
				for(int j=i-1;j>=0;j--)
				{
					if(SourceOptions.get(i).equals(SourceOptions.get(j)))
					{
						SourceOptions.remove(i);
						break;
					}
				}
			}
			SourceAddComboBox.setModel(new DefaultComboBoxModel(SourceOptions.toArray()));
			break;
		}
		case "Motorcycle":
		{
			ArrayList<String> SourceOptions=new ArrayList<String>();
			trips.trimToSize();
			for(int i=0;i<trips.size();i++)
			{
				if(trips.get(i).getCarID().charAt(0)=='M')
				{
				SourceOptions.add(trips.get(i).getSource());
				}
			}
			SourceOptions.trimToSize();
			for(int i=SourceOptions.size()-1;i>0;i--)
			{
				for(int j=i-1;j>=0;j--)
				{
					if(SourceOptions.get(i).equals(SourceOptions.get(j)))
					{
						SourceOptions.remove(i);
						break;
					}
				}
			}
			SourceAddComboBox.setModel(new DefaultComboBoxModel(SourceOptions.toArray()));
			break;
		}
		}
	}
	void FillDestinationInfo(String selected,String prevSelection)
	{
		switch(prevSelection)
		{
		case "Bus":
		{
			
			ArrayList<String> DestinationOptions=new ArrayList<String>();
			trips.trimToSize();
			for(int i=0;i<trips.size();i++)
			{
				if(trips.get(i).getSource().equalsIgnoreCase(selected) && trips.get(i).getCarID().charAt(0)=='B')
				{
				DestinationOptions.add(trips.get(i).getDestination());
				}
			}
			DestinationOptions.trimToSize();
			for(int i=DestinationOptions.size()-1;i>0;i--)
			{
				for(int j=i-1;j>=0;j--)
				{
					if(DestinationOptions.get(i).equals(DestinationOptions.get(j)))
					{
						DestinationOptions.remove(i);
						break;
					}
				}
			}
			Destination.setModel(new DefaultComboBoxModel(DestinationOptions.toArray()));
	
			break;
		}
		case "Mini-Bus":
		{
			ArrayList<String> DestinationOptions=new ArrayList<String>();
			trips.trimToSize();
			for(int i=0;i<trips.size();i++)
			{
				if(trips.get(i).getSource().equalsIgnoreCase(selected) && trips.get(i).getCarID().charAt(0)=='M' && trips.get(i).getCarID().charAt(1)=='B')
				{
				DestinationOptions.add(trips.get(i).getDestination());
				}
			}
			DestinationOptions.trimToSize();
			for(int i=DestinationOptions.size()-1;i>0;i--)
			{
				for(int j=i-1;j>=0;j--)
				{
					if(DestinationOptions.get(i).equals(DestinationOptions.get(j)))
					{
						DestinationOptions.remove(i);
						break;
					}
				}
			}
			Destination.setModel(new DefaultComboBoxModel(DestinationOptions.toArray()));
			break;
		}
		case "Taxi":
		{
			ArrayList<String> DestinationOptions=new ArrayList<String>();
			trips.trimToSize();
			for(int i=0;i<trips.size();i++)
			{
				if(trips.get(i).getSource().equalsIgnoreCase(selected) && trips.get(i).getCarID().charAt(0)=='R' && trips.get(i).getCarID().charAt(1)=='T')
				{
				DestinationOptions.add(trips.get(i).getDestination());
				}
			}
			DestinationOptions.trimToSize();
			for(int i=DestinationOptions.size()-1;i>0;i--)
			{
				for(int j=i-1;j>=0;j--)
				{
					if(DestinationOptions.get(i).equals(DestinationOptions.get(j)))
					{
						DestinationOptions.remove(i);
						break;
					}
				}
			}
			Destination.setModel(new DefaultComboBoxModel(DestinationOptions.toArray()));
			break;
		}
		case "Train":
		{
			ArrayList<String> DestinationOptions=new ArrayList<String>();
			trips.trimToSize();
			for(int i=0;i<trips.size();i++)
			{
				if(trips.get(i).getSource().equalsIgnoreCase(selected) && trips.get(i).getCarID().charAt(0)=='T' )
				{
				DestinationOptions.add(trips.get(i).getDestination());
				}
			}
			DestinationOptions.trimToSize();
			for(int i=DestinationOptions.size()-1;i>0;i--)
			{
				for(int j=i-1;j>=0;j--)
				{
					if(DestinationOptions.get(i).equals(DestinationOptions.get(j)))
					{
						DestinationOptions.remove(i);
						break;
					}
				}
			}
			Destination.setModel(new DefaultComboBoxModel(DestinationOptions.toArray()));
			break;
		}
		case "Limousine":
		{
			ArrayList<String> DestinationOptions=new ArrayList<String>();
			trips.trimToSize();
			for(int i=0;i<trips.size();i++)
			{
				if(trips.get(i).getSource().equalsIgnoreCase(selected) && trips.get(i).getCarID().charAt(0)=='L' )
				{
				DestinationOptions.add(trips.get(i).getDestination());
				}
			}
			DestinationOptions.trimToSize();
			for(int i=DestinationOptions.size()-1;i>0;i--)
			{
				for(int j=i-1;j>=0;j--)
				{
					if(DestinationOptions.get(i).equals(DestinationOptions.get(j)))
					{
						DestinationOptions.remove(i);
						break;
					}
				}
			}
			Destination.setModel(new DefaultComboBoxModel(DestinationOptions.toArray()));
			break;
		}
		case "Metro":
		{
			ArrayList<String> DestinationOptions=new ArrayList<String>();
			trips.trimToSize();
			for(int i=0;i<trips.size();i++)
			{
				if(trips.get(i).getSource().equalsIgnoreCase(selected) && trips.get(i).getCarID().charAt(0)=='M' && trips.get(i).getCarID().charAt(1)=='T')
				{
				DestinationOptions.add(trips.get(i).getDestination());
				}
			}
			DestinationOptions.trimToSize();
			for(int i=DestinationOptions.size()-1;i>0;i--)
			{
				for(int j=i-1;j>=0;j--)
				{
					if(DestinationOptions.get(i).equals(DestinationOptions.get(j)))
					{
						DestinationOptions.remove(i);
						break;
					}
				}
			}
			Destination.setModel(new DefaultComboBoxModel(DestinationOptions.toArray()));
			break;
		}
		case "Motorcycle":
		{
			ArrayList<String> DestinationOptions=new ArrayList<String>();
			trips.trimToSize();
			for(int i=0;i<trips.size();i++)
			{
				if(trips.get(i).getSource().equalsIgnoreCase(selected) && trips.get(i).getCarID().charAt(0)=='M')
				{
				DestinationOptions.add(trips.get(i).getDestination());
				}
			}
			DestinationOptions.trimToSize();
			for(int i=DestinationOptions.size()-1;i>0;i--)
			{
				for(int j=i-1;j>=0;j--)
				{
					if(DestinationOptions.get(i).equals(DestinationOptions.get(j)))
					{
						DestinationOptions.remove(i);
						break;
					}
				}
			}
			Destination.setModel(new DefaultComboBoxModel(DestinationOptions.toArray()));
			break;
		}
		}
		
		
		
		
		
	}
	void FillDepartInfo(String selected,String SrcSelection,String CarSelection)
	{
		switch(CarSelection)
		{
		case "Bus":
		{
			
			ArrayList<String> DepartOptions=new ArrayList<String>();
			trips.trimToSize();
			for(int i=0;i<trips.size();i++)
			{
				if(trips.get(i).getDestination().equalsIgnoreCase(selected)
						&&trips.get(i).getSource().equalsIgnoreCase(SrcSelection)
						&& trips.get(i).getCarID().charAt(0)=='B')
				{
				DepartOptions.add(trips.get(i).getDepartDate());
				}
			}
			DepartOptions.trimToSize();
			for(int i=DepartOptions.size()-1;i>0;i--)
			{
				for(int j=i-1;j>=0;j--)
				{
					if(DepartOptions.get(i).equals(DepartOptions.get(j)))
					{
						DepartOptions.remove(i);
						break;
					}
				}
			}
			DepartBox.setModel(new DefaultComboBoxModel(DepartOptions.toArray()));
	
			break;
		}
		case "Mini-Bus":
		{
			ArrayList<String> DepartOptions=new ArrayList<String>();
			trips.trimToSize();
			for(int i=0;i<trips.size();i++)
			{
				if(trips.get(i).getDestination().equalsIgnoreCase(selected)
						&&trips.get(i).getSource().equalsIgnoreCase(SrcSelection)
						&& trips.get(i).getCarID().charAt(0)=='M' && trips.get(i).getCarID().charAt(1)=='B')
				{
				DepartOptions.add(trips.get(i).getDepartDate());
				}
			}
			DepartOptions.trimToSize();
			for(int i=DepartOptions.size()-1;i>0;i--)
			{
				for(int j=i-1;j>=0;j--)
				{
					if(DepartOptions.get(i).equals(DepartOptions.get(j)))
					{
						DepartOptions.remove(i);
						break;
					}
				}
			}
			DepartBox.setModel(new DefaultComboBoxModel(DepartOptions.toArray()));
			break;
		}
		case "Taxi":
		{
			ArrayList<String> DepartOptions=new ArrayList<String>();
			trips.trimToSize();
			for(int i=0;i<trips.size();i++)
			{
				if(trips.get(i).getDestination().equalsIgnoreCase(selected)
						&&trips.get(i).getSource().equalsIgnoreCase(SrcSelection)
						&& trips.get(i).getCarID().charAt(0)=='R' && trips.get(i).getCarID().charAt(1)=='T')
				{
				DepartOptions.add(trips.get(i).getDepartDate());
				}
			}
			DepartOptions.trimToSize();
			for(int i=DepartOptions.size()-1;i>0;i--)
			{
				for(int j=i-1;j>=0;j--)
				{
					if(DepartOptions.get(i).equals(DepartOptions.get(j)))
					{
						DepartOptions.remove(i);
						break;
					}
				}
			}
			DepartBox.setModel(new DefaultComboBoxModel(DepartOptions.toArray()));
			break;
		}
		case "Train":
		{
			ArrayList<String> DepartOptions=new ArrayList<String>();
			trips.trimToSize();
			for(int i=0;i<trips.size();i++)
			{
				if(trips.get(i).getDestination().equalsIgnoreCase(selected)
						&&trips.get(i).getSource().equalsIgnoreCase(SrcSelection)
						&& trips.get(i).getCarID().charAt(0)=='T')
				{
				DepartOptions.add(trips.get(i).getDepartDate());
				}
			}
			DepartOptions.trimToSize();
			for(int i=DepartOptions.size()-1;i>0;i--)
			{
				for(int j=i-1;j>=0;j--)
				{
					if(DepartOptions.get(i).equals(DepartOptions.get(j)))
					{
						DepartOptions.remove(i);
						break;
					}
				}
			}
			DepartBox.setModel(new DefaultComboBoxModel(DepartOptions.toArray()));
			break;
		}
		case "Limousine":
		{
			ArrayList<String> DepartOptions=new ArrayList<String>();
			trips.trimToSize();
			for(int i=0;i<trips.size();i++)
			{
				if(trips.get(i).getDestination().equalsIgnoreCase(selected)
						&&trips.get(i).getSource().equalsIgnoreCase(SrcSelection)
						&& trips.get(i).getCarID().charAt(0)=='L')
				{
				DepartOptions.add(trips.get(i).getDepartDate());
				}
			}
			DepartOptions.trimToSize();
			for(int i=DepartOptions.size()-1;i>0;i--)
			{
				for(int j=i-1;j>=0;j--)
				{
					if(DepartOptions.get(i).equals(DepartOptions.get(j)))
					{
						DepartOptions.remove(i);
						break;
					}
				}
			}
			DepartBox.setModel(new DefaultComboBoxModel(DepartOptions.toArray()));
			break;
		}
		case "Metro":
		{
			ArrayList<String> DepartOptions=new ArrayList<String>();
			trips.trimToSize();
			for(int i=0;i<trips.size();i++)
			{
				if(trips.get(i).getDestination().equalsIgnoreCase(selected)
						&&trips.get(i).getSource().equalsIgnoreCase(SrcSelection)
						&& trips.get(i).getCarID().charAt(0)=='M' && trips.get(i).getCarID().charAt(1)=='T')
				{
				DepartOptions.add(trips.get(i).getDepartDate());
				}
			}
			DepartOptions.trimToSize();
			for(int i=DepartOptions.size()-1;i>0;i--)
			{
				for(int j=i-1;j>=0;j--)
				{
					if(DepartOptions.get(i).equals(DepartOptions.get(j)))
					{
						DepartOptions.remove(i);
						break;
					}
				}
			}
			DepartBox.setModel(new DefaultComboBoxModel(DepartOptions.toArray()));
			break;
		}
		case "Motorcycle":
		{
			ArrayList<String> DepartOptions=new ArrayList<String>();
			trips.trimToSize();
			for(int i=0;i<trips.size();i++)
			{
				if(trips.get(i).getDestination().equalsIgnoreCase(selected)
						&&trips.get(i).getSource().equalsIgnoreCase(SrcSelection)
						&& trips.get(i).getCarID().charAt(0)=='M')
				{
				DepartOptions.add(trips.get(i).getDepartDate());
				}
			}
			DepartOptions.trimToSize();
			for(int i=DepartOptions.size()-1;i>0;i--)
			{
				for(int j=i-1;j>=0;j--)
				{
					if(DepartOptions.get(i).equals(DepartOptions.get(j)))
					{
						DepartOptions.remove(i);
						break;
					}
				}
			}
			DepartBox.setModel(new DefaultComboBoxModel(DepartOptions.toArray()));
			break;
		}
		}

	}
	void FillLabels(String selected,String DestSelection, String SrcSelection,String CarSelection)
	{
		rdbtnOneway.setEnabled(true);
		  rdbtnRound.setEnabled(true);
		switch(CarSelection)
		{
		case "Bus":
		{
			
			trips.trimToSize();
			for(int i=0;i<trips.size();i++)
			{
				if(trips.get(i).getDepartDate().equalsIgnoreCase(selected)&&trips.get(i).getDestination().equalsIgnoreCase(DestSelection)
						&&trips.get(i).getSource().equalsIgnoreCase(SrcSelection)
						&& trips.get(i).getCarID().charAt(0)=='B')
				{
					lblReturndate.setText(trips.get(i).getReturnDate());
					double DiscountedPrice=trips.get(i).getPrice()*0.6;
					lblPrice.setText(Double.toString(DiscountedPrice));
					lblType_2.setText(trips.get(i).getType());
					CarIDLbl.setText(trips.get(i).getCarID());
				}
			}
			break;
		}
		case "Mini-Bus":
		{
				trips.trimToSize();
				for(int i=0;i<trips.size();i++)
				{
					if(trips.get(i).getDepartDate().equalsIgnoreCase(selected)&&trips.get(i).getDestination().equalsIgnoreCase(DestSelection)
							&&trips.get(i).getSource().equalsIgnoreCase(SrcSelection)
							&& trips.get(i).getCarID().charAt(0)=='M' && trips.get(i).getCarID().charAt(1)=='B')
					{
						lblReturndate.setText(trips.get(i).getReturnDate());
						double DiscountedPrice=trips.get(i).getPrice()*0.6;
						lblPrice.setText(Double.toString(DiscountedPrice));
						lblType_2.setText(trips.get(i).getType());
						CarIDLbl.setText(trips.get(i).getCarID());
					}
				}
				break;
		}
		case "Taxi":
		{
			trips.trimToSize();
			for(int i=0;i<trips.size();i++)
			{
				if(trips.get(i).getDepartDate().equalsIgnoreCase(selected)&&trips.get(i).getDestination().equalsIgnoreCase(DestSelection)
						&&trips.get(i).getSource().equalsIgnoreCase(SrcSelection)
						&& trips.get(i).getCarID().charAt(0)=='R' && trips.get(i).getCarID().charAt(1)=='T')
				{
					lblReturndate.setText(trips.get(i).getReturnDate());
					double DiscountedPrice=trips.get(i).getPrice()*0.6;
					lblPrice.setText(Double.toString(DiscountedPrice));
					lblType_2.setText(trips.get(i).getType());
					CarIDLbl.setText(trips.get(i).getCarID());
				}
			}
			break;
		}
		case "Train":
		{
			trips.trimToSize();
			for(int i=0;i<trips.size();i++)
			{
				if(trips.get(i).getDepartDate().equalsIgnoreCase(selected)&&trips.get(i).getDestination().equalsIgnoreCase(DestSelection)
						&&trips.get(i).getSource().equalsIgnoreCase(SrcSelection)
						&& trips.get(i).getCarID().charAt(0)=='T')
				{
					lblReturndate.setText(trips.get(i).getReturnDate());
					double DiscountedPrice=trips.get(i).getPrice()*0.6;
					lblPrice.setText(Double.toString(DiscountedPrice));
					lblType_2.setText(trips.get(i).getType());
					CarIDLbl.setText(trips.get(i).getCarID());
				}
			}
			break;
		}
		case "Limousine":
		{
			trips.trimToSize();
			for(int i=0;i<trips.size();i++)
			{
				if(trips.get(i).getDepartDate().equalsIgnoreCase(selected)&&trips.get(i).getDestination().equalsIgnoreCase(DestSelection)
						&&trips.get(i).getSource().equalsIgnoreCase(SrcSelection)
						&& trips.get(i).getCarID().charAt(0)=='L')
				{
					lblReturndate.setText(trips.get(i).getReturnDate());
					double DiscountedPrice=trips.get(i).getPrice()*0.6;
					lblPrice.setText(Double.toString(DiscountedPrice));
					lblType_2.setText(trips.get(i).getType());
					CarIDLbl.setText(trips.get(i).getCarID());
				}
			}
			break;
		}
		case "Metro":
		{
			trips.trimToSize();
			for(int i=0;i<trips.size();i++)
			{
				if(trips.get(i).getDepartDate().equalsIgnoreCase(selected)&&trips.get(i).getDestination().equalsIgnoreCase(DestSelection)
						&&trips.get(i).getSource().equalsIgnoreCase(SrcSelection)
						&& trips.get(i).getCarID().charAt(0)=='M' && trips.get(i).getCarID().charAt(1)=='T')
				{
					lblReturndate.setText(trips.get(i).getReturnDate());
					double DiscountedPrice=trips.get(i).getPrice()*0.6;
					lblPrice.setText(Double.toString(DiscountedPrice));
					lblType_2.setText(trips.get(i).getType());
					CarIDLbl.setText(trips.get(i).getCarID());
				}
			}
			break;
		}
		case "Motorcycle":
		{
			trips.trimToSize();
			for(int i=0;i<trips.size();i++)
			{
				if(trips.get(i).getDepartDate().equalsIgnoreCase(selected)&&trips.get(i).getDestination().equalsIgnoreCase(DestSelection)
						&&trips.get(i).getSource().equalsIgnoreCase(SrcSelection)
						&& trips.get(i).getCarID().charAt(0)=='M')
				{
					lblReturndate.setText(trips.get(i).getReturnDate());
					double DiscountedPrice=trips.get(i).getPrice()*0.6;
					lblPrice.setText(Double.toString(DiscountedPrice));
					lblType_2.setText(trips.get(i).getType());
					CarIDLbl.setText(trips.get(i).getCarID());
				}
			}
			break;
		}
		}
	}
	void FillComfortabilityBox()
	{
		String[] comfortability= {"Low","Intermediate","High","VIP Level"};
		ComfortabilityBox.setModel(new DefaultComboBoxModel(comfortability));
	}
	void FillAvailDriverBox()
	{
		LoadAllHumans();
		employees.trimToSize();
		ArrayList<String> AvailEmp=new ArrayList<String>();
		for(int i=0;i<employees.size();i++)
		{
			if(employees.get(i).getAvailable() && employees.get(i).getCarDrivingID().equalsIgnoreCase("null"))
			{
				AvailEmp.add(Integer.toString(employees.get(i).getHumanID()));
			}
		}
		AvailDriverBox.setModel(new DefaultComboBoxModel(AvailEmp.toArray()));
		
		if(AvailDriverBox.getItemCount()==0)
		{
			playsound(pop);
			int button=JOptionPane.YES_NO_OPTION;
			int result=JOptionPane.showConfirmDialog(frame, "There are No Available Drivers at the moment\nWant to add a Driver?","Information Error",button);
			playsound(pop);
			if(result==JOptionPane.YES_OPTION)
			{
		 		ResetCarsGui();
		 		pnlButtons.setVisible(true);
		 		pnlCars.setVisible(false);
				pnlBook.setVisible(false);
				pnlMembers.setVisible(true);
				LoadAllHumans();
				IntroCars.setVisible(false);
				Menu1.setVisible(false);
				Employee.setVisible(true);
				chosenC=0;
				populateC1=false;
				populateC2=false;
				populateC3=false;
				populateC4=false;
				populateC5=false;
				populateC6=false;
				populateC7=false;
				DefaultTableModel t1 = (DefaultTableModel) tblMini.getModel();
				DefaultTableModel t2 = (DefaultTableModel) tblLimo.getModel();
				DefaultTableModel t3 = (DefaultTableModel) tblTaxi.getModel();
				DefaultTableModel t4 = (DefaultTableModel) tblTrain.getModel();
				DefaultTableModel t5 = (DefaultTableModel) tblMetro.getModel();
				DefaultTableModel t6 = (DefaultTableModel) tblMotor.getModel();
				DefaultTableModel t7 = (DefaultTableModel) table_1.getModel();
				t1.setRowCount(0);
				t2.setRowCount(0);
				t3.setRowCount(0);
				t4.setRowCount(0);
				t5.setRowCount(0);
				t6.setRowCount(0);
				t7.setRowCount(0);
				Buses.setVisible(false);
				IntroCars.setVisible(false);
				infoPnlCars.setVisible(false);
				BusesList.setVisible(false);
				Motorlist.setVisible(false);
				Metrolist.setVisible(false);
				Trainlist.setVisible(false);
				Taxilist.setVisible(false);
				Limousinelist.setVisible(false);
				MiniBuseslist.setVisible(false);
				AddMenu.setVisible(false);
				DeleteMenuCars.setVisible(false);
				ResetManagementGui();
				EmpIntro.setVisible(false);
				InfoMem.setVisible(true);
				AddMenuMem.setVisible(true);
				DeleteMenuMem_1.setVisible(false);
				EmpPnl.setVisible(false);
				UserPnl.setVisible(false);
				ManagerPnl.setVisible(false);
				VipPnl.setVisible(false);
			}
			else
			{
				ResetBookingGUI();
			}
		}
	}
	void FillDriverLbl(String selected)
	{
		employees.trimToSize();
		for(int i=0;i<employees.size();i++)
		{
			if(employees.get(i).getHumanID()==Integer.parseInt(selected))
			{
				DriverNameLbl.setText(employees.get(i).getFirstName()+" "+employees.get(i).getLastName());
				neededDriverIndex=i;
				break;
			}
		}
	}
	void FillAvailableCarsTrips(String Selected)
	{
		
		switch(Selected)
		{
		case "Bus":
		{
			
			loadAllCars();
			buses.trimToSize();
			ArrayList<String> AvailCar=new ArrayList<String>();
			for(int i=0;i<buses.size();i++)
			{
				if(buses.get(i).getAvailable())
				{
					AvailCar.add(buses.get(i).getCompCarID());
				}
			}
			TripsAvailableCarsBox.setModel(new DefaultComboBoxModel(AvailCar.toArray()));
			break;
		}
		case "Mini-Bus":
		{
			loadAllCars();
			minibuses.trimToSize();
			ArrayList<String> AvailCar=new ArrayList<String>();
			for(int i=0;i<minibuses.size();i++)
			{
				if(minibuses.get(i).getAvailable())
				{
					AvailCar.add(minibuses.get(i).getCompCarID());
				}
			}
			TripsAvailableCarsBox.setModel(new DefaultComboBoxModel(AvailCar.toArray()));
			break;
		}
		case "Taxi":
		{
			loadAllCars();
			taxis.trimToSize();
			ArrayList<String> AvailCar=new ArrayList<String>();
			for(int i=0;i<taxis.size();i++)
			{
				if(taxis.get(i).getAvailable())
				{
					AvailCar.add(taxis.get(i).getCompCarID());
				}
			}
			TripsAvailableCarsBox.setModel(new DefaultComboBoxModel(AvailCar.toArray()));
			break;
		}
		case "Train":
		{
			loadAllCars();
			trains.trimToSize();
			ArrayList<String> AvailCar=new ArrayList<String>();
			for(int i=0;i<trains.size();i++)
			{
				if(trains.get(i).getAvailable())
				{
					AvailCar.add(trains.get(i).getCompCarID());
				}
			}
			TripsAvailableCarsBox.setModel(new DefaultComboBoxModel(AvailCar.toArray()));
			break;
		}
		case "Limousine":
		{
			loadAllCars();
			limos.trimToSize();
			ArrayList<String> AvailCar=new ArrayList<String>();
			for(int i=0;i<limos.size();i++)
			{
				if(limos.get(i).getAvailable())
				{
					AvailCar.add(limos.get(i).getCompCarID());
				}
			}
			TripsAvailableCarsBox.setModel(new DefaultComboBoxModel(AvailCar.toArray()));
			break;
		}
		case "Metro":
		{
			loadAllCars();
			metros.trimToSize();
			ArrayList<String> AvailCar=new ArrayList<String>();
			for(int i=0;i<metros.size();i++)
			{
				if(metros.get(i).getAvailable())
				{
					AvailCar.add(metros.get(i).getCompCarID());
				}
			}
			TripsAvailableCarsBox.setModel(new DefaultComboBoxModel(AvailCar.toArray()));
			break;
		}
		case "Motorcycle":
		{
			loadAllCars();
			motorcycles.trimToSize();
			ArrayList<String> AvailCar=new ArrayList<String>();
			for(int i=0;i<motorcycles.size();i++)
			{
				if(motorcycles.get(i).getAvailable())
				{
					AvailCar.add(motorcycles.get(i).getCompCarID());
				}
			}
			TripsAvailableCarsBox.setModel(new DefaultComboBoxModel(AvailCar.toArray()));
			break;
		}
	}
		if(TripsAvailableCarsBox.getItemCount()==0)
		{
			playsound(pop);
			int button=JOptionPane.YES_NO_OPTION;
			int result=JOptionPane.showConfirmDialog(frame, "There are No Available Car of this Type\nWant to add a car?","Information Error",button);
			playsound(pop);
			if(result==JOptionPane.YES_OPTION)
			{
				ResetBookingGUI();
				DeleteBooking.setVisible(false);
		 		addinBook.setVisible(false);
		 		BookingIntro.setVisible(false);
		 		infoPanel.setVisible(false);
		 		AddBookingPnl.setVisible(false);
		 		TripsTblPnl.setVisible(false);
		 		BookinglistTblpnl.setVisible(false);
		 		ResetCarsGui();
		 		pnlButtons.setVisible(true);
		 		pnlCars.setVisible(true);
				pnlBook.setVisible(false);
				pnlMembers.setVisible(false);
				loadAllCars();
				populate=false;
				chosenB=0;
				Menu1.setVisible(true);
				Booking.setVisible(false);
				DefaultTableModel t1 = (DefaultTableModel) table.getModel();
				DefaultTableModel t2 = (DefaultTableModel) tblTrips.getModel();
				t1.setRowCount(0);
				t2.setRowCount(0);
				IntroCars.setVisible(true);
				Menu1.setVisible(false);
				Buses.setVisible(true);
				Booking.setVisible(false);
				IntroCars.setVisible(false);
				infoPnlCars.setVisible(true);
				BusesList.setVisible(false);
				Motorlist.setVisible(false);
				Metrolist.setVisible(false);
				Trainlist.setVisible(false);
				Taxilist.setVisible(false);
				Limousinelist.setVisible(false);
				MiniBuseslist.setVisible(false);
				AddMenu.setVisible(true);
				DeleteMenuCars.setVisible(false);
			}
			else
			{
				ResetBookingGUI();
			}
		}
	}
	void ResetBookingGUI()
	{
		DepartBox.removeAllItems();
 		SourceAddComboBox.removeAllItems();
 		Destination.removeAllItems();
 		TripsSourceBox.setSelectedIndex(0);
 		TripsDestinationBox.setSelectedIndex(0);
 		TripsCarBox.setSelectedIndex(0);
 		TripsAvailableCarsBox.removeAllItems();
 		TripsStopsBox.setSelectedIndex(0);
 		DepartDay.setSelectedIndex(0);
 		DepartMonth.setSelectedIndex(0);
 		DepartYear.setSelectedIndex(0);
 		ReturnDay.setSelectedIndex(0);
 		ReturnMonth.setSelectedIndex(0);
 		ReturnYear.setSelectedIndex(0);
 		label_17.setText("Price");
 		lblReturndate.setText("ReturnDate");
 		lblType_2.setText("Stops");
 		lblPrice.setText("Price (Manager Discount)");
 		CarIDLbl.setText("CarID");
 		rdbtnOneway.setSelected(true);
 		rdbtnOneway.setEnabled(false);
		  rdbtnRound.setEnabled(false);
		  SrcDel.setText("Example:Alexandria");
			TypeDel.setText("Example:Bus");
			DestDel.setText("Example:Cairo");
			CarIDDel.setText("Example:B-4789");
			DepartDel.setText("Example:20/10/2018");
			ReturnDel.setText("Example:20/10/2018");
			BookingIDSearch.setText("Example:521");
	}
	void ResetManagementGui()
	{
		HumanTypeBox.setSelectedIndex(0);
		txtFirst.setText("Example:Hisham");
		txtLast.setText("Example:Maged");
		txtAge.setText("Example:19");
		txtPhone.setText("Example:01228961190");
		txtPassword.setText("asdasd");
		IDSearch.setText("Example:4725");
		FirstDel.setText("Example:Hisham");
		LastDel.setText("Example:Maged");
		AgeDel.setText("Example:19");
		PhoneDel.setText("Example:01228961190");
		TypeDelBox.setSelectedIndex(0);
	}
	void ResetCarsGui()
	{
		CarBox.setSelectedIndex(0);
		ComfortabilityBox.removeAllItems();
		AvailDriverBox.removeAllItems();
		DriverNameLbl.setText("Driver name");
		lblCarid.setText("Generated CarID");
		AssigDriverID.setText("Assigned DriverID");
		DestDelCar.setText("Example:Cairo");
		SrcDelCar.setText("Example:Alexandria");
		ComfortabilityDel.setText("Example:Low");
		AvailDel.setText("Example:20/10/2018");
		CarTypeDel.setSelectedIndex(0);
		CarIDSearch.setText("Example:B-4725");
		
	}
	int FindIfAvailable(String selected)
	{
		loadAllCars();
		switch(selected)
		{
		case "Bus":
		{
			for(int i=0;i<buses.size();i++)
			{
				if(buses.get(i).getCompCarID().equalsIgnoreCase(CarIDLbl.getText()))
				{
					
					if(buses.get(i).getAvailNoOfSeats()>0)
					{
						
						buses.get(i).TakeSeat();
						return 1;
					}
				}
			}
			break;
		}
		case "Mini-Bus":
		{
			for(int i=0;i<minibuses.size();i++)
			{
				if(minibuses.get(i).getCompCarID().equalsIgnoreCase(CarIDLbl.getText()))
				{
					if(minibuses.get(i).getAvailNoOfSeats()>0)
					{
						minibuses.get(i).TakeSeat();
						return 1;
					}
				}
			}
			break;
		}
		case "Taxi":
		{
			for(int i=0;i<taxis.size();i++)
			{
				if(taxis.get(i).getCompCarID().equalsIgnoreCase(CarIDLbl.getText()))
				{
					if(taxis.get(i).getAvailNoOfSeats()>0)
					{
						taxis.get(i).TakeSeat();
						return 1;
					}
				}
			}
			break;
		}
		case "Train":
		{
			for(int i=0;i<trains.size();i++)
			{
				if(trains.get(i).getCompCarID().equalsIgnoreCase(CarIDLbl.getText()))
				{
					if(trains.get(i).getAvailNoOfSeats()>0)
					{
						trains.get(i).TakeSeat();
						return 1;
					}
				}
			}
			break;
		}
		case "Limousine":
		{
			for(int i=0;i<limos.size();i++)
			{
				if(limos.get(i).getCompCarID().equalsIgnoreCase(CarIDLbl.getText()))
				{
					if(limos.get(i).getAvailNoOfSeats()>0)
					{
						limos.get(i).TakeSeat();
						return 1;
					}
				}
			}
			break;
		}
		case "Metro":
		{
			for(int i=0;i<metros.size();i++)
			{
				if(metros.get(i).getCompCarID().equalsIgnoreCase(CarIDLbl.getText()))
				{
					if(metros.get(i).getAvailNoOfSeats()>0)
					{
						metros.get(i).TakeSeat();
						return 1;
					}
				}
			}
			break;
		}
		case "Motorcycle":
		{
			for(int i=0;i<motorcycles.size();i++)
			{
				if(motorcycles.get(i).getCompCarID().equalsIgnoreCase(CarIDLbl.getText()))
				{
					if(motorcycles.get(i).getAvailNoOfSeats()>0)
					{
						motorcycles.get(i).TakeSeat();
						return 1;
					}
				}
			}
			break;
		}
		}
		return 0;
	}
}
