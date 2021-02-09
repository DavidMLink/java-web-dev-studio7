package org.launchcode.studio7;

import java.util.ArrayList;

public class BaseDisc{

    private String name;
    private double availableSpace; //totalSpace - usedSpace
    private double totalSpace;
    private double usedSpace;
    private ArrayList<String> contents;
    private String discType; // CD vs DVD

    public BaseDisc(String name, double availableSpace, double totalSpace, double usedSpace, ArrayList<String> contents, String discType) {
        this.name = name;
        this.availableSpace = availableSpace;
        this.totalSpace = totalSpace;
        this.usedSpace = usedSpace;
        this.contents = contents;
        this.discType = discType;
    }

    public String write(double spaceBurned){
//        Check for availableSpace
        if(spaceBurned < this.availableSpace){
            usedSpace += spaceBurned;
            availableSpace -= spaceBurned;
            return "Success, there was space!";
        }
        return "Not enough space!!";
    }

    public String getName() {
        return name;
    }

    public ArrayList<String> getContents() {
        return contents;
    }
}
