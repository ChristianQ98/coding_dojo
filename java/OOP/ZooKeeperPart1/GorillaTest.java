package OOP.ZooKeeperPart1;

public class GorillaTest {
    public static void main(String[] args) {
        // Create an instance of the Gorilla class
        Gorilla g1 = new Gorilla();
        // Gorilla initially starts with a 100 energy level
        System.out.println(g1.getEnergyLevel());
        System.out.println("*********************************************************************************************");
        // Gorilla is going to throw three things, resulting in losing 15 of its energy level
        g1.throwSomething();
        g1.throwSomething();
        g1.throwSomething();
        System.out.println(g1.getEnergyLevel());
        System.out.println("*********************************************************************************************");
        // Gorilla is going to eat two bananas, which will increase its energy level by 20
        g1.eatBananas();
        g1.eatBananas();
        System.out.println(g1.getEnergyLevel());
        System.out.println("*********************************************************************************************");
        // Gorilla is now going to climb once, which will decrease its energy level by 10
        g1.climb();
        System.out.println(g1.getEnergyLevel());
    }
}
