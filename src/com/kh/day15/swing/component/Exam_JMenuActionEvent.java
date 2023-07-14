package com.kh.day15.swing.component;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Exam_JMenuActionEvent extends JFrame {
	private JLabel imgLabel;
	public Exam_JMenuActionEvent() {
		setTitle("메뉴에 리스너 만들기 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		createMenu();
		Container c = getContentPane(); //컨텐트팬
		imgLabel = new JLabel(); // 이미지 들어갈 라벨
		c.setLayout(new BorderLayout()); // Border 레이아웃스! (TOP, BOTTOM , LEFT , RIGHT, CENTER)
		c.add(imgLabel, BorderLayout.CENTER);
		
		
		setSize(250, 220); 
		setVisible(true);

	}

	public void createMenu() {
		JMenuBar bar = new JMenuBar(); //메뉴바 (최상위)
		JMenu screenmenu = new JMenu("screen"); // 메뉴
		String[] menuItem = { "Load", "Hide", "ReShow", "Exit" };

		for (int i = 0; i < 4; i++) {
			JMenuItem jmenuItem = new JMenuItem(menuItem[i]); // 메뉴 밑에 들어감
			jmenuItem.addActionListener(new ActionListener() { //아이템이 선택 되었을때

				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					String cmd = e.getActionCommand();

					switch (cmd) { // else if 보다 빠른 switch case
					case "Load":
						if (imgLabel.getIcon() != null)return; // 이미 로딩시 리턴
						imgLabel.setVisible(true);
						imgLabel.setIcon(new ImageIcon("image/rpg.png"));
						break;
					case "Hide":
						
//						imgLabel.setIcon(null);
						imgLabel.setVisible(false);
						break;
					case "ReShow":
						imgLabel.setVisible(true);
						break;
					case "Exit":
						System.exit(0);
						break;

					}
				}
			});
			screenmenu.add(jmenuItem);

		}

//			screenmenu.add(new JMenuItem("Load"));
//			screenmenu.add(new JMenuItem("Hide"));
//			screenmenu.add(new JMenuItem("ReShow"));
//			screenmenu.add(new JMenuItem("Exit"));
		bar.add(screenmenu);
		setJMenuBar(bar);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Exam_JMenuActionEvent();

	}

}
