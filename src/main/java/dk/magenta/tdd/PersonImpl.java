package dk.magenta.tdd;

public class PersonImpl implements Person {

	private float mass;
	private float height;
	
	public PersonImpl(float mass, float height) {
		this.mass = mass;
		this.height = height;
	}
	
	public float getMass() {
		return mass;
	}

	public void setMass(float mass) throws IllegalArgumentException {
		if (mass < 0) {
			throw new IllegalArgumentException();	
		} else {
			this.mass = mass;
		}
		

	}

	public float getHeight() {
		return height;
	}

	public float getBMI() {
		// TODO Auto-generated method stub
		return 0;
	}

}
