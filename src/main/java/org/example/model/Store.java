package org.example.model;

public class Store {
    public static void main(String[] args) {

        ProductForSale[] products = new ProductForSale[7];


        ProductForSale cokeOnSale = new Coke("Coca Cola 4 x 250 Ml Zero Sugar", 90.00,
                                            "Şekersiz kola, 4 adet 250 ml", true,"Kutu");


        ProductForSale breadOnSale = new Bread("Fırından yeni çıkmış el yakan", 10, "Taze mis gibi oh ekmek",
                                                100, "çavdar unu",true);



        ProductForSale chocOnSale = new Chocolate("55% Bitter Chocolate",40.90,"Taze sütlü",
                                                    false,"Turkey");


        ProductForSale breadOnSale2 = new Bread("Taze ekmak", 5,"Fakir beyaz ekmaa",
                                               50.00,"Beyaz un",false);


        mapProductToProductsArray(products,cokeOnSale);
        mapProductToProductsArray(products, breadOnSale);
        mapProductToProductsArray(products,chocOnSale);
        mapProductToProductsArray(products, breadOnSale2);


        listProducts(products);

    }
//  https://chatgpt.com/c/678918fd-7b60-8009-ae4b-0bbceb475a59
public static void listProducts(ProductForSale[] productForSaledenTuremisProductsArrayi) {
    for (int i = 0; i < productForSaledenTuremisProductsArrayi.length; i++) {
        ProductForSale product = productForSaledenTuremisProductsArrayi[i];

        if (product != null) {
            product.showDetails();
        } else if (productForSaledenTuremisProductsArrayi.length > 7) {
            System.out.println("Already maximum products are on sale !");
        } else {
            System.out.println("Index " + (i+1) + " does not have a product. It's blank.");
        }
    }
}

    // Bu metod, bir ProductForSale ürününü, verilen ProductForSale dizisindeki ilk boş (null) alana ekler.
    // ilk paramı array, ikinci paramı bu arraye eklenmek istenen ProductForSale instanceı
    public static void mapProductToProductsArray(ProductForSale[] products, ProductForSale product) {
        for (int i = 0; i < products.length; i++) {
            if (products[i] == null) {
                products[i] = product;
                return;
            }
        }
        System.out.println("Hata: Dizi dolu, ürünü ekleyemiyoruz! (" + product.getType() + ")");
    }
    }
