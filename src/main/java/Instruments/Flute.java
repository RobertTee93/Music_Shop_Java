package Instruments;

import Enums.InstrumentType;

public class Flute extends Instrument {

    public Flute(String material, double cost, double sell) {
        super(material, InstrumentType.WOODWIND, cost, sell);
    }

    public String play() {
        return "Flute sound...";
    }
}
