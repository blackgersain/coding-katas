package visitor;

public class Marauder implements IArmoredUnit {

	private int health;
	
	public Marauder() {
		health = 125;
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
