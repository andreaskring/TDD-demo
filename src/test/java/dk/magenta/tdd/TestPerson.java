package dk.magenta.tdd;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestPerson {

	// person cannot have negative mass
	// a 2 m height person weighing 100 kg should have a BMI = 25


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
		Person person = new PersonImpl(75, (float) 1.85);
		assertEquals(1.85, person.getHeight(), 1e-7);
	}

}
