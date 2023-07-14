package com.kh.day14.swing.Component.exercise;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;

public class Exam_RadioButtonItemEvent extends JFrame {
	private JRadioButton[] fruits; //라디오버튼 객체 배열
	private String[] names = { "사과", "배", "체리" }; //라이도 버튼 이름 배열
	private ImageIcon[] images = { // 이미지 라벨에 들어갈 이미지아이콘 배열

			new ImageIcon("image/apple.jpg"), new ImageIcon("image/pear.jpg"), new ImageIcon("image/nomarlcherry.jpg")

	};
	private JLabel imageLabel; // 이미지 라벨 선언

	public Exam_RadioButtonItemEvent() {
		super("JCheckBox 이미지 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new BorderLayout());	//Border 레이아웃 사용!!
		JPanel radioPanel = new JPanel(); // 라디오 버튼을 추가 할 팬을 만듬(이후 라디오팬이라고 함!)
		radioPanel.setBackground(Color.LIGHT_GRAY); // 새로만든 팬의 배경색을 바꿈
		fruits = new JRadioButton[3]; // 라디오 버튼 객체 배열 생성함
		imageLabel = new JLabel(); // 라벨 객체 생성함
		ButtonGroup btnG = new ButtonGroup();
		
		for (int i = 0; i < fruits.length; i++) {
		
		
			fruits[i] = new JRadioButton(names[i]); // 반복문으로 라디오 객체 생성하고 배열에 넣음
			btnG.add(fruits[i]); // 라디오 버튼 중 1개만 선택되도록 버튼 그룹을 설정해줌.
			radioPanel.add(fruits[i]); // 새로 만든 라디오 팬에 추가함.
			fruits[i].addItemListener(new ItemListener() {
				
				@Override
				public void itemStateChanged(ItemEvent e) {
					// TODO Auto-generated method stub
					if(e.getStateChange() == ItemEvent.DESELECTED) {
							return;
					}
					if(fruits[0].isSelected()) {
						imageLabel.setIcon(images[0]);
					}else if (fruits[1].isSelected()) {
						imageLabel.setIcon(images[1]);
					}else if (fruits[2].isSelected())  {
						imageLabel.setIcon(images[2]);
						
					}
				}
			});
		
		
		}

		c.add(radioPanel, BorderLayout.NORTH); //라디오팬을 컨텐트팬에 추가함!, 탑으로 붙여서 보일거임
		c.add(imageLabel, BorderLayout.CENTER);//이미지 라벨은 센터에 붙여놓았습니다!!!!!!!^^^
		imageLabel.setHorizontalAlignment(SwingConstants.CENTER);

		setSize(250, 200);
		setVisible(true);

	}

	public static void main(String[] args) {

		new Exam_RadioButtonItemEvent();
	}

}
