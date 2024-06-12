package swiggyFunctions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Swiggy {
    List<Restaurant> restaurantList;
    public List<Restaurant>getRestaurant(){
        Restaurant restaurant = new Restaurant();
        restaurant.restaurantNames="PisthaHouse";
        Restaurant restaurant1 = new Restaurant();
        restaurant1.restaurantNames="Mandi";
        Restaurant restaurant2 = new Restaurant();
        restaurant2.restaurantNames="Alpha";
        Restaurant restaurant3=new Restaurant();
        restaurant3.getMenuList();
        List<Restaurant>restaurantList1 =new ArrayList<>();
        restaurantList1.add(restaurant);
        restaurantList1.add(restaurant1);
        restaurantList1.add(restaurant2);
       // restaurant3.getMenuList();
        return restaurantList1;
    }
    @Override
    public String toString() {
        return "Swiggy{" +
                "restaurantList=" + restaurantList +
                '}';
    }
}