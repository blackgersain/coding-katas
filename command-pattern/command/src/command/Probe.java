package command;

import java.util.LinkedList;
import java.util.Queue;

public class Probe implements IUnit {

	private int minerals;
	private Point position;
	private Queue<ICommand> commands;
	
	public Probe() {
		minerals = 0;
		position = new Point();
		commands = new LinkedList<ICommand>();
	}
	
	public Queue<ICommand> getCommands() {
		return commands;
	}
	
	@Override
	public int getMinerals() {
		return minerals;
	}
	
	@Override
	public void setMinerals(int minerals) {
		this.minerals = minerals;
	}
	
	@Override
	public Point getPosition() {
		return position;
	}
	
	@Override
	public void setPosition(Point position) {
		this.position = position;
	}
	
	@Override
	public void gather() {
		commands.add(new GatherCommand(this));
	}
	
	@Override
	public void move(int x, int y) {
		commands.add(new MoveCommand(this, x, y));
	}
}
