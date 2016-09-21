package dk.magenta.tdd;

public class PersonImpl implements Person {

	private float mass;
	
	public PersonImpl(float mass) {
		this.mass = mass;
	}
	
	public float getMass() {
		return mass;
	}

	public void setMass(float mass) throws IllegalArgumentException {
		// TODO Auto-generated method stub

	}

	public float getHeight() {
		// TODO Auto-generated method stub
		return 0;
	}

	public float getBMI() {
		// TODO Auto-generated method stub
		return 0;
	}

}
