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
	}
}