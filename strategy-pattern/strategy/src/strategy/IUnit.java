package strategy;

public interface IUnit {

	int getPosition();
	
	void setPosition(int position);
	
	void move();
	
	IMoveBehavior getMoveBehavior();
	
	void setMoveBehavior(IMoveBehavior moveBehavior);
}
