package BirdSancturyManagementSystem;

import java.util.Objects;

public abstract class Bird {
	
	enum Color {RED, BLACK, WHITE, BLUE, GREEN, BLACK_WHITE}
	
	Color color;
	String id;
	String name;
	
	@Override
	public String toString() {
		return "Bird [color=" + color + ", id=" + id + ", name=" + name + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(color, id, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bird other = (Bird) obj;
		return color == other.color && Objects.equals(id, other.id) && Objects.equals(name, other.name);
	}


}
