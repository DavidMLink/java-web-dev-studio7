package org.launchcode.studio7;

import java.util.ArrayList;

public class CD extends BaseDisc implements OpticalDisc {

    // TODO: Implement your custom interface.

    public CD ( String name, double availableSpace, double totalSpace, double usedSpace, ArrayList<String> contents, String discType){
        super(name, availableSpace, totalSpace, usedSpace, contents, discType);
    }

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

    //    Overload this
        @Override
        public void spinDisc(){
            System.out.println("A CD spins at a rate of 200 - 500 rpm.");
        }
    //    Overload this
        @Override
        public void read(){
            System.out.println("Running a Simcity 2000");
        }
}
