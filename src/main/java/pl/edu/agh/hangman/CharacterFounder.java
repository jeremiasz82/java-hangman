package pl.edu.agh.hangman;

import java.util.ArrayList;

public class CharacterFounder {
	public ArrayList<Integer> findCharacters(Character letter, String password) {
		ArrayList<Integer> arrayOfIndexes = new ArrayList<Integer>();
		
		int index = 0;
		for (Character passwordLetter : password.toCharArray()) {
			if (passwordLetter == letter) {
				arrayOfIndexes.add(index);
			}
			index++;
		}
		return arrayOfIndexes;
	}
}
