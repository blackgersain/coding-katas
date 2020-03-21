package state;

public class SiegeState implements IUnitState {

	public SiegeState() {}
	
	@Override
	public boolean canMove() {
		return false;
	}
	
	@Override
	public int damage() {
		return 20;
	}
}
