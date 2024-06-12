package hashcode;

public class EqualsHashcode {
    public static void main(String[] args) {
        Address restaurantaddress=new Address();
        restaurantaddress.area="kphb";
        restaurantaddress.state="ap";
        Address deliveryaddress=new Address();
        deliveryaddress.area="kphb";
        deliveryaddress.state="ap";
        System.out.println(restaurantaddress.equals(deliveryaddress));
        System.out.println(restaurantaddress.hashCode());
        System.out.println(deliveryaddress.hashCode());
    }
}
