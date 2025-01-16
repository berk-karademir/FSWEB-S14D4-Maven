package org.example.model;

public class Coke extends ProductForSale{

    private boolean isZeroSugar;
    private String packageType;


    public boolean isZeroSugar() {
        return isZeroSugar;
    }

    public String packageType() {
        return packageType;
    }

    public Coke(String type, double price, String description) {
        super(type, price, description);
    }
//hepsi'li constructor :D
    public Coke(String type, double price, String description, boolean isZeroSugar, String packageType) {
        super(type, price, description);
        this.isZeroSugar = isZeroSugar;
        this.packageType = packageType;
    }

    @Override
    public String getClassName() {
        return getClass().getSimpleName();
    }

    @Override
    public void showDetails() {
        System.out.println(
                "------------------***    COKE INSTANCE    ***------------------\n" +
                getClassName() + " is on the sale ! \n" +
                        "What kind of " + getClassName().toLowerCase() + " is this ? " + getType() + "." + "\n" +
                        "Details of " + getClassName().toLowerCase() + " : " + getDescription() + "." + "\n" +
                        "What kind of the " + getClassName().toLowerCase() + " has ? " + packageType() + "." + "\n" +
                        "Is the " + getClassName().toLowerCase() + " ok for diabetics ? " +
                        (isZeroSugar ? "Yes, it has no sugar in it." : "No, it has a few kinds of sugars in it.") + "\n" +
                        "How much is this " + getClassName().toLowerCase() + " ? $" + getPrice() + "\n"
        );
    }
}
