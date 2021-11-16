package com.qa.domain;

public class MakeTea {
	
	private CupOfTea cupOfTea;
	
	public MakeTea(CupOfTea cupOfTea) {
		this.cupOfTea = cupOfTea;
	}

	public void boilingWater() {
		System.out.println("Water is not boiling yet");
	}
	
	public void addingSugar(int sugars) {
		cupOfTea.setNoOfSugars(sugars);
	}
	
}
