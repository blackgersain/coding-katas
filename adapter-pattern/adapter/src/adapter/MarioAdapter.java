package adapter;

public class MarioAdapter implements IUnit {

	private Mario mario;
	
	public MarioAdapter(Mario mario) {
		this.mario = mario;
	}
	
	@Override
	public void attack(Target target) {
		target.setHealth(target.getHealth() - mario.jumpAttack());
	}
}
