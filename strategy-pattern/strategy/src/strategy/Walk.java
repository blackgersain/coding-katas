package strategy;

public class Walk implements IMoveBehavior {

	@Override
	public void move(IUnit unit) {
		unit.setPosition(unit.getPosition() + 1);
	}
}
