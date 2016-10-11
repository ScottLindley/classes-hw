import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

/**
 * Created by Scott Lindley on 10/11/2016.
 */
public class User {
    private String mName;
    private HashMap<String, Playlist> mPlaylists;

    public User(String name) {
        mName = name;
        mPlaylists = new HashMap<>();
    }

    public void addPlaylist(Playlist playlist) {
        mPlaylists.put(playlist.getName(), playlist);
    }

    public Set<String> getAllPlaylistNames() {
        return mPlaylists.keySet();
    }

    public Playlist getPlaylistByName(String name) {
        if (mPlaylists.containsKey(name)) {
            return mPlaylists.get(name);
        }
        System.out.println("Playlist " + name + " not found");
        return null;
    }

    public void reMovePlaylistByName(String name) {
        if (mPlaylists.containsKey(name)) {
            mPlaylists.remove(name);
            System.out.println("Playlist " + name + " has been deleted");
        } else {
            System.out.println("Playlist " + name + " not found");
        }
    }

    public void changePlaylistName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("**************\nWhich playlist would you like to rename?");
        String input = scanner.nextLine();
        Playlist playlistToEdit = getPlaylistByName(input);
        try{
            playlistToEdit.getName();
        }catch (NullPointerException npe) {
            return;
        }
        System.out.println("Okay, enter a new name");
        playlistToEdit.setName(scanner.nextLine());
        System.out.println("Playlist " + input + " is now named: " + playlistToEdit.getName());
    }


    //BONUS SETTERS

    public void setName(String name) {
        mName = name;
    }

    public void setPlaylists(HashMap<String, Playlist> playlists) {
        mPlaylists = playlists;
    }
}
