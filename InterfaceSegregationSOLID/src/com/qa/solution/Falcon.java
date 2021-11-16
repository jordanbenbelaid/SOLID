package com.qa.solution;

public class Falcon extends Bird implements FlyingCreature, EggLayingCreature{

	 public Falcon(String currentLocation, int numberOfEggs) {
//		 this.setNumberOfEggs(numberOfEggs);
		 super(currentLocation, numberOfEggs);
	 }
	 
		@Override
		public void layEggs() {
			System.out.println("I lay some eggs");
		}

		@Override
		public void fly() {
			System.out.println("I can fly high in the sky");
		}
	 
}
