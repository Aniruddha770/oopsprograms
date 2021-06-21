package InventoryModel;

public class Inventory {
    String name;
    Double price;
    Double weight;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Inventory(String name, Double price, Double weight) {
        this.name = name;
        this.price = price;
        this.weight = weight;
    }

    public Inventory() {
    }
}
