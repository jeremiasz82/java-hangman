package pl.edu.agh.hangman;

public class HangmanGame {
	public static void main(String[] args) {
		
		BlindWordCreator blindWordCreator = new BlindWordCreator();
		CharacterScanner characterScanner = new CharacterScanner();
		CharacterFounder characterFounder = new CharacterFounder();
				
		String password = "JAVA";
		
//		String blindWord = blindWordCreator.createBlindWord(password);
		Character letter = characterScanner.scanCharacter();
//		System.out.println(letter);
//		System.out.println(blindWord);
		System.out.println(characterFounder.findCharacters(letter, password));
		
	}
}
