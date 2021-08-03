package OOP.ZooKeeperPart2;

import OOP.ZooKeeperPart1.Mammal;

public class Bat extends Mammal {
    private int energyLevel = 300;

    public int displayEnergyLevel() {
        super.energyLevel = 300;
        return super.displayEnergyLevel();
    }

    public void fly() {
        this.energyLevel -= 50;
        System.out.println("WOOOOOOOOSHHHHHHHH");
        System.out.println("The bat has lost 50 energy level due to flying.");
        System.out.println("Its energy is now at " + this.energyLevel);
    }

    public void eatHumans() {
        this.energyLevel += 25;
        System.out.println("Yummy. Tasty humans.");
        System.out.println("The bat has gained 25 energy level due to eating a human.");
        System.out.println("Its energy is now at " + this.energyLevel);
    }

    public void attackTown() {
        this.energyLevel -= 100;
        System.out.println("BRRRRRRRRRRCKCKCKCKCKCKCK");
        System.out.println("The bat has lost 100 energy due to attacking the town.");
        System.out.println("Its energy is now at " + this.energyLevel);
    }

    public void setEnergyLevel(int energyLevel) {
        this.energyLevel = 300;
    }
}
