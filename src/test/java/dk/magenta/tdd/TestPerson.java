package dk.magenta.tdd;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestPerson {

	// height should be 1.78 if the person is 1.78 cm height
	// height should be 1.85 if the person is 1.85 cm height
	// person cannot have negative mass
	// a 2 m height person weighing 100 kg should have a BMI = 25


	@Test
	public void shouldReturnMassOf50ForAPersonWeighing50kg() {
		Person person = new PersonImpl(50);
		assertEquals(50, person.getMass(), 1e-7);
	}

	@Test
	public void shouldReturnMassOf75ForAPersonWeighing75kg() {
		Person person = new PersonImpl(75);
		assertEquals(75, person.getMass(), 1e-7);
	}
}
