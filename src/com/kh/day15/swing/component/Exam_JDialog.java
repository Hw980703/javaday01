package com.kh.day15.swing.component;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JTextField;

class MyDialog extends JDialog {


private JButton btn;
	public MyDialog() {}
	public MyDialog(JFrame frame, String title) {
			super(frame,title);
			setLayout(new FlowLayout());
			add(new JTextField(10));
			btn = new JButton("OK");
			setSize(200,100);
			btn.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					setVisible(false);
				}
			});
	}

}
public class Exam_JDialog extends JFrame{
	private MyDialog dialog;
	
		public Exam_JDialog() {
			super("Dialog 만들기 예제");
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			JButton btn = new JButton("Show Dialog"); // 버튼 생성
			dialog = new MyDialog(this,"Test Dialog"); // 다이얼로그 생성!
			btn.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
						dialog.setVisible(true);
				}
			});
			Container c = getContentPane();
			c.add(btn);
			
			
			setSize(250,200);
			setVisible(true);
			
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Exam_JDialog();
		
	}

}

