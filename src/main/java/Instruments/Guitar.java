package Instruments;

import Enums.GuitarType;
import Enums.InstrumentType;

public class Guitar extends Instrument {

    private GuitarType guitarType;
    private int numOfStrings;

    public Guitar(GuitarType guitarType, int numOfStrings, String material, double cost, double sell) {
        super(material, InstrumentType.GUITAR, cost, sell);
        this.guitarType = guitarType;
        this.numOfStrings = numOfStrings;
    }

    public GuitarType getGuitarType() {
        return guitarType;
    }

    public int getNumOfStrings() {
        return numOfStrings;
    }

    public String play() {
        return "Guitar noise...";
    }
}
