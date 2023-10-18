package Musiclibrary;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
/**
 * This class represents a music library. It adds tracks and albums to the library and performs various operations.
 */
public class Main {

    /**
     * The main method that demonstrates the functionality of the music library.
     *
     * @param args An array of command-line arguments passed to this program.
     */
    public static void main(String[] args) {

        Artist gustArtist = new Artist("Lisa");
        Artist artist = new Artist("name");
        Soloists soloists = new Soloists("name1");
        Bands bands = new Bands("name2");
        Album album = new Album("Album1", artist, Album.Type.POP);

        MusicTrack musicTrack = new MusicTrack("A Night at the Opera");//bands
        Bands myBand = new Bands("Queen");
        List<Artist> list = new ArrayList<>();
        list.add(artist);
        list.add(soloists);
        list.add(bands);
        List<Artist> list1 = new ArrayList<>();
        list1.add(gustArtist);
        myBand.setBandMembers((ArrayList<Artist>) list);

        myBand.getBandMembers().add(new Artist("member1"));

        musicTrack.setGuestArtist(list1);
        musicTrack.setPlayCount(1497);
        musicTrack.setArtist(myBand);
        musicTrack.setDate(new Date());
        musicTrack.setRating(4);
        musicTrack.setFileSize(10086);
        musicTrack.setRunningTime(4);
        musicTrack.setLocationFile("England");
        musicTrack.setBandMembers(myBand.getBandMembers());
        album.addListAlbums(musicTrack);


        MusicTrack musicTrack2 = new MusicTrack("Someone Like You");
        Artist gustArtist1 = new Artist("");
        Artist artist1 = new Artist("yue wen");
        Soloists soloists1 = new Soloists("name1");
        //Bands bands1 = new Bands("li hua");
        ArrayList<Artist> list23 = new ArrayList<>();
        list23.add(artist1);
        list23.add(soloists1);
        //list23.add(bands1);
        //bands1.setBandMembers(list23);
        ArrayList<Artist> list21 = new ArrayList<>();
        list21.add(gustArtist1);
        musicTrack2.setGuestArtist(list21);
        musicTrack2.setPlayCount(8809);
        musicTrack2.setArtist(artist);
        musicTrack2.setDate(new Date());
        musicTrack2.setRating(5);
        musicTrack2.setFileSize(69979);
        musicTrack2.setRunningTime(3);
        musicTrack2.setLocationFile("英国");
        //musicTrack2.setBandMembers(bands1.getBandMembers());
        album.addListAlbums(musicTrack2);


        MusicTrack musicTrack3 = new MusicTrack("Shape of You");
        Artist artist12 = new Artist("123");
        Artist gustArtist12 = new Artist("li sa");
        Soloists soloists12 = new Soloists("name1");
        Bands bands12 = new Bands("li hua");
        ArrayList<Artist> list22 = new ArrayList<>();
        list22.add(artist12);
        list22.add(soloists12);
        list22.add(bands12);
        bands12.setBandMembers(list22);
        ArrayList<Artist> list4 = new ArrayList<>();
        list4.add(gustArtist12);
        musicTrack3.setPlayCount(1320);
        musicTrack3.setArtist(artist1);
        musicTrack3.setDate(new Date());
        musicTrack3.setRating(3);
        musicTrack3.setFileSize(1998);
        musicTrack3.setRunningTime(5);
        musicTrack3.setLocationFile("英国");
        musicTrack3.setBandMembers(bands12.getBandMembers());
        musicTrack3.setGuestArtist(list4);

        album.addListAlbums(musicTrack3);


        ArrayList<MusicTrack> listOfTracks = album.getListOfTracks();

        for (MusicTrack track : listOfTracks) {
            System.out.println("Track Information:");
            System.out.println(" Title: " + track.getTrackName() +"\n"+
                    " Artist: " + track.getArtist().getName() +"\n"+
                    " Date: " + track.getDate() +"\n"+
                    " Duration: " + track.getRunningTime() +"\n"+
                    " Rating: " + track.getRating() +"\n"+
                    " File Size: " + track.getFileSize() +"\n"+
                    " Location: " + track.getLocationFile() +"\n"+
                    " Guest Artists: " + track.getGuestArtist() +"\n"+
                    " Band Members: " + track.getBandMembers() +"\n"+
                    " Play Count: " + track.getPlayCount());
            System.out.println();
        }
        int sum = 0;

        for (MusicTrack track : listOfTracks) {
            sum += track.getRunningTime();
        }
        System.out.println("Total duration of the album: " + sum + " minutes"+"\n");
        album.setRunningTime(sum);

        long totalFileSize = Long.parseLong(album.getTotalFileSize());
        System.out.println("Total file size of the album: " + totalFileSize + " bytes"+"\n");


        double averageRating = (album.getAverageRating());
        album.setAverageRating(averageRating);
        System.out.println("Track average rating: " + averageRating+"\n");



        Library library = new Library("My Library");

        // Add tracks and albums to the library
        library.addAlbum(album);
        library.addTrack(musicTrack);
        library.addTrack(musicTrack2);
        library.addTrack(musicTrack3);


        // Get a list of tracks with the lowest score
        List<MusicTrack> lowestRatedTracks = library.getTracksWithLowestRating();
        System.out.println("The track with the lowest rating is " +"\n" + lowestRatedTracks);


        // Input all information of album into the output.txt
        String output = String.valueOf(library);

        try {
            FileWriter writer = new FileWriter("output.txt");
            writer.write(output);
            writer.close();
            System.out.println("The string has been successfully written to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing the file：" + e.getMessage());
        }
    }
}