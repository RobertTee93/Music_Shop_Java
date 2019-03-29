package Instruments;

import Enums.InstrumentType;
import Interfaces.IPlay;
import Interfaces.ISell;

public abstract class Instrument implements ISell, IPlay {

    private String material;
    private InstrumentType type;
    private double cost;
    private double sell;

    public Instrument(String material, InstrumentType type, double cost, double sell) {
        this.material = material;
        this.type = type;
        this.cost = cost;
        this.sell = sell;
    }

    public String getMaterial() {
        return material;
    }

    public InstrumentType getType() {
        return type;
    }

    public double getCostPrice() {
        return this.cost;
    }

    public double getSellPrice() {
        return this.sell;
    }

    public double markUp() {
        return this.sell - this.cost;
    }
}
