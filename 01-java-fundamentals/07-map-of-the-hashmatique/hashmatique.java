import java.util.HashMap;

public class hashmatique {
    public static void main(String[] args) {
        HashMap<String, String> songs = new HashMap<String, String>();
        songs.put("track1", "countrySong");
        songs.put("track2", "hiphopSong");
        songs.put("track3", "slowmusic");
        songs.put("track4", "indianmusic");
        System.out.println(songs.get("track1"));
        System.out.println(songs);

    }
}
