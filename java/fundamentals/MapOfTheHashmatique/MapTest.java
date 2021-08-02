package Fundamentals.MapOfTheHashmatique;

import java.util.HashMap;
import java.util.Set;

public class MapTest {
    public static void main(String[] args) {
        HashMap<String, String> trackList = new HashMap<String, String>();
        trackList.put("Shogun", "Time will not heal all of your pain");
        trackList.put("When All Light Dies", "In this chasm lying broken");
        trackList.put("Master of Puppets", "I'm your source of self-destruction");
        trackList.put("Hangar 18", "Hangar 18, I know too much");
        System.out.println(trackList.get("Master of Puppets"));
        Set<String> keys = trackList.keySet();
        for (String key : keys) {
            System.out.println(key + ": " + trackList.get(key));
        }
    }
}
