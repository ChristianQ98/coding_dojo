package OOP.ObjectMasterPart1;

public class HumanTest {
    public static void main(String[] args) {
    // Create two instances of the Human class
    Human h1 = new Human();
    Human h2 = new Human();
    // Make human 1 attack human 2
    h1.attack(h2);
    System.out.println("Human 1 has attacked Human 2, the remaining health for Human 2 is...");
    System.out.println(h2.getHealth());
    h1.attack(h2);
    System.out.println("Human 1 has attacked Human 2, the remaining health for Human 2 is...");
    System.out.println(h2.getHealth());
    }
}
