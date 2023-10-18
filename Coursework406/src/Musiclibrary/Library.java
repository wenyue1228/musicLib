package Musiclibrary;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private ArrayList<Album> albums;
    private ArrayList<MusicTrack> tracks;
    private String name;

    //Initializes the album list and track List
    public Library(String name) {
        this.name = name;
        albums = new ArrayList<>();
        tracks = new ArrayList<>();
    }

    public ArrayList<Album> getAlbums() {
        return albums;
    }

    public void setAlbums(ArrayList<Album> albums) {
        this.albums = albums;
    }

    public ArrayList<MusicTrack> getTracks() {
        return tracks;
    }

    public void setTracks(ArrayList<MusicTrack> tracks) {
        this.tracks = tracks;
    }

    /*
    Add albums to the library
     */
    public void addAlbum(Album album) {
        albums.add(album);
    }
/*
Add tracks to the library
 */
    public void addTrack(MusicTrack musicTrack) {
        tracks.add(musicTrack);
    }

 /*
Get a list of the lowest rated tracks.
If a lower score is found, update the lowest score value and clear the previously stored lowest-rated track list,
then add the current track to the lowest-rated track list.
If the score equals the lowest score,
the current track is added directly to the lowest score list.
*/
    public List<MusicTrack> getTracksWithLowestRating() {
        int lowestRating = Integer.MAX_VALUE;
        List<MusicTrack> lowestRatedTracks = new ArrayList<>();

        for (MusicTrack track : tracks) {
            int rating = track.getRating();
            if (rating < lowestRating) {
                lowestRating = rating;
                lowestRatedTracks.clear();
                lowestRatedTracks.add(track);
            } else if (rating == lowestRating) {
                lowestRatedTracks.add(track);
            }
        }

        return lowestRatedTracks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}