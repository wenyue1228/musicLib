package Musiclibrary;

import java.util.ArrayList;


public class Bands extends Artist {
    private ArrayList<Artist> bandMembers;

    public Bands(String name) {
        super(name);
    }//构造函数，；类型是String,所以在Main里面定义时括号里是字符串



    /*
        add a member to the band
        */
    public void addBandMembers(Artist artist) {
        bandMembers.add(artist);
    }

    public ArrayList<Artist> getBandMembers() {
        return bandMembers;
    }

    public void setBandMembers(ArrayList<Artist> bandMembers) {
        this.bandMembers = bandMembers;
    }

}