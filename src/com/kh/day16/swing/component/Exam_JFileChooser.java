package com.kh.day16.swing.component;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

public class Exam_JFileChooser extends JFrame {
	private JLabel imgLabel;


	public Exam_JFileChooser() {
		imgLabel = new JLabel();
		setTitle("파일 연습");

		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.add(imgLabel);
		createMenu();
		
		setVisible(true);
		setSize(500, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	private void createMenu() {
		JMenuBar bar = new JMenuBar();
		JMenu menu = new JMenu("File"); // 메뉴들
		JMenuItem item = new JMenuItem("Open");
		
		item.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JFileChooser chooser = new JFileChooser();
				int choice = 
				chooser.showOpenDialog(null);
				
				//FileChooser 동작시 비정상적인 선택
				if ( choice != JFileChooser.APPROVE_OPTION) {
					// 메세지 출력 , 파일 선택 안했는데 ? 
					JOptionPane.showMessageDialog(null, "파일을 선택하지 않았습니다.","경고",JOptionPane.WARNING_MESSAGE);
					return; //밑에 있는 코드를 실행하면 NullPointerException 발생하기 때문에 종료해줌!!
				
				}
				String filePath = chooser.getSelectedFile().getPath();
				imgLabel.setIcon(new ImageIcon(filePath));
			}
		});
		menu.add(item);
		bar.add(menu);
		setJMenuBar(bar);
		
		
		
//		screenMenu.add("File");
//		screenMenu.add("open");
//			
//		menu.add(screenMenu);
//		menu.add(new JMenu("File"));
//		setJMenuBar(bar); // 프레임에 추가
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Exam_JFileChooser();
	}

}
