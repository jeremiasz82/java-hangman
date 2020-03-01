package pl.edu.agh.hangman;

import java.util.Scanner;

public class CharacterScanner {
	public Character scanCharacter() {
		Scanner scan = new Scanner(System.in);
		Character letter = scan.next().charAt(0);
		
		return letter;
	}
}
