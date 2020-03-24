package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import decorator.IMarine;
import decorator.Marine;
import decorator.MarineArmorUpgrade;
import decorator.MarineWeaponUpgrade;

public class Tests {

	@Test
	public void testSingleUpgrade() {
		IMarine marine = new Marine(10, 1);
		
		assertEquals(10 + 1, new MarineWeaponUpgrade(marine).getDamage());
	}

	@Test
	public void testDoubleUpgrade() {
		IMarine marine = new Marine(15, 1);
		marine = new MarineWeaponUpgrade(marine);
		marine = new MarineWeaponUpgrade(marine);
		
		assertEquals(15 + 1 + 1, marine.getDamage());
	}
	
	@Test
	public void testMixUpgrades() {
		IMarine marine = new Marine(10, 1);
		marine = new MarineWeaponUpgrade(marine);
		marine = new MarineArmorUpgrade(marine);
		marine = new MarineWeaponUpgrade(marine);
		marine = new MarineArmorUpgrade(marine);
		
		assertEquals(12, marine.getDamage());
		assertEquals(3, marine.getArmor());
	}
}
