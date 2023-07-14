package com.kh.day14.swing.Component;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingConstants;

public class Exam_JButton extends JFrame {

	
		public Exam_JButton(){
			
			super("JButton 이미지 예제");
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			Container c = getContentPane();
			c.setLayout(new FlowLayout());
			ImageIcon normalIcon = new ImageIcon("image/rpg.png");
			ImageIcon pressIcon = new ImageIcon("image/press.gif");
			ImageIcon pressOutIcon = new ImageIcon("image/pressout.gif");
			
			JButton btn = new JButton("Call" , normalIcon);
//			JButton btn = new JButton("Call",normalIcon);
			btn.setPressedIcon(pressIcon);
			btn.setRolloverIcon(pressOutIcon);
			
			
			// 버튼 안에 텍스트 및 이미지의 수평, 수직 위치 조정 메소드
//			btn.setHorizontalAlignment(SwingConstants.LEFT);
//			btn.setVerticalAlignment(SwingConstants.BOTTOM);
			
			c.add(btn);
			
			setSize(400, 600);
			setVisible(true);
			
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Exam_JButton();
	}

}
