package com.kh.day16.swing.component;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;

public class Exam_JColorChooser extends JFrame{
	JLabel jl;
	
	public Exam_JColorChooser() {
		jl = new JLabel();
		setTitle("JColorChoose 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		createMenu();
		JTextArea ja = new JTextArea();
		jl.setText("Hello");
		c.add(jl);
		jl.setHorizontalAlignment(SwingConstants.CENTER);
		jl.setFont(new Font("Ravie",Font.ITALIC,30));
		c.add(jl,BorderLayout.CENTER);
		setSize(250,200);
		setVisible(true);
	}
	
	private void createMenu() {
		
		JMenuBar bar = new JMenuBar();
		JMenu menu = new JMenu("Text"); //Text
		JMenuItem item = new JMenuItem("Color"); //Color
		
		item.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				Color chosenColor = // 선택된 색은 Color Type으로 리턴됨
				JColorChooser.showDialog(null, "ColorPicker",Color.yellow);
				if ( chosenColor != null) {
					jl.setForeground(chosenColor); //선택한 색으로 글씨색 설정
				}
			
			}
		});
		
		bar.add(menu);
		menu.add(item);
		setJMenuBar(bar);
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Exam_JColorChooser();
	}

}
