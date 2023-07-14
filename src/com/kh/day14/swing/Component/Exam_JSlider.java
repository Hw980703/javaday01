package com.kh.day14.swing.Component;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JSlider;

public class Exam_JSlider extends JFrame{
	public Exam_JSlider() { 
		super("JCheckBox 이미지 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JSlider slider = new JSlider(JSlider.HORIZONTAL,0,200,100);
	slider.setPaintLabels(true);
		slider.setPaintTicks(true);
		slider.setMajorTickSpacing(50);
		slider.setMinorTickSpacing(10);
		slider.setPaintTrack(true);
		c.add(slider);
		
		setSize(300,100);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Exam_JSlider();
	}

}
