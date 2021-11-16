package task;

public class BedroomAdder {

	public void addBedroom(Penthouse penthouse, int rooms) {
		penthouse.setNumberOfBedrooms(penthouse.getNumberOfBedrooms() + rooms);
	}
	
	public void addSquareFootage(Studio studio, int foot) {
		studio.setSquareFootage(studio.getSquareFootage() + foot);
	}
}
