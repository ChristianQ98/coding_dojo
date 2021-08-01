package Fundamentals.fizzBuzz;

public class FizzBuzz {
    public String fizzBuzz(int num) {
        if(num % 3 == 0 && num % 5 == 0) {
            return "FizzBuzz";
        } else if(num % 3 == 0) {
            return "Fizz";
        } else if(num % 5 == 0) {
            return "Buzz";
        } else {
            return Integer.toString(num);
        }
    }

    public String fizzBuzz(int num, String multOf3Word, String multOf5Word, String multOf15Word) {
        if(num % 3 == 0 && num % 5 == 0) {
            return multOf15Word;
        } else if(num % 3 == 0) {
            return multOf3Word;
        } else if(num % 5 == 0) {
            return multOf5Word;
        } else {
            return Integer.toString(num);
        }
    }
}