package sk.desertgame.graphics;

import javax.swing.JFrame;

public class DesertWindow extends JFrame{
	public DesertWindow() {
		initWindow();
	}
	
	private void initWindow() {
		setTitle("Desert Window");
		setSize(500, 500);
		setVisible(true);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		add(new DesertGraphicsPanel());
		
	}
}
