package Fundamentals.ListOfExceptions;

import java.util.ArrayList;

public class Exceptions {
    public static void Exception() {
        ArrayList<Object> myList = new ArrayList<Object>();
        myList.add("13");
        myList.add("hello world");
        myList.add(48);
        myList.add("Goodbye World");
        for(int i = 0; i < myList.size(); i++) {
            try {
                Integer castedValue = (Integer) myList.get(i);
                System.out.println(castedValue);
            } catch (ClassCastException e) {
                System.out.println(e);
                System.out.println("Error occured at index: " + i);
                System.out.println("Value of error: " + myList.get(i));
            }
        }
    }
}
