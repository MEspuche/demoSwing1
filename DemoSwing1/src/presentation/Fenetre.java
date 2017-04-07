package presentation;

import javax.swing.JFrame;

public class Fenetre extends JFrame {
	
	public Fenetre(String nom) {
		// TODO Auto-generated constructor stub
		super(nom);
		setSize(800,600);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Fenetre f = new Fenetre("MA FENETRE");
		f.setVisible(true);
		
		
		
	}

}
