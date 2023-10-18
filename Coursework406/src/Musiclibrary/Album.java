package Musiclibrary;

/*  Define a Java class to represent albums. Provide methods to:
Create an album.
Set and get the name and type of the album and the artist.
Define the list of tracks for the album.
Get the overall running time of the album.
Get the overall file size of the album.
Get the average rating of tracks on the album.*/

import java.util.ArrayList;

public class Album {
    private String title;
    private Type type; //album type
    private Artist artist;
    private ArrayList<MusicTrack> ListOfTracks;
    private int runningTime;
    private long fileSize;
    private double averageRating;


    public Album(String title, Artist artist,Type type) {
        this.title = title;
        this.artist = artist;
        this.type = type;
        this.runningTime = runningTime;
        this.fileSize = fileSize;
        this.averageRating = averageRating;
        this.ListOfTracks = new ArrayList<>();
    }


    public String getTitle() { return title; }

    public void setTitle(String title) { this.title = title; }

    public Type getType() { return type; }

    public void setType(Type type) { this.type = type; }

    public Artist getArtist() { return artist; }

    public void setArtist(Artist artist) { this.artist = artist; }

    public void setListOfTracks(ArrayList<MusicTrack> listOfTracks) {
        this.ListOfTracks = listOfTracks;
    }

    public ArrayList<MusicTrack> getListOfTracks() { return ListOfTracks; }

    public int getRunningTime() { return runningTime; }

    public void setRunningTime(int runningTime) { this.runningTime = runningTime; }

    public long getFileSize() { return fileSize; }

    public void setFileSize(long fileSize) { this.fileSize = fileSize; }

    public void setAverageRating(double averageRating) { this.averageRating = averageRating; }

    public ArrayList<MusicTrack> addListAlbums(MusicTrack musicTrack){
        ListOfTracks.add(
                musicTrack
        );

        return ListOfTracks;
    }

    public void printAllOfTracksInAlbum(){
        for (int i = 0; i < ListOfTracks.size(); i++) {
            System.out.println(ListOfTracks.get(i));
        }
    }

    public ArrayList<MusicTrack> removeAlbums(MusicTrack musicTrack){
        ListOfTracks.remove(musicTrack);
        return ListOfTracks;
    }

    @Override
    public String toString() {
        return  "Title: " + title + "\n" +
                "Type: " + type + "\n" +
                "Total Running time: " + runningTime + "\n" +
                "File size: " + fileSize + "\n" +
                "Average rating: " + averageRating + "\n" +
        getTracksAsString();

    }

    public String getTracksAsString(){
        StringBuilder sb = new StringBuilder();
        for(MusicTrack track : ListOfTracks) {
            sb.append(track.toString()).append("\n");
        }//增强的for循环，用于遍历tracks数组中的每个元素。在每次循环迭代中，将当前元素赋值给名为track的变量，它代表了数组中的一个Track对象。
        return sb.toString();
    }

    public enum Type {
        ROCK,
        POP,
        JAZZ,
        CLASSICAL,
        // add more types
    }


    //Get the overall running time of the album.
    public int getTotalRunningTime(){
        int totalRunningTime = 0;
        for (MusicTrack track : ListOfTracks) {
            totalRunningTime += track.getRunningTime();
        }
        return totalRunningTime;
    }


    public String getTotalFileSize(){
        String totalFileSize = String.valueOf(0);
        for (MusicTrack track : ListOfTracks) {
            totalFileSize += track.getFileSize();
        }
        return totalFileSize;
    }

/*
Get the average rating of tracks on the album.
*/
    public String getTheAverageRating(){
        String averageRating = String.valueOf(0);
        for (MusicTrack track : ListOfTracks) {
            averageRating += track.getFileSize();
        }
        return averageRating;
    }

    public double getAverageRating() {
        if (ListOfTracks.isEmpty()) {
            return 0.0;
        }

        double totalRating = 0;
        int count = 0;
        for (MusicTrack track : ListOfTracks) {
            if (track != null) {
                totalRating += track.getRating();
                count++;
            }
        }

        if (count > 0) {
            return totalRating / count;
        } else {
            return 0.0;
        }
    }
}
