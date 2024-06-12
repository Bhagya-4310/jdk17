package swiggy;

public class Product{
    public String productName;
    public String price;

    @Override
    public String toString() {
        return "Product{" +
                "productName='" + productName + '\'' +
                ", price='" + price + '\'' +
                '}';
    }
}
