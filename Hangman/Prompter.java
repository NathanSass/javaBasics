import java.io.Console;

public class Prompter {
	private Game mGame;
	
	public Prompter (Game game) {
		mGame = game;
	}
	public void displayProgress(){
		System.out.printf("Try to solve: %s\n", mGame.getCurrentProgress());
	}
	public boolean promptForGuess() {
		Console console = System.console();
		String guessAsString = console.readLine("Enter a letter: ");
		char guess = guessAsString.charAt(0);
		return mGame.applyGuess(guess);
		// return true;
	}
		
}