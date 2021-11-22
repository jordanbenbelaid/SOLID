package com.qa.proj;

import java.util.List;

import com.qa.interfaces.Developer;

public class Project {

	//singular
	public void implement(Developer dev) {
		dev.develop();
	}
	
	
	//List of developers
	private List<Developer> developers;
	
	public Project() {}
	
	public Project(List<Developer> developers) {
		this.developers = developers;
	}
	
	public void implementList() {
		for(Developer dev:developers) {
			dev.develop();
		}
	}
	
	//less lines for list of developers
	public void implementListVersionTwo(List<Developer> developers) {
		for(Developer dev:developers) {
			dev.develop();
		}
	}
}
