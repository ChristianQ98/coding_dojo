package OOP.ZooKeeperPart2;

public class BatTest {
    public static void main(String[] args) {
        // Create an instance of the Bat class
        Bat b1 = new Bat();
        // Display the Bat's initial energy level, which is 300
        System.out.println("Starting energy level... ");
        System.out.println(b1.displayEnergyLevel());
        System.out.println("*********************************************************************************************");
        // The bat is going to attack three towns, which is going to decrease its energy level by 300
        b1.attackTown();
        b1.attackTown();
        b1.attackTown();
        b1.displayEnergyLevel();
        System.out.println("*********************************************************************************************");
        // The bat is going to eat two humans, which is going to increase its energy level by 50
        b1.eatHumans();
        b1.eatHumans();
        b1.displayEnergyLevel();
        System.out.println("*********************************************************************************************");
        // The bat is going to fly twice, which is going to decrease its energy level by 100
        b1.fly();
        b1.fly();
        b1.displayEnergyLevel();
        System.out.println("*********************************************************************************************");
    }
}
