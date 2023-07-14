package com.kh.day15.swing.component;

import java.awt.Container;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTabbedPane;

public class Exam_JTabbedPane extends JFrame{

	
		public Exam_JTabbedPane() {
			setTitle("탭팬 만들기 예제");
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			Container c = getContentPane();
			JTabbedPane pane = createTabbePane();
			c.add(pane);
			setSize(250,200);
			setVisible(true);
			
		}
		
		public JTabbedPane createTabbePane() {
			
			JTabbedPane pane = new JTabbedPane();
			pane.addTab("superman", new JLabel(new ImageIcon("image/superman.jpg")));
			pane.addTab("wonderWomen", new JLabel(new ImageIcon("image/wonderwomen.jpg")));
			return pane;
		}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Exam_JTabbedPane();
		
	}

}
