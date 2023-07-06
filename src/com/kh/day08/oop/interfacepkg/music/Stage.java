package com.kh.day08.oop.interfacepkg.music;

public class Stage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Musician ms =  new Musician();
			
			ms.play(new Drum());
			ms.play(new Guitar());
			ms.play(new Piano());;
			
			
	}

}