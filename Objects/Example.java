public class Example {

	public static void main(String[] args) {
		System.out.println("We are making a new Pez Dispenser.");
		
		PezDispenser dispenser = new PezDispenser("Versace");
		
		System.out.printf("The dispenser charachter is %s\n",
			dispenser.getCharachterName());
	}
}