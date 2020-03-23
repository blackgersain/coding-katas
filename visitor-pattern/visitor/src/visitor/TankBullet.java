package visitor;

public class TankBullet implements IVisitor {

	@Override
	public void visit(IArmoredUnit unit) {
		unit.setHealth(unit.getHealth() - 32);
	}
	
	@Override
	public void visit(ILightUnit unit) {
		unit.setHealth(unit.getHealth() - 21);
	}
}
