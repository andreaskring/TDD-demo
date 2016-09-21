package dk.magenta.tdd;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestPerson {

	// person should have correct mass after it has been changed
	// a 2 m height person weighing 100 kg should have a BMI = 25

	private Person person1;
	
	@Before
	public void setUp() {
		person1 = new PersonImpl(75, (float) 1.85);
	}

	@Test
	public void shouldReturnMassOf50ForAPersonWeighing50kg() {
		Person person = new PersonImpl(50, (float) 1.78);
		assertEquals(50, person.getMass(), 1e-7);
	}

	@Test
	public void shouldReturnMassOf75ForAPersonWeighing75kg() {
		Person person = new PersonImpl(75, (float) 1.78);
		assertEquals(75, person.getMass(), 1e-7);
	}
	
	@Test
	public void shouldReturn178WhenPerson178Heigh() {
		Person person = new PersonImpl(75, (float) 1.78);
		assertEquals(1.78, person.getHeight(), 1e-7);
	}
	
	@Test
	public void shouldReturn185WhenPerson185Heigh() {
		assertEquals(1.85, person1.getHeight(), 1e-7);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void personMassCannotBeSetToNegative() throws IllegalArgumentException {
		person1.setMass(-10);
	}

}
