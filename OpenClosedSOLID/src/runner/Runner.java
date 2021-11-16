package runner;

import domain.Greeter;
import greetings.CasualGreeting;
import greetings.FormalGreeting;

public class Runner {
	
	public static void main(String[] args) {
		
		Greeter greeter = new Greeter();
		FormalGreeting formalGreeting = new FormalGreeting();
		CasualGreeting casualGreeting = new CasualGreeting();
		
		//Setter injection
		greeter.setGreeting(casualGreeting);
		System.out.println(greeter.iWantToGreetPeople());
		
		greeter.setGreeting(formalGreeting);
		System.out.println(greeter.iWantToGreetPeople());
		
		System.out.println(formalGreeting.greet());
		System.out.println(casualGreeting.greet());
		
		//Constructor injection
		Greeter greetFormal = new Greeter(formalGreeting);
//		Greeter gf = new Greeter(new FormalGreeting());
		System.out.println(greetFormal.iWantToGreetPeople());
		
		Greeter greetCasual = new Greeter(casualGreeting);
		System.out.println(greetCasual.iWantToGreetPeople());
		
	}

}
