package SwiggiApp;

import static java.awt.Color.pink;
import static java.awt.SystemColor.menu;

public class DishService {
    public static Dish findDish(Restaurant restaurant, String dishName) {
        if (restaurant != null) {
            return restaurant.getDish(dishName);
        } else {
            return null;
        }
    }
}