package System;
/**
 * @author ${hisham_maged10}
 *https://github.com/hisham-maged10
 * ${DesktopApps}
 */
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.io.File;
import java.util.Timer;
import java.util.TimerTask;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.Border;
import java.awt.CardLayout;

public class DriverSignUp extends FileHandling{

	protected JFrame frame;
	private JTextField textField;
	private Border emptyBorder=BorderFactory.createEmptyBorder();
	private JTextField textField_1;
	private JPasswordField textField_2;
	private JTextField txtExample_1;
	private JTextField txtExample;
	private JPanel loading;
	private final int ClassNo=3;
	private int ErrorCount=0;
	private File Text=new File("src/System/sounds/Text.WAV");
	private File Press=new File("src/System/sounds/Login.WAV");
	private File Bam=new File("src/System/sounds/bam.WAV");
	private File pop=new File("src/System/sounds/tada.WAV");
	private JCheckBox agreement;
	private int xMouse;
	private int yMouse;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DriverSignUp window = new DriverSignUp();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}*/

	/**
	 * Create the application.
	 */
	public DriverSignUp() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		ErrorCount=0;
		frame = new JFrame();
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
		frame.setBounds(300, 75, 935, 639);
		frame.setUndecorated(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new CardLayout(0, 0));
		
		JPanel BG = new JPanel();
		frame.getContentPane().add(BG, "name_16757309587843");
		BG.setLayout(null);
		
		JPanel Info = new JPanel();
		Info.setBounds(392, 0, 544, 642);
		Info.setBackground(new Color(98, 12, 147).darker().darker());
		BG.add(Info);
		Info.setLayout(null);
		
		JLabel lblLetsGetYou = new JLabel("Let's get Started!");
		lblLetsGetYou.setHorizontalAlignment(SwingConstants.CENTER);
		lblLetsGetYou.setForeground(Color.WHITE);
		lblLetsGetYou.setFont(new Font("Century Gothic", Font.BOLD, 39));
		lblLetsGetYou.setBounds(-17, 0, 371, 60);
		Info.add(lblLetsGetYou);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(14, 60, 340, 10);
		Info.add(separator);
		
		JLabel lblNewLabel = new JLabel("Driver's First Name");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setFont(new Font("Century Gothic", Font.PLAIN, 25));
		lblNewLabel.setBounds(67, 85, 253, 36);
		Info.add(lblNewLabel);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setForeground(Color.WHITE);
		separator_1.setBounds(67, 154, 340, 20);
		Info.add(separator_1);
		
		textField = new JTextField();
		textField.addFocusListener(new FocusAdapter() {
			public void focusGained(FocusEvent arg0) {
				if(textField.getText().equals("Example:Hisham"))
				textField.setText("");
			}
		});
		textField.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent arg0) {
				playsound(Text);
			}
			});
		textField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		
		textField.setText("Example:Hisham");
		textField.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent e) {
				char ch=e.getKeyChar();
				if(!(Character.isAlphabetic(ch) || e.getKeyChar()==KeyEvent.VK_BACK_SPACE))
				{
					e.consume();
					playsound(pop);
					if(ErrorCount==1)
						JOptionPane.showMessageDialog(frame, "Already Told ya, you Can Only Enter Alphabits in Names","Wrong Input",JOptionPane.ERROR_MESSAGE);
						else
							JOptionPane.showMessageDialog(frame, "You Can Only Enter Alphabits in Names","Wrong Input",JOptionPane.ERROR_MESSAGE);
					ErrorCount=1;
				}
			}
		});
		textField.setFont(new Font("Century Gothic", Font.ITALIC, 15));
		textField.setBorder(emptyBorder);
		textField.setCaretColor(Color.WHITE);
		textField.setForeground(SystemColor.control);
		textField.setBackground(new Color(98, 12, 147).darker().darker());
		textField.setBounds(67, 129, 340, 22);
		Info.add(textField);
		textField.setColumns(10);
		
		JLabel lblLastname = new JLabel("Driver's Last Name");
		lblLastname.setForeground(Color.WHITE);
		lblLastname.setFont(new Font("Century Gothic", Font.PLAIN, 25));
		lblLastname.setBackground(Color.WHITE);
		lblLastname.setBounds(67, 175, 253, 36);
		Info.add(lblLastname);
		
		textField_1 = new JTextField();
		textField_1.setText("Example:Maged");
		textField_1.setCaretColor(Color.WHITE);
		textField_1.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent e) {
				char ch=e.getKeyChar();
				if(!(Character.isAlphabetic(ch) || e.getKeyChar()==KeyEvent.VK_BACK_SPACE))
				{
					e.consume();
					playsound(pop);
					ErrorCount=1;
					if(ErrorCount==1)
					JOptionPane.showMessageDialog(frame, "Already Told ya, you Can Only Enter Alphabits in Names","Wrong Input",JOptionPane.ERROR_MESSAGE);
					else
						JOptionPane.showMessageDialog(frame, "You Can Only Enter Alphabits in Names","Wrong Input",JOptionPane.ERROR_MESSAGE);
						
				}
			}
		});
		textField_1.addFocusListener(new FocusAdapter() {
			public void focusGained(FocusEvent arg0) {
				if(textField_1.getText().equals("Example:Maged"))
				textField_1.setText("");
			}
		});
		textField_1.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent arg0) {
				playsound(Text);
			}
			});
		textField_1.setForeground(SystemColor.menu);
		textField_1.setFont(new Font("Century Gothic", Font.ITALIC, 15));
		textField_1.setColumns(10);
		textField_1.setBorder(emptyBorder);
		textField_1.setBackground(new Color(98, 12, 147).darker().darker());
		textField_1.setBounds(67, 219, 340, 22);
		Info.add(textField_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setForeground(Color.WHITE);
		separator_2.setBounds(67, 244, 340, 20);
		Info.add(separator_2);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setForeground(Color.WHITE);
		lblPassword.setFont(new Font("Century Gothic", Font.PLAIN, 25));
		lblPassword.setBackground(Color.WHITE);
		lblPassword.setBounds(67, 266, 132, 36);
		Info.add(lblPassword);
		
		textField_2 = new JPasswordField();
		textField_2.setText("asdasd");
		textField_2.setCaretColor(Color.WHITE);
		textField_2.addFocusListener(new FocusAdapter() {
			public void focusGained(FocusEvent arg0) {
				textField_2.setText("");
			}
		});
		textField_2.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent arg0) {
				playsound(Text);
			}
			});
		textField_2.setForeground(SystemColor.menu);
		textField_2.setFont(new Font("Century Gothic", Font.ITALIC, 15));
		textField_2.setColumns(10);
		textField_2.setBorder(emptyBorder);
		textField_2.setBackground(new Color(98, 12, 147).darker().darker());
		textField_2.setBounds(67, 310, 340, 22);
		Info.add(textField_2);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setForeground(Color.WHITE);
		separator_3.setBounds(67, 335, 340, 20);
		Info.add(separator_3);
		
		JLabel lblPhonenumber = new JLabel("Phonenumber");
		lblPhonenumber.setForeground(Color.WHITE);
		lblPhonenumber.setFont(new Font("Century Gothic", Font.PLAIN, 25));
		lblPhonenumber.setBackground(Color.WHITE);
		lblPhonenumber.setBounds(67, 357, 211, 36);
		Info.add(lblPhonenumber);
		
		txtExample_1 = new JTextField();
		txtExample_1.setText("Example:01228961190");
		txtExample_1.setCaretColor(Color.WHITE);
		txtExample_1.addFocusListener(new FocusAdapter() {
			public void focusGained(FocusEvent arg0) {
				if(txtExample_1.getText().equals("Example:01228961190"))
				txtExample_1.setText("");
			}
		});
		txtExample_1.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent arg0) {
				playsound(Text);
			}
			});
		txtExample_1.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent e) {
				char ch=e.getKeyChar();
				if(!(Character.isDigit(ch) || e.getKeyChar()==KeyEvent.VK_BACK_SPACE))
				{
					e.consume();
					playsound(pop);
						JOptionPane.showMessageDialog(frame, "Phonenumbers are made of \"Numbers\"","Wrong Input",JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		txtExample_1.setForeground(SystemColor.menu);
		txtExample_1.setFont(new Font("Century Gothic", Font.ITALIC, 15));
		txtExample_1.setColumns(10);
		txtExample_1.setBorder(emptyBorder);
		txtExample_1.setBackground(new Color(98, 12, 147).darker().darker());
		txtExample_1.setBounds(67, 401, 340, 22);
		Info.add(txtExample_1);
		
		JSeparator separator_4 = new JSeparator();
		separator_4.setForeground(Color.WHITE);
		separator_4.setBounds(67, 426, 340, 20);
		Info.add(separator_4);
		
		JLabel lblAge = new JLabel("Age");
		lblAge.setForeground(Color.WHITE);
		lblAge.setFont(new Font("Century Gothic", Font.PLAIN, 25));
		lblAge.setBackground(Color.WHITE);
		lblAge.setBounds(67, 446, 211, 36);
		Info.add(lblAge);
		
		txtExample = new JTextField();
		txtExample.setText("Example:19");
		txtExample.setCaretColor(Color.WHITE);
		txtExample.addFocusListener(new FocusAdapter() {
			public void focusGained(FocusEvent arg0) {
				if(txtExample.getText().equals("Example:19"))
				txtExample.setText("");
			}
		});
		txtExample.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent arg0) {
				playsound(Text);
			}
			});
		txtExample.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent e) {
				char ch=e.getKeyChar();
				if(!(Character.isDigit(ch) || e.getKeyChar()==KeyEvent.VK_BACK_SPACE))
				{
					e.consume();
					playsound(pop);
						JOptionPane.showMessageDialog(frame, "They say Age is just a \"Number\"","Wrong Input",JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		txtExample.setForeground(SystemColor.menu);
		txtExample.setFont(new Font("Century Gothic", Font.ITALIC, 15));
		txtExample.setColumns(10);
		txtExample.setBorder(emptyBorder);
		txtExample.setBackground(new Color(98, 12, 147).darker().darker());
		txtExample.setBounds(67, 490, 340, 22);
		Info.add(txtExample);
		
		JSeparator separator_5 = new JSeparator();
		separator_5.setForeground(Color.WHITE);
		separator_5.setBounds(67, 515, 340, 20);
		Info.add(separator_5);
		
		JButton btnSignUp = new JButton("Get Started");
		btnSignUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String[] Info= new String[5];
				char[] pwdc=textField_2.getPassword();
				String check=new String(pwdc);
				if(!((textField.getText().equals("") ||textField.getText().equals("Example:Hisham") )|| (textField_1.getText().equals("") || textField_1.getText().equals("Example:Maged"))
						||(txtExample_1.getText().equals("")|| txtExample_1.getText().equals("Example:01228961190"))
						||(txtExample.getText().equals("") || txtExample.getText().equals("Example:19")) ||(textField_2.getPassword().length==0|| check.equals("asdasd")))
						&& agreement.isSelected()
						)
				{
				Info[0]=textField.getText();
				Info[1]=textField_1.getText();
				Info[2]=txtExample_1.getText();
				Info[3]=txtExample.getText();
				char[] pwd=textField_2.getPassword();
				Info[4]=new String(pwd);
				try
				{
					playsound(pop);
					int button=JOptionPane.YES_NO_OPTION;
					int result=JOptionPane.showConfirmDialog(frame, "By clicking Yes, your account will be created","Warning",button);
					playsound(pop);
					if(result==JOptionPane.YES_OPTION)
					{
					WriteInfo(employee,Info,ClassNo);
					playsound(Bam);
					JOptionPane.showMessageDialog(frame, "Saved Successfully!");
					}
					
				}catch(Exception e)
				{
					playsound(pop);
					JOptionPane.showMessageDialog(null, "Missing Inputs","Input Failure",JOptionPane.ERROR_MESSAGE);
				}
			}
				else
				{
					playsound(pop);
					JOptionPane.showMessageDialog(frame, "Please input all the fields and check the agreement box");
				}
			}
		});
		btnSignUp.setForeground(Color.WHITE);
		btnSignUp.setBorder(emptyBorder);
		btnSignUp.setFocusable(false);
		btnSignUp.setFont(new Font("Century Gothic", Font.BOLD, 18));
		btnSignUp.setBackground(new Color(98, 12, 147).darker());
		btnSignUp.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				playsound(Text);
				btnSignUp.setBackground(new Color(98, 12, 147));
			}
			public void mouseExited(MouseEvent e) {
				playsound(Text);
				btnSignUp.setBackground(new Color(98, 12, 147).darker());
			}
			public void mouseClicked(MouseEvent arg0) {
				playsound(Press);
			}
		});
		btnSignUp.setBounds(67, 570, 167, 49);
		Info.add(btnSignUp);
		
		agreement = new JCheckBox(" I have read all the agreements and Accept them");
		agreement.setVerticalAlignment(SwingConstants.TOP);
		agreement.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		agreement.setForeground(SystemColor.control);
		agreement.setBackground(new Color(98, 12, 147).darker().darker());
		agreement.setBounds(67, 530, 402, 25);
		agreement.setFocusable(false);
		agreement.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				playsound(Text);
			}
			public void mouseExited(MouseEvent e) {
				playsound(Text);
			}
			public void mouseClicked(MouseEvent arg0) {
				playsound(Press);
			}
		});
		Info.add(agreement);
		
		JLabel lblAlreadyAMember = new JLabel("Already a Driver? Login now!");
		lblAlreadyAMember.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				playsound(Text);
				lblAlreadyAMember.setForeground(SystemColor.control.darker());
			}
			public void mouseExited(MouseEvent e) {
				playsound(Text);
				lblAlreadyAMember.setForeground(SystemColor.control);
			}
			public void mouseClicked(MouseEvent e) {
				playsound(Press);
				LoginMenu login=new LoginMenu();
				login.getFrame().setVisible(true);
				frame.setVisible(false);
			}
		});
		lblAlreadyAMember.setForeground(SystemColor.control);
		lblAlreadyAMember.setBounds(269, 580, 211, 35);
		Info.add(lblAlreadyAMember);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		btnNewButton.setIcon(new ImageIcon("src/System/images/Delete_20px.png"));
		btnNewButton.setBackground(new Color(98, 12, 147).darker().darker());
		btnNewButton.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				playsound(Text);
				btnNewButton.setBackground(new Color(98, 12, 147).darker());
			}
			public void mouseExited(MouseEvent e) {
				playsound(Text);
				btnNewButton.setBackground(new Color(98, 12, 147).darker().darker());
			}
			public void mouseClicked(MouseEvent arg0) {
				playsound(Press);
			}
		});
		btnNewButton.setBorder(emptyBorder);
		btnNewButton.setBounds(487, 0, 57, 25);
		Info.add(btnNewButton);
		
		
		JSeparator separator_7 = new JSeparator();
		separator_7.setForeground(Color.WHITE);
		separator_7.setBounds(267, 609, 185, 20);
		Info.add(separator_7);
		
		JPanel Design= new JPanel();
		Design.setBounds(0, 0, 395, 642);
		Design.setBackground(new Color(98, 12, 147).darker());
		BG.add(Design);
		Design.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel();
		lblNewLabel_1.setBounds(38, 0, 345, 307);
		Design.add(lblNewLabel_1);
		lblNewLabel_1.setIcon(new ImageIcon("src/System/images/18-512.png"));
		
		JLabel lblBusReservationSystem = new JLabel("Bus Reservation System");
		lblBusReservationSystem.setHorizontalAlignment(SwingConstants.CENTER);
		lblBusReservationSystem.setFont(new Font("Segoe UI", Font.BOLD, 28));
		lblBusReservationSystem.setForeground(Color.WHITE);
		lblBusReservationSystem.setBounds(27, 294, 336, 57);
		Design.add(lblBusReservationSystem);
		
		JLabel lblNewLabel_2 = new JLabel("An application to automate bus reservation system.");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Century Gothic", Font.BOLD, 15));
		lblNewLabel_2.setBounds(12, 294, 400, 112);
		Design.add(lblNewLabel_2);
		
		JLabel lblItAlsoIncludes = new JLabel("It also includes maintenance of information");
		lblItAlsoIncludes.setForeground(Color.WHITE);
		lblItAlsoIncludes.setFont(new Font("Century Gothic", Font.BOLD, 15));
		lblItAlsoIncludes.setBounds(12, 315, 400, 112);
		Design.add(lblItAlsoIncludes);
		
		JLabel lblLikeScheduleAnd = new JLabel("like schedule and details of each bus");
		lblLikeScheduleAnd.setForeground(Color.WHITE);
		lblLikeScheduleAnd.setFont(new Font("Century Gothic", Font.BOLD, 15));
		lblLikeScheduleAnd.setBounds(12, 334, 400, 112);
		Design.add(lblLikeScheduleAnd);
		
		JLabel lblTheSystemIs = new JLabel(" The system is very simple in design and to use");
		lblTheSystemIs.setForeground(Color.WHITE);
		lblTheSystemIs.setFont(new Font("Century Gothic", Font.BOLD, 15));
		lblTheSystemIs.setBounds(12, 354, 400, 112);
		Design.add(lblTheSystemIs);
		
		JSeparator separator_6 = new JSeparator();
		separator_6.setBounds(12, 440, 371, 23);
		Design.add(separator_6);
		
		JLabel lblNewLabel_3 = new JLabel("Join Now!");
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setFont(new Font("Segoe UI", Font.BOLD, 23));
		lblNewLabel_3.setIcon(new ImageIcon("src/System/images/200 sign up.png"));
		lblNewLabel_3.setBounds(0, 440, 395, 165);
		Design.add(lblNewLabel_3);
		
		JLabel lblWrongClickClick = new JLabel("Wrong Click? Get back From here! ");
		lblWrongClickClick.setForeground(SystemColor.menu);
		lblWrongClickClick.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				playsound(Text);
				lblWrongClickClick.setForeground(Color.black);
			}
			public void mouseExited(MouseEvent e) {
				playsound(Text);
				lblWrongClickClick.setForeground(SystemColor.control);
			}
			public void mouseClicked(MouseEvent e) {
				playsound(Press);
				Timer time=new Timer();
				loading.setVisible(true);
				BG.setVisible(false);
				time.schedule(new TimerTask() {
							public void run() {
								playsound(Bam);
								SignUP sign=new SignUP();
								sign.frame.setVisible(true);
								frame.setVisible(false);								
							}
					},1000*1);
			}
		});
		lblWrongClickClick.setBounds(172, 607, 211, 35);
		Design.add(lblWrongClickClick);
	
	loading = new JPanel();
	frame.getContentPane().add(loading, "name_16757328475088");
	loading.setLayout(null);
	
	JLabel lblNewLabel_4 = new JLabel();
	lblNewLabel_4.setIcon(new ImageIcon("src/System/images/31 (1).gif"));
	lblNewLabel_4.setBounds(460, 207, 365, 211);
	loading.add(lblNewLabel_4);
	JButton button = new JButton("");
	button.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			LoginMenu login=new LoginMenu();
			login.getFrame().setVisible(true);
			frame.setVisible(false);
		}
	});
	button.addMouseListener(new MouseAdapter() {
		public void mouseEntered(MouseEvent e) {
			playsound(Text);
			button.setBackground(new Color(98, 12, 147).darker().darker());
		}
		public void mouseExited(MouseEvent e) {
			playsound(Text);
			button.setBackground(new Color(98, 12, 147).darker());
		}
		public void mouseClicked(MouseEvent arg0) {
			playsound(Press);
		}
	});
	button.setIcon(new ImageIcon("src/System/images/Back_20px.png"));
	button.setBorder(emptyBorder);
	button.setBackground(new Color(98, 12, 147).darker());
	button.setBounds(0, 0, 57, 25);
	Design.add(button);
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

