/**
 * Created by Scott Lindley on 10/11/2016.
 */
public class Song {
    private String mSongName;
    private String mArtistName;
    private String mAlbumName;

    public Song(String songName, String artistName, String albumName) {
        mSongName = songName;
        mArtistName = artistName;
        mAlbumName = albumName;
    }

    public void play(){
        System.out.println("Now playing:");
        System.out.println(mSongName+" - "+ mArtistName+" - "+ mAlbumName);
    }


    //BONUS SETTERS

    public void setSongName(String songName) {
        mSongName = songName;
    }

    public void setArtistName(String artistName) {
        mArtistName = artistName;
    }

    public void setAlbumName(String albumName) {
        mAlbumName = albumName;
    }
}
