package adapter;

public class Zergling implements IUnit {

	@Override
	public void attack(Target target) {
		target.setHealth(target.getHealth() - 5);
	}
}
