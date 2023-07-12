package com.kh.day13.swing.event;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Exam_AnonymousClassListener extends JFrame {

	public Exam_AnonymousClassListener() {
		// TODO Auto-generated constructor stub

		setTitle("Action 이벤트 리스너 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();

		c.setLayout(new FlowLayout());

		JButton btn = new JButton("Action");
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		btn.addActionListener(new MyActionListener(){
				public void actionPerformed(ActionEvent e) {
					JButton btn = (JButton)e.getSource();
					if(btn.getText().equals("Action")) {
						btn.setText("액션");
					}
					else {btn.setText("Action");}
						setTitle(btn.getText() + " 이벤트 리스너 ");
					
					
				}
		});
			
		
		
		c.add((btn));
		c.setBackground(Color.CYAN);

		setSize(350, 150);
		setVisible(true);

	}

	private class Action implements ActionListener {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			JButton btn = (JButton)e.getSource();
			if(btn.getText().equals("Action")) {
				btn.setText("액션");
			}
			else {btn.setText("Action");}
			
			Exam_AnonymousClassListener.this.setTitle(btn.getText() + " 이벤트 리스너 예제");

		
		}
		
		
	}
	
	public static void main(String[] args) {

		new Exam_AnonymousClassListener();

	}

}
