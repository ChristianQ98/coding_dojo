package Fundamentals.alfredBot;

public class AlfredTest {
    public static void main(String[] args) {
        // Set a variable that contains the AlfredQuotes class, which includes all the methods within the class
        AlfredQuotes aQ = new AlfredQuotes();

        // Call the guestGreeting method to greet a guest
        String greeting = aQ.guestGreeting("Alfred", "Afternoon");
        System.out.println(greeting);

        // Call the dateAnnouncement method to return the current date
        String date = aQ.dateAnnouncement();
        System.out.println(date);

        // Returns a snarky response if Alexis is in the convo
        // Returns a sophisticated response if Alfred is in the convo
        // Returns an appropriate response if neither name is in the convo
        String convo = aQ.answeringBeforeAlexis("Hi, Alfred");
        System.out.println(convo);

        // The inputted sentence will return it in "yell" form
        String sentence = aQ.yell("Where is Batman");
        System.out.println(sentence);
    }
}
