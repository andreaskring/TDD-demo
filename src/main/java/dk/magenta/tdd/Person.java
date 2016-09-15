package dk.magenta.tdd;

public interface Person {

	/**
	 * Get the persons name
	 * @return persons name
	 */
	public String getName();
	
	
	/**
	 * Get the persons mass
	 * @return persons mass in kg
	 */
	public float getMass();
	
	
	/**
	 * Change the mass of the person
	 * @param mass new mass in kg
	 * @throws IllegalArgumentException if new mass < 0
	 */
	public void setMass(float mass) throws IllegalArgumentException;
	
	
	/**
	 * Get the height of the person
	 * @return height in meters
	 */
	public float getHeight();
}
