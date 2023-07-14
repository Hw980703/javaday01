package com.kh.day14.swing.Component;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;

public class Exam_JList extends JFrame {
	private String[] fruits = {"apple","banana","kiwi","mango","pear","peach"
			,"berry","strawberry","blackberry"};
	private ImageIcon [] images= {
			new ImageIcon("image/home.png"),
			new ImageIcon("image/search.png"),
			new ImageIcon("image/key.png"),
			new ImageIcon("image/net.png"),
	};
	private JScrollPane scrollPane;
	
		public Exam_JList() {
			super("JCheckBox 이미지 예제");
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			Container c = getContentPane();
			c.setLayout(new FlowLayout());
			
			JList<String> strList = new JList <String>(fruits);
			c.add(strList);
			
			JList<ImageIcon> imgList = new JList<ImageIcon>();
			imgList.setListData(images);
			c.add(imgList);
			
			JList<String> scrollList = new JList<String>(fruits);
			scrollPane = new JScrollPane(scrollList);
//			scrollPane.add(scrollList);
			c.add(scrollPane);
			
			
			setSize(300, 300);
			setVisible(true);
			
			
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Exam_JList();
		}

}
