package fr.bloome.spacecheckers;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class GamePanel extends JPanel{
	
	public GamePanel() {
	}
	
	public void paintComponent(Graphics g) {
		
		//dessin du damier
		g.setColor(Color.DARK_GRAY);
		g.fillRect(0, 100, 500, 500);
		g.setColor(Color.WHITE);
		g.fillRect(10, 110, 480, 480);
		//dessin des carrés noirs
		g.setColor(Color.black);
		int squarePosX = 58;
		int squarePosY = 110;
		boolean oddLine = true;
		for(int i=0;i<=50;i++) {
			g.fillRect(squarePosX, squarePosY, 48, 48);
			squarePosX += 96;
			if(i % 5 == 0 && i != 0) {
				if(oddLine == true) {
					squarePosX = 10;
					oddLine = false;
				}else {
					squarePosX = 58;
					oddLine = true;
				}
				squarePosY += 48;
			}
		}
	}
}
