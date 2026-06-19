package example;

public class activity1 {
	public static void main(String[] args) {
		// Create the Car object
		car obj1 = new car("Black", "Manual", 2024);
		
		// Use the object to call its functions
		obj1.displayCharacteristics();
		obj1.accelarate();
		obj1.brake();
	}
}
