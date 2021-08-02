package Fundamentals.CafeJava;

public class CafeJava {
    public static void main(String[] args) {
        // APP VARIABLES
        // Lines of text that will appear in the app. 
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready";
        String displayTotalMessage = "Your total is $";
        
        // Menu variables (add yours below)
        double mochaPrice = 3.50;
        double dripCoffeePrice = 2.50;
        double lattePrice = 3.25;
        double cappucinoPrice = 4.00;
        
        // Customer name variables (add yours below)
        String customer1 = "Cindhuri";
        String customer2 = "Sam";
        String customer3 = "Jimmy";
        String customer4 = "Noah";
        
        // Order completions (add yours below)
        boolean isReadyOrder1 = false;
        boolean isReadyOrder2 = true;
        boolean isReadyOrder3 = true;
        boolean isReadyOrder4 = false;
        
        // APP INTERACTION SIMULATION (Add your code for the challenges below)
        
        // Example:
        System.out.println(generalGreeting + customer1); // Displays "Welcome to Cafe Java, Cindhuri"
    	// ** Your customer interaction print statements will go here ** //
        
        // Cindhuri ordered a coffee. Show her the correct status message.
        System.out.println(customer1 + pendingMessage); // Displays "Cindhuri, your order will be ready shortly."

        // Noah ordered a cappucino. Check the status of his order and let him know. If it is ready, also tell him his total.
        if(isReadyOrder4) {
            System.out.println(customer4 + readyMessage + "." + displayTotalMessage + cappucinoPrice +  " ."); // Displays "Noah, your order is ready. Your total is $4.00"
        } else {
            System.out.println(customer4 + pendingMessage + "."); // Displays "Noah, your order will be ready shortly"
        }

        // Sam just order 2 lattes, and would like the total up front. Also give them their order status.
        if(isReadyOrder2) {
            System.out.println(customer2 + readyMessage + ". " + displayTotalMessage + String.format("%.2f", (lattePrice * 2)) + "."); // Displays "Sam, your order is ready. Your total is $6.50."
        } else {
            System.out.println(customer2 + pendingMessage + ". " + displayTotalMessage + String.format("%.2f", (lattePrice * 2)) + "."); // Displays "Sam, your order will be ready shortly. Your total is $6.50."
        }

        // Jimmy just realized he was charged for a coffee but had ordered a latte. Tell him his new total (what he owes) to make up the difference.
        System.out.println(displayTotalMessage + String.format("%.2f", (lattePrice - dripCoffeePrice)) + "."); // Displays "Your total is 0.75."
    }
}
