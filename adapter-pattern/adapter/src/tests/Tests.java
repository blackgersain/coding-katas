package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import adapter.Mario;
import adapter.MarioAdapter;
import adapter.Target;

public class Tests {

	@Test
	public void testMarioAdapterCanAttack() {
		MarioAdapter marioAdapter = new MarioAdapter(new Mario());
		Target target = new Target();
		target.setHealth(33);
		
		marioAdapter.attack(target);
		
		assertEquals(30, target.getHealth());
	}
}
