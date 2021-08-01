package Fundamentals.alfredBot;

import java.util.Date;

public class AlfredQuotes {
    public String guestGreeting(String name, String dayPeriod) {
        return "Good " + dayPeriod + ", " + name;
    }

    public String dateAnnouncement() {
        Date date = new Date();
        return "The current date is " + date; 
    }

    public String answeringBeforeAlexis(String conversation) {
        if(conversation.contains("Alexis")){
            return "Right away, sir. She certainly isn't sophisticated enough for that.";
        } else if(conversation.contains("Alfred")){
            return "At your service. As you wish, naturally.";
        } else {
            return "Right. And with that I shall retire.";
        }
    }

    public String yell(String sentence) {
        return sentence.toUpperCase() + "!!!";
    }
}
