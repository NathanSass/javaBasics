import java.io.Console;

public class Prompter {
	private Game mGame;
	
	public void play() {
		while (mGame.getRemainingTries() > 0) {
			displayProgress();
			promptForGuess();
		}
	}
	public Prompter (Game game) {
		mGame = game;
	}
	public void displayProgress(){
		System.out.printf("You have %d tries left to solve: %s\n", mGame.getRemainingTries(), mGame.getCurrentProgress());
	}
	public boolean promptForGuess() {
		Console console = System.console();
		String guessAsString = console.readLine("Enter a letter: ");
		char guess = guessAsString.charAt(0);
		return mGame.applyGuess(guess);
		// return true;
	}
		
}