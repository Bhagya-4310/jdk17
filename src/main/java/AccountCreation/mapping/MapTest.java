package AccountCreation.mapping;

import java.util.HashMap;
import java.util.Map;

public class MapTest {
    public static void main(String[] args) {
        Restaurant restaurant1 = new Restaurant();
        restaurant1.restaurantName = "Mehfil";
        Restaurant restaurant2 = new Restaurant();
        restaurant2.restaurantName = "Pista House";
        //HashMap map = new HashMap();

        Map<Restaurant,String> restaurant= new HashMap<>();

        restaurant.put(restaurant1, "Mehfil");
        restaurant.put(restaurant2, "PistaHouse");

        System.out.println(restaurant.get(restaurant1));
//        restaurant.remove(restaurant2);
//        System.out.println(restaurant);
    }
}

