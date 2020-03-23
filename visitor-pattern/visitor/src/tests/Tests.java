package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import visitor.IArmoredUnit;
import visitor.ILightUnit;
import visitor.IVisitor;
import visitor.Marauder;
import visitor.Marine;
import visitor.TankBullet;

public class Tests {

	@Test
	public void testVisitLigthUnit() {
		IVisitor bullet = new TankBullet();
		ILightUnit light = new Marine();
		
		light.accept(bullet);
		
		assertEquals(100 -21, light.getHealth());
	}
	
	@Test
	public void testVisitArmoredUnit() {
		IVisitor bullet = new TankBullet();
		IArmoredUnit armored = new Marauder();
		
		armored.accept(bullet);
		
		assertEquals(125 - 32, armored.getHealth());
	}
}
