package org.example.model;

public class Bread extends ProductForSale{

    private double weight;
    private String flourType;
    private boolean isOrganic;


    public double getWeight() {
        return weight;
    }

    public String getFlourType() {
        return flourType;
    }

    public boolean isOrganic() {
        return isOrganic;
    }

    public Bread(String type, double price, String description) {
        super(type, price, description);
    }

//hepsi'li constructor :D
    public Bread(String type, double price, String description, double weight, String flourType, boolean isOrganic) {
        super(type, price, description);
        this.weight = weight;
        this.flourType = flourType;
        this.isOrganic = isOrganic;
    }

    public String getClassName() {
        return getClass().getSimpleName();
    }

    @Override
    public void showDetails() {
        System.out.println(
                "------------------***    BREAD INSTANCE    ***------------------\n" +
                        getClassName() + " is on the sale ! \n" +
                        "What kind of " + getClassName().toLowerCase() + " is this ? " + getType() + "." + "\n" +
                        "Details of " +  getClassName().toLowerCase() + " : " + getDescription() + "." + "\n" +
                        "How much the " + getClassName().toLowerCase() + " weigh ? " + getWeight() + " gr." + "\n" +
                        "What kind of flour the " + getClassName().toLowerCase() + " made from ? " + getFlourType() + "." + "\n" +
                        "Is the " + getClassName().toLowerCase() + " organic ? " + (isOrganic() ? "Yes, 100% organic, 0 additive" : "No, it is not organic.") + "." + "\n" +
                        "How much is this " + getClassName().toLowerCase() + " ? $" + getPrice() + "\n"
        );
    }
}
