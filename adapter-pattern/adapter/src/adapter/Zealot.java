package adapter;

public class Zealot implements IUnit {

	@Override
	public void attack(Target target) {
		target.setHealth(target.getHealth() - 8);
	}
}
