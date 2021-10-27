package BirdSancturyManagementSystem;

import java.util.ArrayList;
import java.util.HashSet;

public class BirdRepository {

	// private ArrayList<Bird> birdlist = new ArrayList();

	private HashSet<Bird> birdlist = new HashSet<>();

	private static BirdRepository instance;

	private BirdRepository() {

	}

	static BirdRepository getInstance() {
		if (instance == null) {
			instance = new BirdRepository();
		}
		return instance;
	}

	public void add(Bird bird) {
		birdlist.add(bird);
	}

	public void remove(Bird bird) {
		birdlist.remove(bird);
	}

	public HashSet<Bird> get() {
		return birdlist;
	}

	public Bird getBird(String birdName) {

	}
}
