package swiggy;

public class Test{
    public static void main(String[] args) {
        Address address=new Address();
        address.mobileNo="1234";
        address.name="bhagi";
        address.city="gnt";
        address.pincode="3456";

        Product product=new Product();
        product.productName="pongal";
        product.price="100";

        OrderItem orderItem=new OrderItem();

        Order order=new Order();
        order.orderId="4310";
        order.orderDate="31-03-2024";
        order.orderItem=orderItem;
        order.address=address;

        orderItem.quatity="3";
        orderItem.price="200";
        orderItem.address=address;
        orderItem.product=product;
        System.out.println(order);
    }
}
