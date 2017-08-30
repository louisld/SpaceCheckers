package fr.bloome.spacecheckers;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Hashtable;

import javax.swing.JPanel;

public class GamePanel extends JPanel{
	
	public GamePanel() {
		this.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				Hashtable<Integer, Pion> pionList = PionManager.getPions();
				for(int i = 0;i<pionList.size();i++) {
					int x = pionList.get(i).getPosX()*48 +10;
					int y = pionList.get(i).getPosY()*48 +110;
					if(e.getX() > x && e.getX() < x + 48 && e.getY() > y && e.getY() < y + 48) {
						PionManager.preMove(i);
					}
				}
			}
		});
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
		//Dessin des pions
		Hashtable<Integer, Pion> pionList = PionManager.getPions();
		
		for(int i = 0;i<pionList.size();i++) {
			g.setColor(pionList.get(i).getColor());
			g.fillOval(pionList.get(i).getPosX()*48 + 10, pionList.get(i).getPosY() *48 +110, 48, 48);
		}
	}
}
