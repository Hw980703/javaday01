package com.kh.day14.swing.event;

import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Exam_DbllickChangeColor extends JFrame {

	public Exam_DbllickChangeColor() {
		// TODO Auto-generated constructor stub
		setTitle("Double Click");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 200);
		Container c = getContentPane();
		c.setBackground(Color.white);
		JLabel la = new JLabel("ㅎㅇ");
		c.addMouseListener(new MyMouseListener());
		c.add(la);
		la.setSize(50, 40);

		setVisible(true);

	}
	
	
	private class MyMouseListener extends MouseAdapter{
		@Override
		public void mouseClicked(MouseEvent e) {
			// 더블 클릭 구현, 클릭 카운트수가 2면 더블클릭이지
			if ( e.getClickCount() == 2) {
				
				// (int)Math.random()*(최대값 - 최솟값 + 1) + 최소값
				// 0 ~ 255 범위의 랜덤한 수를 출력하는 방법
				Random rand = new Random();
				int num = (int)(Math.random()*256);
				int num2 = rand.nextInt(255)+1;
				int num3 = rand.nextInt(255)+1;
				Component c = (Component)e.getSource();
				c.setBackground(new Color(num,num2,num3));
			}
			if ( e.getClickCount() == 1) {
//				Random rand = new Random();
//				int num = rand.nextInt(255)+1;
//				int num2 = rand.nextInt(255)+1;
//				int num3 = rand.nextInt(255)+1;
				Component c = (Component)e.getSource();
				c.setBackground(new Color(255,255,255));
			}
			
			
			// TODO Auto-generated method stub
		}
		
		
	}
	
	
	
//	public class MouseClick implements MouseListener{
//
//		@Override
//		public void mouseClicked(MouseEvent e) {
//			// TODO Auto-generated method stub
//			Component c = (Component)e.getSource();
//			c.setBackground(Color.cyan);
//		}
//
//		@Override
//		public void mousePressed(MouseEvent e) {
//			// TODO Auto-generated method stub
//			Component c = (Component)e.getSource();
//			c.setBackground(Color.blue);
//		}
//
//		@Override
//		public void mouseReleased(MouseEvent e) {
//			// TODO Auto-generated method stub
//			Component c = (Component)e.getSource();
//			c.setBackground(Color.white);
//		}
//
//		@Override
//		public void mouseEntered(MouseEvent e) {
//			// TODO Auto-generated method stub
//			
//		}
//
//		@Override
//		public void mouseExited(MouseEvent e) {
//			// TODO Auto-generated method stub
//			
//		}
//		
//		
//		
//	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Exam_DbllickChangeColor();
	}

}
