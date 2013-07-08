package hfj;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;


@SuppressWarnings("serial")
public class ChessBoard extends JFrame {
	public ChessBoard() {
		this.setTitle("Chess board...");
		this.setSize(500, 500);
		this.setLayout(new GridLayout(8, 8));

		for(int i=1; i<=8; i++) {
			for(int j=1; j<=8; j++) {
		JPanel pan = new JPanel();

		if((i+j)%2==0)
			pan.setBackground(Color.BLACK);
		else
			pan.setBackground(Color.WHITE);
		
		getContentPane().add(pan);
			}
		}
	}
}