package BirdSancturyManagementSystem;

public class Duck extends Bird implements Swimmable, Flyable {

	public Duck() {
		name = "DUCK";
		color = Color.BLACK;
	}

	@Override
	public void swim() {
		System.out.println(name + "can swim");
	}
	
	public void fly() {
		System.out.println(name + "can fly also");
	}
}
