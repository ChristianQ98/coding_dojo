package OOP.ObjectMasterPart2;

public class Human {
	protected int strength = 3;
    protected int stealth = 3;
    protected int intelligence = 3;
    protected int health = 100;
	
    public Human(int stealth, int strength, int intelligence, int health) {
    	super();
    	this.strength = 3;
    	this.stealth = 3;
    	this.intelligence = 3;
    	this.health = 100;
    }
    
    public int attack(Human human) {
        return human.health -= this.strength;
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
