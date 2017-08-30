package fr.bloome.spacecheckers;

import java.awt.Color;

public class Pion {
	private int posX;
	private int posY;
	private Color color;
	private boolean isQueen;
	
	public Pion(int posX, int posY, Color color) {
		this.posX = posX;
		this.posY = posY;
		this.color = color;
		
	}
	
	public int getPosX() {
		return posX;
	}
	public int getPosY() {
		return posY;
	}
	public Color getColor() {
		return color;
	}

}
