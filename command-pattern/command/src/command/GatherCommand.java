package command;

public class GatherCommand implements ICommand {

	private IUnit unit;
	
	public GatherCommand(IUnit unit) {
		this.unit = unit;
	}
	
	@Override
	public boolean canExecute() {
		return unit.getMinerals() == 0;
	}
	
	@Override
	public void execute() {
		if (canExecute()) unit.setMinerals(unit.getMinerals() + 5);
	}
}
