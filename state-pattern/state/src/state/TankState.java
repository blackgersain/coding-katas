package state;

public class TankState implements IUnitState {

	public TankState() {}

	@Override
	public boolean canMove() {
		return true;
	}
	
	@Override
	public int damage() {
		return 5;
	}
}
