package dk.magenta.tdd;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestPerson {

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

	@Test
	public void personShouldHaveMass60AfterChangingTheMassTo60() {
		person1.setMass(60);
		assertEquals(60, person1.getMass(), 1e-7);
	}
	
	@Test
	public void shouldHaveBMI25WhenMassIs100AndHeightIs2() {
		Person person = new PersonImpl(100, 2);
		assertEquals(100/(2*2), person.getBMI(), 1e-7);
	}

	@Test
	public void shouldHaveBMI50WhenMassIs200AndHeightIs2() {
		Person person = new PersonImpl(200, 2);
		assertEquals(200/(2*2), person.getBMI(), 1e-7);
	}

	// Person cannot be born with negative mass
	@Test(expected = IllegalArgumentException.class)
	public void personCannotBeInstantiatedWithNegativeMass() {
		new PersonImpl(-10, (float) 1.85);
	}
	
	// Person cannot be born with negative height

	
}
