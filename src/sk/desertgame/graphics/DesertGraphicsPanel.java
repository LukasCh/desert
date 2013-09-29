package sk.desertgame.graphics;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;


public class DesertGraphicsPanel extends JPanel {
	int actorX = 100;
	int actorY = 100;
	
	public DesertGraphicsPanel() {
		System.out.println("tes");
		init();
	}
	
	private void init() {
		
		addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent arg0) {
			}
			
			@Override
			public void keyReleased(KeyEvent arg0) {
			}
			
			@Override
			public void keyPressed(KeyEvent arg0) {
				if (arg0.getKeyCode() == KeyEvent.VK_W) {
					actorY-=5;
					repaint();
				} else if (arg0.getKeyCode() == KeyEvent.VK_S) {
					actorY+=5;
					repaint();
				} else if (arg0.getKeyCode() == KeyEvent.VK_A) {
					actorX-=5;
					repaint();
				} else if (arg0.getKeyCode() == KeyEvent.VK_D) {
					actorX+=5;
					repaint();
				}
			}
		});
		setFocusable(true);
		requestFocus();
		System.out.println(this.hasFocus());
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		draw(g);
	}
	
	private void draw(Graphics g){
		g.setColor(Color.red);		
		g.fillOval(actorX, actorY, 10, 10);
		g.setColor(Color.blue);		
		g.fillOval(actorX+50, actorY+50, 10, 10);
		g.setColor(Color.green);		
		g.fillOval(actorX+100, actorY+100, 10, 10);
	}
}
