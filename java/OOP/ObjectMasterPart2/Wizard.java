package OOP.ObjectMasterPart2;

public class Wizard extends Human {
	protected int strength;
	protected int stealth;
	protected int intelligence;
	protected int health;
	
	public Wizard(int stealth, int strength, int intelligence, int health) {
		super(stealth, strength, intelligence, intelligence);
		this.intelligence = 8;
		this.health = 50;
	}
	
	public int heal(Human human) {
		return human.health += this.intelligence;
	}
	
	public int fireball(Human human) {
		return human.health -= (this.intelligence * 3);
	}

	public int getStrength() {
		return strength;
	}

	public void setStrength(int strength) {
		this.strength = strength;
	}

	public int getStealth() {
		return stealth;
	}

	public void setStealth(int stealth) {
		this.stealth = stealth;
	}

	public int getIntelligence() {
		return intelligence;
	}

	public void setIntelligence(int intelligence) {
		this.intelligence = intelligence;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}
	
	

}
