package Main;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

public class GFrame extends JFrame{

	GFrame()
	{
		this.add(new GamePanel());
		this.setTitle("Tele Voyage");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.pack();
		this.setVisible(true);
		this.setLocationRelativeTo(null);
		this.setSize(1600,900);
		
	}
	
}

