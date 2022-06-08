import java.util.Set;
import java.util.HashMap;

public class HashMaps {
    public static void main(String[] args) {
        HashMap<String, String> trackList = new HashMap<String, String>();
        trackList.put("Boyfriend", "test1" );
        trackList.put("Sweetest Pie", "test2");
        trackList.put("As It Was", "test3");
        trackList.put("Bam Bam", "test4");

        System.out.println(trackList.get("Boyfriend"));

        Set<String> keys = trackList.keySet();
        for (String key : keys) {
            System.out.println(key);
            System.out.println(trackList.get(key));
        }
    }

}