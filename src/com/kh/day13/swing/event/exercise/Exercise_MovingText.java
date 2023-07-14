package com.kh.day13.swing.event.exercise;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Exercise_MovingText extends JFrame {

	private final int MOVING_UNIT = 10;
	// 상,하,좌,우 키로 텍스트 움직이기

	public Exercise_MovingText() {
		// TODO Auto-generated constructor stub
		JLabel la = new JLabel("HELLO");

		Container c = getContentPane();
		c.setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));
		setTitle("Moving Text");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		c.addKeyListener(new KeyAdapter() {

			public void keyPressed(KeyEvent e) {
//				la.setText(e.getKeyText(e.getKeyCode()));

				int keyCode = e.getKeyCode();

				
					switch(keyCode) {
					case 	KeyEvent.VK_UP : 	la.setLocation(la.getX(), la.getY()-MOVING_UNIT); break;
					case 	KeyEvent.VK_LEFT : 			la.setLocation(la.getX()-MOVING_UNIT, la.getY()); break;
					case 	KeyEvent.VK_RIGHT : 					la.setLocation(la.getX()+MOVING_UNIT, la.getY()); break;
					case 	KeyEvent.VK_DOWN : 					la.setLocation(la.getX(), la.getY()+MOVING_UNIT); break;
					
					}
				
//				if (keyCode == KeyEvent.VK_UP) {
//					la.setLocation(la.getX(), la.getY()-MOVING_UNIT);
//				}
//				if (keyCode == KeyEvent.VK_LEFT) {
//					la.setLocation(la.getX()-MOVING_UNIT, la.getY());
//				}
//				if (keyCode == KeyEvent.VK_RIGHT) {
//					la.setLocation(la.getX()+MOVING_UNIT, la.getY());
//				}
//				if (keyCode == KeyEvent.VK_DOWN) {
//					la.setLocation(la.getX(), la.getY()+MOVING_UNIT);
//				}

			}

		});
		la.setSize(50, 30);
		la.setLocation(50, 50);
		c.add(la);
		setSize(300, 300);
		setVisible(true);

		c.setFocusable(true);
		c.requestFocus();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Exercise_MovingText();
	}

}
