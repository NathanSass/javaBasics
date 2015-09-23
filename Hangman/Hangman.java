public class Hangman {
	public static void main(String[] args) {
		Game game = new Game("hangyDoodle");
		Prompter prompter = new Prompter(game);
		boolean isHit = prompter.promptForGuess();
		prompter.displayProgress();
		if (isHit) {
			System.out.println("We got a hit!");
		} else {
			System.out.println("Whoops a miss");
		}
	}
}