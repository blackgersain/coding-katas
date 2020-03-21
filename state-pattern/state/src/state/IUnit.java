package state;

public interface IUnit {

	IUnitState getState();
	
	void setState(IUnitState state);
	
	boolean canMove();
	
	int damage();
}
