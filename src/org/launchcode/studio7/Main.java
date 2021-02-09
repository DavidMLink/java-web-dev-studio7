package org.launchcode.studio7;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args){

        // TODO: Declare and initialize a CD and a DVD object.

        ArrayList<String> songs = new ArrayList<>();

        songs.add("Waterloo");
        songs.add("Yesterday");
        songs.add("Monday, Monday");
        songs.add("Bohemian Rhapsody");
        songs.add("Thriller");

        ArrayList<String> movieOptions = new ArrayList<>();

        movieOptions.add("Play");
        movieOptions.add("Scene Selection");
        movieOptions.add("Language");
        movieOptions.add("Settings");
        movieOptions.add("BehindTheScenes");

        CD myCd = new CD("VampireWeekendAlbum", 2.2, 5.0, 2.8, songs, "CD");
        DVD myDvd = new DVD("LordOfTheRings", 2.2, 5.0, 2.8, movieOptions, "DVD");

        // TODO: Call each CD and DVD method to verify that they work as expected.
        myCd.spinDisc();
        myDvd.spinDisc();
        myCd.read(); //Our Read doesn't print what we want. Fix it!
        myDvd.read(); //Our Read doesn't print what we want. Fix it!
//        myCd.write();
//        myDvd.write();
//        myCd.reportInfo();
//        myDvd.reportInfo();


    }
}
