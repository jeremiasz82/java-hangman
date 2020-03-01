package pl.edu.agh.hangman;

public class HangmanGame {
	public static void main(String[] args) {
		
		BlindWordCreator blindWordCreator = new BlindWordCreator();
		String blindWord = blindWordCreator.createBlindWord("JAVA");
		System.out.println(blindWord);
	}
}
