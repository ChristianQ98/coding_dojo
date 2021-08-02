package Fundamentals.CafeBusinessLogic;

import java.util.Arrays;

public class TestCafe {
    public static void main(String[] args) {
        System.out.println("----- MILITARY HOURS TEST -----");
        CafeUtil.militaryHoursTest();
        System.out.println("----- COFFEE NOTIFICATIONS TEST -----");
        CafeUtil.coffeeNotification();
        System.out.println("----- SPECIALS ALERT TEST -----");
        CafeUtil.specialsAlert();
        System.out.println("----- LEADS AT DAY 10 TEST -----");
        System.out.println(CafeUtil.leadsAtDay10());
        System.out.println("----- DISPLAY MENU TEST -----");
        String [] arr = {"Coffee", "Cappucino", "Latte"};
        CafeUtil.displayMenu(arr);
        System.out.println("----- GET ORDER TOTAL TEST -----");
        double[] prices = {3.75, 4, 2.50};
        System.out.println(CafeUtil.getOrderTotal(prices));
        System.out.println("----- GET HIGHEST PRICE TEST -----");
        double[] highest_price = {4, 3.75, 1.25, 2.50, 7, 5.25};
        System.out.println(CafeUtil.getHighestPrice(highest_price));
        System.out.println("----- GET RAFFLE WINNERS TEST -----");
        String[] customers = {
            "Cindhuri", "Noah", "Sam", "Jimmy", 
            "Ian Curtis", "Ada", "Brandon Stantman", 
            "Zoe", "Jesse"};
        System.out.println(CafeUtil.getRaffleWinners(customers));
    }

}
