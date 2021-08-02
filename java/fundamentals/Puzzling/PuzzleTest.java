package Fundamentals.Puzzling;

public class PuzzleTest {
    public static void main(String[] args) {
        System.out.println("----- TEN RANDOM INTS -----");
        System.out.println(PuzzleJava.getTenRolls());
        System.out.println("----- GET RANDOM LETTER FROM ALPHABET -----");
        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        System.out.println(PuzzleJava.getRandomLetter(alphabet));
        System.out.println("----- GENERATING RANDOM PASSWORD -----");
        System.out.println(PuzzleJava.generatePassword(alphabet));
        System.out.println("----- GENERATING RANDOM PASSWORD SETS -----");
        String[] letters = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
        System.out.println(PuzzleJava.generateNewPasswordSet(4, letters));
    }
}
