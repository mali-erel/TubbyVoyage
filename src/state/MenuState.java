package state;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLayeredPane;

import java.awt.CardLayout;
import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Image;

import javax.swing.SwingConstants;

import Main.GamePanel;
import Main.ImageLoader;

import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MenuState {

	private JFrame frame;
	private JPanel credit;
	private JPanel settings;
	private JPanel play;
	private JPanel menu;
	private JLayeredPane layeredPane_1;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JButton btnNewButton_4;
	private JButton btnNewButton_5;
	private JLabel lblNewLabel_6;
	private JButton btnNewButton_6;
	private JButton btnNewButton_7;
	private JButton btnNewButton_8;
	private JLabel wasd;
	private JLabel arrow;
	private JLabel gif_1;
	private JButton button;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuState window = new MenuState();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public void sP(JPanel panel) {
		layeredPane_1.removeAll();
		layeredPane_1.add(panel);
		layeredPane_1.repaint();
		layeredPane_1.revalidate();
	}
	
	/**
	 * Create the application.
	 */
	public MenuState() {
		initialize();
	}

	
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 800, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		layeredPane_1 = new JLayeredPane();
		layeredPane_1.setBounds(10, 11, 766, 541);
		frame.getContentPane().add(layeredPane_1);
		layeredPane_1.setLayout(new CardLayout(0, 0));
		
		menu = new JPanel();
		layeredPane_1.add(menu, "name_618912982208900");
		menu.setLayout(null);
		
		frame.setResizable(false);
		
		JButton btnNewButton = new JButton("Play");
		btnNewButton.setFont(new Font("Imprint MT Shadow", Font.PLAIN, 30));
		btnNewButton.setBackground(new Color(255, 215, 0));//import java.awt.Color;
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setFocusPainted(false);
		btnNewButton.setBorderPainted(false);
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame window = new JFrame("Tubby Voyage");
				window.setContentPane(new GamePanel());
				window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				window.setResizable(false);
				window.pack();
				window.setVisible(true);
				window.setSize(1600, 900);
			}
		});
		btnNewButton.setFont(new Font("Imprint MT Shadow", Font.PLAIN, 30));
		btnNewButton.setBounds(190, 90, 398, 58);
		menu.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Settings");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sP(settings);
			}
		});
		btnNewButton_1.setBackground(new Color(50, 205, 50));
		btnNewButton_1.setFont(new Font("Imprint MT Shadow", Font.PLAIN, 30));
		btnNewButton_1.setBounds(190, 160, 398, 58);
		btnNewButton_1.setFocusPainted(false);
		btnNewButton_1.setBorderPainted(false);
		menu.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Credit");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sP(credit);
			}
		});
		btnNewButton_2.setBackground(new Color(255, 0, 255));
		btnNewButton_2.setFont(new Font("Imprint MT Shadow", Font.PLAIN, 30));
		btnNewButton_2.setBounds(190, 230, 398, 58);
		btnNewButton_2.setFocusPainted(false);
		btnNewButton_2.setBorderPainted(false);
		menu.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Exit");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton_3.setBackground(new Color(255, 0, 0));
		btnNewButton_3.setFont(new Font("Imprint MT Shadow", Font.PLAIN, 30));
		btnNewButton_3.setBounds(190, 300, 398, 58);
		btnNewButton_3.setFocusPainted(false);
		btnNewButton_3.setBorderPainted(false);
		menu.add(btnNewButton_3);
		
		JLabel lblNewLabel = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("/img/menubg.png")).getImage();
		 ImageLoader.loadImage("/Tubbies/greenTubbyR.png");
		lblNewLabel.setIcon(new ImageIcon(img));
		lblNewLabel.setBounds(0, 0, 800, 600);
		menu.add(lblNewLabel);
		
		
		
		play = new JPanel();
		layeredPane_1.add(play, "name_618915288650600");
		play.setLayout(null);
		
		settings = new JPanel();
		layeredPane_1.add(settings, "name_618917614656100");
		settings.setLayout(null);
		
		btnNewButton_5 = new JButton("Return to Menu");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sP(menu);
			}
		});
		btnNewButton_5.setFont(new Font("Tahoma", Font.PLAIN, 50));
		btnNewButton_5.setBounds(0, 461, 756, 69);
		settings.add(btnNewButton_5);
		
		lblNewLabel_6 = new JLabel("Please choose how you want to play");
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 36));
		lblNewLabel_6.setBounds(77, 11, 615, 69);
		settings.add(lblNewLabel_6);
		
		btnNewButton_6 = new JButton("Mouse");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_6.setFont(new Font("Tahoma", Font.PLAIN, 35));
		btnNewButton_6.setBounds(341, 91, 281, 69);
		settings.add(btnNewButton_6);
		
		btnNewButton_7 = new JButton("W-A-S-D");
		btnNewButton_7.setFont(new Font("Tahoma", Font.PLAIN, 34));
		btnNewButton_7.setBounds(341, 205, 281, 69);
		settings.add(btnNewButton_7);
		
		btnNewButton_8 = new JButton("Arrows");
		btnNewButton_8.setFont(new Font("Tahoma", Font.PLAIN, 35));
		btnNewButton_8.setBounds(341, 331, 281, 69);
		settings.add(btnNewButton_8);
		
		wasd = new JLabel("");
		Image WASD = new ImageIcon(this.getClass().getResource("/img/wasd.gif")).getImage();
		wasd.setIcon(new ImageIcon(WASD));
		wasd.setBounds(97, 192, 205, 115);
		settings.add(wasd);
		
		arrow = new JLabel("");
		Image ARROW = new ImageIcon(this.getClass().getResource("/img/arrows.gif")).getImage();
		arrow.setIcon(new ImageIcon(ARROW));
		arrow.setBounds(97, 318, 205, 115);
		settings.add(arrow);
		
		gif_1 = new JLabel("");
		Image gifMouse = new ImageIcon(this.getClass().getResource("/img/1.gif")).getImage();
		gif_1.setIcon(new ImageIcon(gifMouse));
		gif_1.setBounds(97, 66, 205, 115);
		settings.add(gif_1);
		
		button = new JButton("New button");
		button.setBounds(0, 427, 181, -27);
		settings.add(button);
		
		credit = new JPanel();
		layeredPane_1.add(credit, "name_618942709405300");
		credit.setLayout(null);
		
		lblNewLabel_1 = new JLabel("Creators");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Informal Roman", Font.PLAIN, 68));
		lblNewLabel_1.setBounds(10, 11, 746, 77);
		credit.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("Mehmet Ali EREL");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 51));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(161, 99, 445, 77);
		credit.add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("Tu\u011Fberk Y\u0131lmaz");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 51));
		lblNewLabel_3.setBounds(161, 187, 445, 77);
		credit.add(lblNewLabel_3);
		
		lblNewLabel_4 = new JLabel("Mehmet Ali EREL");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 51));
		lblNewLabel_4.setBounds(161, 275, 445, 77);
		credit.add(lblNewLabel_4);
		
		lblNewLabel_5 = new JLabel("Mehmet Ali EREL");
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 51));
		lblNewLabel_5.setBounds(161, 363, 445, 77);
		credit.add(lblNewLabel_5);
		
		btnNewButton_4 = new JButton("Return to Menu");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sP(menu);
			}
		});
		btnNewButton_4.setFont(new Font("Tahoma", Font.PLAIN, 50));
		btnNewButton_4.setBounds(0, 478, 766, 63);
		credit.add(btnNewButton_4);
	}
}
