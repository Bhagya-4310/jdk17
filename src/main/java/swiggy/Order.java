package swiggy;

public class Order {
    public String orderId;
    public String orderDate;
    Address address;
    OrderItem orderItem;

    @Override
    public String toString() {
        return "Order{" +
                "orderId='" + orderId + '\'' +
                ", orderDate='" + orderDate + '\'' +
                ", address=" + address +
                ", orderItem=" + orderItem +
                '}';
    }
}
