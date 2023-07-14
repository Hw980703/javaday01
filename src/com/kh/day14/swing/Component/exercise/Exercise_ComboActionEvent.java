package com.kh.day14.swing.Component.exercise;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Exercise_ComboActionEvent extends JFrame {

	private String[] fruits = { "apple", "banana", "kiwi", "mango" };
	private ImageIcon[] images = {

			new ImageIcon("image/apple.jpg"), new ImageIcon("image/banana.jpg"), new ImageIcon("image/kiwi.jpg"),
			new ImageIcon("image/mango.jpg")

	};
	private JLabel imgLabel;
	private JComboBox<String> strCombo;

	public Exercise_ComboActionEvent() {
		super("JComboBox 활용 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		imgLabel = new JLabel(images[0]); // 첫 이미지 세팅
		strCombo = new JComboBox<String>(fruits); // 문자열 배열 콤보박스에 세팅
		c.add(strCombo); // 꼭 콘텐트팬에 추가해줘요~ 잊지마요~
		c.add(imgLabel);

		strCombo.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JComboBox jc = (JComboBox) e.getSource(); // e.getSource()는 이벤트가 발생한 콤포넌트 가져옴(this와 비슷해ㅋ)
				int index = jc.getSelectedIndex(); // 선택된 아이템의 index를 구해오는 메소드인데 js에도 있음
				imgLabel.setIcon(images[index]);
			}
		});
		setSize(300, 250);
		setVisible(true);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Exercise_ComboActionEvent();
	}

}
