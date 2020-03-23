package visitor;

public interface ILightUnit {

	int getHealth();
	
	void setHealth(int health);
	
	void accept(IVisitor visitor);
}
