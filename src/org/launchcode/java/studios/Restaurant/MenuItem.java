package org.launchcode.java.studios.Restaurant;

public class MenuItem {

    private String name;
    private double price;
    private String description;
    private boolean newOrNot;

    public MenuItem (String name, double price, String description, boolean newOrNot) {
        this.name = name;
        this.price = price;
        this. description = description;
        this.newOrNot = newOrNot;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setNewOrNot(boolean newOrNot) {
        this.newOrNot = newOrNot;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }

    public boolean isNewOrNot() {
        return newOrNot;
    }
}
