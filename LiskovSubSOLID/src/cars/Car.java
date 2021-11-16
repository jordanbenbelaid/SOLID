package cars;

import abstractclasses.Electric;
import abstractclasses.Petrol;

public class Car {
	
	public void badEnvironment(Petrol petrol) {
		petrol.fumes();
	}
	
	public void environmentFriendly(Electric electric) {
		electric.energySave();
	}

}
