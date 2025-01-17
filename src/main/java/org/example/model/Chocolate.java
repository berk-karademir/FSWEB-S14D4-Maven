package org.example.model;

public class Chocolate extends ProductForSale{

    private boolean isZeroSugar;
    private String productionCountry;

    public boolean isZeroSugar() {
        return isZeroSugar;
    }

    public String productionCountry() {
        return productionCountry;
    }

    public Chocolate(String type, double price, String description) {
        super(type, price, description);
    }

//hepsi'li constructor :D
    public Chocolate(String type, double price, String description, boolean isZeroSugar, String madeIn) {
        super(type, price, description);
        this.isZeroSugar = isZeroSugar;
        this.productionCountry = madeIn;
    }

    @Override
    public String getClassName() {
        return getClass().getSimpleName();
    }


    // || super.toString() + this
    @Override
    public void showDetails() {
        System.out.println(
                "------------------***    CHOCOLATE INSTANCE    ***------------------\n" +
                        getClassName() + " is on the sale ! \n" +
                        "What kind of " + getClassName().toLowerCase() + " is this ? " + getType() + "." + "\n" +
                        "Details of " +  getClassName().toLowerCase() + " : " + getDescription() + "." + "\n" +
                        "Is the " + getClassName().toLowerCase() + " ok for diabetics ? " + (isZeroSugar() ? "Yes, it has no sugar in it." : "No, it has a few kinds of sugars in it.") + "\n" +
                        "Which country the " + getClassName().toLowerCase() + " is made in" + "." + " It is made in " + productionCountry() + ". \n"  +
                        "How much is this " + getClassName().toLowerCase() + " ? $" + getPrice() + "\n"
        );
    }


}
