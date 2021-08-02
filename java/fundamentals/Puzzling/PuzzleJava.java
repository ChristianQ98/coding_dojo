package Fundamentals.Puzzling;

import java.util.ArrayList;
import java.util.Random;

public class PuzzleJava {
    // Write a method that will generate and return an array with 10 random numbers between 1 and 20 inclusive. 
    public static ArrayList<Integer> getTenRolls() {
        ArrayList<Integer> arr = new ArrayList<Integer>(10);
        Random random = new Random();
        for(int i = 0; i < 10; i++) {
            arr.add(random.nextInt(21));
        } return arr;
    }

    // Write a method that will:
    // 1.) Create an array within the method that contains all 26 letters of the alphabet (this array must have 26 values). 
    // 2.) Generate a random index between 0-25, and use it to pull a random letter out of the array.
    // 3.) Return the random letter.
    public static char getRandomLetter(char[] letters) {
        Random random = new Random();
        return letters[random.nextInt(26)];
    }

    // Write a method that uses the previous method to create a random string of eight characters, and return that string.
    public static String generatePassword(char[] letters) {
        Random random = new Random();
        String password = "";
        for(int i = 0; i < 8; i++) {
            password += (letters[random.nextInt(26)]);
        } return password;
    }

    // Write a method that takes an int length as an argument and creates an array of random eight character words. The array should be the length passed in as an int.
    public static ArrayList<String> generateNewPasswordSet(int length, String[] letters) {
        Random random = new Random();
        ArrayList<String> arr = new ArrayList<String>(length);
        for(int j = 0; j < length; j++) {
            arr.add(letters[random.nextInt(26)].concat(letters[random.nextInt(26)]).concat(letters[random.nextInt(26)]).concat(letters[random.nextInt(26)])
            .concat(letters[random.nextInt(26)]).concat(letters[random.nextInt(26)]).concat(letters[random.nextInt(26)]).concat(letters[random.nextInt(26)]));
        } return arr;
    }
}
