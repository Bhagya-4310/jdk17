package AccountCreation.creditcardusage;

import AccountCreation.Shopping.ProductSpecification;

public class TestClass {
    public static void main(String[] args) {
        CardService process=new CardService();
        Carddetails carddetails = new Carddetails();
       // process.purchasebill(carddetails);
        ProductSpecification productSpecification=new ProductSpecification();
        productSpecification.size="32";
        productSpecification.colour="pink";
        productSpecification.brand="rarerabbit";
    }
}
