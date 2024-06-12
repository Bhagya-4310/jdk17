package swiggy;

public class OrderItem {
    public String quatity;
    public String price;
    Address address;
    Product product;

    @Override
    public String toString() {
        return "OrderItem{" +
                "quatity='" + quatity + '\'' +
                ", price='" + price + '\'' +
                ", address=" + address +
                '}';
    }
}
