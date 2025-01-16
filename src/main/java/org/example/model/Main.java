package org.example.model;

public class Main {
    public static void main(String[] args) {
        ProductForSale cheapCoke = new Coke("Coca Cola 4 x 250 Ml Zero Sugar",
        90.00, "Şekersiz kola, 4 adet 250 ml", true,"Kutu");
        cheapCoke.showDetails();

        ProductForSale breadOnSale = new Bread("Fırından yeni çıkmış el yakan", 10, "Taze mis gibi oh ekmek", 100, "çavdar unu",true);
        breadOnSale.showDetails();

        ProductForSale chocOnSale = new Chocolate("55% Bitter Chocolate",40.90,"Taze sütlü", false,"Turkey");
        chocOnSale.showDetails();
    }
}
