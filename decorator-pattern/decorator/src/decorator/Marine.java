package decorator;

public class Marine implements IMarine {

	private int damage;
	private int armor;
	
	public Marine(int damage, int armor) {
		this.damage = damage;
		this.armor = armor;
	}
	
	@Override
	public int getArmor() {
		return armor;
	}
	
	@Override
	public void setArmor(int armor) {
		this.armor = armor;
	}
	
	@Override
	public int getDamage() {
		return damage;
	}
	
	@Override
	public void setDamage(int damage) {
		this.damage = damage;
	}
}
