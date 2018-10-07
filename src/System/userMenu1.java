package System;
/**
 * @author ${hisham_maged10}
 *https://github.com/hisham-maged10
 * ${DesktopApps}
 */
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.CardLayout;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JRadioButton;

public class userMenu1 extends FileHandling {
	private JFrame frame;
	public JFrame getFrame() {
		return frame;
	}
	private JPanel contentPane;
	private File Text=new File("src/System/sounds/Text.WAV");
	private File Press=new File("src/System/sounds/Login.WAV");
	private File Bam=new File("src/System/sounds/bam.WAV");
	private File pop=new File("src/System/sounds/tada.WAV");
	private String username;
	private JLabel Welcome;
	private LoginMenu Login=new LoginMenu();
	private JPanel MainMenu;
	private JPanel Changer;
	private JPanel BookingList;
	private JPanel BookedList;
	private JTable table;
	private JTableHeader header;
	private JPanel btnpnl;
	private Boolean populate=false;
	private boolean list=false;
	private boolean booked=false;
	private int ID;
	private JButton btnNewButton_2;
	private JComboBox SourceAddComboBox;
	private JComboBox CarTypeBox;
	private JComboBox Destination;
	private JLabel lblReturndate;
	private JLabel lblType_2;
	private JLabel CarIDLbl;
	private JLabel lblPrice;
	private JButton btnBookNow;
	private JPanel Header;
	private JRadioButton rdbtnRound;
	private JRadioButton rdbtnOneway;
	private JComboBox DepartBox;
	private JLabel lblNewLabel;
	private JButton button_1;
	private JButton btnNewButton_1;
	private boolean discount;
	private int xMouse;
	private int yMouse;

	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					userMenu1 login = new userMenu1();
					login.frame.setVisible(true);
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
	public userMenu1(int UserIndex) {
		LoadInfo(user,3);
		ID=users.get(UserIndex).getHumanID();
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
		
		btnpnl = new JPanel();
		btnpnl.setVisible(false);
		btnpnl.setBounds(280, 168, 208, 43);
		panel.add(btnpnl);
		btnpnl.setLayout(new CardLayout(0, 0));
		
		btnNewButton_2 = new JButton("Back");
		btnpnl.add(btnNewButton_2, "name_225167405082627");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ResetBookingGUI();
				btnNewButton_1.setBackground(new Color(42, 53, 58));
				Header.setBackground(new Color(61,76,83).darker());
				button_1.setBackground(new Color(42, 53, 58));
				btnpnl.setVisible(false);
				BookingList.setVisible(false);
				BookedList.setVisible(false);
				MainMenu.setVisible(true);
				list=false;
				booked=false;
				populate=false;
				DefaultTableModel t1 = (DefaultTableModel) table.getModel();
				t1.setRowCount(0);
			}
		});
		btnNewButton_2.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent arg0) {
				playsound(Text);
				if(list)
				{
				btnNewButton_2.setBackground(Color.white);
				btnNewButton_2.setForeground(new Color(61,76,83));
				}
				if(booked)
				{
					btnNewButton_2.setBackground(Color.white);
					btnNewButton_2.setForeground(new Color(61,76,83));
				}
				}
				
			public void mouseExited(MouseEvent e) {
				if(list)
				{
				btnNewButton_2.setBackground(new Color(172,49,46));
				btnNewButton_2.setForeground(Color.WHITE);
				}
				if(booked)
				{
				btnNewButton_2.setBackground(new Color(230,119,46));
				btnNewButton_2.setForeground(Color.WHITE);
				}
				
			}
			public void mousePressed(MouseEvent e) {
				playsound(Press);
			}
				
				
		});
		
		btnNewButton_2.setBorder(emptyborder);
		btnNewButton_2.setFocusable(false);
		btnNewButton_2.setFont(new Font("Segoe UI", Font.PLAIN, 29));
		
		Header = new JPanel();
		Header.setBackground(new Color(61,76,83).darker());
		
		
		
		Header.setBounds(0, 0, 1262, 211);
		panel.add(Header);
		Header.setLayout(null);
		
		lblNewLabel = new JLabel();
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
		
		JLabel lblUserMenu = new JLabel("User Menu");
		lblUserMenu.setForeground(Color.WHITE);
		lblUserMenu.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 25));
		lblUserMenu.setBounds(290, 80, 825, 92);
		Header.add(lblUserMenu);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(290, 102, 56, 14);
		Header.add(separator_1);
		
		Welcome = new JLabel();
		Welcome.setForeground(Color.WHITE);
		Welcome.setText("Welcome,"+users.get(UserIndex).getFirstName()+" "+users.get(UserIndex).getLastName());
		Welcome.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 25));
		Welcome.setBounds(916, 136, 304, 92);
		Header.add(Welcome);
		
		btnNewButton_1 = new JButton();
		btnNewButton_1.setBackground(new Color(42, 53, 58));
		btnNewButton_1.setBorder(emptyborder);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent arg0) {
				playsound(Text);
				btnNewButton_1.setBackground(Color.white);
			}
			public void mouseExited(MouseEvent e) {
				if(list)
				{
					btnNewButton_1.setBackground(new Color(247,71,66).darker());
				}
				else if(booked)
				{
					btnNewButton_1.setBackground(new Color(230,119,46));
				}
				else
				{
					btnNewButton_1.setBackground(new Color(42, 53, 58));
				}
			}
			public void mousePressed(MouseEvent e) {
				btnNewButton_1.setBackground(Color.WHITE);
			}
		});
		btnNewButton_1.setIcon(new ImageIcon("src/System/images/Delete_20px.png"));
		btnNewButton_1.setBounds(1211, 0, 51, 33);
		Header.add(btnNewButton_1);
		
		button_1 = new JButton();
		button_1.setIcon(new ImageIcon("src/System/images/Back_20px.png"));
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login.getFrame().setVisible(true);
				frame.setVisible(false);
			}
		});
		
		button_1.setBackground(new Color(42, 53, 58));
		button_1.setBounds(0, 0, 51, 33);
		button_1.setBorder(emptyborder);
		button_1.setFocusable(false);
		button_1.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent arg0) {
				playsound(Text);
				button_1.setBackground(Color.white);
			}
			public void mouseExited(MouseEvent e) {
				if(list)
				{
					button_1.setBackground(new Color(247,71,66).darker());
				}
				else if(booked)
				{
					button_1.setBackground(new Color(230,119,46));
				}
				else
				{
					button_1.setBackground(new Color(42, 53, 58));
				}
			}
			public void mousePressed(MouseEvent e) {
				playsound(Press);
				button_1.setBackground(Color.WHITE);
			}
		});
		Header.add(button_1);
		
		Changer = new JPanel();
		Changer.setBounds(0, 211, 1262, 462);
		panel.add(Changer);
		Changer.setLayout(new CardLayout(0, 0));
		
		MainMenu = new JPanel();
		Changer.add(MainMenu, "name_224230899014610");
		MainMenu.setBackground(SystemColor.controlHighlight);
		MainMenu.setLayout(null);
		
		JButton btnNewButton = new JButton();
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				loadBookings();
				list=true;
				btnNewButton_1.setBackground(new Color(247,71,66).darker());
				button_1.setBackground(new Color(247,71,66).darker());
				btnNewButton_2.setBackground(new Color(172,49,46));
				btnNewButton_2.setForeground(Color.WHITE);
				Header.setBackground(new Color(247,71,66).darker());
				btnpnl.setVisible(true);
				BookingList.setVisible(true);
				BookedList.setVisible(false);
				MainMenu.setVisible(false);
				
			}
		});
		btnNewButton.setFocusable(false);
		btnNewButton.setIcon(new ImageIcon("src/System/images/bus.png"));
		//btnNewButton.setBorder(new EmptyBorder(0, 0, 0, 0));
		btnNewButton.setBackground(SystemColor.controlHighlight);
		btnNewButton.setBounds(200, 109, 351, 306);
		btnNewButton.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent arg0) {
				playsound(Text);
				btnNewButton.setBackground(new Color(42,53,58));
			}
			public void mouseExited(MouseEvent e) {
				btnNewButton.setBackground(SystemColor.controlHighlight);
			}
			public void mousePressed(MouseEvent e) {
				playsound(Press);
				btnNewButton.setBackground(new Color(42,53,58));
			}
		});
		MainMenu.add(btnNewButton);
		
		JButton button = new JButton();
		button.setFocusable(false);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				booked=true;
				loadBookings();
				Header.setBackground(new Color(230,119,46));
				btnpnl.setVisible(true);
				btnNewButton_1.setBackground(new Color(230,119,46));
				button_1.setBackground(new Color(230,119,46));
				btnNewButton_2.setBackground(new Color(230,119,46));
				btnNewButton_2.setForeground(Color.WHITE);
				BookingList.setVisible(false);
				BookedList.setVisible(true);
				MainMenu.setVisible(false);
		 		if(!populate)
		 		{
		 		PopulateBookings();
		 		}
		 		populate=true;
		 		try
		 		{
		 		table.setRowSelectionInterval(0,0);
		 		}
		 		catch(Exception e2)
		 		{
		 			playsound(pop);
					int button=JOptionPane.YES_NO_OPTION;
					int result=JOptionPane.showConfirmDialog(frame, "You Haven't booked any Trips yet!\nDo you want to make a booking now?","Information Error",button);
					playsound(pop);
					if(result==JOptionPane.YES_OPTION)
					{
						btnpnl.setVisible(true);
						BookingList.setVisible(true);
						BookedList.setVisible(false);
						MainMenu.setVisible(false);
					}
					else
					{
						btnpnl.setVisible(false);
						BookingList.setVisible(false);
						BookedList.setVisible(false);
						MainMenu.setVisible(true);
					}
		 			
		 		}
			}
		});
		button.setIcon(new ImageIcon("src/System/images/calendar-clipart-booked-3.png"));
		button.setBackground(SystemColor.controlHighlight);
		//button.setBorder(emptyborder);
		button.setBounds(706, 109, 351, 306);
		button.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent arg0) {
				playsound(Text);
				button.setBackground(new Color(42,53,58));
			}
			public void mouseExited(MouseEvent e) {
				button.setBackground(SystemColor.controlHighlight);
			}
			public void mousePressed(MouseEvent e) {
				playsound(Press);
				button.setBackground(new Color(42,53,58));
			}
		});
		MainMenu.add(button);
		
		JLabel lblBookNow = new JLabel("Book Now !");
		lblBookNow.setHorizontalAlignment(SwingConstants.CENTER);
		lblBookNow.setForeground(SystemColor.windowBorder);
		lblBookNow.setFont(new Font("Segoe UI SemiBold", Font.BOLD, 44));
		lblBookNow.setBounds(230, 13, 304, 92);
		MainMenu.add(lblBookNow);
		
		JLabel lblBooked = new JLabel("Booked");
		lblBooked.setHorizontalAlignment(SwingConstants.CENTER);
		lblBooked.setForeground(SystemColor.windowBorder);
		lblBooked.setFont(new Font("Segoe UI Semibold", Font.BOLD, 44));
		lblBooked.setBounds(737, 13, 304, 92);
		MainMenu.add(lblBooked);
		
		BookingList = new JPanel();
		BookingList.setBackground(SystemColor.menu);
		Changer.add(BookingList, "name_224225439845412");
		BookingList.setLayout(null);
		
		JLabel lblCarType = new JLabel("Car Type");
		lblCarType.setForeground(new Color(61,76,83));
		lblCarType.setFont(new Font("Segoe UI Semilight", Font.ITALIC, 46));
		lblCarType.setBounds(71, 24, 245, 62);
		BookingList.add(lblCarType);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setForeground(new Color(61,76,83));
		separator_2.setBackground(new Color(61,76,83));
		separator_2.setBounds(71, 142, 245, 30);
		BookingList.add(separator_2);
		
		CarTypeBox = new JComboBox();
		CarTypeBox.setBackground(SystemColor.menu);
		CarTypeBox.setToolTipText("Choose the type of car u want to travel in\r\n");
		 CarTypeBox.addActionListener(new ActionListener() {
			  	public void actionPerformed(ActionEvent arg0) {
			  		if(!(CarTypeBox.getSelectedItem().toString().equals("Choose Car Type")))
			  		{
			  		FillSourceInfo(CarTypeBox.getSelectedItem().toString());
			  			Destination.removeAllItems();;
			  			DepartBox.removeAllItems();
			  			lblReturndate.setText("ReturnDate");
			  			lblType_2.setText("Stops");
			  			if(discount)
			  			{
			  				lblPrice.setText("Price (discounted)");	
			  			}
			  			else
			  			{
			  			lblPrice.setText("Price");
			  			}
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
		CarTypeBox.setFont(new Font("Segoe UI", Font.PLAIN, 21));
		CarTypeBox.setBounds(71, 88, 233, 41);
		BookingList.add(CarTypeBox);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setForeground(Color.WHITE);
		separator_3.setBackground(new Color(61, 76, 83));
		separator_3.setBounds(12, 9, 1238, 30);
		BookingList.add(separator_3);
		
		JSeparator separator_4 = new JSeparator();
		separator_4.setForeground(Color.WHITE);
		separator_4.setBackground(new Color(61, 76, 83));
		separator_4.setBounds(12, 452, 1238, 30);
		BookingList.add(separator_4);
		
		JSeparator separator_5 = new JSeparator();
		separator_5.setOrientation(SwingConstants.VERTICAL);
		separator_5.setForeground(Color.WHITE);
		separator_5.setBackground(new Color(61, 76, 83));
		separator_5.setBounds(10, 28, 29, 406);
		BookingList.add(separator_5);
		
		JSeparator separator_6 = new JSeparator();
		separator_6.setOrientation(SwingConstants.VERTICAL);
		separator_6.setForeground(Color.WHITE);
		separator_6.setBackground(new Color(61, 76, 83));
		separator_6.setBounds(1250, 28, 29, 406);
		BookingList.add(separator_6);
		
		JLabel lblSource = new JLabel("Source");
		lblSource.setForeground(new Color(61, 76, 83));
		lblSource.setFont(new Font("Segoe UI Semilight", Font.ITALIC, 46));
		lblSource.setBounds(71, 173, 245, 62);
		BookingList.add(lblSource);
		
		SourceAddComboBox = new JComboBox();
		SourceAddComboBox.addActionListener(new ActionListener() {
		  	public void actionPerformed(ActionEvent arg0) {
		  		try
		  		{
		  		FillDestinationInfo(SourceAddComboBox.getSelectedItem().toString(),CarTypeBox.getSelectedItem().toString());
	  			DepartBox.removeAllItems();
	  			lblReturndate.setText("ReturnDate");
	  			lblType_2.setText("Stops");
	  			if(discount)
	  			{
	  				lblPrice.setText("Price (discounted)");
	  			}
	  			else
	  			{
	  			lblPrice.setText("Price");
	  			}
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
		SourceAddComboBox.setBackground(SystemColor.menu);
		SourceAddComboBox.setToolTipText("Choose the Source");
		SourceAddComboBox.setFont(new Font("Segoe UI", Font.PLAIN, 21));
		SourceAddComboBox.setBounds(71, 237, 233, 41);
		BookingList.add(SourceAddComboBox);
		
		JSeparator separator_7 = new JSeparator();
		separator_7.setForeground(new Color(61, 76, 83));
		separator_7.setBackground(new Color(61, 76, 83));
		separator_7.setBounds(71, 291, 245, 30);
		BookingList.add(separator_7);
		
		JLabel lblDestination = new JLabel("Destination");
		lblDestination.setForeground(new Color(61, 76, 83));
		lblDestination.setFont(new Font("Segoe UI Semilight", Font.ITALIC, 46));
		lblDestination.setBounds(356, 24, 245, 62);
		BookingList.add(lblDestination);
		
		Destination = new JComboBox();
		 Destination.addActionListener(new ActionListener() {
			  	public void actionPerformed(ActionEvent e) {
			  		try
			  		{
			  		FillDepartInfo(Destination.getSelectedItem().toString(),SourceAddComboBox.getSelectedItem().toString(),CarTypeBox.getSelectedItem().toString());
			  		lblReturndate.setText("ReturnDate");
		  			lblType_2.setText("Stops");
		  			if(discount)
		  			{
		  				lblPrice.setText("Price (discounted)");
		  			}
		  			else
		  			{
		  			lblPrice.setText("Price");
		  			}
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
		Destination.setBorder(emptyborder);
		Destination.setFocusable(false);
		Destination.setBackground(SystemColor.menu);
		Destination.setToolTipText("Choose the Destination");
		Destination.setFont(new Font("Segoe UI", Font.PLAIN, 21));
		Destination.setBounds(356, 88, 233, 41);
		BookingList.add(Destination);
		
		JSeparator separator_8 = new JSeparator();
		separator_8.setForeground(new Color(61, 76, 83));
		separator_8.setBackground(new Color(61, 76, 83));
		separator_8.setBounds(356, 142, 245, 30);
		BookingList.add(separator_8);
		
		JLabel lblDepartdate = new JLabel("DepartDate");
		lblDepartdate.setForeground(new Color(61, 76, 83));
		lblDepartdate.setFont(new Font("Segoe UI Semilight", Font.ITALIC, 46));
		lblDepartdate.setBounds(356, 173, 245, 62);
		BookingList.add(lblDepartdate);
		
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
		DepartBox.setBackground(SystemColor.menu);
		DepartBox.setToolTipText("Choose the Depart Date");
		DepartBox.setFont(new Font("Segoe UI", Font.PLAIN, 21));
		DepartBox.setBounds(356, 237, 233, 41);
		BookingList.add(DepartBox);
		
		JSeparator separator_9 = new JSeparator();
		separator_9.setForeground(new Color(61, 76, 83));
		separator_9.setBackground(new Color(61, 76, 83));
		separator_9.setBounds(356, 291, 245, 30);
		BookingList.add(separator_9);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("src/System/images/3722_-_Route_I-512.png"));
		lblNewLabel_1.setBounds(739, 25, 467, 391);
		BookingList.add(lblNewLabel_1);
		
		JSeparator separator_10 = new JSeparator();
		separator_10.setForeground(new Color(61, 76, 83));
		separator_10.setBackground(new Color(61, 76, 83));
		separator_10.setBounds(59, 404, 168, 30);
		BookingList.add(separator_10);
		
		lblReturndate = new JLabel("ReturnDate");
		lblReturndate.setFont(new Font("Segoe UI Semilight", Font.ITALIC, 28));
		lblReturndate.setForeground(new Color(61,76,83));
		lblReturndate.setBounds(60, 374, 167, 30);
		BookingList.add(lblReturndate);
		
		lblType_2 = new JLabel("Stops");
		lblType_2.setForeground(new Color(61, 76, 83));
		lblType_2.setFont(new Font("Segoe UI Semilight", Font.ITALIC, 28));
		lblType_2.setBounds(256, 374, 144, 30);
		BookingList.add(lblType_2);
		
		JSeparator separator_11 = new JSeparator();
		separator_11.setForeground(new Color(61, 76, 83));
		separator_11.setBackground(new Color(61, 76, 83));
		separator_11.setBounds(255, 404, 145, 30);
		BookingList.add(separator_11);
		
		lblPrice = new JLabel();
		if(users.get(UserIndex).getState().equalsIgnoreCase("vip"))
		{
		lblPrice.setText("Price (discounted)");
		discount=true;
		}
		else
		{
			lblPrice.setText("Price");
			discount=false;
		}
		lblPrice.setForeground(new Color(61, 76, 83));
		lblPrice.setFont(new Font("Segoe UI Semilight", Font.ITALIC, 22));
		lblPrice.setBounds(422, 374, 167, 30);
		BookingList.add(lblPrice);
		
		JSeparator separator_12 = new JSeparator();
		separator_12.setForeground(new Color(61, 76, 83));
		separator_12.setBackground(new Color(61, 76, 83));
		separator_12.setBounds(418, 404, 171, 30);
		BookingList.add(separator_12);
		
		CarIDLbl = new JLabel("CarID");
		CarIDLbl.setForeground(new Color(61, 76, 83));
		CarIDLbl.setFont(new Font("Segoe UI Semilight", Font.ITALIC, 28));
		CarIDLbl.setBounds(602, 374, 167, 30);
		BookingList.add(CarIDLbl);
		
		JSeparator separator_13 = new JSeparator();
		separator_13.setForeground(new Color(61, 76, 83));
		separator_13.setBackground(new Color(61, 76, 83));
		separator_13.setBounds(601, 404, 144, 30);
		BookingList.add(separator_13);
		
		btnBookNow = new JButton("Book Now!");
		btnBookNow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
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
		  		Info[9]=users.get(UserIndex).getFirstName();
		  		Info[10]=users.get(UserIndex).getLastName();
		  		Info[11]=Integer.toString(users.get(UserIndex).getHumanID());
		  		try
				{
					playsound(pop);
					int button=JOptionPane.YES_NO_OPTION;
					int result=JOptionPane.showConfirmDialog(frame, "By clicking Yes, your account will be created","Warning",button);
					playsound(pop);
					if(result==JOptionPane.YES_OPTION)
					{
						WriteInfo(book,Info,2);
					playsound(Bam);
					LoadInfo(user,3);
					users.get(UserIndex).setTripsIN(users.get(UserIndex).getTripsIN()+1);
					users.get(UserIndex).setTripsCounter(users.get(UserIndex).getTripsCounter()+1);
					if(users.get(UserIndex).getTripsCounter()>5)
					{
						users.get(UserIndex).setState("vip");
					}
					users.trimToSize();
					user.setTxtFile();
					PrintWriter OutPutUser=CreatePrintWriterinTryCatch(user.getTxtFile());
					for(User iterate: users)
					{
						String InfoTobeWritten=iterate.getFirstName()+","+ iterate.getLastName() 
						+","+ iterate.getHumanID()+","+iterate.getPhoneNumber()+","+Integer.toString(iterate.getAge())+","+iterate.getState()
						+","+iterate.getTripsCounter()+","+iterate.getTripsIN()+","+iterate.getPassword();
						OutPutUser.println(InfoTobeWritten);
					}
					users.trimToSize();
					OutPutUser.close();
					LoadInfo(user,3);
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
			  		btnBookNow.setBackground(SystemColor.menu.darker());
			  		playsound(Press);
			  	}
			  	public void mouseEntered(MouseEvent e) {
			  		btnBookNow.setBackground(SystemColor.menu.darker());
			  		playsound(Text);
			  	}
			  	public void mouseExited(MouseEvent e) {
			  		btnBookNow.setBackground(SystemColor.menu);
			  		playsound(Text);
			  	}
			  });
		btnBookNow.setBackground(SystemColor.menu);
		btnBookNow.setForeground(new Color(61,76,83));
		btnBookNow.setFont(new Font("Segoe UI Semilight", Font.BOLD, 20));
		btnBookNow.setBounds(631, 24, 144, 47);
		BookingList.add(btnBookNow);
		
		JLabel lblType = new JLabel("Type:");
		lblType.setFont(new Font("Segoe UI", Font.ITALIC, 18));
		lblType.setForeground(new Color(61,76,83));
		lblType.setBounds(29, 330, 49, 30);
		BookingList.add(lblType);
		
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
		rdbtnRound.setForeground(new Color(61,76,83));
		rdbtnRound.setBackground(SystemColor.menu);
		rdbtnRound.setBounds(81, 337, 80, 25);
		BookingList.add(rdbtnRound);
		
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
		rdbtnOneway.setForeground(new Color(61,76,83));
		rdbtnOneway.setBackground(SystemColor.menu);
		rdbtnOneway.setBounds(157, 337, 127, 25);
		BookingList.add(rdbtnOneway);
		ButtonGroup group=new ButtonGroup();
		group.add(rdbtnOneway);
		group.add(rdbtnRound);
		rdbtnOneway.setSelected(true);
		rdbtnOneway.setEnabled(false);
		rdbtnRound.setEnabled(false);
		
		BookedList = new JPanel();
		Changer.add(BookedList, "name_224228395513296");
		BookedList.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 0, 1262, 462);
		BookedList.add(scrollPane);
		
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
			  table.setSelectionBackground(new Color(230,119,46).darker());
			  
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
	void loadBookings()
	{
		LoadInfo(book,2);
		LoadInfo(trip,4);
	}
	void PopulateBookings()
	{
		addRowBooking();
	}
	void addRowBooking()
	{
		DefaultTableModel tablemodel= (DefaultTableModel)table.getModel();
		Object[] rowData=new Object[12];
		bookings.trimToSize();
		for(int i=0;i<bookings.size();i++)
		{
			if(bookings.get(i).getUserID()==ID)
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
		double DiscountedPrice;
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
					if(discount)
					{
						DiscountedPrice=trips.get(i).getPrice()*0.8;
					}
					else
					{
						DiscountedPrice=trips.get(i).getPrice();
					}
					
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
						if(discount)
						{
							DiscountedPrice=trips.get(i).getPrice()*0.8;
						}
						else
						{
							DiscountedPrice=trips.get(i).getPrice();
						}
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
					if(discount)
					{
						DiscountedPrice=trips.get(i).getPrice()*0.8;
					}
					else
					{
						DiscountedPrice=trips.get(i).getPrice();
					}
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
					if(discount)
					{
						DiscountedPrice=trips.get(i).getPrice()*0.8;
					}
					else
					{
						DiscountedPrice=trips.get(i).getPrice();
					}
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
					if(discount)
					{
						DiscountedPrice=trips.get(i).getPrice()*0.8;
					}
					else
					{
						DiscountedPrice=trips.get(i).getPrice();
					}
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
					if(discount)
					{
						DiscountedPrice=trips.get(i).getPrice()*0.8;
					}
					else
					{
						DiscountedPrice=trips.get(i).getPrice();
					}
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
					if(discount)
					{
						DiscountedPrice=trips.get(i).getPrice()*0.8;
					}
					else
					{
						DiscountedPrice=trips.get(i).getPrice();
					}
					lblPrice.setText(Double.toString(DiscountedPrice));
					lblType_2.setText(trips.get(i).getType());
					CarIDLbl.setText(trips.get(i).getCarID());
				}
			}
			break;
		}
		}
	}
	void ResetBookingGUI()
	{
		DepartBox.removeAllItems();
 		SourceAddComboBox.removeAllItems();
 		Destination.removeAllItems();
 		lblReturndate.setText("ReturnDate");
 		lblType_2.setText("Stops");
 		lblPrice.setText("Price (Manager Discount)");
 		CarIDLbl.setText("CarID");
 		rdbtnOneway.setSelected(true);
 		rdbtnOneway.setEnabled(false);
		  rdbtnRound.setEnabled(false);
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
