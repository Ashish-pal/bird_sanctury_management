package BirdSancturyManagementSystem;

public class Application {

	// UserInterface userInterface = new UserInterface();
	// UserInterface userInterface = UserInterface.getInstance();
	// BirdRepository birdrepo = BirdRepository.getInstance();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to new Bird Project");
		
		Application application = new Application();
		
		boolean printAgainOptions = false;
		
		  while (!printAgainOptions) {
			UserInterface userInterface = UserInterface.getInstance();
			int userOption = userInterface.showUserMenu();
			application.handleUserOption(userOption);
		  }
	}

		/*
		Bird parrot = new Parrot();
		parrot.id = "P001";
		Bird penguin = new Penguin();
		penguin.id = "PN001";
		Bird crow = new Crow();
		crow.id = "C001";
		Bird duck = new Duck();
		duck.id = "D001";
		Bird ostrich = new Ostrich();
		ostrich.id = "OS001";
		Bird ostrich2 = new Ostrich();
		ostrich2.id = "OS001";

		birdrepo.add(ostrich);
		birdrepo.add(ostrich2);
		birdrepo.add(parrot);
		birdrepo.add(penguin);
		birdrepo.add(crow);
		birdrepo.add(duck);

		UserInterface userinterface = new UserInterface();

		userinterface.print(birdrepo.get());

		birdrepo.remove(ostrich);
		birdrepo.remove(duck);
		System.out.println("After removing some parrots data: ");
		userinterface.print(birdrepo.get());
		userinterface.printSwimmable(birdrepo.get());
		userinterface.printFlyable(birdrepo.get()); 
		*/

	private void handleUserOption(int userOption) {
		 UserInterface userInterface = UserInterface.getInstance();
	     BirdRepository birdRepository = BirdRepository.getInstance();
		switch (userOption) {
		case 1:
			addBird();
			break;
		case 2:
			break;
		case 3:
			//getBird();
			userInterface.print(birdRepository.getBird());
			break;
		case 4:
			//getFlyBird();
			userInterface.print(birdRepository.getFlyBird());
			break;
		case 5:
			//getSwimBird();
			userInterface.print(birdRepository.getSwimBird());
		case 6:
			System.exit(0);
			break;
		default:
			System.out.println("Wrong input, Please input correct choice!!!");
		}
	}

	private static void addBird() {
		Bird parrot = new Parrot();
		parrot.id = "P001";
		Bird penguin = new Penguin();
		penguin.id = "PN001";
		Bird crow = new Crow();
		crow.id = "C001";
		Bird duck = new Duck();
		duck.id = "D001";
		Bird ostrich = new Ostrich();
		ostrich.id = "OS001";
		Bird ostrich2 = new Ostrich();
		ostrich2.id = "OS001";
	}

	private static void getBird() {
		
	}

	private static void getFlyBird() {
		//userInterface.print(birdrepo.get());
	}

	private static void getSwimBird() {
		//userInterface.print(birdrepo.get());
	}
}