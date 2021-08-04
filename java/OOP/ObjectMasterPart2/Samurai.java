package OOP.ObjectMasterPart2;

public class Samurai extends Human {
	
	private static int numOfSamurais = 0;

	public Samurai(int stealth, int strength, int intelligence, int health) {
		super(stealth, strength, intelligence, health);
		this.health = 200;
		numOfSamurais++;
	}
	
	public int deathBlow(Human human) {
		human.health = 0;
		return this.health /= 2;
	}
	
	public int meditate() {
		return this.health += (this.health / 2);
	}
	
	public static int howMany() {
		return numOfSamurais;
	}
	
}
