package OOP.ObjectMasterPart2;

public class HumanTest {

	public static void main(String[] args) {
		// Create two instances of the Human class
		// Create two instances of the Human class
		Human h1 = new Human(3, 3, 3, 100);
		Human h2 = new Human(3, 3, 3, 100);
		// Make human 1 attack human 2
		h1.attack(h2);
		System.out.println("Human 1 has attacked Human 2, the remaining health for Human 2 is...");
		System.out.println(h2.getHealth());
		// Create a new instance of the Wizard class
		Wizard w1 = new Wizard(3, 3, 8, 50);
		// The wizard is healing human 2
		System.out
				.println("Wizard 1 healed human 2 by " + w1.intelligence + " health, human 2's remaining health is...");
		w1.heal(h2);
		System.out.println(h2.getHealth());
		// The wizard used a fireball on human 2
		System.out.println("Wizard 1 used a fireball on human 2 and did  " + (w1.intelligence * 3)
				+ " damage, human 2's remaining health is...");
		w1.fireball(h2);
		System.out.println(h2.getHealth());

		// Create a new instance of the Ninja class
		Ninja n1 = new Ninja(10, 3, 3, 100);
		n1.setHealth(100);
		// Ninja 1 stole from Human 1, which resulted in human 1 losing 10 hp and ninja
		// 1 gaining 10 hp
		n1.steal(h1);
		System.out.println("Ninja 1 stole from Human 1");
		System.out.println("Ninja 1 now has...");
		System.out.println(n1.getHealth() + " health");
		System.out.println("Human 1 now has...");
		System.out.println(h1.getHealth() + " health");
		// Ninja 1 runs away, which decreases his health by 10
		n1.runAway();
		System.out.println("Ninja 1's health is now...");
		System.out.println(n1.getHealth());

		// Create a new Samurai
		Samurai s1 = new Samurai(3, 3, 3, 200);
		// Samurai uses Death Blow on Human 1
		// Kills human and cuts Samurai hp in half
		System.out.println(
				"Samurai 1 used Death Blow on Human 1. Human 1 no longer has any hp and Samurai 1's hp is now cut in half.");
		s1.deathBlow(h1);
		System.out.println("Human 1 hp: ");
		System.out.println(h1.getHealth());
		System.out.println("Samurai 1 hp: ");
		System.out.println(s1.getHealth());
		// Samurai uses Meditate
		// Heals Samurai for half of their current health
		s1.meditate();
		System.out.println("Samurai 1 is meditating. His health increases by half of his current health.");
		System.out.println("He now has...");
		System.out.println(s1.getHealth() + " health");
		// Create a new Samurai
		Samurai s2 = new Samurai(3, 3, 3, 200);
		System.out.println("There are currently " + Samurai.howMany() + " Samurais");

	}

}
