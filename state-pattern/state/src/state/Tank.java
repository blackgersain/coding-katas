package state;

public class Tank implements IUnit {

	private IUnitState state;
	
	public Tank() {
		state = new TankState();
	}
	
	@Override
	public boolean canMove() {
		return state.canMove();
	}
	
	@Override
	public int damage() {
		return state.damage();
	}
	
	@Override
	public IUnitState getState() {
		return state;
	}
	
	@Override
	public void setState(IUnitState state) {
		this.state = state;
	}
}
