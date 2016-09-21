package dk.magenta.tdd;

public class PersonImpl implements Person {

	private float mass;
	private float height;
	
	public PersonImpl(float mass, float height) throws IllegalArgumentException {
		checkAndSetMass(mass);
		this.height = height;
	}
	
	public float getMass() {
		return mass;
	}

	public void setMass(float mass) throws IllegalArgumentException {
		checkAndSetMass(mass);
	}

	public float getHeight() {
		return height;
	}

	public float getBMI() {
		return mass/(height*height);
	}
	
	private void checkAndSetMass(float mass) {
		if (mass < 0) {
			throw new IllegalArgumentException("Not so fast, Ace! Mass cannot be negative");
		}
		this.mass = mass;
	}

}
