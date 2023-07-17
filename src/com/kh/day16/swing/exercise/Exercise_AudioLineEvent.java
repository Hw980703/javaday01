package com.kh.day16.swing.exercise;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.io.File;
import java.io.IOException;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineEvent;
import javax.sound.sampled.LineListener;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Exercise_AudioLineEvent extends JFrame {

	private Clip clip;
	private JLabel label;
	

	public Exercise_AudioLineEvent() {
		label = new JLabel("애국가 1절");
		
		setTitle("오디오 제어 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.setBackground(Color.yellow);
		c.add(label);
		
		
		setSize(300, 150);
		setVisible(true);
		loadAudio("audio/애국가1절.wav");

	}


	private void loadAudio(String audioPath) {
		try {
			// 클립은 도구, 도구가 Stream 사용
			clip = AudioSystem.getClip(); // 비어있는 오디오 클립 생성
			File audioFile = new File(audioPath);
			AudioInputStream audioStream = AudioSystem.getAudioInputStream(audioFile); //오디오 스트림 생성
			clip.open(audioStream); //오디오 스트림을 이용하여 오디오 클립 생성
			clip.addLineListener(new LineListener() {
				
				@Override
				public void update(LineEvent event) {
					// TODO Auto-generated method stub
					if (event.getType() == LineEvent.Type.STOP) { //노래가 멈추면
						getContentPane().setBackground(Color.orange);
						label.setText("연주 끝");
					}
					try {
						audioStream.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			});
			
			clip.start();
		} catch (LineUnavailableException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // 비어있는 오디오 클립 생성
		catch (UnsupportedAudioFileException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Exercise_AudioLineEvent();
	}

}
