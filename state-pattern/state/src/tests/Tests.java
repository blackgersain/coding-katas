package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import state.IUnit;
import state.SiegeState;
import state.Tank;

public class Tests {

	@Test
	public void test0() {
		IUnit tank = new Tank();
		
		assertTrue(tank.canMove());
		assertEquals(5, tank.damage());
	}
	
	@Test
	public void test1() {
		IUnit tank = new Tank();
		tank.setState(new SiegeState());
		
		assertFalse(tank.canMove());
		assertEquals(20, tank.damage());
	}
	
	@Test
	public void test2() {
		IUnit tank = new Tank();
		
		assertTrue(tank.canMove());
		tank.setState(new SiegeState());
		assertEquals(20, tank.damage());
	}

}
