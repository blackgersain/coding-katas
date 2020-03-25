package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import command.GatherCommand;
import command.IUnit;
import command.MoveCommand;
import command.Point;
import command.Probe;

public class Tests {

	@Test
	public void testMoveCommandMovesUnit() {
		IUnit unit = new Probe();
		MoveCommand moveCommand = new MoveCommand(unit, 7, 9);
		
		moveCommand.execute();
		Point expected = new Point(7, 9);
		
		assertEquals(expected.getX(), unit.getPosition().getX());
		assertEquals(expected.getY(), unit.getPosition().getY());
	}
	
	@Test
	public void testGatherCommandGathersResources() {
		IUnit unit = new Probe();
		GatherCommand gatherCommand = new GatherCommand(unit);
		
		gatherCommand.execute();
		
		assertEquals(5, unit.getMinerals());
	}
	
	@Test
	public void gatherCommandOnlyGathersIfMineralsEqual0() {
		IUnit unit = new Probe();
		GatherCommand gatherCommand = new GatherCommand(unit);
		
		assertEquals(0, unit.getMinerals());
		
		gatherCommand.execute();
		
		assertEquals(5, unit.getMinerals());
		
		unit.setMinerals(6);
		gatherCommand.execute();
		
		assertTrue("you should increment only when it can execute", unit.getMinerals() == 6);
	}

}
