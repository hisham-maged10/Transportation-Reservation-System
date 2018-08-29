 package System;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import java.awt.Cursor;
import java.awt.ComponentOrientation;
import java.awt.CardLayout;
import java.awt.GridLayout;
import java.awt.SystemColor;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;

import java.awt.FlowLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.util.Timer;
import java.util.TimerTask;
import java.awt.event.MouseMotionAdapter;

public class LoginMenu extends FileHandling {

	private JPanel contentPane;
	private JPanel panel;
	private JPanel Login;
	private JPanel Loader;
	private JLabel ImgLoaderLbl;
	private JLabel lblLogingIn;
	private JTextField usertxt;
	private JPasswordField pass;
	private JSeparator separator;
	private JSeparator separator_1;
	private JLabel lblNewLabel;
	private JLabel label;
	private JLabel lblLoginSystem;
	private JLabel lblChooseType;
	private JLabel lblNewLabel_1;
	private JButton btnReset;
	private JRadioButton rdbtnAdmin;
	private JButton close;
	private JLabel lblBusReservationSystem;
	private JSeparator separator_2;
	private JRadioButton rdbtnUser;
	private int neededindex = -1;
	private boolean flag=false;
	private int xMouse;
	private int yMouse;
	public JFrame getFrame() {
		return frame;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
	}
	private JFrame frame;
	private File Text=new File("src/System/sounds/Text.WAV");
	private File pop=new File("src/System/sounds/tada.WAV");
	private File Loginx=new File("src/System/sounds/Login.WAV");
	private File Bam=new File("src/System/sounds/bam.WAV");


	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					LoginMenu login = new LoginMenu();
					login.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	

	public LoginMenu() {
		
		
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
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setUndecorated(true);
		frame.setBounds(390, 155, 780, 410);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		frame.setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel BgPanel = new JPanel();
		BgPanel.setBounds(0, 0, 780, 410);
		BgPanel.setBackground(new Color(255,255,255));
		BgPanel.setForeground(new Color(40,163,163));
		BgPanel.setFocusable(false);
		contentPane.add(BgPanel);
		BgPanel.setLayout(null);
		panel=new JPanel();
		panel.setBounds(0, 0, 780, 410);
		BgPanel.add(panel);
		panel.setBackground(new Color(255,255,255));
		panel.setLayout(new CardLayout(0, 0));
		
		Login = new JPanel();
		Login.setBackground(new Color(255,255,255));
		panel.add(Login, "name_17660238410880");
		Login.setLayout(null);
		
		usertxt = new JTextField();
		usertxt.addFocusListener(new FocusAdapter() {
			public void focusGained(FocusEvent arg0) {
				playsound(Text);
				
				if(usertxt.getText().equalsIgnoreCase("user or admin"))
					{
					playsound(Text);
				usertxt.setText("");
					}
				
			}
		});
		usertxt.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent e) {
				char ch=e.getKeyChar();
				if(!(Character.isDigit(ch) || e.getKeyChar()==KeyEvent.VK_BACK_SPACE))
				{
					e.consume();
					playsound(pop);
						JOptionPane.showMessageDialog(frame, "You can only input Numbers here","Wrong Input",JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		usertxt.setBounds(235, 159, 385, 35);
		usertxt.setFont(new Font("Segoe UI Semilight", Font.ITALIC, 18));
		
		usertxt.setBorder(emptyborder);
		usertxt.setBackground(new Color(255,255,255));
		usertxt.setForeground(new Color(51,51,51));
		usertxt.setText("User or Admin");
		Login.add(usertxt);
		usertxt.setColumns(10);
		
		pass = new JPasswordField();
		pass.addFocusListener(new FocusAdapter() {
			public void focusGained(FocusEvent e) {
				playsound(Text);
				String pwd=new String(pass.getPassword());
				if(pwd.equalsIgnoreCase("password"))
				{
				pass.setText("");
				}
				
			}
		});
		pass.setFont(new Font("Segoe UI Semilight", Font.ITALIC, 18));
		pass.setBorder(emptyborder);
		pass.setColumns(10);
		pass.setBounds(235, 220, 385, 35);
		pass.setText("Password");
		pass.setBackground(new Color(255,255,255));
		pass.setForeground(new Color(51,51,51));
		Login.add(pass);
		
		separator = new JSeparator();
		separator.setForeground(new Color(40,163,163));
		separator.setBackground(new Color(40,163,163));
		separator.setBounds(235, 194, 385, 35);
		Login.add(separator);
		
		separator_1 = new JSeparator();
		separator_1.setForeground(new Color(40,163,163));
		separator_1.setBackground(new Color(40,163,163));
		separator_1.setBounds(235, 258, 385, 35);
		Login.add(separator_1);
		
		lblNewLabel = new JLabel(new ImageIcon("src/System/images/User Male_96px.png"));
		lblNewLabel.setBounds(181, 151, 65, 53);
		Login.add(lblNewLabel);
		
		label = new JLabel(new ImageIcon("src/System/images/Lock_96px.png"));
		label.setBounds(181, 220, 65, 53);
		Login.add(label);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent arg0) {
				playsound(Text);
				btnNewButton.setBackground(new Color(40,163,163).darker());
			}
			public void mouseExited(MouseEvent arg0) {
				playsound(Text);
				btnNewButton.setBackground(new Color(40,163,163));
			}
		});
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {	
					playsound(Loginx);
					Loader.setVisible(true);
					Login.setVisible(false);
					Timer time=new Timer();
					lblLogingIn.setText("Checking...");
					if(rdbtnUser.isSelected())
					{
						LoadInfo(user,3);
					String pwd=new String(pass.getPassword());					
					users.trimToSize();
					
					for(int i=0;i<users.size();i++)
					{
						if(Integer.parseInt(usertxt.getText())==users.get(i).getHumanID())
						{
							if(pwd.equals(users.get(i).getPassword()))
							{
							flag=true;
							neededindex=i;
							break;
							}
						}
					}
					}
					else if(rdbtnAdmin.isSelected())
					{
						LoadInfo(manager,3);	
					String pwd=new String(pass.getPassword());
					managers.trimToSize();
					for(int i=0;i<managers.size();i++)
					{
						if(Integer.parseInt(usertxt.getText())==managers.get(i).getHumanID())
						{
							if(pwd.equals(managers.get(i).getPassword()))
							{
							flag=true;
							neededindex=i;
							break;
							}
						}
					}						
					}
					if(flag)
					{
					time.schedule(new TimerTask()
							{
						public void run()
						{
							lblLogingIn.setText("Logging in...");
							playsound(pop);
							time.schedule(new TimerTask()
									{
									public void run() 
									{
										if(rdbtnUser.isSelected())
										{
											userMenu1 UserMenu=new userMenu1(neededindex);
											playsound(Bam);
											UserMenu.getFrame().setVisible(true);
											frame.setVisible(false);
										}
										else if(rdbtnAdmin.isSelected())
										{
											adminMenu1 adminMenu=new adminMenu1(managers.get(neededindex).getFirstName(),managers.get(neededindex).getLastName());
											playsound(Bam);
											adminMenu.getFrame().setVisible(true);
											frame.setVisible(false);
										}
										
									}
									
								
								
									}
									, 1000*2);
						}	
							}
							, 1000*3);
					}
					else
					{
						time.schedule(new TimerTask()
								{
								
								public void run()
								{
									usertxt.setText("User or Admin");
									pass.setText("Password");
									Login.setVisible(true);
									Loader.setVisible(false);
									playsound(pop);
									JOptionPane.showMessageDialog(frame, "This ID or Password is Incorrect","Input Error",JOptionPane.INFORMATION_MESSAGE);
								}
								
								}
								, 1000*2);
					}
					/*time.schedule(new TimerTask() {

						public void run() {
							if(rdbtnUser.isSelected())
							{
								LoadInfo(user,3);
							String pwd=new String(pass.getPassword());
							boolean flag=false;
							
							users.trimToSize();
							
							for(int i=0;i<users.size();i++)
							{
								System.out.println("entered 7ta");
								if(Integer.parseInt(user.getText())==users.get(i).getHumanID())
								{
									if(pwd.equals(users.get(i).getPassword()))
									{
										System.out.println("found");
									flag=true;
									neededindex=i;
									break;
									}
								}
							}
							if(flag)
							{
							lblLogingIn.setText("Logging in...");
							playsound(pop);
							time.schedule(new TimerTask() {

								public void run() {
									userMenu1 UserMenu=new userMenu1();
									UserMenu.setWelcome("Welcome,"+users.get(neededindex).getFirstName()+" "+users.get(neededindex).getLastName());
									playsound(Bam);
									UserMenu.getFrame().setVisible(true);
									frame.setVisible(false);
								
									
								}
								
								
								
							},1000*3);
							}
							}
							else if(rdbtnAdmin.isSelected())
							{
								LoadInfo(manager,3);	
							String pwd=new String(pass.getPassword());
							boolean flag=false;
							managers.trimToSize();
							for(int i=0;i<managers.size();i++)
							{
								if(Integer.parseInt(user.getText())==managers.get(i).getHumanID())
								{
									if(pwd.equals(managers.get(i).getPassword()))
									{
									flag=true;
									neededindex=i;
									break;
									}
								}
							}							
							if(flag)
							{
							lblLogingIn.setText("Logging in...");
							playsound(pop);
							time.schedule(new TimerTask() {

								public void run() {
									adminMenu1 adminMenu=new adminMenu1();
									adminMenu.setWelcome("Welcome,"+managers.get(neededindex).getFirstName()+" "+managers.get(neededindex).getLastName());
									playsound(Bam);
									adminMenu.getFrame().setVisible(true);
									frame.setVisible(false);
								
									
								}
								
								
								
							},1000*3);
							}
							}
						
							else
							{
								
								user.setText("User or Admin");
								pass.setText("Password");
								Login.setVisible(true);
								JOptionPane.showMessageDialog(Login, "Wrong User or Password","Authentication Failure",JOptionPane.ERROR_MESSAGE);
								Loader.setVisible(false);
								
							}
						}
						
					},1000*3);*/
				
			}
		});
		btnNewButton.setForeground(new Color(255,255,255));
		btnNewButton.setBackground(new Color(40,163,163));
		btnNewButton.setFont(new Font("Segoe UI", Font.BOLD,17));
		btnNewButton.setBounds(491, 306, 128, 48);
		Login.add(btnNewButton);
		
		lblLoginSystem = new JLabel("Login System");
		lblLoginSystem.setFont(new Font("Segoe UI Semibold", Font.BOLD, 24));
		lblLoginSystem.setBounds(217, 84, 161, 35);
		lblLoginSystem.setBackground(new Color(255,255,255));
		lblLoginSystem.setForeground(new Color(51,51,51).brighter().brighter());
		Login.add(lblLoginSystem);
		
		lblChooseType = new JLabel("Choose Type :");
		lblChooseType.setForeground(new Color(72, 72, 72));
		lblChooseType.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 18));
		lblChooseType.setBackground(Color.WHITE);
		lblChooseType.setBounds(478, 40, 114, 35);
		Login.add(lblChooseType);
		
		rdbtnUser = new JRadioButton("User");
		rdbtnUser.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent arg0) {
				playsound(Text);
			}
			public void mouseExited(MouseEvent e) {
				playsound(Text);
			}
			public void mousePressed(MouseEvent e) {
				playsound(Loginx);
			}
		});
		rdbtnUser.setBounds(674, 48, 79, 25);
		rdbtnUser.setFocusable(false);
		rdbtnUser.setBackground(new Color(255,255,255));
		rdbtnUser.setForeground(new Color(51,51,51).brighter());
		Login.add(rdbtnUser);
		rdbtnAdmin = new JRadioButton("Admin");
		rdbtnAdmin.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent arg0) {
				playsound(Text);
			}
			public void mouseExited(MouseEvent e) {
				playsound(Text);
			}
			public void mousePressed(MouseEvent e) {
				playsound(Loginx);
			}
		});
		rdbtnAdmin.setForeground(new Color(72, 72, 72));
		rdbtnAdmin.setBackground(Color.WHITE);
		rdbtnAdmin.setBounds(600, 48, 65, 25);
		Login.add(rdbtnAdmin);
		ButtonGroup group = new ButtonGroup();
		group.add(rdbtnUser);
		group.add(rdbtnAdmin);
		rdbtnUser.setSelected(true);
		lblNewLabel_1 = new JLabel();
		lblNewLabel_1.setIcon(new ImageIcon("src/System/images/Bus_96px.png"));
		lblNewLabel_1.setBounds(53, 124, 122, 156);
		Login.add(lblNewLabel_1);
		
		btnReset = new JButton("Create");
		btnReset.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent arg0) {
				playsound(Text);
				btnReset.setBackground(new Color(40,163,163).darker());
			}
			public void mouseExited(MouseEvent arg0) {
				playsound(Text);
				btnReset.setBackground(new Color(40,163,163));
			}
		});
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				playsound(Loginx);
				Loader.setVisible(true);
				Login.setVisible(false);
				Timer time=new Timer();
				lblLogingIn.setText("Loading...");
				time.schedule(new TimerTask() {
							public void run() {
								SignUP signup=new SignUP();
								playsound(Bam);
								signup.frame.setVisible(true);
								frame.setVisible(false);								
							}
					},1000*1);
							
					}
				});
		btnReset.setForeground(Color.WHITE);
		btnReset.setFont(new Font("Segoe UI", Font.BOLD, 17));
		btnReset.setBackground(new Color(40, 163, 163));
		btnReset.setBounds(154, 306, 128, 48);
		Login.add(btnReset);
		
		
		
		close = new JButton();
		close.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent arg0) {
				close.setBackground(new Color(40, 163, 163));
				playsound(Text);
			}
			public void mouseExited(MouseEvent e) {
				close.setBackground(new Color(255,255,255));
				playsound(Text);
			}
			public void mousePressed(MouseEvent e) {
				close.setBackground(new Color(40, 163, 163));
			}
		});
		close.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				playsound(Loginx);
				
				System.exit(0);
				
			}
		});
		close.setIcon(new ImageIcon("src/System/images/Delete_20px.png"));
		close.setBorder(emptyborder);
		close.setBackground(new Color(255,255,255));
		close.setFocusable(false);
		close.setBounds(740, 0, 40, 35);
		Login.add(close);
		
		lblBusReservationSystem = new JLabel("Bus Reservation System");
		lblBusReservationSystem.setForeground(new Color(72, 72, 72));
		lblBusReservationSystem.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 18));
		lblBusReservationSystem.setBackground(Color.WHITE);
		lblBusReservationSystem.setBounds(12, 0, 246, 35);
		Login.add(lblBusReservationSystem);
		
		separator_2 = new JSeparator(SwingConstants.VERTICAL);
		separator_2.setForeground(new Color(40, 163, 163));
		separator_2.setBackground(new Color(40, 163, 163));
		separator_2.setBounds(175, 132, 170, 145);
		Login.add(separator_2);
		
		
		
		Loader = new JPanel();
		Loader.setBackground(new Color(255,255,255));
		panel.add(Loader, "name_17878520637278");
		Loader.setLayout(null);
		
		lblLogingIn = new JLabel();
		
		lblLogingIn.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 39));
		lblLogingIn.setForeground(new Color(40,163,163));
		lblLogingIn.setHorizontalAlignment(SwingConstants.CENTER);
		lblLogingIn.setBounds(200, 243, 394, 62);
		Loader.add(lblLogingIn);
		
		ImgLoaderLbl = new JLabel(new ImageIcon("src/System/images/done loader.gif"));
		ImgLoaderLbl.setPreferredSize(new Dimension(240, 240));
		ImgLoaderLbl.setMinimumSize(new Dimension(240, 240));
		ImgLoaderLbl.setMaximumSize(new Dimension(240, 240));
		ImgLoaderLbl.setBounds(0, -50, 780, 410);
		Loader.add(ImgLoaderLbl);
		ImgLoaderLbl.setFocusable(false);
		ImgLoaderLbl.setHorizontalAlignment(SwingConstants.CENTER);
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

}
	
