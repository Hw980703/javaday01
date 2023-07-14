package com.kh.day15.swing.exercise;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JTextField;

class MyModalDialog extends JDialog{
	
		public MyModalDialog() {}
		public MyModalDialog(JFrame frame , String title) {
			super (frame , title);
			setLayout(new FlowLayout());
			add(new JTextField(10));
			JButton btn = new JButton("OK");
			btn.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
				setVisible(false);
				}
			});
			add(btn);
			setSize(200,100);
			
		}
}


public class Exercise_DialogSetText extends JFrame {
	private MyModalDialog dialog;
	public Exercise_DialogSetText() {
		super("다이얼로그 텍스트 셋팅 예제!!");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JButton btn = new JButton("Show Modal Dialog");
		btn.setSize(200,50);
		btn.setLocation(20, 50);
		dialog = new MyModalDialog(this,"Show Modal Dialog");
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
						dialog.setVisible(true);
			}
		});
		Container c = getContentPane();
		c.setLayout(null);
		c.add(btn);
		setSize(250,200);
		setVisible(true);
	
	}
	public static void main(String[] args) {
			new Exercise_DialogSetText();
	}

}
