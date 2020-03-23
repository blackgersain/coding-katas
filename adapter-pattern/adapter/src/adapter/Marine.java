package adapter;

public class Marine implements IUnit {

	@Override
	public void attack(Target target) {
		target.setHealth(target.getHealth() - 6);
	}
}
