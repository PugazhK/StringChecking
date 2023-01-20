package RepeatedCharacter;

import java.util.Scanner;

public class ScannerMethod {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter you Name: ");
		String name = s.nextLine();
		System.out.println("Hey Welcome " + name + "!");
		System.out.println("Enter you age : ");
		String age = s.nextLine();
		
	}
}
