package Fundamentals.fizzBuzz;

public class FizzBuzzTest {
    public static void main(String[] args) {
        FizzBuzz test = new FizzBuzz();
        System.out.println(test.fizzBuzz(9));
        System.out.println(test.fizzBuzz(10));
        System.out.println(test.fizzBuzz(15));
        System.out.println(test.fizzBuzz(16));
        System.out.println(test.fizzBuzz(2));

        System.out.println("NINJA BONUS...........");

        // NINJA BONUS : Overloaded Method
        System.out.println(test.fizzBuzz(9, "Hello", "There", "World"));
        System.out.println(test.fizzBuzz(10, "Hello", "There", "World"));
        System.out.println(test.fizzBuzz(15, "Hello", "There", "World"));
        System.out.println(test.fizzBuzz(16, "Hello", "There", "World"));
        System.out.println(test.fizzBuzz(2, "Hello", "There", "World"));
    }
}
