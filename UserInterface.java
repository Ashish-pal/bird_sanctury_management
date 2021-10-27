package BirdSancturyManagementSystem;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class UserInterface {
	
	private static UserInterface instance;
	
	private UserInterface() {
		
	}
	
	static UserInterface getInstance() {
		if(instance == null) {
			instance = new UserInterface();
		}
		return instance;
	}

	public void print(HashSet<Bird> birdlist) {

		for (Bird bird : birdlist) {
			System.out.println(bird);
		}
	}

	public void printSwimmable(HashSet<Bird> birdlist) {

		for (Bird bird : birdlist) {
			if (bird instanceof Swimmable)
				System.out.println(bird);
		}

	}

	public void printFlyable(HashSet<Bird> birdlist) {

		for (Bird bird : birdlist) {
			if (bird instanceof Flyable)
				System.out.println(bird);
		}
	}

	
	public int showUserMenu() {
		System.out.println("Press 1 for Add Bird: ");
		System.out.println("Press 2 for Delete Bird: ");
		System.out.println("Press 3 for Show Bird: ");
		System.out.println("Press 4 for Print All Swimmable Bird: ");
		System.out.println("Press 5 for Print All Flyable Bird: ");
		System.out.println("Exit Press 6");

		Scanner sc = new Scanner(System.in);
		int option = sc.nextInt();
		return option;
	}

}
