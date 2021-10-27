package BirdSancturyManagementSystem;

public class Penguin extends Bird implements Swimmable{

	public Penguin() {
		name = "PENGUIN";
		color = Color.BLACK_WHITE;
	}

	@Override
	public void swim() {
		System.out.println(name + "can swim");
	}

}
