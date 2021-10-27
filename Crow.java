package BirdSancturyManagementSystem;

public class Crow extends Bird implements Flyable{

	public Crow() {
		name = "CROW";
		color = Color.BLACK;
	}

	@Override
	public void fly() {
		System.out.println(name + "can fly");
	}
}
