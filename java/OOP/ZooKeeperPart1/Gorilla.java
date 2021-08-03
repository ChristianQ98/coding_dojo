package OOP.ZooKeeperPart1;

public class Gorilla extends Mammal{
    public void throwSomething() {
        this.energyLevel -= 5;
        System.out.println("The gorilla has thrown something. As a result, its energy level has decreased by 5.");
        System.out.println("It's energy level is now " + this.energyLevel);
    }

    public void eatBananas() {
        this.energyLevel += 10;
        System.out.println("The gorilla is satisfied with its banana, therefore its energy level has increased by 10.");
        System.out.println("It's energy level is now " + this.energyLevel);
    }

    public void climb() {
        this.energyLevel -= 10;
        System.out.println("The gorilla has climbed a tree. As a result, its energy level has decreased by 5.");
        System.out.println("It's energy level is now " + this.energyLevel);
    }
}
