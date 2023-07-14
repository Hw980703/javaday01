package com.kh.day15.swing.exercise;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JTextField;

class MyModalDialog1 extends JDialog {
	private JTextField field;
	private JButton btn;
	public MyModalDialog1() {}
	public MyModalDialog1(JFrame frame, String title, JButton jBtn) {
		super(frame, title);
		setLayout(new FlowLayout());
		field = new JTextField(10);
		add(field);
		btn = new JButton("OK");
		btn.addActionListener(new ActionListener() {	// OK 버튼 눌렸을때
			@Override
			public void actionPerformed(ActionEvent e) {
				setVisible(false);						// OK 버튼 누르면 사라짐
				if(field.getText().length() == 0) return;
				else jBtn.setText(field.getText());
			}
		});
		add(btn);
		setSize(200, 100);
	}
	
//	public String getInput() {
//		if(field.getText().length() == 0) return null;
//		else return field.getText();
//	}
}


public class MinExercise_DialogSetText extends JFrame{
	private MyModalDialog1 dialog;
	public MinExercise_DialogSetText() {
		super("다이얼로그 텍스트 셋팅 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JButton btn = new JButton("Show Modal Dialog");
		btn.setSize(200, 50);
		btn.setLocation(20, 50);
		dialog = new MyModalDialog1(this, "Show Modal Dialog", btn); 
		btn.addActionListener(new ActionListener() {	// 버튼 누르면 다이얼로그 띄어줌
			@Override
			public void actionPerformed(ActionEvent e) {
				
				
				
				dialog.setVisible(true);
//				String text = dialog.getInput();
//				if(text == null) return;
//				JButton btn = (JButton)e.getSource();
//				btn.setText(text);
			}
		});
		Container c = getContentPane();
		c.setLayout(null);
		c.add(btn);
		
		setSize(250, 200);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new MinExercise_DialogSetText();
	}

}
