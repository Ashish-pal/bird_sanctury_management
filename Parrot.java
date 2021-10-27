package BirdSancturyManagementSystem;

public class Parrot extends Bird implements Flyable {

	public Parrot(){
		name = "PARROT";
		color = Color.GREEN;
	}

	@Override
	public void fly() {
		System.out.println(name + "can fly");
	}
}
