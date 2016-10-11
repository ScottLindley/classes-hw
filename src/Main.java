/**
 * Created by Scott Lindley on 10/11/2016.
 */
public class Main {
    public static void main(String[] args) {
        User user = new User("Scott");

        Song nobodyToBlame = new Song("Nobody to Blame","Chris Stapleton","Traveller");
        Song iWantYouBack = new Song("I Want You Back","Jackson 5","Diana Ross Presents The Jackson 5");
        Song spiritInTheSky = new Song("Spirit in the Sky","Norman Greenbaum","Spirit in the Sky");
        Song superstition = new Song("Superstition","Stevie Wonder","Talking Book");
        Song iWalkTheLine = new Song("I Walk the Line","Johnny Cash","With His Hot and Blue Guitar");

        Playlist favorites = new Playlist("favorites");
        Playlist country = new Playlist("country");

        favorites.addSong(iWantYouBack);
        favorites.addSong(spiritInTheSky);
        favorites.addSong(superstition);

        country.addSong(nobodyToBlame);
        country.addSong(iWalkTheLine);

        user.addPlaylist(favorites);
        user.addPlaylist(country);

        System.out.println(user.getAllPlaylistNames());

        System.out.println("******************");

        user.getPlaylistByName("favorites").playAll();
        System.out.println("******************");
        user.getPlaylistByName("country").playAll();

        /*Enter a playlist name to test bonus methods
        * valid options: "favorites", "country"*/
        user.changePlaylistName();
    }
}
