public class Example {

	public static void main(String[] args) {
		System.out.println("We are making a new Pez Dispenser.");
		
		PezDispenser dispenser = new PezDispenser("Versace");
		
		System.out.printf("The dispenser charachter is %s\n",
			dispenser.getCharachterName());

		if (dispenser.isEmpty()) {
			System.out.println("it is currently empty");
		}

		System.out.println("Loading...");
		dispenser.load();
		if (!dispenser.isEmpty()) {
			System.out.println("it is no longer empty");
		}

		while (dispenser.dispense()) {
			System.out.println("Chomp!");
		}

		if(dispenser.isEmpty()) {
			System.out.println("It is empty");
		}

		dispenser.load(4);
		dispenser.load(2);
		while (dispenser.dispense()) {
			System.out.println("Chomp!");
		}
		try {
			dispenser.load(400);
			
		} catch (IllegalArgumentException iae) {
			System.out.println("Whoa there!!");
			System.out.printf("The error was: %s\n", iae.getMessage());
		}
		System.out.println("this will never print");
	}
}