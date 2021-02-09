package org.launchcode.studio7;

import java.util.ArrayList;

public class DVD extends BaseDisc implements OpticalDisc {

    // TODO: Implement your custom interface.
    public DVD ( String name, double availableSpace, double totalSpace, double usedSpace, ArrayList<String> contents, String discType){
        super(name, availableSpace, totalSpace, usedSpace, contents, discType);
    }
    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

//    Overload this
    @Override
    public void spinDisc(){
        System.out.println("A DVD spins at a rate of 570 - 1600 rpm.");
    }
//    Overload this
    @Override
    public void read(){
        System.out.println("The Real Steel");
    }
}
