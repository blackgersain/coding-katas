package visitor;

public interface IArmoredUnit {

	int getHealth();
	
	void setHealth(int health);
	
	void accept(IVisitor visitor);
}
