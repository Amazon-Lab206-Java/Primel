import java.util.HashMap;

public class SongList{
    public void songs(){
        HashMap<String, String> trackList = new HashMap<>();
        trackList.put("Rebellion", "Sleeping is giving in, No matter what the time is");
        trackList.put("Photosynthesis", "Well I guess I should confess that I am starting to get old, All the latest music fads all passed me by and left me cold");
        trackList.put("Black Sun", "There is whiskey in the water, and there is death upon the vine.");
        trackList.put("Loro", "And the Ripped Ones say goodbye, while the others meet.");
        String track = trackList.get("Rebellion");
        System.out.println(track);
        System.out.println(trackList);
    }
}
