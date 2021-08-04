package OOP.ObjectMasterPart2;

public class Ninja extends Human {
	protected int health;

	public Ninja(int stealth, int strength, int intelligence, int health)  {
		super(stealth, strength, intelligence, health);
		this.stealth = 10;
	}
	
	public int steal(Human human) {
		human.health -= this.stealth;
		return this.health += stealth;
	}
	
	public int runAway() {
		return this.health -= 10;
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
		return this.health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	
	

}
