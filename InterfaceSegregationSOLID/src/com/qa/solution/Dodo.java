package com.qa.solution;

public class Dodo extends Bird implements ExtinctCreature, EggLayingCreature{
	
	public Dodo(String currentLocation, int numberOfEggs) {
//		this.setNumberOfEggs(numberOFEggs);
		super(currentLocation, numberOfEggs);
	}
	
	@Override
	public void layEggs() {
		System.out.println("I lay way more eggs than a falcon");
	}

	@Override
	public void goExtinct() {
		System.out.println("You can only see me in the museum");
	}

}
