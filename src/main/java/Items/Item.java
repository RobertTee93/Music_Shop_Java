package Items;

import Interfaces.ISell;

public class Item implements ISell {

    private String description;
    private double cost;
    private double sell;

    public Item(String description, double cost, double sell) {
        this.description = description;
        this.cost = cost;
        this.sell = sell;
    }

    public String getDescription() {
        return description;
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
