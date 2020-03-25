package command;

public interface IUnit {

	int getMinerals();
	
	void setMinerals(int minerals);
	
	Point getPosition();
	
	void setPosition(Point position);
	
	void move(int x, int y);
	
	void gather();
}
