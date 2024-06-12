package AccountCreation.Shopping;

import AccountCreation.Shopping.Product;
import AccountCreation.Shopping.ProductSpecification;
import AccountCreation.Shopping.Shop;

import java.util.ArrayList;
import java.util.List;

public class ShoppingTest {
    public static void main(String[] args) {
        Product shirtProduct=new Product();
        ProductSpecification productSpecification=new ProductSpecification();
        productSpecification.colour="pink";
        productSpecification.size="32";
        productSpecification.price="2000";
        productSpecification.brand="H&M";
        shirtProduct.type="shirt";
        shirtProduct.productSpecification=productSpecification;


        Product tshirtProduct=new Product();
        ProductSpecification tshirtproductSpecification=new ProductSpecification();
        tshirtproductSpecification.colour="white";
        tshirtproductSpecification.size="30";
        tshirtproductSpecification.price="2000";
        tshirtproductSpecification.brand="roardstar";
        tshirtProduct.type="tshirt";
        tshirtProduct.productSpecification=tshirtproductSpecification;

        Product jeansProduct=new Product();
        ProductSpecification jeansproductSpecification=new ProductSpecification();
        jeansproductSpecification.colour="grey";
        jeansproductSpecification.size="30";
        jeansproductSpecification.price="2000";
        jeansproductSpecification.brand="rarerabbit";
        jeansProduct.type="jeans";
        jeansProduct.productSpecification=jeansproductSpecification;


    Shop shop=new Shop();
        List<Product> productList=new ArrayList<>();
        productList.add(shirtProduct);
        productList.add(jeansProduct);
        productList.add(tshirtProduct);
        ShoppingService shoppingService=new ShoppingService();
        shoppingService.shopping(productSpecification);
    }
}
