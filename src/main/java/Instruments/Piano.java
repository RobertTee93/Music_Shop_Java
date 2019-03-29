package Instruments;

import Enums.InstrumentType;

public class Piano extends Instrument {

    private String keyColor;


    public Piano(String material, String keyColor, double cost, double sell) {
        super(material, InstrumentType.PIANO, cost, sell);
        this.keyColor = keyColor;
    }

    public String play() {
        return "Piano sound...";
    }

    public String getKeyColor() {
        return keyColor;
    }
}
