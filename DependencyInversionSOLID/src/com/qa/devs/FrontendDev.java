package com.qa.devs;

import com.qa.interfaces.Developer;

public class FrontendDev implements Developer{

	@Override
	public void develop() {
		doHTML();
	}
	
	public void doHTML() {
		System.out.println("I'm making a cool website");
	}

}
