package com.kh.day08.oop.interfacepkg.zoo;

public class ZooKeeper  {
	
	public void feed(Foodinterface predator) {
			System.out.println("feed"+predator.animalFood());
	}
		
//	public void feed(Baer baer) {
//		System.out.println("fedd" + baer.animalFood());
//	}
//	
//	public void feed(Tiger tiger) {
//		System.out.println("fedd" + tiger.animalFood());
//	}
//	
//	public void feed(Lion lion) {
//		System.out.println("fedd" + lion.animalFood());
//	}
//	
	public static void main(String[] args) {
		ZooKeeper zk = new ZooKeeper();
		zk.feed(new Baer());
		zk.feed(new Tiger());
		zk.feed(new Lion());
		
		
	}
	
	
	
}
