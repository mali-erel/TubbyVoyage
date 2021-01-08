package Main;

import javax.swing.JFrame;

public class Game {

	public static void main(String[] args) {

		JFrame window = new JFrame("Tubby Voyage");
		window.setContentPane(new GamePanel());
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setResizable(false);
		window.pack();
		window.setVisible(true);
		window.setSize(1600, 900);

	}

}
