import java.util.ArrayList;

/**
 * Created by Scott Lindley on 10/11/2016.
 */
public class Playlist {
    private String mName;
    private ArrayList<Song> mSongs;

    public Playlist(String name) {
        mName = name;
        mSongs = new ArrayList<>();
    }

    public String getName() {
        return mName;
    }

    public void addSong(Song song){
        mSongs.add(song);
    }

    public void playAll(){
        for(Song s: mSongs){
            s.play();
        }
    }

    //BONUS SETTERS

    public void setName(String name) {
        mName = name;
    }

    public void setSongs(ArrayList<Song> songs) {
        mSongs = songs;
    }
}
