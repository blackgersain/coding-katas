package decorator;

public class MarineWeaponUpgrade implements IMarine {

	private IMarine marine;
	
	public MarineWeaponUpgrade(IMarine marine) {
		this.marine = marine;
	}
	
	@Override
	public int getArmor() {
		return marine.getArmor();
	}
	
	@Override
	public void setArmor(int armor) {
		marine.setArmor(armor);
	}
	
	@Override
	public int getDamage() {
		return marine.getDamage() + 1;
	}
	
	@Override
	public void setDamage(int damage) {
		this.setDamage(damage);
	}
}
