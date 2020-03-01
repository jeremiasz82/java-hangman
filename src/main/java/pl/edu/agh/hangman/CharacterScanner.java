package pl.edu.agh.hangman;

import java.util.Scanner;

public class CharacterScanner {
	public String scanCharacter() {
		Scanner scan = new Scanner(System.in);
		String letter = scan.next();
		
		return letter;
	}
}
