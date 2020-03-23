package visitor;

public class Marine implements ILightUnit {

	private int health;
	
	public Marine() {
		health = 100;
	}
	@Override
	public int getHealth() {
		return health;
	}
	
	@Override
	public void setHealth(int health) {
		this.health = health;
	}
	
	@Override
	public void accept(IVisitor visitor) {	
		visitor.visit(this);
	}
}
