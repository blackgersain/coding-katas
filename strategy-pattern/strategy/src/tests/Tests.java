package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import strategy.Fly;
import strategy.IUnit;
import strategy.Viking;

public class Tests {

	@Test
	public void testWalkMove() {
		IUnit viking = new Viking();
		
		viking.move();
		assertEquals(1, viking.getPosition());
		viking.move();
		assertEquals(2, viking.getPosition());
	}
	
	@Test
	public void testFlyMove() {
		IUnit viking = new Viking();
		viking.setMoveBehavior(new Fly());
		
		viking.move();
		assertEquals(10, viking.getPosition());
		viking.move();
		assertEquals(20, viking.getPosition());
	}
	
	@Test
	public void testMixMove() {
		IUnit viking = new Viking();
		
		viking.move();
		assertEquals(1, viking.getPosition());
		
		viking.setMoveBehavior(new Fly());
		viking.move();
		assertEquals(11, viking.getPosition());
	}

}
