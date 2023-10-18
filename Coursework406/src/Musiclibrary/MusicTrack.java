package Musiclibrary;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;
/**
 * The MusicTrack class represents a track in a music library.
 */
public class MusicTrack {
    private String trackName;
    private Artist artist;
    private Date date;
    private int length;
    private int rating;
    private String locationFile;
    private int sizeFile;
    private List<Artist> guestArtist;
    private List<Artist> bandMembers;
    private int playCount;
    private int RunningTime;
    private long FileSize;
    private double AverageTime;


    public MusicTrack() {
        this.date = null;
    }

    public MusicTrack(String trackName) {
        this.trackName = trackName;
        this.playCount = 0;
    }

    public String getTrackName() {
        return trackName;
    }

    public void setTrackName(String trackName) {
        this.trackName = trackName;
    }

    public Artist getArtist() {
        return artist;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getLocationFile() {
        return locationFile;
    }

    public void setLocationFile(String locationFile) {
        this.locationFile = locationFile;
    }

    public int getSizeFile() {
        return sizeFile;
    }

    public void setSizeFile(int sizeFile) {
        this.sizeFile = sizeFile;
    }

    public List<Artist> getGuestArtist() {
        return guestArtist;
    }

    public void setGuestArtist(List<Artist> guestArtist) {
        this.guestArtist = guestArtist;
    }

    public List<Artist> getBandMembers() {
        return bandMembers;
    }

    public void setBandMembers(List<Artist> bandMembers) {
        this.bandMembers = bandMembers;
    }

    public int getPlayCount() {
        return playCount;
    }

    public void setPlayCount(int playCount) {
        this.playCount = playCount;
    }

    public int getRunningTime() {
        return RunningTime;
    }

    public void setRunningTime(int runningTime) {
        RunningTime = runningTime;
    }

    public long getFileSize() { return FileSize; }

    public void setFileSize(long fileSize) {
        FileSize = fileSize;
    }

    public double getAverageTime() {
        return AverageTime;
    }

    public void setAverageTime(double averageTime) {
        AverageTime = averageTime;
    }


    //Get a list of all individuals on the track, including band members and guest artists
    public List<Artist> getAllIndividuals() {   //这段代码是一个函数getAllIndividuals()，返回一个List<Artist>类型的列表，表示音轨上的所有个人。
        List<Artist> allIndividuals = new ArrayList<>();  //在函数中创建一个新的ArrayList对象，用于存储音轨上的所有个人
        //add bandMembers
        List<Artist> BandMembers = getBandMembers();
        allIndividuals.addAll(BandMembers);
        //add guestArtist
        List<Artist> GuestArtist = getGuestArtist();
        allIndividuals.addAll(GuestArtist);
        return allIndividuals;
    }

    //Add to the play count of a track.  Get the play count of a track.
    public int playCount() {
        setPlayCount(getPlayCount() + 1);
        System.out.println("Play Count is" + getPlayCount());
        return getPlayCount();
    }

    //添加嘉宾艺人
    public void addGustArtist(Artist artist){
        List<Artist> GuestArtist = getGuestArtist();
        GuestArtist.add(artist);
        System.out.println("Add GuestArtist Success Name is "+artist);
    }

    // 重写toString()方法，输出音轨的字符串表示
    @Override
    public String toString() {
        return "Track title: " + trackName + "\n" +
                "Artist: " + artist + "\n" +
                "Date: " + date + "\n" +
                "Running time: " + length + "\n" +
                "Rating: " + rating + "\n" +
                "Location: " + locationFile + "\n" +
                "File Size: " + sizeFile + "\n" +
                "Guest Artists: " + guestArtist + "\n" +
                "Band Members: " + bandMembers + "\n" +
                "Play Count: " + playCount;
    }

}


