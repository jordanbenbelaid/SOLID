package task;

public class Runner {

	public static void main(String[] args) {
		
		Penthouse p = new Penthouse();
		
		Studio s = new Studio();
		
		BedroomAdder ba = new BedroomAdder();
		
		ba.addBedroom(p, 7);
		System.out.println(p.getNumberOfBedrooms());
		
		s.setSquareFootage(300);
		
		ba.addSquareFootage(s, 100);
		
		System.out.println(s.getSquareFootage());

	}

}
