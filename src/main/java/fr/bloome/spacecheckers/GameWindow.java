package fr.bloome.spacecheckers;

import javax.swing.JFrame;

public class GameWindow extends JFrame{
	private GamePanel gamePanel = new GamePanel();
	
	public GameWindow() {
		this.setName("Space Checkers");
		this.setSize(510, 700);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setContentPane(gamePanel);
		this.setVisible(true);
	}
}
