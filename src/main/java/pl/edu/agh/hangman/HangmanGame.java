package pl.edu.agh.hangman;

public class HangmanGame {
	public static void main(String[] args) {
		
		BlindWordCreator blindWordCreator = new BlindWordCreator();
		CharacterScanner characterScanner = new CharacterScanner();
		
		String blindWord = blindWordCreator.createBlindWord("java");
		String letter = characterScanner.scanCharacter();
		System.out.println(letter);
		System.out.println(blindWord);
		
	}
}
