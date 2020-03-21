package strategy;

public class Viking implements IUnit {

	private IMoveBehavior moveBehavior;
	private int position;
	
	public Viking() {
		moveBehavior = new Walk();
		position = 0;
	}
	
	@Override
	public IMoveBehavior getMoveBehavior() {
		return moveBehavior;
	}
	
	@Override
	public void setMoveBehavior(IMoveBehavior moveBehavior) {
		this.moveBehavior = moveBehavior;
	}
	
	@Override
	public int getPosition() {
		return position;
	}
	
	@Override
	public void setPosition(int position) {
		this.position = position;		
	}
	
	@Override
	public void move() {
		moveBehavior.move(this);
	}
}
