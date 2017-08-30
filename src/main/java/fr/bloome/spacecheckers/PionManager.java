package fr.bloome.spacecheckers;

import java.awt.Color;
import java.util.Hashtable;

abstract public class PionManager {
	
	private static Hashtable<Integer, Pion> pionList = new Hashtable<Integer, Pion>();
	
	static public void initialize() {
		int row = 0;
		int col = 1;
		boolean odd = true;
		for(int i = 0;i<20;i++) {
			if(i % 5 == 0 && i != 0) {
				row ++;
				if(odd == true) {
					col = 0;
					odd = false;
				}else {
					col = 1;
					odd = true;
				}
			}
			pionList.put(i, new Pion(col, row, Color.red));
			col += 2;
		}
		row = 10;
		col = 0;
		odd = true;
		for(int i = 20;i<40;i++) {
			if(i % 5 == 0 && i != 0) {
				row --;
				if(odd == true) {
					col = 0;
					odd = false;
				}else {
					col = 1;
					odd = true;
				}
			}
			pionList.put(i, new Pion(col, row, Color.blue));
			col += 2;
		}
	}
	
	static public Hashtable<Integer, Pion> getPions(){
		return pionList;
	}
	
	static public void preMove(int index) {
		Pion pion = pionList.get(index);
		
	}
}
