package pl.edu.agh.hangman;

public class BlindWordCreator {
	
	public String createBlindWord(String passwordFromFile) {
		int passwordLength = passwordFromFile.length();
		String tempBlindWord = "";
		for (int i = 0; i < passwordLength; i++) {
			tempBlindWord += "_ ";
		}
		
		return tempBlindWord.substring(0, tempBlindWord.length()-1);
	}
}
