package AccountCreation.Shopping;

import AccountCreation.Shopping.Product;
import AccountCreation.Shopping.ProductSpecification;

public class ShoppingService {
    public Product shopping(ProductSpecification productSpecification){
        Product product=new Product();
       if(product.type.equals(productSpecification.type)&&(product.brand.equals(productSpecification.brand)&&(product.colour.equals(productSpecification.colour)&&(product.size).equals(productSpecification.size)))){
           System.out.println(product);
       }else{
           System.out.println("product unavailable");
       }
        return product;
    }
}
