package command;

public class MoveCommand implements ICommand {

	private IUnit unit;
	private int x;
	private int y;
	
	public MoveCommand(IUnit unit, int x, int y) {
		this.unit = unit;
		this.x = x;
		this.y = y;
	}
	
	@Override
	public boolean canExecute() {
		return true;
	}
	
	@Override
	public void execute() {
		unit.getPosition().setX(x);
		unit.getPosition().setY(y);
	}
}
