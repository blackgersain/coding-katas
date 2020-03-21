package strategy;

public class Fly implements IMoveBehavior {

	@Override
	public void move(IUnit unit) {
		unit.setPosition(unit.getPosition() + 10);
	}
}
