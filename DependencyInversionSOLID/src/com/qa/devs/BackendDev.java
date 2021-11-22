package com.qa.devs;

import com.qa.interfaces.Developer;

public class BackendDev implements Developer{

	@Override
	public void develop() {
		writeJava();
	}

	public void writeJava() {
		System.out.println("I am writing java code because its fun!");
	}
}
