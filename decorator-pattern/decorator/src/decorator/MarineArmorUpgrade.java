package decorator;

public class MarineArmorUpgrade implements IMarine {

	private IMarine marine;
	
	public MarineArmorUpgrade(IMarine marine) {
		this.marine = marine;
	}
	
	@Override
	public int getArmor() {
		return marine.getArmor() + 1;
	}
	
	@Override
	public void setArmor(int armor) {
		marine.setArmor(armor);
	}
	
	@Override
	public int getDamage() {
		return marine.getDamage();
	}
	
	@Override
	public void setDamage(int damage) {
		marine.setDamage(damage);		
	}
}
