package com.kh.day15.swing.component;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JToolBar;

public class Exam_JToolBar extends JFrame {
	private Container contentPane;

	public Exam_JToolBar() {
		setTitle("툴바 만들기 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		createToolBar();
		setSize(400, 200);
		setVisible(true);

	}

	public void createToolBar() {

		JToolBar toolBar = new JToolBar();
		toolBar.setBackground(Color.green);
		JButton newBtn = new JButton("New");
		newBtn.setToolTipText("파일 생성합니다.");
		toolBar.add(newBtn);
		toolBar.add(new JButton(new ImageIcon("image/file 1.jpg")));
		toolBar.addSeparator();
		toolBar.add(new JButton(new ImageIcon("image/file 2.jpg")));
		toolBar.addSeparator();
		toolBar.add(new JButton(new ImageIcon("image/file 3.jpg")));
		toolBar.addSeparator();
		toolBar.add(new JButton(new ImageIcon("image/file 4.jpg")));

		contentPane.add(toolBar, BorderLayout.NORTH);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Exam_JToolBar();

	}

}
