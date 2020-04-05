package com.company;

// TODO: Define a class: StringInstrument that is derived from the Instrument class
public class StringInstrument extends Instrument {
    // TODO: Declare private fields: numStrings, numFrets
    private int numStrings;
    private int numFrets;

    // TODO: Define mutator methods -
    //      setNumOfStrings(), setNumOfFrets()
    public void setNumOfStrings(int countStrings){
        this.numStrings = countStrings;
    }

    public void setNumOfFrets(int countNumFrets){
        this.numFrets = countNumFrets;
    }

    // TODO: Define accessor methods -
    //      getNumOfStrings(), getNumOfFrets()
    public int getNumOfStrings(){
        return numStrings;
    }

    public int getNumOfFrets(){
        return numFrets;
    }



}

