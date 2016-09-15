package dk.magenta.tdd;

public interface Person {

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
	
	
	/**
	 * Calculates the persons BMI
	 * @return the BMI in kg/m^2
	 */
	public float getBMI();
}
